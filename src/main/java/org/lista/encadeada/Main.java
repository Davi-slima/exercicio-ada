package org.lista.encadeada;

public class Main {
    public static void main(String[] args) throws Exception {
        ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.add("Ana");
        listaEncadeada.add("André");
        listaEncadeada.add("Ultimo");
        listaEncadeada.add("Fábio");


        listaEncadeada.printList();
        System.out.println("Item escolhido: " + listaEncadeada.get(2));

//        listaEncadeada.remove(3);

//        listaEncadeada.printList();
    }
}