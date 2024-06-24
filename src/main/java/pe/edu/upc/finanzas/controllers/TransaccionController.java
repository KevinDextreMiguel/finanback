package pe.edu.upc.finanzas.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.finanzas.dtos.TransaccionDTO;
import pe.edu.upc.finanzas.entities.Transaccion;
import pe.edu.upc.finanzas.servicesinterfaces.ITransaccionservice;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/transacciones")
public class TransaccionController {
    @Autowired
    private ITransaccionservice tS;
    @PostMapping
    public void registrar(@RequestBody TransaccionDTO s){
        ModelMapper m=new ModelMapper();
        Transaccion sh=m.map(s,Transaccion.class);
        tS.insert(sh);
    }
    @PutMapping
    public void modificar(@RequestBody TransaccionDTO s){
        ModelMapper m=new ModelMapper();
        Transaccion sh=m.map(s,Transaccion.class);
        tS.insert(sh);
    }
    @GetMapping
    public List<TransaccionDTO> list(){

        return tS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,TransaccionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tS.delete(id);
    }
    @GetMapping("/{id}")
    public TransaccionDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        TransaccionDTO dto=m.map(tS.listId(id),TransaccionDTO.class);
        return dto;
    }
}
