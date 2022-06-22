package entities;


import java.util.Scanner;

public interface Cadastrar {

    public static void main(String[] args) {
        Scanner cdt = new Scanner(System.in);
        System.out.print("Por favor insira seu login: ");
        String nome = cdt.nextLine();
        System.out.print("Por favor insira sua senha: ");
        int senha = cdt.nextInt();
        System.out.println("Bem vindo(a): " + nome);

        CadastarProfessor usuario = new CadastarProfessor() {};


    }
}
