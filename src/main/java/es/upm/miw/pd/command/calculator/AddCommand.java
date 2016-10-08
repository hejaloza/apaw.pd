package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class AddCommand extends Command{

	public AddCommand(Calculator calculator) {
		super(calculator);
	}
	
	@Override
	public void execute() {
		int sumando = IO.getIO().readInt();
        calculator.add(sumando);
	}

	@Override
	public String name() {
		return "Add";
	}

}
