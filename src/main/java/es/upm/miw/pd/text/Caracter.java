package es.upm.miw.pd.text;

public class Caracter extends TextoComponente {

    private char caracter;

    public Caracter(char caracter) {
        this.caracter = caracter;
    }

    @Override
    public void add(TextoComponente componente) {
    	
    }

    @Override
    public void remove(TextoComponente componente) {
    	
    }

    @Override
    public String dibujar(boolean mayusculas) {
        if (mayusculas) {
            return String.valueOf(Character.toUpperCase(caracter));
        }
        return String.valueOf(caracter);
    }

    @Override
    public boolean isComposite() {
        return false;
    }

}
