package pe.edu.upc.finanzas.servicesinterfaces;

import pe.edu.upc.finanzas.entities.Cliente;

import java.util.List;

public interface IClienteServices {
    public void insert(Cliente cliente);
    public List<Cliente> list();
    public void delete(int id);
    public Cliente listId(int id);
}
