package com.reto02.microservicios.sede.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name="sede")
public class Sede
{
	
	@Column(name = "IDSEDE")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSede;
    
    @Column(name = "DESCSEDE")
    private String descSede;
    
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    
    @PrePersist
    public void prePersist() {
    	this.fechaRegistro = new Date();
    }

	public Long getIdSede() {
		return idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public String getDescSede() {
		return descSede;
	}

	public void setDescSede(String descSede) {
		this.descSede = descSede;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

}

