package br.com.cutrale.FirstProjectWithSpringBoot.repository;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cutrale.FirstProjectWithSpringBoot.model.UsuarioPadrao;

@Transactional
public interface UsuarioPadraoRepository extends Repository<UsuarioPadrao, Integer>{
	
    public List<UsuarioPadrao> findAll();
 
}
