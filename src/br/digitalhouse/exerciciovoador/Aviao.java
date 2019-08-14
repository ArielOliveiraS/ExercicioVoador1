package br.digitalhouse.exerciciovoador;

public class Aviao implements Voador{
    public float horasDeVoo;

    @Override
    public void voar() {
        horasDeVoo = horasDeVoo + 13;
        System.out.println("Estou voando com um avião! " + horasDeVoo);
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "horasDeVoo=" + horasDeVoo +
                '}';
    }
}
