package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;
    private ArrayList<Geo> gloc;

    public GerenciadorAeroportos(){
        this.aeroportos = new ArrayList<>();
        this.gloc = new ArrayList<>();
    }

    public void insere(String umCod, String umNome, double umLat, double umLongi){
        aeroportos.add(new Aeroporto(umCod, umNome, umLat, umLongi));
    }

    @Override
    public String toString() {
        return String.format("\n %2s",
                aeroportos);
    }
}
