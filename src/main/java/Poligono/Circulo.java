package Poligono;

import lombok.Getter;

@Getter
public class Circulo extends Forma {

	public Circulo() {
		super("circulo");
	}
	
	@Override
	public String desenhar() {
		return "sou um circulo e tenho minha propria desenho";
	}
	
	public String calculaArea() {
		return"minha area é";
	}
}
