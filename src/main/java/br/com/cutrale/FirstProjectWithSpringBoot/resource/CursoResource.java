package br.com.cutrale.FirstProjectWithSpringBoot.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cutrale.FirstProjectWithSpringBoot.model.Curso;

@RestController
public class CursoResource {

	private int indexMap = 1;
	private Map<Integer, Curso> cursos;

	public CursoResource() {

		cursos = new HashMap<Integer, Curso>();

		Curso c1 = new Curso(this.indexMap, "Workshop Rest", "24hs");
		cursos.put(this.indexMap, c1);
		++this.indexMap;

		Curso c2 = new Curso(this.indexMap, "Workshop Spring MVC", "24hs");
		cursos.put(this.indexMap, c2);
		++this.indexMap;

		Curso c3 = new Curso(this.indexMap, "Desenvolvimento Web com JSF 2", "60hs");
		cursos.put(this.indexMap, c3);
		++this.indexMap;

	}

	@RequestMapping(value = "/cursos", method = RequestMethod.GET)
	public ResponseEntity<List<Curso>> listar() {

		return new ResponseEntity<List<Curso>>(new ArrayList<Curso>(cursos.values()), HttpStatus.OK);
	}

	@RequestMapping(value = "/cursos/{id}", method = RequestMethod.GET)
	public ResponseEntity<Curso> buscar(@PathVariable("id") Integer id) {
		Curso curso = cursos.get(id);

		if (curso == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Curso>(curso, HttpStatus.OK);
	}

	@RequestMapping(value = "/cursos/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletar(@PathVariable("id") int id) {
		Curso curso = cursos.remove(id);

		if (curso == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/cursos/add", method = RequestMethod.POST)
	public ResponseEntity<?> incluir(@RequestParam("nome") String nome, @RequestParam("horas") String horas) {
		
		try {
			Curso curso = new Curso(this.indexMap, nome, horas);
			cursos.put(this.indexMap, curso);
			++this.indexMap;
		} catch (Exception ex) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
