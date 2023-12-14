package Folha_6_7;

public class Node<T> {
    private T value;      // Valor guardado no node
    private Node<T> next; // Referencia para o proximo node da lista

    // Construtor
    Node(T v, Node<T> n) {
        value = v;
        next = n;
    }

    // Getters e Setters
    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setValue(T v) {
        value = v;
    }

    public void setNext(Node<T> n) {
        next = n;
    }


}


