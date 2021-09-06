package com.proj.serv;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.domain.Categoria;
import com.proj.repository.CategoriaRep;

@Service
public class CategoriaServ {
	
	@Autowired
	private CategoriaRep rep;
	
	public Categoria buscar(int id) {
		
		Optional<Categoria> opt;
		opt=rep.findById(id);	
		
		return opt.orElseThrow();	
	}
	
}
