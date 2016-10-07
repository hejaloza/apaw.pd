package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber() {
		return new NaturalNumberEs(2);
	}

	@Override
	public String toString() {
		return "Creador de NaturalNumberEs";
	}

}
