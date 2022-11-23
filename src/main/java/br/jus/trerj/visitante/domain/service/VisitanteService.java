package br.jus.trerj.visitante.domain.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import br.jus.trerj.visitante.domain.model.Visitante;

@Service
public class VisitanteService implements Serializable{

	private static final long serialVersionUID = -8508235042859017745L;

	public Visitante buscarVisitante() {
		Visitante visitante = new Visitante();
		
		visitante.setContato("Christian");
		visitante.setDataAcesso(new Date());
		visitante.setDestino("SEDSIS");
		visitante.setDocumento("RG");
		visitante.setEmpresa("TRE-RJ");
		visitante.setId(1L);
		visitante.setNome("Christian Moreira");
		visitante.setNumeroDoc("100");
		visitante.setRamal("8243");
		visitante.setTelefone("(21) 98367-8785");
		
		return null;
	}
	
	public Visitante buscarVisitante(Long id) {
		return null;
	}

	public List<Visitante> listar() {
		return null;
	}

	public Visitante adicionarVisitante(Long id) {
		return null;
	}

	public Visitante removerVisitante(Long id) {
		return null;
	}

	public Visitante alterarVisitante(Long id) {
		return null;
	}	
	
}
