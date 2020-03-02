package cl.escalab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.escalab.model.Archivo;

public interface IArchivoRepo extends JpaRepository<Archivo, Integer>{

}
