package br.digitalhouse.exerciciovoador;

public class Pato implements Voador {
    public int unidadeEnergia;

    @Override
    public void voar() {
        unidadeEnergia = unidadeEnergia - 5;
        System.out.println("Estou voando como um pato! " + unidadeEnergia);
    }
    @Override
    public String toString() {
        return "Pato{" +
                "unidadeEnergia=" + unidadeEnergia +
                '}';
    }
}

//        if(voar == true){
//             unidadeEnergia = unidadeEnergia - 5;
//           System.out.println("Estou voando como um pato! " + unidadeEnergia);
//        }else{
//           System.out.println("Não estou voando! ");}
//        }}
