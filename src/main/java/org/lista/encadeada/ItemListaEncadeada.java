package org.lista.encadeada;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemListaEncadeada<K> {
    private K dado;
    private ItemListaEncadeada<K> proximo;
}
