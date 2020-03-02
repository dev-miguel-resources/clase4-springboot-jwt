package cl.escalab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.escalab.model.Paciente;

//@Repository
public interface IPacienteRepo extends JpaRepository<Paciente, Integer>{
	
}
