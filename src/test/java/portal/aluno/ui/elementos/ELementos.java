package portal.aluno.ui.elementos;

import org.openqa.selenium.By;

public class ELementos {
	
	// Formar de criar Locators 
	private By tituloPrincipal = By.id("titulo-principal");
	private By usuario = By.id("usuario");
	private By senha = By.id("senha");
	private By btnLogin = By.xpath("//*[text()='Login']");
	
	public By getTituloPrincipal() {
		return tituloPrincipal;
	}
	
	public By getUsuario() {
		return usuario;
	}
	
	public By getSenha() {
		return senha;
	}
	
	public By getBtnLogin() {
		return btnLogin;
	}
	
	
}