package com.honestwy.adminback.dto;

public class PrecioOficialResponseDTO {

    private String id;
    private String nombre;
    private String categoria;
    private String subcategoria;
    private String unidad;
    private Integer precioMaximo;
    private Integer precioReferencia;
    private Boolean activo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getSubcategoria() {
		return subcategoria;
	}
	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public Integer getPrecioMaximo() {
		return precioMaximo;
	}
	public void setPrecioMaximo(Integer precioMaximo) {
		this.precioMaximo = precioMaximo;
	}
	public Integer getPrecioReferencia() {
		return precioReferencia;
	}
	public void setPrecioReferencia(Integer precioReferencia) {
		this.precioReferencia = precioReferencia;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	public PrecioOficialResponseDTO(String id, String nombre, String categoria, String subcategoria, String unidad,
			Integer precioMaximo, Integer precioReferencia, Boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.subcategoria = subcategoria;
		this.unidad = unidad;
		this.precioMaximo = precioMaximo;
		this.precioReferencia = precioReferencia;
		this.activo = activo;
	}
	public PrecioOficialResponseDTO() {
		super();
	}
    
}

