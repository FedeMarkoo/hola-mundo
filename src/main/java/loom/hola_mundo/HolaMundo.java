
package loom.hola_mundo;

/**
 * @author FedeMarkoo
 *
 */
public class HolaMundo {

    /**
     * Saluda a la persona.
     * Este método recibe por parametro el nombre de la persona
     * y devuelve un String saludando por su nombre.
     *
     * @param persona a saludar.
     * @return persona saludada.
     */

public String saludar(final String persona) {
		String nuevo = "";
		for (String cad : persona.split(" ")) {
			nuevo += (cad.charAt(0) + "").toUpperCase();
			nuevo += cad.substring(1).toLowerCase();
			nuevo += " ";
		}
		return "¡Hola, " + nuevo.trim() + "!";
	}
}
