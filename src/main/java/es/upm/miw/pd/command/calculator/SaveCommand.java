package es.upm.miw.pd.command.calculator;

public class SaveCommand extends Command {

	private GestorMementos<MementoCalculadora> gestorMementos;

	public SaveCommand(Calculator calculator, GestorMementos<MementoCalculadora> gestorMementos) {
		super(calculator);
		this.gestorMementos = gestorMementos;
	}

	@Override
	public void execute() {
		MementoCalculadora mementoCalculadora = this.calculator.createMemento();
		gestorMementos.addMemento(mementoCalculadora.getKey(), mementoCalculadora);
	}

	@Override
	public String name() {
		return "Save";
	}

}
