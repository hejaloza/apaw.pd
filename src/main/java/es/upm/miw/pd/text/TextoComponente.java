package es.upm.miw.pd.text;

public abstract class TextoComponente {

    public abstract void add(TextoComponente componente);

    public abstract void remove(TextoComponente componente);

    public abstract String dibujar(boolean mayusculas);

    public abstract boolean isComposite();
}
