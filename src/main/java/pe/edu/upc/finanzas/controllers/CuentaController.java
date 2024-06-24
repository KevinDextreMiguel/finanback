package pe.edu.upc.finanzas.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.finanzas.dtos.CuentaDTO;
import pe.edu.upc.finanzas.entities.Cuenta;
import pe.edu.upc.finanzas.servicesinterfaces.ICuentaServices;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {
    @Autowired
    private ICuentaServices cS;
    @PostMapping
    public void registrar(@RequestBody CuentaDTO s){
        ModelMapper m=new ModelMapper();
        Cuenta sh=m.map(s,Cuenta.class);
        cS.insert(sh);
    }
    @PutMapping
    public void modificar(@RequestBody CuentaDTO s){
        ModelMapper m=new ModelMapper();
        Cuenta sh=m.map(s,Cuenta.class);
        cS.insert(sh);
    }
    @GetMapping
    public List<CuentaDTO> list(){

        return cS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,CuentaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public CuentaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        CuentaDTO dto=m.map(cS.listId(id),CuentaDTO.class);
        return dto;
    }
}
