package controller;

import estilos.CaixaAlta;
import estilos.CaixaBaixa;
import estilos.Italico;
import estilos.Negrito;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while (true){
			
			Controller Controller = new Controller();
			Scanner scan = new Scanner(System.in);
			CaixaAlta caixaAlta = new CaixaAlta();
			CaixaBaixa caixaBaixa = new CaixaBaixa();
			Italico italico = new Italico();
			Negrito negrito = new Negrito();
			
			System.out.print("Digite seu Texto: ");
			String texto = scan.nextLine();
			System.out.print("\nComo deseja formatar seu Texto? ");
			System.out.println("\nDigite 1 - Caixa Alta\n"
					+ "Digite 2 - Caixa Baixa\n"
					+ "Digite 3 - Caixa Negrito\n"
					+ "Digite 4 - Caixa itálico\n");
			int formato = scan.nextInt();			
			
			String resultado = "";
			
			if (formato == 1) { 
				resultado = Controller.formataTipoTexto(caixaAlta, texto);
			} else if (formato == 2) {
				resultado = Controller.formataTipoTexto(caixaBaixa, texto);				
			} else if (formato == 3) {
				resultado = Controller.formataTipoTexto(negrito, texto);				
			} else if (formato == 4) {
				resultado = Controller.formataTipoTexto(italico, texto);			
			} else {
				resultado = "Formato Invalido!";				
			}
			System.out.println(resultado + "\n");		
		}
		
	}
}
