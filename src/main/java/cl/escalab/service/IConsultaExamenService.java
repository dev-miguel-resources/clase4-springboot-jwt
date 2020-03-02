package cl.escalab.service;

import java.util.List;

import cl.escalab.model.ConsultaExamen;

public interface IConsultaExamenService {

	List<ConsultaExamen> listarExamenesPorConsulta(Integer idconsulta);
}
