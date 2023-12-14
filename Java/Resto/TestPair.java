
class Pair<A,B>{
    private A first;
    private B second;

    Pair(A a, B b) {
        first = a;
        second = b;
    }

    public A getFirst(){return first;}
    public B getsecond(){return second;}
}

public class TestPair{
    public static void main(String[] args){
        Pair <String, String> par1 = new Pair <String, String> ("jogas 0", "tiagovski");
        par1.getFirst();
        System.out.println(par1.getFirst());
    }
}