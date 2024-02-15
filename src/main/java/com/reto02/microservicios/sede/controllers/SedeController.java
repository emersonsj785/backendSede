package com.reto02.microservicios.sede.controllers;

import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.reto02.microservicios.commons.controllers.CommonController;
import com.reto02.microservicios.sede.models.entity.Sede;
import com.reto02.microservicios.sede.services.SedeService;

@RestController
public class SedeController extends CommonController<Sede, SedeService>
{
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Sede sede, @PathVariable Long id)
	{
		Optional<Sede> s = service.findById(id);
		
		if(s.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Sede sedeDb = s.get();
		sedeDb.setDescSede(sede.getDescSede());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(sedeDb));
		
	}
	
}
