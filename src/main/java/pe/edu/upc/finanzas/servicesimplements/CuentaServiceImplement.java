package pe.edu.upc.finanzas.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.finanzas.entities.Cuenta;
import pe.edu.upc.finanzas.repositories.ICuentaRepository;
import pe.edu.upc.finanzas.servicesinterfaces.ICuentaServices;

import java.util.List;
@Service
public class CuentaServiceImplement implements ICuentaServices {
    @Autowired
    private ICuentaRepository cR;
    @Override
    public void insert(Cuenta cuenta) {
        cR.save(cuenta);
    }

    @Override
    public List<Cuenta> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id)  {
        cR.deleteById(id);
    }

    @Override
    public Cuenta listId(int id) {
        return cR.findById(id).orElse(new Cuenta());
    }
}
