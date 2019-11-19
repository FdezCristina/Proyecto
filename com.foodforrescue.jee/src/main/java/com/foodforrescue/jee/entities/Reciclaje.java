package com.foodforrescue.jee.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="reciclaje")
@NamedQuery(name="Reciclaje.findAll", query="SELECT r FROM Reciclaje r")

public class Reciclaje implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private Long id;
	@Column(name="tipo")
	private String tipo;
	@Column(name="peso")
	private int peso;
	@Column(name="descuento")
	private int descuento;
	
	
	
	public Reciclaje() {
		super();
	}


	public Reciclaje(Long id, String tipo, int peso, int descuento) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.peso = peso;
		this.descuento = descuento;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public int getDescuento() {
		return descuento;
	}


	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}


	@Override
	public String toString() {
		return "Reciclaje [id=" + id + ", tipo=" + tipo + ", peso=" + peso + ", descuento=" + descuento + "]";
	}
	
	
	
}
