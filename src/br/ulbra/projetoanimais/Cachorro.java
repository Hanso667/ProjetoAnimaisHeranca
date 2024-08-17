package br.ulbra.projetoanimais;

import javax.swing.JOptionPane;

public class Cachorro extends Animal {

    private String raca;

    public Cachorro() {
        super.tipo = "cachorro";
    }

    public Cachorro(String raca, String nome, int idade) {
        super.nome = nome;
        super.idade = idade;
        this.raca = raca;
        super.tipo = "cachorro";
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raça) {
        this.raca = raça;
    }

    @Override
    public void EmitirSom() {
        System.out.println("Cachorro: Au AU");
    }

    public void EmitirSom(String som) {
        System.out.println(som);
    }

    @Override
    public void getDados() {
        JOptionPane.showMessageDialog(null, "Raça: " + this.raca + "\nNome: " + this.nome + "\nIdade: " + this.idade + "\ntipo: " + this.tipo);
    }

    public void correr() {
        System.out.println("cachorro: O cachorro esta correndo");
    }

}
