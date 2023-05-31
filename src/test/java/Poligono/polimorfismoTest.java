package Poligono;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class polimorfismoTest {
	List<Forma> formas = new ArrayList<Forma>();

	
	@BeforeEach
	public void init() {
		formas.add(new Cilindro("cilindro", 2));
		formas.add(new Circulo());
		formas.add(new Triangulo());
	}
	@Test
	    public void testDesenharFormas() {
	        Assertions.assertEquals("sou a forma cilindro e tenho 2 lados", formas.get(0).desenhar());
	        Assertions.assertEquals("sou um circulo e tenho minha propria desenho", formas.get(1).desenhar());
	        Assertions.assertEquals("sou a forma Tringulo", formas.get(2).desenhar());
	    }

	    @Test
	    public void testCalculaAreaCirculo() {
	        Circulo circulo = new Circulo();
	        Assertions.assertEquals("minha area é", circulo.calculaArea());
	    }
	}

