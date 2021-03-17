package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.GerenciadorAeronaves;
import pucrs.myflight.modelo.GerenciadorAeroportos;
import pucrs.myflight.modelo.GerenciadorCias;

public class App {

	public static void main(String[] args) {

		GerenciadorCias gc = new GerenciadorCias();
		GerenciadorAeronaves av = new GerenciadorAeronaves();
		GerenciadorAeroportos ap = new GerenciadorAeroportos();

		gc.insere("JJ", "LATAM Linhas Aereas");
		gc.insere("G3", "Gol Linhas Aereas SA");
		gc.insere("TP", "TAP Portugal");
		gc.insere("AD", "Azul Linhas Aereas");

		av.insere("733", "Boeing 737-300", 140);
		av.insere("73G", "Boeing 737-300", 126);

		ap.insere("POA", "Salgado Filho Intl Apt", -29.9939, -51.1711 );

		System.out.println(gc.toString());
		System.out.println(av.toString());
		System.out.println(ap.toString());
	}
}
