package projeto01;
import java.util.*;


class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Declaracao
		int num1,num2,soma;
		//Leituras
		System.out.println("Digite um numero");
		num1 = sc.nextInt();
		System.out.println("Digite outro numero");
		num2 = sc.nextInt();
		//Soma
		soma = num1 + num2;
		//Printar na tela
		System.out.println("Soma:" + soma);
	}
}
