package portal.aluno.ui.metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;

import portal.aluno.ui.drivers.Drivers;

public class MetodosTestes extends Drivers {

	/**
	 * Validar um texto capturado utilizando o locator.
	 * 
	 * @param locator
	 * @param textoEsperado
	 * @author Anderson
	 * @category UI
	 */
	public void validarTexto(By locator, String textoEsperado) {
		try {
			String textoCapturado = driver.findElement(locator).getText();
			assertEquals(textoEsperado, textoCapturado);
		} catch (Exception e) {
			throw new NotFoundException("Não encontramos o texto " + textoEsperado);
		}
	}

	/**
	 * Validar o title do HEAD no arquivo HTML
	 * @param titleEsperado
	 * @author Anderson
	 * @category UI
	 * 	 */
	public void validarTitle(String titleEsperado) {
		try {
			String titleCapturado = driver.getTitle();
			assertEquals(titleEsperado, titleCapturado);
		} catch (Exception e) {
			throw new NotFoundException("Title não encontrado ou diferente do esperado " + titleEsperado);
		}
	}
	
	/**
	 * Escrever em um elemento WEB informando o By 
	 * @param locator
	 * @param texto
	 */
	public void escrever(By locator, String texto) {
		try {
			driver.findElement(locator).sendKeys(texto);
		} catch (Exception e) {
		throw new NoSuchElementException("Elemento " + locator + " não encontrado.");
		}
	}

}
