package br.jus.trerj.visitante.api.controller;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.jus.trerj.visitante.domain.model.Visitante;
import br.jus.trerj.visitante.domain.service.VisitanteService;

@RestController
@RequestMapping(value="/acessoVisitante")
public class VisitanteController implements Serializable{

	private static final long serialVersionUID = -7213806792451521736L;

	@Autowired
	private VisitanteService service;
	
	private Logger logger = LoggerFactory.getLogger(Visitante.class);

	
	// ------------------------------------- Consultas ---------------------------
	
	// retorna um objeto
	@RequestMapping(value = "/testeConsultarVisitante", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Visitante> buscarEvento() {
		
		Visitante visita = this.service.buscarVisitante();
		
		return new ResponseEntity<Visitante>(visita, HttpStatus.OK);
	}	
	
	// retorna um objeto a partir de um id
	@RequestMapping(value = "/testeObterVisitante/{idVisitante}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> testarObterVisitante(@PathVariable("idVisitante") int idVisitante) {
		Visitante visita = new Visitante();
		try {
				visita = this.service.acharVisitanteTeste(idVisitante);
				HttpHeaders headers = new HttpHeaders();
		    	ResponseEntity<Visitante> response = new ResponseEntity<>(visita, headers, HttpStatus.OK);
		    	return response;
	
		} catch (Exception e) {
			this.logger.error("Erro ao obter o visitante", e);
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);	
		}
	}
	
	// retorna uma listagem
	@RequestMapping(value = "/testeListar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> listagem() {
		
		try {
			List<Visitante> lista = this.service.listarTeste();
						
			return ResponseEntity.ok().body(lista);
			
		} catch (Exception e) {
			this.logger.error("ERRO NO SERVIÇO: ", e.getMessage());
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}	
	
	// retorna um tipo primitivo
	@GetMapping("/numero")
	public Integer numero() {		
		return 1;
	}

	@GetMapping("/texto")
	public ResponseEntity<String> ols() {
			
		return new ResponseEntity<String>("Olá Spring Boot", HttpStatus.OK);
	}

}
	
//	localhost:8080/visitante-api/acessoVisitante/testarVisitante	
	
	

	
	

