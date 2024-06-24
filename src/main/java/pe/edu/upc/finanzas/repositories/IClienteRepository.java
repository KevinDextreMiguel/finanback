package pe.edu.upc.finanzas.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.finanzas.entities.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente,Integer> {
}
