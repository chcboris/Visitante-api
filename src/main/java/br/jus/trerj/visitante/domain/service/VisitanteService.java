package br.jus.trerj.visitante.domain.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import br.jus.trerj.visitante.domain.model.Visitante;

@Service
public class VisitanteService implements Serializable{

	private static final long serialVersionUID = -8508235042859017745L;

	
	/* ------------------------------------- Consultas --------------------------- */
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
		
		return visitante;
	}
	
	public List<Visitante> listarTeste() {
		
		Visitante visitante1 = new Visitante();
		
		visitante1.setContato("Christian");
		visitante1.setDataAcesso(new Date());
		visitante1.setDestino("SEDSIS");
		visitante1.setDocumento("RG");
		visitante1.setEmpresa("TRE-RJ");
		visitante1.setId(1L);
		visitante1.setNome("Christian Moreira");
		visitante1.setNumeroDoc("100");
		visitante1.setRamal("8243");
		visitante1.setTelefone("(21) 98367-8785");
		
		Visitante visitante2 = new Visitante();		
		visitante2.setContato("Christian 2");
		visitante2.setDataAcesso(new Date());
		visitante2.setDestino("SEDSIS");
		visitante2.setDocumento("RG");
		visitante2.setEmpresa("TRE-RJ");
		visitante2.setId(2L);
		visitante2.setNome("Christian Moreira");
		visitante2.setNumeroDoc("100");
		visitante2.setRamal("8243");
		visitante2.setTelefone("(21) 98367-8785");

		Visitante visitante3 = new Visitante();		
		visitante3.setContato("Christian 3");
		visitante3.setDataAcesso(new Date());
		visitante3.setDestino("SEDSIS");
		visitante3.setDocumento("RG");
		visitante3.setEmpresa("TRE-RJ");
		visitante3.setId(2L);
		visitante3.setNome("Christian Moreira");
		visitante3.setNumeroDoc("100");
		visitante3.setRamal("8243");
		visitante3.setTelefone("(21) 98367-8785");
		
		ArrayList<Visitante> lst = new ArrayList<Visitante>(); 
		
		lst.add(visitante1);
		lst.add(visitante2);
		lst.add(visitante3);
		
		return lst;
	}
	
	public Visitante acharVisitanteTeste(int ind) {
		
		Visitante visitante1 = new Visitante();
		
		visitante1.setContato("Christian");
		visitante1.setDataAcesso(new Date());
		visitante1.setDestino("SEDSIS");
		visitante1.setDocumento("RG");
		visitante1.setEmpresa("TRE-RJ");
		visitante1.setId(1L);
		visitante1.setNome("Christian Moreira");
		visitante1.setNumeroDoc("100");
		visitante1.setRamal("8243");
		visitante1.setTelefone("(21) 98367-8785");
		
		Visitante visitante2 = new Visitante();		
		visitante2.setContato("Christian 2");
		visitante2.setDataAcesso(new Date());
		visitante2.setDestino("SEDSIS");
		visitante2.setDocumento("RG");
		visitante2.setEmpresa("TRE-RJ");
		visitante2.setId(2L);
		visitante2.setNome("Christian Moreira");
		visitante2.setNumeroDoc("100");
		visitante2.setRamal("8243");
		visitante2.setTelefone("(21) 98367-8785");

		Visitante visitante3 = new Visitante();		
		visitante3.setContato("Christian 3");
		visitante3.setDataAcesso(new Date());
		visitante3.setDestino("SEDSIS");
		visitante3.setDocumento("RG");
		visitante3.setEmpresa("TRE-RJ");
		visitante3.setId(2L);
		visitante3.setNome("Christian Moreira");
		visitante3.setNumeroDoc("100");
		visitante3.setRamal("8243");
		visitante3.setTelefone("(21) 98367-8785");
		
		ArrayList<Visitante> lst = new ArrayList<Visitante>(); 
		
		lst.add(visitante1);
		lst.add(visitante2);
		lst.add(visitante3);
		
		return lst.get(ind);
	}
}
