package Exemplos;

import java.util.Scanner;

public class TemperaturaCelcius {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double celsius = 0;
		double fahrenheint = 0;
		
		System.out.println("Digite a temperatura em Celsius e eu vou retornar em Fahrenheint: ");
		celsius = leia.nextDouble();
		
		fahrenheint = (celsius * 9/5) + 32;
		
		System.out.println("A temperatura �: " + fahrenheint + "�F");
		
	}
}
