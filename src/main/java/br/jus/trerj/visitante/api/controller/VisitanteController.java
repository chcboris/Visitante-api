package br.jus.trerj.visitante.api.controller;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	
	@RequestMapping(value = "/obterVisitante/{idVisitante}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> obterVisitante(@PathVariable("idVisitante") String idVisitante) {
		Visitante visita = new Visitante();
		try {
				HttpHeaders headers = new HttpHeaders();
		    	ResponseEntity<Visitante> response = new ResponseEntity<>(visita, headers, HttpStatus.OK);
		    	return response;
	
		} catch (Exception e) {
			this.logger.error("Erro ao obter o visitante", e);
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);	
		}
	}

	@RequestMapping(value = "/obterVisitante/}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> obterVisitante() {
		Visitante visita = new Visitante();
		try {
				HttpHeaders headers = new HttpHeaders();
		    	ResponseEntity<Visitante> response = new ResponseEntity<>(visita, headers, HttpStatus.OK);
		    	return response;
	
		} catch (Exception e) {
			this.logger.error("Erro ao obter o visitante", e);
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);	
		}
	}

	@RequestMapping(value = "/testarVisitante", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Visitante> buscarEvento() {
		
		Visitante visita = this.service.buscarVisitante();
		
		return new ResponseEntity<Visitante>(visita, HttpStatus.OK);
	}
	

	@RequestMapping(value = "/testarAcharVisitante/}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> acharVisitante() {
		Visitante visita = this.service.buscarVisitante();
		try {
				HttpHeaders headers = new HttpHeaders();
		    	ResponseEntity<Visitante> response = new ResponseEntity<>(visita, headers, HttpStatus.OK);
		    	return response;
	
		} catch (Exception e) {
			this.logger.error("Erro ao obter o visitante", e);
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);	
		}
	}
	
	public void listar() {
		
	}
	
	public void cadastrar() {
		
	}
	
	public void excluir() {
		
	}
	
	public void alterar() {
		
	}

	public void salvar() {
		
	}
	
//	@RequestMapping(value = "/listarDiplomasPorFiltro", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<?> listarDiplomaPorFiltro(@RequestBody FiltroDiplomaDTO filtro) {
//		
//		try {
//			List<Visitante> listaDiplomas = this.service.listarDiplomaPorFiltro(filtro);
//			
//			List<ImpressaoDiplomaDTO> listaDTO = new ArrayList<>();
//			for (ImpressaoDiploma impressaoDiploma : listaDiplomas) {
//				listaDTO.add(impressaoDiploma.converteParaDTO());
//			}
//			
//			return ResponseEntity.ok().body(listaDTO);
//			
//		} catch (Exception e) {
//			this.logger.error("ERRO NO SERVIÇO: ", e.getMessage());
//			return new ResponseEntity<StringDTO>(new StringDTO("ERRO NO SERVIÇO"), HttpStatus.BAD_REQUEST);
//		}
//
//	}
}
