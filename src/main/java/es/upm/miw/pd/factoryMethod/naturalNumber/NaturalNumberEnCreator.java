package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEnCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber() {
		return new NaturalNumberEn(2);
	}

	@Override
	public String toString() {
		return "Creador de NaturalNumberEn";
	}
}
