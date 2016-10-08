package es.upm.miw.pd.command.calculator;

public interface Momentable<T> {
	
	T createMemento();

    void restoreMemento(T memento);

}
