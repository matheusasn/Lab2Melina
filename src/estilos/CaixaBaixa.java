package estilos;

import inteface.TipoFormatacao;

public class CaixaBaixa implements TipoFormatacao{
	public CaixaBaixa() {
		
	}
	
	public String tipoFormatoTexto(String texto) {
		return texto.toLowerCase();
	}
}
