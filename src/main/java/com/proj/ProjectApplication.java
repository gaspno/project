package com.proj;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proj.domain.Categoria;
import com.proj.repository.CategoriaRep;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner{

	@Autowired
	CategoriaRep rep;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria c1=new Categoria(null,"Esportes");
		
		Categoria c2=new Categoria(null,"Informatica");
		
		rep.saveAll(Arrays.asList(c1,c2));
		
	}

}
