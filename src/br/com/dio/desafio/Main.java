package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição do curso de java");
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso javascript");
		curso2.setDescricao("descrição do curso de javascript");
		
		Mentoria mentoria = new Mentoria();
		//mentoria.setTitulo("Mentoria de java");
		//mentoria.setDescricao("descrição da mentoria de java");
		mentoria .setDate(LocalDate.now());
		
		//System.out.println(curso1);
//		System.out.println(curso2);
	//	System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos"+ devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("Conteudos concluidos"+ devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		
		System.out.println("-------------------------------");
		
		Dev devJon = new Dev();
		devCamila.setNome("Jon");
		devJon.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos"+ devJon.getConteudosInscritos());
		devJon.progredir();
		System.out.println("Conteudos concluidos"+ devJon.getConteudosConcluidos());
		System.out.println("XP: " + devJon.calcularTotalXp());		
		
	}

}
