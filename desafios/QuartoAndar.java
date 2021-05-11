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
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();
        String porta1, porta2;
        String porta3;
        int escolha1, opcaoPorta = 0;
        int urna2, cc = 0;
        boolean respostaTrue = false;
        int respostaPorta = 0;
        int dado;

        System.out.printf("Você chegou em um andar da torre que está muito tranquilo,\n"
                + " mas em pouco tempo, portões irão se abrir sozinhos e alguns lobos irão\n"
                + " se soltar e se você ainda estiver neste andar, sera devorado por eles,\n"
                + " fuja o mais rápido possível.\n ");

        System.out.println("Você deseja tentar passar as portas o mais rápido possivel ou ficar e lutar com os lobos? ");
        System.out.printf("1- Ficar e lutar.\n2- Tentar as portas.\n");
        escolha1 = input.nextInt();

        switch (escolha1) {
            case 1:
                System.out.println("Mensagem"); // mensagem que nao é possivel enfrentar tantos lobos.
                break;
            case 2:
                long t = System.currentTimeMillis();
                List<String> urna = Arrays.asList("62631 essa é a senha em decimal, para passar digite a mesma em octal.",
                        "F4A7 essa é a senha em hexadecimal, para passar digite a mesma em decimal.",
                        "0111100101000111100 essa é a senha em binario, para passar digite a mesma em octal.");

                porta1 = urna.get(0);
                porta2 = urna.get(1);
                porta3 = urna.get(2);
                do {
                    Collections.shuffle(urna);
                    dado = aleatorio.nextInt(2);
                    System.out.printf("Porta 1 - \nPorta 2 - \nPorta 3 - \n"); // mostrar opções de porta

                    System.out.println("Escolha uma das 3 portas e digite a senha correta.");  // escolher porta
                    opcaoPorta = input.nextInt();

                    System.out.println("Você escolheu a porta " + opcaoPorta); // porta escolhida
                    System.out.println("" + urna.get(dado));
                    System.out.println("Qual a senha correta para abrir esta porta? "); // pedir senha da porta escolhida
                    respostaPorta = input.nextInt();

                    switch (respostaPorta) {
                        case 172247:
                            if (urna.get(dado).equals(porta1)) {
                                System.out.println("Resposta certa.");
                                respostaTrue = true;

                            } else {
                                System.out.println("Resposta errada.");
                                cc++;
                            }
                            break;
                        case 62631:
                            if (urna.get(dado).equals(porta2)) {
                                System.out.println("Certo.");
                                respostaTrue = true;

                            } else {
                                System.out.println("Errado.");
                                cc++;
                            }
                            break;
                        case 745074:
                            if (urna.get(dado).equals(porta3)) {
                                System.out.println("Certa.");
                                respostaTrue = true;

                            } else {
                                System.out.println("errada.");
                                cc++;
                            }
                            break;
                        default:
                            System.out.println("Resposta errada.");
                    }
                    if (cc == 3) {
                        System.out.println("Voce errou demais.");
                    }
                } while (!respostaTrue || cc == 3);
                if (respostaTrue) {
                    System.out.println("Parabéns.");
                    System.out.println("" + t);
                }
        }

    }
}
