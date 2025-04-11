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
	void setup() {
		Navegadores.IniciarTeste();
	}

	@AfterEach
	void tearDown() {
		 Navegadores.finalizarTeste();
	}

	@Test
	void testTitle() {
		metodo.validarTitle("Plataforma do ALuno - E2E Treinamentos");
	}

	@Test
	void testTitulo() {
		metodo.validarTexto(el.getTituloPrincipal(), "Plataforma E2E Treinamentos");
	}

	@Test
	void loginComSucesso() {
		metodo.escrever(el.getUsuario(), "e2etreinamentos");
		metodo.escrever(el.getSenha(), "e2e@123");
		metodo.clicar(el.getBtnLogin());
		String logado = "Bem vindo a plataforma do Aluno E2E Treinamentos!";
		metodo.validarTexto(el.getTituloLogado(), logado);
	}

	@Test
	void senhaBranco() {
		metodo.escrever(el.getSenha(), "e2e@123");
		metodo.clicar(el.getBtnLogin());
		metodo.validarAlert("Usuário e senha são obrigatórios.");
	}
	
	@Test
	void usuarioBranco() {
		metodo.escrever(el.getUsuario(), "e2etreinamentos");
		metodo.clicar(el.getBtnLogin());
		metodo.validarAlert("Usuário e senha são obrigatórios.");
	}
	
	@Test
	void usuarioInvalido() {
		metodo.escrever(el.getUsuario(), "errado");
		metodo.escrever(el.getSenha(), "e2e@123");
		metodo.clicar(el.getBtnLogin());
		metodo.validarAlert("Usuário ou senha inválidos");
	}
	
	@Test
	void senhaInvalida() {
		metodo.escrever(el.getUsuario(), "e2etreinamentos");
		metodo.escrever(el.getSenha(), "errada");
		metodo.clicar(el.getBtnLogin());
		metodo.validarAlert("Usuário ou senha inválidos");
	}
}