package br.digitalhouse.exerciciovoador;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {

    public Voador umVoador;

    public List <Voador> voadores = new ArrayList<>();

    public void voemTodos(){

        for (int i = 0; i <voadores.size() ; i++) {
            voadores.get(i).voar();

            System.out.println(voadores.get(i).toString());
        }
    }
    public void adicionarVoador(Voador umVoador){
        voadores.add(umVoador);
        //voemTodos();
    }
}
