package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class TextoComposite extends TextoComponente {

	protected List<TextoComponente> componentes;

	public TextoComposite() {
		this.componentes = new ArrayList<TextoComponente>();
	}

	public abstract void add(TextoComponente componente);

	public abstract void remove(TextoComponente componente);

	public abstract String dibujar(boolean mayusculas);

	public abstract boolean isComposite();
}
