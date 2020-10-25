package estilos;

import inteface.TipoFormatacao;

public class Negrito implements TipoFormatacao{
	
	@Override
	public String tipoFormatoTexto(String msg) {
		return "\033[1m" + msg + "\033[1m";
	}
	
}
