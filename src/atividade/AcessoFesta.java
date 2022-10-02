package atividade;

import java.util.Scanner;

public class AcessoFesta {

	public static void main(String[] args) {
		int idade;
		int autorizacao = 1;
		Scanner p1 = new Scanner(System.in);

		System.out.println("qual sua idade");
		idade = p1.nextInt();
		if (idade >= 18) {
			System.out.println("ACESSO PERMITIDO");
		} else if (idade >= 16 && idade < 18) {
			System.out.println("POSSUI AUTORIZACAO POR ESCRITO OU ESTA ACOMPANHADO(A) POR MAIOR DE IDADE:");
			System.out.println("1 sim 2 nao");
			autorizacao = p1.nextInt();
			if (autorizacao == 1) {

				System.out.println("ACESSO PERMITIDO");
			} else {
				System.out.println("ACESSO NEGADO");

			}
		} else {
			System.out.println("NAO PODE ENTRAR DE FORMA ALGUMA  : ACESSO NEGADO");

		}

	}
}
