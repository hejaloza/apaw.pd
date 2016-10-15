package es.upm.miw.pd.command.calculator;

public class MementoCalculadora {

	private int value;

	private String key;

	public MementoCalculadora(int value, String key) {
		this.value = value;
		this.key = key;
	}

	public String getKey() {
		return this.key;
	}

	public int getValor() {
		return this.value;
	}

}
