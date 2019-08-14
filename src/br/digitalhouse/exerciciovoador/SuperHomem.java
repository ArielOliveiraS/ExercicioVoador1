package br.digitalhouse.exerciciovoador;

public class SuperHomem  implements Voador{
    public int experiencia;


    @Override
    public void voar() {
        experiencia = experiencia + 3;
        System.out.println("Estou voando com um campeão! " + experiencia);
    }

    @Override
    public String toString() {
        return "SuperHomem{" +
                "experiencia=" + experiencia +
                '}';
    }
}
