package exercicio3;

import exercicio3.classes.Item;
import exercicio3.enums.Segmento;

import java.util.ArrayList;
import java.util.List;

public class Compras {



    public static void main(String[] args) {
        List<Item> listaCompras = new ArrayList<>();

        Item i1 = new Item("Sabonente", Segmento.HIGIENE,2.35, 3);
        Item i2 = new Item("Cotonente", Segmento.HIGIENE,4.56, 1);
        Item i3 = new Item("Sabão Líquido", Segmento.LIMPEZA,13.5, 2);
        Item i4 = new Item("Cacetinhos", Segmento.ALIMENTACAO,5.23, 4);

        listaCompras.add(i1);
        listaCompras.add(i2);
        listaCompras.add(i3);
        listaCompras.add(i4);

        for (Item item: listaCompras){
            item.imprimir();
        }


    }
}
