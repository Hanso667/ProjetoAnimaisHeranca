package br.ulbra.projetoanimais;

import javax.swing.JOptionPane;

public class Gato extends Animal {

    private String corPelagem;

    public Gato() {
        super.tipo = "Gato";
    }

    public Gato(String corPelagem, String nome, int idade) {
        this.corPelagem = corPelagem;
        super.nome = nome;
        super.idade = idade;
        super.tipo = "Gato";
    }

    @Override
    public void EmitirSom() {
        System.out.println("Gato: Miau Miau");
    }

    public String getCorPelagem() {
        return corPelagem;
    }

    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }

    @Override
    public void getDados() {
        JOptionPane.showMessageDialog(null, "Pelagem: " + this.corPelagem + "\nNome: " + this.nome + "\nIdade: " + this.idade + "\ntipo: " + this.tipo);
    }

    public void subirEmArvore() {
        System.out.println("Gato: O Gato subiu na arvore");
    }

    public void cacar() {
        System.out.println("Gato: o gato esta caçando");
        idade -= 1;
    }
}
