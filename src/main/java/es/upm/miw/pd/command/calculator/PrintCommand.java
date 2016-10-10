package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class PrintCommand extends Command{

	public PrintCommand(Calculator calculator) {
		super(calculator);
	}
	
	@Override
	public void execute() {
		IO.getIO().println(calculator.getTotal());
	}
	
	@Override
	public String name() {
	    return "Print";
	}

}
