package cl.escalab.service;

import java.util.List;

import cl.escalab.model.Menu;

public interface IMenuService extends ICRUD<Menu>{
	
	List<Menu> listarMenuPorUsuario(String nombre);
}
