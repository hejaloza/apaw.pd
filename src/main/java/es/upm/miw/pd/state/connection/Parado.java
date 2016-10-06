package es.upm.miw.pd.state.connection;

public class Parado extends State {

	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException(MENSAJE_OPERATION_EXCEPTION);
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException(MENSAJE_OPERATION_EXCEPTION);
	}

	@Override
	public void parar(Conexion conexion) {

	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstado(new Preparado());
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException(MENSAJE_OPERATION_EXCEPTION);

	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException(MENSAJE_OPERATION_EXCEPTION);
	}

	@Override
	public Estado getEstado() {
		return Estado.PARADO;
	}

}
