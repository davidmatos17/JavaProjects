
class Aluno {
    // Atributos da classe (variáveis para conter informação)
    String nome;
    int numero;

    // Construtor "padrão"
    Aluno(String n, int mec) {
        nome = n;
        numero = mec;
    }


    public String toString(){

        return "(" + nome + ", " + numero + ")";
    }


    int ano() {
        return numero / 100000;
    }
}


class Professor{
    String nome;
    int numero;

    Professor(String n, int mec){
        nome = n;
        numero = mec;

    }
}

// Classe principal contendo o main para testar a classe Aluno
public class TestAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno("David Matos", 202207635);

        System.out.println("a.nome = " + a.nome);
        System.out.println("a.numero = " + a.numero);
        System.out.println("a =" + a);

        Aluno e = new Aluno("Manuel", 201506234);

        System.out.println("e = " + e);
        Aluno f = new Aluno("Maria",23);
        Aluno g = new Aluno("Ana", 201408762);
        Aluno h = new Aluno("Bruno", 201508145);
        System.out.println(g.ano() + " " + h.ano());
        int n = 1;
        Aluno[] v = new Aluno[n];

        v[0].nome = "joao";
        v[0].numero = 12;
        //for (int i=0; i<n; i++) v[i] = new Aluno("ola", 123);
        System.out.println(v[0]);

    }

}

