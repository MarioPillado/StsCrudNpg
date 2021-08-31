package com.tutoriales.apps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutoriales.apps.models.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Long>{

}
