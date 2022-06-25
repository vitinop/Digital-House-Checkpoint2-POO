package entities;

import entities.exception.MensagemException;

import java.util.ArrayList;
import java.util.List;

public interface Notas {

    List NotasLista = new ArrayList();

    public void cadNotasLista() throws MensagemException;
}