package br.digitalhouse.exercicioImpressora;

public class Foto implements Imprimivel {
    public String nome;
    public String tipo;

    public String getNome() {
        return nome; }
    public void setNome(String novoNome) {
        nome = novoNome; }
    public String getTipo() {
        return tipo; }
    public void setTipo(String novoTipo) {
        tipo = novoTipo; }

    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie: ");
    }
}


