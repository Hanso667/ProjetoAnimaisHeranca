package br.ulbra.projetoanimais;

import java.util.Scanner;

public class Petshop {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o nome do cachorro: ");
        cachorro.setNome(ler.next());
        
        System.out.println("Insira a idade: ");
        cachorro.setIdade(ler.nextInt());
        
        System.out.println("Insira a raça do cachorro: ");
        cachorro.setRaca(ler.next());
        cachorro.getDados();
        cachorro.EmitirSom();

        System.out.println("Insira o nome do gato: ");
        gato.setNome(ler.next());
        System.out.println("Insira a idade:");
        gato.setIdade(ler.nextInt());
        System.out.println("insira a pelagem:");
        gato.setCorPelagem(ler.next());
        gato.subirEmArvore();
        gato.cacar();
        gato.getDados();
        gato.EmitirSom();

        System.out.println("Insira o tipo do Animal:");
        animal.setTipo(ler.next());
        System.out.println("Insira o nome:");
        animal.setNome(ler.next());
        System.out.println("Insira a idade:");
        animal.setIdade(ler.nextInt());
        animal.getDados();
        animal.EmitirSom();
    }

}
