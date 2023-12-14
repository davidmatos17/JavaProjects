package Folha_6_7;

public class SinglyLinkedList<T> {
    private Node<T> first;    // Primeiro no da lista
    private int size;         // Tamanho da lista

    // Construtor (cria lista vazia)
    SinglyLinkedList() {
        first = null;
        size = 0;
    }

    // Retorna o tamanho da lista
    public int size() {
        return size;
    }

    // Devolve true se a lista estiver vazia ou falso caso contrario
    public boolean isEmpty() {
        return (size == 0);
    }

    // Adiciona v ao inicio da lista
    public void addFirst(T v) {
        Node<T> newNode = new Node<T>(v, first);
        first = newNode;
        size++;
    }

    // Adiciona v ao final da lista
    public void addLast(T v) {
        Node<T> newNode = new Node<T>(v, null);
        if (isEmpty()) {
            first = newNode;
        } else {
            Node<T> cur = first;
            while (cur.getNext() != null)            //  funcao getValue() esta no ficheiro Folha7.Node1
                cur = cur.getNext();
            cur.setNext(newNode);
        }
        size++;
    }

    // Retorna o primeiro valor da lista (ou null se a lista for vazia)
    public T getFirst() {
        if (isEmpty()) return null;
        return first.getValue();
    }

    // Retorna o ultimo valor da lista (ou null se a lista for vazia)
    public T getLast() {
        if (isEmpty()) return null;
        Node<T> cur = first;
        while (cur.getNext() != null)
            cur = cur.getNext();
        return cur.getValue();
    }

    // Remove o primeiro elemento da lista (se for vazia nao faz nada)
    public void removeFirst() {
        if (isEmpty()) return;
        first = first.getNext();
        size--;
    }

    // Remove o ultimo elemento da lista (se for vazia nao faz nada)
    public void removeLast() {
        if (isEmpty()) return;
        if (size == 1) {
            first = null;
        } else {
            // Ciclo com for e uso  de size para mostrar alternativa ao while
            Node<T> cur = first;
            for (int i=0; i<size-2; i++)
                cur = cur.getNext();
            cur.setNext(cur.getNext().getNext());
        }
        size--;
    }

    // Converte a lista para uma String
    public String toString() {
        String str = "{";
        Node<T> cur = first;
        while (cur != null) {
            str += cur.getValue();
            cur = cur.getNext();
            if (cur != null) str += ",";
        }
        str += "}";
        return str;
    }


    public T get(int pos){

        if( pos < 0 || pos >= size){
            return null;
        }

        Node<T> current = first;
        for(int i = 0; i < pos ; i++){
            current = current.getNext();
        }
        return current.getValue();
    }

    public T remove(int pos) {
        if (isEmpty()) return null;
        if (pos < 0 || pos >=size) {
            return null;
        }
        if (pos == 0){
            T valor = get(pos);
            removeFirst();
            return valor;
        }
        if (pos == size-1){
            T valor = get(pos);
            removeLast();
            return valor;
        }

        else {
            Node<T> curr = first;
            for (int i = 0; i < pos - 1; i++) {
                curr = curr.getNext();
            }
            T valor = curr.getNext().getValue();
            Node<T> removedNode = curr.getNext();

            curr.setNext(removedNode.getNext()); // ESTA FUNCAO setNext APONTA PARA DOIS NOS A FRENTE

            size--;
            return valor;

        }
    }

    public SinglyLinkedList<T> copy(){
        SinglyLinkedList<T> nova = new SinglyLinkedList<T>();
        Node<T> curr = first;
        if (isEmpty()){
            return null;
        }else {
            while (curr != null) {
                nova.addLast(curr.getValue());
                curr = curr.getNext();

            }
        }
        return nova;
    }

    public SinglyLinkedList<T> duplicate(){
        SinglyLinkedList<T> newList = new SinglyLinkedList<T>();
        Node<T> curr = first;
        if (isEmpty()) return null;
        else{
            while(curr != null){
                for(int i = 0 ; i < 2 ;i++ ){
                    newList.addLast(curr.getValue());

                }
                size++;
                curr = curr.getNext();
            }
        }
        return newList;
    }

    public int count(T value){
        Node<T> curr = first;
        int count = 0;
        while(curr != null){
            if(curr.getValue().equals(value)){
                count++;
            }
            curr = curr.getNext();
        }
        return count;
    }
    public void removeAll(T value){
        Node<T> prev = null;
        Node<T> curr = first;
        while(curr != null) {
            if (curr.getValue().equals(value)) {
                if (prev == null) {
                    first = curr.getNext();

                } else {
                    prev.setNext(curr.getNext());
                }

                size--;
            }
            else{
                prev = curr;
            }
                curr = curr.getNext();
        }

    }

}
