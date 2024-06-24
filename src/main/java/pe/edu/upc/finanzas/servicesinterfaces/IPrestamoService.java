package pe.edu.upc.finanzas.servicesinterfaces;
import pe.edu.upc.finanzas.entities.Prestamo;

import java.util.List;

public interface IPrestamoService {
    public void insert(Prestamo prestamo);
    public List<Prestamo> list();
    public void delete(int id);
    public Prestamo listId(int id);
}
