package pe.edu.upc.finanzas.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.finanzas.entities.Transaccion;
import pe.edu.upc.finanzas.repositories.ITransaccionRepository;
import pe.edu.upc.finanzas.servicesinterfaces.ITransaccionservice;

import java.util.List;

@Service
public class TransaccionServiceImplement implements ITransaccionservice {
    @Autowired
    private ITransaccionRepository tR;
    @Override
    public void insert(Transaccion transaccion)  {
        tR.save(transaccion);
    }

    @Override
    public List<Transaccion> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }

    @Override
    public Transaccion listId(int id) {
        return tR.findById(id).orElse(new Transaccion());
    }
}
