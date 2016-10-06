package es.upm.miw.pd.composite.expression;

public class Numero extends Expresion {

	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "" + numero;
	}

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return this.numero;
	}

}
