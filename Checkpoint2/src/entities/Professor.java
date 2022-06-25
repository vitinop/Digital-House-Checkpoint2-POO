package entities;

public class Professor implements Notas{

    //Construtor Padrão
    public Professor() {
    }

    //Acesso da interface notas
    public boolean acessNotas() {
        if (NotasLista.size() != 0) {
            for (int i = 0; i < NotasLista.size(); i++) {
                System.out.println(NotasLista.get(i));
            }

        }

        return false;
    }


    //Inserção das notas através de lista
    @Override
    public void cadNotasLista() {

        NotasLista.add(7.00);
        NotasLista.add(5.00);
    }
}
