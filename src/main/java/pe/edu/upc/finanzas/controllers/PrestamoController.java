package pe.edu.upc.finanzas.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.finanzas.dtos.PrestamoDTO;
import pe.edu.upc.finanzas.entities.Prestamo;
import pe.edu.upc.finanzas.servicesinterfaces.IClienteServices;
import pe.edu.upc.finanzas.servicesinterfaces.IPrestamoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/prestamos")
public class PrestamoController {
    @Autowired
    private IPrestamoService pS;
    @PostMapping
    public void registrar(@RequestBody PrestamoDTO dto){
        ModelMapper m=new ModelMapper();
        Prestamo prestamo=m.map(dto, Prestamo.class);
        pS.insert(prestamo);
    }
    @PutMapping
    public void modificar(@RequestBody PrestamoDTO dto){
        ModelMapper m=new ModelMapper();
        Prestamo prestamo=m.map(dto, Prestamo.class);
        pS.insert(prestamo);
    }
    @GetMapping
    public List<PrestamoDTO> list(){

        return pS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,PrestamoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public PrestamoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        PrestamoDTO dto=m.map(pS.listId(id),PrestamoDTO.class);
        return dto;
    }
}
