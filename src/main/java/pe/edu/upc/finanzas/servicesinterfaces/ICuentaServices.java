package pe.edu.upc.finanzas.servicesinterfaces;

import pe.edu.upc.finanzas.entities.Cuenta;

import java.util.List;

public interface ICuentaServices {
    public void insert(Cuenta cuenta);
    public List<Cuenta> list();
    public void delete(int id);
    public Cuenta listId(int id);
}
