package pe.edu.upc.finanzas.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.finanzas.entities.Cliente;
import pe.edu.upc.finanzas.repositories.IClienteRepository;
import pe.edu.upc.finanzas.servicesinterfaces.IClienteServices;

import java.util.List;
@Service
public class ClienteServiceImplement implements IClienteServices {
    @Autowired
    IClienteRepository cR;


    @Override
    public void insert(Cliente cliente) {
        cR.save(cliente);
    }

    @Override
    public List<Cliente> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public Cliente listId(int id) {
        return cR.findById(id).orElse(new Cliente());
    }
}
