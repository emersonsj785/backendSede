package com.reto02.microservicios.sede.services;
import org.springframework.stereotype.Service;

import com.reto02.microservicios.commons.services.CommonServiceImpl;
import com.reto02.microservicios.sede.models.entity.Sede;
import com.reto02.microservicios.sede.models.repository.SedeRepository;

@Service
public class SedeServiceImpl extends CommonServiceImpl<Sede, SedeRepository> implements SedeService 
{
	
}
