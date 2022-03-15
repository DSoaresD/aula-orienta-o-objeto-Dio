package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	
	private int cargaHoraria;
	
	public Curso() {
		
	}
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + this.getTitulo() + ", descricao=" + this.getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}


	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}