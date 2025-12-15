package com.honestwy.adminback.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
public class PrecioOficialRequestDTO {

    @NotBlank
    private String nombre;

    private String descripcion;
    private String categoria;
    private String subcategoria;
    private String unidad;

    @NotNull
    private Integer precioMaximo;

    private Integer precioReferencia;
    private Boolean activo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	public PrecioOficialRequestDTO(@NotBlank String nombre, String descripcion, String categoria, String subcategoria,
			String unidad, @NotNull Integer precioMaximo, Integer precioReferencia, Boolean activo) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.subcategoria = subcategoria;
		this.unidad = unidad;
		this.precioMaximo = precioMaximo;
		this.precioReferencia = precioReferencia;
		this.activo = activo;
	}
	public PrecioOficialRequestDTO() {
	}
    
    
}
