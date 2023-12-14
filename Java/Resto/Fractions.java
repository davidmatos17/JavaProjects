class Fraction{
    // CONSTRUTOR PRINCIPAL

    int numerador;
    int denominador;

    Fraction(int a, int b){
        numerador = a;
        denominador = b;
    }

    //              METODOS

    public String toString() {
        if ((numerador/denominador)==0){
            return numerador + "/" + denominador;
        }
        if (numerador % denominador == 0) {
            return "" + numerador / denominador;
        }
        else {
            return numerador / denominador + " + " + numerador % denominador + "/" + denominador;
        }
    }

    public String Write() {
        return numerador + "/" + denominador;
    }



    public Fraction add(Fraction f){
        // To add two fractions, you need to find a common denominator.
        int commonDenominator = this.denominador * f.denominador;

        // Calculate the numerators for the fractions with the common denominator.
        int newNumerator1 = this.numerador * f.denominador;
        int newNumerator2 = f.numerador * this.denominador;

        // Add the numerators together to get the new numerator.
        int resultNumerador = newNumerator1 + newNumerator2;

        // Create and return a new Fraction with the result.
        return new Fraction(resultNumerador, commonDenominator);
    }


    public Fraction multiply(Fraction f){
        int novoDenominador = this.denominador * f.denominador;
        int novoNumerador = this.numerador * f.numerador;
        return new Fraction(novoNumerador, novoDenominador);
    }


    public void simplify(){
        int MDC = MDC (this.numerador, this.denominador);
        this.numerador /= MDC;
        this.denominador /= MDC;
    }


    public  int MDC(int a , int b) {
            if(b==0){
                return a;
        }
            return MDC(b, a%b);
        }
    }


//  MAIN CLASS / SHOULD HAVE THE NAME OF THE FILE AND CONTAIN THE MAIN FUNCTION

public class Fractions {
    public static void main(String[] args){
        Fraction f1 = new Fraction(2,3);
        Fraction f2 = new Fraction(3,4);
        System.out.println(f1.toString());


        Fraction soma = f1.add(f2);
        System.out.println(soma.toString());

        soma.simplify();
        System.out.println(soma.toString());


        Fraction multiplicacao = f1.multiply(f2);
        System.out.println(multiplicacao.Write());

        multiplicacao.simplify();
        System.out.println(multiplicacao.Write());

    }
}
