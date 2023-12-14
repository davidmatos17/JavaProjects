public class Numbers {
    public static void main(String[] args) {
	int n = 500; // limite dos numeros
	int soma = 0;
	System.out.print("Numeros de 1 a " + n + ": "); // + é o operador de concatenação de strings
	for (int i=1; i<= n - 1; i++){
	    System.out.print(i + ","); 
		
	}
	System.out.println(n);
	for( int j = 1 ; j <= n; j++ ){
		soma += j;
	}
	System.out.println(soma);
	}
}


