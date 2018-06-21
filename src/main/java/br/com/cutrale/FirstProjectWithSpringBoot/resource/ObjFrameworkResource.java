package br.com.cutrale.FirstProjectWithSpringBoot.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cutrale.FirstProjectWithSpringBoot.model.ObjFramework;
import br.com.cutrale.FirstProjectWithSpringBoot.repository.ObjFrameworkRepository;

@RestController
public class ObjFrameworkResource {
		
	@Autowired
	ObjFrameworkRepository objFrameworkRepository;
	
	@RequestMapping(value = "/objframework", method = RequestMethod.GET)
	public ResponseEntity<List<ObjFramework>> listar() {
		
		List<ObjFramework> listaObjFramework = objFrameworkRepository.findAll();
		
		if (listaObjFramework == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<List<ObjFramework>>(listaObjFramework, HttpStatus.OK);
		
	}
	
}
