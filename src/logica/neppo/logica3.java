package logica.neppo;

import java.util.Scanner;

public class logica3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] vet = new char[100];
		int k = 0;
		Integer qtd;

		Integer n = sc.nextInt();

		if (n >= 1000) {
			qtd = n / 1000;
			for (int i = 0; i < qtd; i++) {
				vet[k++] = 'M';
			}
			n = n % 1000;
		}
		if (n < 1000 && n >= 900) {
			n = n % 900;
			vet[k++] = 'C';
			vet[k++] = 'M';
		}
		if (n < 900 && n >= 500) {
			qtd = n / 500;
			for (int i = 0; i < qtd; i++) {
				vet[k++] = 'D';
			}
			n = n % 500;
		}
		if (n < 500 && n >= 400) {
			n = n % 400;
			vet[k++] = 'C';
			vet[k++] = 'D';
		}
		if (n < 400 && n >= 100) {
			qtd = n / 100;
			for (int i = 0; i < qtd; i++) {
				vet[k++] = 'C';
			}
			n = n % 100;
		}
		if (n < 100 && n >= 90) {
			n = n % 90;
			vet[k++] = 'X';
			vet[k++] = 'C';
		}
		if (n < 90 && n >= 50) {
			qtd = n / 50;
			for (int i = 0; i < qtd; i++) {
				vet[k++] = 'L';
			}
			n = n % 50;
		}
		if (n < 50 && n >= 40) {
			n = n % 40;
			vet[k++] = 'X';
			vet[k++] = 'L';
		}
		if (n < 40 && n >= 10) {
			qtd = n / 10;
			for (int i = 0; i < qtd; i++) {
				vet[k++] = 'X';
			}
			n = n % 10;
		}
		if (n < 10 && n >= 9) {
			n = n % 9;
			vet[k++] = 'I';
			vet[k++] = 'X';
		}
		if (n < 9 && n >= 5) {
			qtd = n / 5;
			for (int i = 0; i < qtd; i++) {
				vet[k++] = 'V';
			}
			n = n % 5;
		}
		if (n < 5 && n >= 4) {
			n = n % 4;
			vet[k++] = 'I';
			vet[k++] = 'V';
		}
		if (n < 4 && n >= 1) {
			qtd = n / 1;
			for (int i = 0; i < qtd; i++) {
				vet[k++] = 'I';
			}
			n = n % 1;
		}

		int i = 0;
		while (i < k) {
			System.out.print(vet[i++]);
		}

		sc.close();
	}
}
