package br.com.aula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();

        System.out.println("Digite seu peso");
        Double peso = entrada.nextDouble();

        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();

        System.out.printf("Nome: %s, Peso: %.2f, Idade: %d.", nome, peso, idade);
        //System.out.println("Nome: " + nome + "peso: " + peso + "idade " + idade);

        entrada.close();
    }
}