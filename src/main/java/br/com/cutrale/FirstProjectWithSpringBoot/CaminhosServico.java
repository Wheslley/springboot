package br.com.cutrale.FirstProjectWithSpringBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaminhosServico {
	
	protected List<String> paths = new ArrayList<>();

	public CaminhosServico() {
		this.paths.add("[GET]    /calcula");
		this.paths.add("[GET]    /calcula/{id}");
		this.paths.add("[DELETE] /calcula/{id}");
		this.paths.add("[GET]    /objframework");
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<String> home() {
		int contador = 0;
		String strReturn = "{ \"paths\" : [";
		for (String path : paths) {
			if(contador != 0) strReturn = strReturn + ",";
			strReturn = strReturn + "{\"endPoint\": \""+path+"\"}";
			++contador;
		}
		strReturn = strReturn + "]}";
		return new ResponseEntity<String>( strReturn, HttpStatus.OK);
		
	}
	
}
