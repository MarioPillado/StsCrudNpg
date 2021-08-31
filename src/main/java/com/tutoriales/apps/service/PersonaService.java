package com.tutoriales.apps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutoriales.apps.models.Persona;
import com.tutoriales.apps.repository.IPersonaRepository;

@Service
public class PersonaService {

	@Autowired
	private IPersonaRepository personaRepository;
	
	public Persona create (Persona persona) {
		return personaRepository.save(persona);
	}
	
	public List<Persona> getAllPersonas () {
		return personaRepository.findAll();
	}
	
	public void delete (Persona persona) {
		personaRepository.delete(persona);
	}
	
	public Optional<Persona> findById (Long id) {
		return personaRepository.findById(id);
	}
}
