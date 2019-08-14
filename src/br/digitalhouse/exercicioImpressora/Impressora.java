package br.digitalhouse.exercicioImpressora;

import java.util.ArrayList;
import java.util.List;

public class Impressora {

    public Imprimivel imprimir;

    public List<Imprimivel> imprimiveis = new ArrayList<>();

    public void imprimirTudo(){
        for (int i = 0; i <imprimiveis.size() ; i++) {
            System.out.println(imprimiveis.get(i));}
    }

    public void adicionarImprimivel(Imprimivel umImprimivel){

        imprimiveis.add(imprimir);
    }

    public void imprimir(){}

    public Imprimivel getImprimir() {
        return imprimir;}
    public void setImprimir(Imprimivel novaImprimir) {
        imprimir = novaImprimir;}

//        public Impressora(Imprimivel novaImprimir) {
//        imprimir = novaImprimir;}


}
