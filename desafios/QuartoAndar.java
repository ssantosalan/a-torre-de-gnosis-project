/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quarto.andar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class QuartoAndar {

    /**
     * 62631 decimal == 172247 octal//F4A7 hexadecimal == 62631 decimal
     * 0111100101000111100 == 745074 octal
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

		Random aleatorio = new Random();
		String porta1, porta2;
		String porta3;
		String opcaoPorta;
		int contadorPorta = 0;
		int cc = 0;
		boolean respostaTrue = false, portaTrue = false;
		String respostaPorta;
		int dado;


		System.out.println();
		System.out.println(
				"Para conseguir abrir a porta de uma só vez, você precisa mostrar que sabe desativar a magia da porta.");
		System.out.println("Para isso, acerte a combinação.");
		System.out.println();

		List<String> urna = Arrays.asList(
				"62631 essa é a senha em decimal. Digite a mesma em octal para desativar a magia.",
				"F4A7 essa é a senha em hexadecimal. Digite a mesma em decimal para desativar a magia.",
				"0111100101000111100 essa é a senha em binario. Digite a mesma em octal para desativar a magia.");

		porta1 = urna.get(0);
		porta2 = urna.get(1);
		porta3 = urna.get(2);

		do {
			Collections.shuffle(urna);
			dado = aleatorio.nextInt(2);
			System.out.printf("Porta 1 - \nPorta 2 - \nPorta 3 - \n"); // mostrar opções de porta

			System.out.print("Escolha uma das 3 portas e digite a senha correta: "); // escolher porta
			opcaoPorta = entrada.next();

			switch (opcaoPorta) {
			case "1":
				portaTrue = true;
				break;
			case "2":
				portaTrue = true;
				break;
			case "3":
				portaTrue = true;
				break;
			default:
				System.out.println("Escolha portas de 1 até 3. ");
				contadorPorta++;
				break;
			}

		} while (portaTrue == false && contadorPorta < 3);
		
		System.out.println();
		if (portaTrue == false) {
			System.out.println("Indeciso... Até mesmo escolher uma porta é difícil para você... ");
			System.out.println("Fim de jogo.");
			System.exit(0);
		} 

		do {
			System.out.println("Você escolheu a porta " + opcaoPorta); // porta escolhida
			System.out.println("" + urna.get(dado));
			System.out.println("Informe a senha para abrir a porta: "); // pedir senha da porta escolhida
			respostaPorta = entrada.next();

			switch (respostaPorta) {
			case "172247":
				if (urna.get(dado).equals(porta1)) {
					System.out.println("Resposta certa!");
					respostaTrue = true;

				} else {
					System.out.println("Resposta errada!");
					cc++;
				}
				break;
			case "62631":
				if (urna.get(dado).equals(porta2)) {
					System.out.println("Certo!");
					respostaTrue = true;

				} else {
					System.out.println("Errado!");
					cc++;
				}
				break;
			case "745074":
				if (urna.get(dado).equals(porta3)) {
					System.out.println("Certa!");
					respostaTrue = true;

				} else {
					System.out.println("Errada!");
					cc++;
				}
				break;
			default:
				System.out.println("Resposta errada!");
				cc++;
			}
			if (cc == 3) {
				System.out.println("Você errou demais!");
				System.exit(0);
			}
		} while (!respostaTrue || cc == 3);

		if (respostaTrue) {
			System.out.println("Você desativou a magia perfeitamente!");
		}

		System.out.println("TO BE CONTINUED");

	}

}
