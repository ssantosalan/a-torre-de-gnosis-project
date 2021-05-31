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
        String opcaoPorta;
        int urna2, cc = 0;
        boolean respostaTrue = false, portaTrue = false;
        String respostaPorta;
        int dado;

        //Digita("Você se cansa disso, seus novos poderes não são inatos e para acessá-los precisa ");
        //Digita("querer “ativar” eles. E se lembra que junto com a sua força e magia, também adquiriu forma de desativar magias.");       
        // if(condição do vini){    condição                                                
        System.out.printf("Para conseguir abrir a porta de uma só vez, você precisa mostrar que sabe desativar a magia da porta\n"
                + "para isso, acerte a combinação.\n");

        List<String> urna = Arrays.asList("62631 essa é a senha em decimal, digite a mesma em octal para desativar a magia.",
                "F4A7 essa é a senha em hexadecimal, digite a mesma em decimal para desativar a magia.",
                "0111100101000111100 essa é a senha em binario, digite a mesma em octal para desativar a magia.");

        porta1 = urna.get(0);
        porta2 = urna.get(1);
        porta3 = urna.get(2);

        do {
            Collections.shuffle(urna);
            dado = aleatorio.nextInt(2);
            System.out.printf("Porta 1 - \nPorta 2 - \nPorta 3 - \n"); // mostrar opções de porta

            System.out.println("Escolha uma das 3 portas e digite a senha correta.");  // escolher porta
            opcaoPorta = input.next();

            
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
                        break;
                }
            

        } while (portaTrue == false);
        System.out.println("Passou");
        do {
            System.out.println("Você escolheu a porta " + opcaoPorta); // porta escolhida
            System.out.println("" + urna.get(dado));
            System.out.println("Qual a senha correta para abrir esta porta? "); // pedir senha da porta escolhida
            respostaPorta = input.next();

            switch (respostaPorta) {
                case "172247":
                    if (urna.get(dado).equals(porta1)) {
                        System.out.println("Resposta certa.");
                        respostaTrue = true;

                    } else {
                        System.out.println("Resposta errada.");
                        cc++;
                    }
                    break;
                case "62631":
                    if (urna.get(dado).equals(porta2)) {
                        System.out.println("Certo.");
                        respostaTrue = true;

                    } else {
                        System.out.println("Errado.");
                        cc++;
                    }
                    break;
                case "745074":
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
        //}else if (outra condicao){

        //}   parenteses do else if
        if (respostaTrue) {
            System.out.println("Você desativou a magia perfeitamente.");
        }
        //Digita("Asulf se concentra e busca em seu âmago toda força que seu pacto lhe conferiu e");
        //Digita("puxou a porta de uma só vez, ele destrói a porta e a água  começa a jorrar no");
        //Digita("ambiente. O  resto de oxigênio abandona a sala e corre em direção à superfície, a ");
        //Digita("água rapidamente inunda a sala e você logo se encontra submerso.");

    }

}
