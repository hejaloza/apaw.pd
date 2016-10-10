package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class SubtractCommand extends Command{

	public SubtractCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		int sumando = IO.getIO().readInt();
        calculator.subtract(sumando);
	}
	
	@Override
	public String name() {
	    return "Subtract";
	}

}
