package pe.edu.upc.finanzas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.finanzas.entities.Prestamo;
@Repository
public interface IPrestamoRepository extends JpaRepository<Prestamo,Integer> {
}
