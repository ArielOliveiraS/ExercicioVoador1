package br.digitalhouse.exerciciovoador;

public class Principal {
    public static void main(String[] args) {
        TorreDeControle novaTorreDeControle = new TorreDeControle();


        Pato patolino = new Pato();
      //  patolino.voar();
        novaTorreDeControle.adicionarVoador(patolino);
        //novaTorreDeControle.voemTodos();


        Aviao bis14 = new Aviao();
        //bis14.voar();
        novaTorreDeControle.adicionarVoador(bis14);
       // novaTorreDeControle.voemTodos();

        SuperHomem clarkKent = new SuperHomem();
       // clarkKent.voar();
        novaTorreDeControle.adicionarVoador(clarkKent);
        //novaTorreDeControle.voemTodos();

        novaTorreDeControle.voemTodos();

    }
}