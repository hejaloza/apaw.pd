package es.upm.miw.pd.composite.expression;

public class Restar extends Operacion {

	public Expresion expresionResta1;
	public Expresion expresionResta2;

	public Restar(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
		this.expresionResta1 = expresion1;
		this.expresionResta2 = expresion2;
	}

	@Override
	public String toString() {
		return "(" + expresionResta1 + "-" + expresionResta2 + ")";
	}

	@Override
	public int operar() {

		return expresionResta1.operar() - expresionResta2.operar();
	}

}
