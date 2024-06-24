package pe.edu.upc.finanzas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.finanzas.entities.Cuenta;

@Repository
public interface ICuentaRepository extends JpaRepository<Cuenta,Integer> {

}
