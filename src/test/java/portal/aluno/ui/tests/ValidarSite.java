package portal.aluno.ui.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import portal.aluno.ui.config.Navegadores;
import portal.aluno.ui.elementos.ELementos;
import portal.aluno.ui.metodos.MetodosTestes;

public class ValidarSite {
	
	MetodosTestes metodo = new MetodosTestes();
	ELementos el = new ELementos();

	@BeforeEach
	public void setup() {
		Navegadores.IniciarTeste();
	}
	
	@AfterEach
	public void tearDown() {
		Navegadores.finalizarTeste();
	}
	
	@Test
	public void testTitle() {
		metodo.validarTitle("Plataforma do ALuno - E2E Treinamentos");
	}

	@Test
	public void testTitulo() {
		metodo.validarTexto(el.getTituloPrincipal(), "Plataforma E2E Treinamentos");
	}

}
