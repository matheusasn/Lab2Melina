package estilos;

import inteface.TipoFormatacao;

public class Italico implements TipoFormatacao {
	
	@Override
	public String tipoFormatoTexto(String msg) {
		return "\033[3m" + msg + "\033[0m";
	}
}
