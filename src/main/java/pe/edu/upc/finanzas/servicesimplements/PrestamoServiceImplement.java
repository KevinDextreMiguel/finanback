package pe.edu.upc.finanzas.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.finanzas.entities.Prestamo;
import pe.edu.upc.finanzas.repositories.IPrestamoRepository;
import pe.edu.upc.finanzas.servicesinterfaces.IPrestamoService;

import java.util.List;

@Service
public class PrestamoServiceImplement implements IPrestamoService {
    @Autowired
    private IPrestamoRepository pR;
    @Override
    public void insert(Prestamo prestamo) {
        pR.save(prestamo);
    }

    @Override
    public List<Prestamo> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public Prestamo listId(int id) {
        return pR.findById(id).orElse(new Prestamo());
    }
}
