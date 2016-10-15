package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ReturnCommand extends Command {

	private GestorMementos<MementoCalculadora> gestorMementos;

	public ReturnCommand(Calculator calculator, GestorMementos<MementoCalculadora> gestorMementos) {
		super(calculator);
		this.gestorMementos = gestorMementos;
	}

	@Override
	public void execute() {
		String key = (String) IO.getIO().select(gestorMementos.keys());
		calculator.restoreMemento(gestorMementos.getMemento(key));
	}

	@Override
	public String name() {
		return "Return";
	}
}