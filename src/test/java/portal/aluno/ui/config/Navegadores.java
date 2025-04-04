package portal.aluno.ui.config;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import portal.aluno.ui.drivers.Drivers;

public class Navegadores extends Drivers {

	 private static String browser = "Chrome";

	public static void IniciarTeste() {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/turma_062024/frontend/index.html");
	}

	public static void finalizarTeste() {
		driver.quit();
	}
}
