package pe.edu.upc.finanzas.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.finanzas.dtos.ClienteDTO;
import pe.edu.upc.finanzas.entities.Cliente;
import pe.edu.upc.finanzas.servicesinterfaces.IClienteServices;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private IClienteServices cS;
    @PostMapping
    public void registrar(@RequestBody ClienteDTO dto){
        ModelMapper m=new ModelMapper();
        Cliente cliente=m.map(dto, Cliente.class);
        cS.insert(cliente);
    }
    @PutMapping
    public void modificar(@RequestBody ClienteDTO dto){
        ModelMapper m=new ModelMapper();
        Cliente cliente=m.map(dto, Cliente.class);
        cS.insert(cliente);
    }
    @GetMapping
    public List<ClienteDTO> list(){

        return cS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ClienteDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public ClienteDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        ClienteDTO dto=m.map(cS.listId(id),ClienteDTO.class);
        return dto;
    }
}
