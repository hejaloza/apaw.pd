package es.upm.miw.pd.factoryMethod.naturalNumber;


public class NaturalNumberFrCreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createNaturalNumber() {
        return new NaturalNumberFr(1);
    }

    @Override
    public String toString() {
        return "Creador de NaturalNumberFr";
    }
}