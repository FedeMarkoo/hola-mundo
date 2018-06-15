package loom.hola_mundo;

import org.junit.Assert;
import org.junit.Test;

public class HolaMundoTests {
	@Test
	public void queSaludaCorrectamente() {
		HolaMundo holaMundo = new HolaMundo();
		Assert.assertEquals("¡Hola, Kent Beck!", holaMundo.saludar("Kent Beck"));
		Assert.assertEquals("¡Hola, Fede Markoo!", holaMundo.saludar("Fede Markoo"));
		Assert.assertEquals("¡Hola, Lucas Videla!", holaMundo.saludar("lucas videla"));
	}

	@Test
	public void queSaludaCorrectamenteSimpsons() {
		HolaMundo holaMundo = new HolaMundo();
		Assert.assertEquals("¡Hola, Georgia!", holaMundo.saludar("Georgia"));
		Assert.assertEquals("¡Hola, Texas!", holaMundo.saludar("Texas"));
		Assert.assertEquals("¡Hola, Aam.. Brooklyn!", holaMundo.saludar("aam.. Brooklyn"));
		Assert.assertEquals("¡Hola, Rusia!", holaMundo.saludar("Rusia"));
		Assert.assertEquals("¡Hola, Escocia!", holaMundo.saludar("Escocia"));
		Assert.assertEquals("¡Hola, Homero!", holaMundo.saludar("HOMERO"));
	}
}
