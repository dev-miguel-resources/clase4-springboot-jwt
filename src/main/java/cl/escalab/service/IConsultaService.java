package cl.escalab.service;

import java.util.List;

import cl.escalab.dto.ConsultaListaExamenDTO;
import cl.escalab.dto.ConsultaResumenDTO;
import cl.escalab.dto.FiltroConsultaDTO;
import cl.escalab.model.Consulta;

public interface IConsultaService extends ICRUD<Consulta>{

	Consulta registrarTransaccional(ConsultaListaExamenDTO dto);
	
	List<Consulta> buscar(FiltroConsultaDTO filtro);

	List<Consulta> buscarFecha(FiltroConsultaDTO filtro);
	
	List<ConsultaResumenDTO> listarResumen();
	
	byte[] generarReporte();
		
}
