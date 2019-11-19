package com.foodforrescue.jee.dao;

import com.foodforrescue.jee.entities.Reciclaje;


public interface ReciclajeDAO {

	
	/**
	 * Recible id, busca y devuelve
	 * @param id
	 * @return
	 */
	public Reciclaje findById(Long id);
	
	
	/**
	 * Recibe un dato y lo almacena en base de datos
	 * @param peso
	 * @return
	 */
	public Reciclaje create (Reciclaje peso);
	
	
	/**
	 * Recibe un dato y lo actualiza
	 * @param peso
	 * @return
	 */
	public Reciclaje update (Reciclaje peso);
	
	
	/**
	 * Recibe un id y lo borra
	 * @param id
	 */
	public void delete(Long id);
	
	
}
