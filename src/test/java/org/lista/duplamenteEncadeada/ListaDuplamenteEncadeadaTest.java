package org.lista.duplamenteEncadeada;


import org.junit.Assert;
import org.junit.Test;

public class ListaDuplamenteEncadeadaTest {


    @Test
    public void shouldFindFirstItemFromEvenList() throws Exception {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.add("Ana");
        lista.add("André");
        lista.add("Fábio");
        lista.add("José");

        String item = lista.get(0);
        Assert.assertTrue(item.equals("Ana"));
    }

    @Test
    public void shouldFindSecondtemFromEvenList() throws Exception {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.add("Ana");
        lista.add("André");
        lista.add("Fábio");
        lista.add("José");

        String item = lista.get(1);
        Assert.assertTrue(item.equals("André"));
    }

    @Test
    public void shouldFindThirdItemFromEvenList() throws Exception {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.add("Ana");
        lista.add("André");
        lista.add("Fábio");
        lista.add("José");

        String item = lista.get(2);
        Assert.assertTrue(item.equals("Fábio"));
    }

    @Test
    public void shouldFindFourthFromEvenList() throws Exception {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.add("Ana");
        lista.add("André");
        lista.add("Fábio");
        lista.add("José");

        String item = lista.get(3);
        Assert.assertTrue(item.equals("José"));
    }
    @Test
    public void shouldFindMiddleFromOddList() throws Exception {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.add("Ana");
        lista.add("André");
        lista.add("Fábio");
        lista.add("José");
        lista.add("Maicon");

        String item = lista.get(3);
        Assert.assertTrue(item.equals("José"));
    }
}
