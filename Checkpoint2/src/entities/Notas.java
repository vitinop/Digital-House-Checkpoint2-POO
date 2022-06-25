package entities;

import entities.exception.MensagemException;

import java.util.ArrayList;
import java.util.List;

public interface Notas {

    //Métodos da inteface

    List NotasLista = new ArrayList();

    //Médotodo de cadastro de notas
    public void cadNotasLista() throws MensagemException;
}