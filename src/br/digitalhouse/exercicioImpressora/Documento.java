package br.digitalhouse.exercicioImpressora;

public class Documento implements Imprimivel {
    public String nome;
    public String tipo;
    public Documento() {}

    public String getNome() {
        return nome; }
    public void setNome(String novoNome) {
        nome = novoNome; }
    public String getTipo() {
        return tipo; }
    public void setTipo(String novoTipo) {
        tipo = novoTipo;
    }

    public void imprimir() {
        System.out.println("Sou um documento Word: ");
    }
}



