package atividade_de_poo6;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class att_de_poo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("atividade1");
		double[] notas = new double[5];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + ":");
			notas[i] = sc.nextDouble();
	}
		double soma = 0;
		double maior = notas[0];
		double menor = notas[0];
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
			if (notas[i] > maior) {
				maior = notas[i];
	}
			if (notas[i] < menor) {
				menor = notas[i];
	}
}
		double media = soma / notas.length;
		System.out.println("Todas as notas digitadas: " + Arrays.toString(notas));
		System.out.println("Maior nota: " + maior);
		System.out.println("Menor nota: " + menor);
		System.out.println("Média da turma: " + media);
		System.out.println("Atividade2");
		int tamanho = r.nextInt(16) + 5;
		int[] vetor = new int[tamanho];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = r.nextInt(10);
		}
		System.out.println("Vetor original (tamanho " + tamanho + "):");
		System.out.println(Arrays.toString(vetor));
		for (int i = 0; i < vetor.length - 1; i++) {
			for (int j = 0; j < vetor.length - 1 - i; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}

		System.out.println("Vetor ordenado em ordem crescente:");
		System.out.println(Arrays.toString(vetor));
	}

}