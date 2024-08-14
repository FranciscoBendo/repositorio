package br.com.aula;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = JOptionPane.showInputDialog("Digite seu nome");
        Double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));

        System.out.println("Nome: " + nome + ", Peso: " + peso + ", Idade: " + idade);

        entrada.close();
    }
}