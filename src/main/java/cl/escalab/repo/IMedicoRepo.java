package cl.escalab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.escalab.model.Medico;

//@Repository
public interface IMedicoRepo extends JpaRepository<Medico, Integer>{
	
}
