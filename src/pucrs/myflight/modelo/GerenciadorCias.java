package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		this.empresas = new ArrayList<>();
	}

	public void insere(String umCodigo, String umNome){
		empresas.add(new CiaAerea(umCodigo, umNome));
	}

	@Override
	public String toString() {
		return String.format("\n%2s",
				empresas);
	}
}
