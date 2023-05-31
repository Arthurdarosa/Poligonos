package Poligono;

import lombok.Getter;

@Getter
public class Cilindro extends Forma {

	private int lados;
	
	public Cilindro(String nome,int lados) {
		super(nome);
		this.lados = lados;
	}
	
	@Override
	public String desenhar() {
		return super.desenhar()+" e tenho "+lados+" lados";
	}
}
