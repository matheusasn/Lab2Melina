package controller;

import inteface.TipoFormatacao;

public class Controller {
	
	public Controller() {
		
	}
	
	public String formataTipoTexto(TipoFormatacao tipoFormatacao, String texto) {
			return tipoFormatacao.tipoFormatoTexto(texto);
	}
}
