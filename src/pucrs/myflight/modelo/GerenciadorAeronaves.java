package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> avioes;

    public GerenciadorAeronaves(){
        this.avioes = new ArrayList<>();
    }

    public void insere(String umCod, String umaDesc, int umaCap){
        avioes.add(new Aeronave(umCod, umaDesc, umaCap));
    }

    @Override
    public String toString() {
        return String.format("\n%2s",
                avioes);
    }
}
