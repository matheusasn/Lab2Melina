package estilos;

import inteface.TipoFormatacao;

public class CaixaAlta implements TipoFormatacao{
	
	public CaixaAlta() {
		
	}
	
	@Override
	public String tipoFormatoTexto(String texto) {
		return texto.toUpperCase();
	}

}
