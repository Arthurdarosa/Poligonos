package Poligono;

import lombok.Getter;

@Getter
public class Poligono extends Forma{
	
	private int lados;
	
	public Poligono(String nome, int lados) {
		super(nome);
		this.lados = lados;
	}
}
