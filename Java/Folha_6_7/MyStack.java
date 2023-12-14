package Folha_6_7;

public interface MyStack<T> {
    // metodos que modificam a pilha
    public void push(T v);

    public T pop();


    // metodos que retornam a informacao da pilha
    public T top();

    public int size();

    public boolean isEmpty();
}