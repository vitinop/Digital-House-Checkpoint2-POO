import entities.Aluno;
import entities.CadastrarAluno;
import entities.CadastrarProfessor;
import entities.Professor;
import entities.exception.MensagemException;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws MensagemException {

        //Interação com o usuário Aluno
        Scanner cdt = new Scanner(System.in);
        System.out.println("_______Area de cadastro de Aluno_______");
        System.out.println("");
        System.out.print("Por favor insira seu Nome: ");
        String nome = cdt.nextLine();
        System.out.println("Escreva a série da turma: ");
        String turma = cdt.nextLine();
        System.out.println("Por favor escreva o ano da turma: ");
        int anoTurma = cdt.nextInt();
        System.out.println("Bem vindo(a): " + nome.toUpperCase());
        System.out.println("");

                    //Instanciação dinâmica do Obj.Aluno
        CadastrarAluno aluno = new CadastrarAluno(turma,anoTurma,nome);
        System.out.println(aluno);
        System.out.println("");
                //Interação com o usuário Professor
        Scanner prof = new Scanner(System.in);
        System.out.println("_______Area de cadastro de Professor_______");
        System.out.println("");
        System.out.print("Por favor insira seu Nome: ");
        nome = prof.nextLine();
        System.out.println("Por favor escreva a sua matéria: ");
        String materiaProfessor= prof.nextLine();

        System.out.println("Bem vindo(a): " + nome.toUpperCase());


                    //Instanciação dinâmica do Obj.Professor
        CadastrarProfessor professor = new CadastrarProfessor(nome, materiaProfessor);
        System.out.println("");
        System.out.println(professor);

        //Acesso de notas pelo Professor
        Professor professor1 = new Professor();
        professor1.cadNotasLista();
        professor1.acessNotas();

        //Acesso de notas pelo Aluno
        Aluno aluno1 = new Aluno();
        aluno1.acessNotas();

        cdt.close();
        prof.close();
    }


}



