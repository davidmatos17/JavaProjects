package Folha_6_7;

class Node1 {
    int valor;
    Node1 next_node;

     Node1(int valor, Node1 next_node) {
        this.valor = valor;
        this.next_node = next_node;
    }
}

//  CLASSE CONSTRUTORA DAS PILHAS
class Pilha{
    private Node1 top;

    public void push(Node1 novo){
        novo.next_node = top;
        top = novo;
    }

    public Node1 pop(){
        if (top == null){
            return null;
        }
        Node1 removedNode = top;
        top = top.next_node;
        return removedNode;
    }

    public void printStack() {
        Node1 current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.valor + " ");
            current = current.next_node;
        }
        System.out.println();
    }

}

//    CLASSE DAS LISTAS LIGADAS

class LinkedList {
    Node1 root;
    int size;

    public LinkedList() {
        this.root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public int getValue(int pos) {
        if (pos < 0 || pos > size) {
            System.out.println("out of bounds");
        }
            Node1 curr = root;
            for(int i = 0; i < pos; i++){
                curr = curr.next_node;
            }
            return curr.valor;
        }

    public void adicionar(Node1 novo){
        if (this.root == null){
            this.root = novo;
        }else{
            Node1 curr = this.root;
            while(curr.next_node != null){
                curr = curr.next_node;
            }
            curr.next_node = novo;
        }
        size++;
    }

    public void remove(int valor){
        if (this.root == null) return;
        if (this.root.valor == valor){
            this.root = this.root.next_node;
            return;
        }

        Node1 previous = this.root;
        Node1 current = this.root.next_node;
        while(current != null ){
            if(current.valor == valor){
                previous.next_node = current.next_node;
                return;
            }
            previous = current;
            current = current.next_node;
        }
        size--;
    }

    @Override
    public String toString() {
        Node1 a = this.root;
        StringBuilder to_return = new StringBuilder();
        while (a != null) {
            to_return.append(a.valor).append(" ");
            a = a.next_node;
        }
        return to_return.toString();
    }

    public static void main(String[] args){
        Node1 a = new Node1(1, null);
        Node1 b = new Node1(2, null);
        Node1 c = new Node1(3,null);
        LinkedList list = new LinkedList();
        list.adicionar(a);
        list.adicionar(b);
        list.adicionar(c);
        Pilha pilha = new Pilha();
        pilha.push(new Node1(4,null));
        pilha.push(new Node1(3,null));
        pilha.push(new Node1(5,null));
        pilha.pop();
        pilha.printStack();

        //list.remove(2);
        System.out.println(list);
        System.out.println("o valor da posicao e: " + list.getValue(1));
        System.out.println("tamanho da linked list e: " + list.size());
    }
}
