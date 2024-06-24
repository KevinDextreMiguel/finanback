package pe.edu.upc.finanzas.servicesinterfaces;

import pe.edu.upc.finanzas.entities.Transaccion;

import java.util.List;

public interface ITransaccionservice {
    public void insert(Transaccion transaccion);
    public List<Transaccion> list();
    public void delete(int id);
    public Transaccion listId(int id);
}
