package entities;

import entities.exception.MensagemException;

import static entities.Notas.NotasLista;

public class Aluno extends Turma implements Notas{
    public Aluno() {
    }

    public boolean acessNotas() {
        if (NotasLista.size() != 0) {
            for (int i = 0; i < NotasLista.size(); i++) {
                System.out.println(NotasLista.get(i));
            }

        }

        return false;
    }


    @Override
    public void cadNotasLista () throws MensagemException {
        throw new MensagemException("{\n" +
                "Error: Não é possivel cadastrar nota -_-!" +
                "\n}");

    }
}
