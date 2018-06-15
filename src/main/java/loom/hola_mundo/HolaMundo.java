package loom.hola_mundo;

public class HolaMundo {

	public String saludar(final String persona) {
		String nuevo = ""; // Creo una String nueva para usar de "buffer" para poner en CamelCase
		for (String cad : persona.split(" ")) { // separo el nombre en espacios para obtener los nombres y apellidos
			nuevo += (cad.charAt(0) + "").toUpperCase(); // con esto obtengo la primer letra y la pongo en mayuscula
			nuevo += cad.substring(1).toLowerCase(); // con esto obtengo el resto del nombre para poner en minuscula
			nuevo += " "; // aca agrego el espacio que lo borra el split
		}
		return "¡Hola, " + nuevo.trim() + "!"; // formateo la salida con el nombre y todo como pide el ejercicio
	}
}
