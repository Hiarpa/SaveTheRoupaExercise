import classes.GuardaVolumes;
import classes.Peca;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //Criando instâncias de Peça
        Peca p1 = new Peca("Golf", "Pants");
        Peca p2 = new Peca("Nike","Tenis");
        Peca p3 = new Peca("Lacoste","Camisa");

        //Add peças em uma lista
        List<Peca> listaDePecas = new ArrayList<>();
        listaDePecas.add(p1);
        listaDePecas.add(p2);
        listaDePecas.add(p3);

        //Criando instancia da class GuardaVolumes e add a lista de peças
        GuardaVolumes gv1 = new GuardaVolumes();
        gv1.guardarPecas(listaDePecas);

        //Manipulando a lista
        gv1.mostrarPecas();
        gv1.devolverPecas(1);
        gv1.mostrarPecas();

        }
}
