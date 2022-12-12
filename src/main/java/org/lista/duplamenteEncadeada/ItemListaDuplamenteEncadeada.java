package org.lista.duplamenteEncadeada;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemListaDuplamenteEncadeada<K> {

        private K dado;
        private ItemListaDuplamenteEncadeada<K> anterior;
        private ItemListaDuplamenteEncadeada<K> proximo;

        public String convertToString() {
                return this.getDado().toString();
        }
}
