package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

	private static FactoriaCaracter factoriaCaracter = new FactoriaCaracter();

	private Map<Character, Caracter> caracteres;

	public FactoriaCaracter() {
		caracteres = new HashMap<Character, Caracter>();
	}

	public static FactoriaCaracter getFactoria() {
		return factoriaCaracter;
	}

	public Caracter get(char key) {
		if (caracteres.containsKey(key)) {
			return caracteres.get(key);
		} else {
			Caracter c = new Caracter(key);
			caracteres.put(key, c);
			return c;
		}
	}
}
