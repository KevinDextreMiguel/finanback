package pe.edu.upc.finanzas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.finanzas.entities.Prestamo;
import pe.edu.upc.finanzas.entities.Transaccion;

@Repository
public interface ITransaccionRepository extends JpaRepository<Transaccion,Integer>{
}


