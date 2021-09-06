package com.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.domain.Categoria;

public interface CategoriaRep  extends JpaRepository<Categoria, Integer>{

}
