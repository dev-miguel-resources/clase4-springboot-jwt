package cl.escalab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.escalab.model.Especialidad;

//@Repository
public interface IEspecialidadRepo extends JpaRepository<Especialidad, Integer>{
	
}
