package cl.escalab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.escalab.model.Examen;

//@Repository
public interface IExamenRepo extends JpaRepository<Examen, Integer>{
	
}
