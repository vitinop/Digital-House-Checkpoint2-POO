package entities;

public class Professor implements Notas{

    public Professor() {
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
    public void cadNotasLista() {

        NotasLista.add(7.00);
        NotasLista.add(5.00);
    }
}
