package br.com.cutrale.FirstProjectWithSpringBoot.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cutrale.FirstProjectWithSpringBoot.model.UsuarioPadrao;
import br.com.cutrale.FirstProjectWithSpringBoot.repository.UsuarioPadraoRepository;

@RestController
public class UsuarioPadraoResource {

	@Autowired
	private UsuarioPadraoRepository usuarioPadraoRepository;

	@RequestMapping(value = "/usuarioPadrao/findAll", method = RequestMethod.GET)
	public ResponseEntity<List<UsuarioPadrao>> findAll() {

		List<UsuarioPadrao> listaUsuarioPadrao = this.usuarioPadraoRepository.findAll();

		if (listaUsuarioPadrao == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<List<UsuarioPadrao>>(listaUsuarioPadrao, HttpStatus.OK);

	}

}
