package entities;

import java.util.Random;
import java.util.Scanner;

public interface Cadastrar {
    //declaração de atributos
    // Constructor padrão

    // Constructor com sobrecarga
    public static void main(String[] args) {
        Random geradormatricula = new Random();
        Scanner cdt = new Scanner(System.in);
        System.out.print("Por favor insira seu Nome: ");
        String nome = cdt.nextLine();
        System.out.print("Por favor insira sua senha: ");
        String senha = cdt.nextLine();
        System.out.println("Bem vindo(a): " + nome + "\n" + "Matricula do usuário: "+ geradormatricula.nextInt(100));

    }

    // Métodos Getters and Setters
}
