package br.ulbra.projetoanimais;

import javax.swing.JOptionPane;

public class Animal {

    protected String nome;
    protected int idade;
    protected String tipo;

    public Animal() {
    }

    public Animal(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void EmitirSom() {
        if (tipo.equalsIgnoreCase("ave")) {
            System.out.println("Ave: piu piu");
        } else {
            System.out.println("Animal: o animal esta emitindo som");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void getDados() {
        JOptionPane.showMessageDialog(null, "\nNome: " + nome + "\nIdade: " + idade + "\ntipo: " + tipo);
    }

}
