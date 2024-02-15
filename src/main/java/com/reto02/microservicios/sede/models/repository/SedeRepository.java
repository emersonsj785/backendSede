package com.reto02.microservicios.sede.models.repository;

import org.springframework.data.repository.CrudRepository;
import com.reto02.microservicios.sede.models.entity.Sede;

public interface SedeRepository extends CrudRepository<Sede, Long>
{
	
}
