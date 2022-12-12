package org.lista.encadeada;

import org.junit.Assert;
import org.junit.Test;
import org.lista.duplamenteEncadeada.ListaDuplamenteEncadeada;

public class ListaEncadeadaTest {

    @Test
    public void shouldReturnItemFromList() throws Exception {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.add("Ana");
        lista.add("André");
        lista.add("Ultimo");
        lista.add("Fábio");
        lista.add("José");

        String itemLista = lista.get(3);

        Assert.assertTrue(itemLista.equals("Fábio"));
    }
}
