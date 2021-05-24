import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ATorreDeGnosis {
	static Scanner entrada = new Scanner(System.in); //variÃ¡vel global de entrada
	static int hpUsuario = 110, chamasNegras = 5, elixirDaVida = 15, sabedoriaDeOdin = 10; //vida global do protagonista e habilidades
	static int temp_dialog = 0, temp_questions = 15, temp_dialogSlow = 200, temp_dialogFast = 80, temp_dialogFaster = 30, ultra_Speed = 10,  temp_dotsSlow = 400, temp_dots = 200;
	//Para nÃ£o ter delay no jogo, coloque 0 em todas as variÃ¡veis acima.
	//Valor das variÃ¡veis caso vc queira zerar em cima e rodar sem delay, mas posteriormente colocando o valor certo:
	//temp_dialog = 50, temp_questions = 15, temp_dialogSlow = 200, temp_dialogFast = 80, temp_dialogFaster = 30, ultra_Speed = 10,  temp_dotsSlow = 400, temp_dots = 200;
	
	public static void main(String[] args) throws Exception{
		String opcao;
		Boolean tacerto = false;

		/*
		 * ExplicaÃ§Ã£o dos prÃ³ximos comandos:
		 * 
		 * O "do" vai iniciar o Menu do jogo. E vai continuar rodando atÃ© o UsuÃ¡rio
		 * escolher "1 - Jogar", "4- CapÃ­tulos" ou "5- Sair". Na opÃ§Ã£o "4 - CapÃ­tulos",
		 * temos um "Switch" dentro que leva para o capÃ­tulo escolhido, ou o UsuÃ¡rio
		 * pode selecionar a opÃ§Ã£o "voltar" para retornar ao menu.
		 */

		do {
			System.out.println("=================");
			System.out.println("A Torre de Gnosis ");
			System.out.println("=================");
			System.out.println();
			System.out.println("1 - Jogar");
			System.out.println("2 - InstruÃ§Ãµes");
			System.out.println("3 - CrÃ©ditos");
			System.out.println("4 - CapÃ­tulos");
			System.out.println("5 - Sair");
			opcao = entrada.next();

			switch (opcao.toLowerCase()) {
			case "1":
				capitulo1();
				tacerto = true;
				break;
			case "2":
				System.out.println("InstruÃ§Ãµes");
				System.out.println();
				System.out.println("O jogo Ã© baseado em escolhas.");
				System.out.println("VocÃª terÃ¡ que informar ou '1' ou '2' ou '3' ou '4' ou '5' de acordo com as opÃ§Ãµes.");
				System.out.println("TambÃ©m haverÃ¡ momentos em que vocÃª deverÃ¡ informar ou 'a' ou 'b' ou 'c' ou 'd' ou 'e' de acordo com as opÃ§Ãµes.");
				System.out.println("TambÃ©m haverÃ¡ momentos que terÃ¡ a opÃ§Ã£o para digitar 'X' para 'voltar'.");
				System.out.println();
				break;
			case "3":
				System.out.println("Alan Siva dos Santos");
				System.out.println("Arthur Solla Gregorut Favero");
				System.out.println("Jorge Luiz dos Santos Oliveira");
				System.out.println("Rafael Astorga Trancozo!");
				System.out.println("Vinicius Gava Pereira!");
				break;

			case "4":
				System.out.println("1 - CapÃ­tulo 1: Pai e Filho");
				System.out.println("2 - CapÃ­tulo 2: O Monge");
				System.out.println("3 - CapÃ­tulo 3");
				System.out.println("4 - CapÃ­tulo 4: 1Âº Andar - PortÃµes de Fogo");
				System.out.println("5 - CapÃ­tulo 5");
				System.out.println("6 - CapÃ­tulo 6: 3Âº Andar - Anjos CaÃ­dos");
				System.out.println("7 - CapÃ­tulo 7: 4Âº Andar - BOSS FIGHT - Would you kill your son?");
				System.out.println("X - Voltar ");
				System.out.print("Digite o capÃ­tulo desejado: ");
				opcao = entrada.next();

				switch (opcao.toLowerCase()) {
				case "1":
					capitulo1();
					tacerto = true;
					break;
				case "2":
					capitulo2();
					tacerto = true;
					break;
				case "3":
					capitulo3();
					tacerto = true;
					break;
				case "4":
					capitulo4();
					tacerto = true;
					break;
				case "5":
					capitulo5();
					tacerto = true;
					break;
				case "6":
					capitulo6();
					tacerto = true;
					break;
				case "7":
					capitulo7();
					tacerto = true;
					break;
				case "x":
					break;
				default:
					System.out.println("Entenda que vocÃª tem que digitar 1 ou 2 ou 3 ou 4 ou 5.");
					break;
				}
				break;

			case "5":
				System.out.println("Jogo finalizado.");
				System.exit(0);
				break;
			default:
				System.out.println("Entenda que tem que digitar 1 ou 2 ou 3 ou 4 ou 5.");
				break;
			}

		} while (!tacerto);

		System.out.println();
		System.out.println();

		

	}
	//CapÃ­tulo 1 inicia-se aqui
	public static void capitulo1() throws InterruptedException{
		System.out.println();
		System.out.println("CapÃ­tulo 1: Pai e Filho");
		System.out.println();
		Digita("	Corra! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Encontre ele! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	VÃ¡ depressa! \n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	VocÃª estÃ¡ invadindo o territÃ³rio de Zark, um dos paÃ­ses vizinhos de sua terra natal, Volstalir. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ambos os reinos viviam um tenso perÃ­odo de paz. ApÃ³s a morte do rei Alexander e da sucessÃ£o de seu filho Atreios. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Acordos mercadolÃ³gicos comeÃ§aram a ser cada vez mais desrespeitados por Zark e em resposta, Ã s terras cedidas a Zark, foram retomadas Ã  Volstalir. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	ApÃ³s este evento, a tensÃ£o entre os dois reinos explodiu em disputas de territÃ³rios e lutas por pontos de suprimentos estratÃ©gicos. Agora vocÃª estÃ¡ invadindo \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mais um desses pontos estratÃ©gicos: uma cidade de mÃ©dio porte cercada por muros, que concentra boa parte das trocas comerciais entre os reinos de Zark. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	VocÃª Ã© Asulf, um general veterano de muitos conflitos, responsÃ¡vel por guiar as tropas que devem derrubar os muros do lado oeste da cidade \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("enquanto outra tropa Ã© responsÃ¡vel por destruir os portÃµes principais. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	ApÃ³s horas de luta, sua tropa consegue rechaÃ§ar a resistÃªncia restante em terra e com a ajuda de arÃ­etes, estÃ£o comeÃ§ando o processo de destruiÃ§Ã£o do muro. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Senhor, senhor, temos um problema! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	VocÃª vÃª um jovem soldado correndo em sua direÃ§Ã£o. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” O que foi jovem? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Os portÃµes, senhor! Os Zarkeanos abriram eles e soltaram a cavalaria e os cÃ£es! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	VocÃª nÃ£o espera que o soldado termine de falar e dispara em direÃ§Ã£o aos inimigos. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Quando chega no campo de batalha â€” um terreno plano de gramado verde â€” agora sujo com o vermelho do sangue dos corpos e dos feridos. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª percebe que alÃ©m da cavalaria e dos cÃ£es, soldados que estavam na cidade tambÃ©m saÃ­ram para ajudar seus companheiros.  \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Um soldado vem em sua direÃ§Ã£o com a espada pronta para te acertar com um golpe. \n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		//Primeira luta comeÃ§a aqui
		boolean vitoria = false; 		//Utilizado quando o UsuÃ¡rio vence do 'Computador' e sai do loop.   
		int hpMonstro01 = 100;		//Vida do inimigo
		String alternativa;			//Alternativa do switch
		Random ataqueForca = new Random(); // ForÃ§a do ataque dado por uma aleatoriedade.
		int dano = 0; //dano causado pelo ataque.
		int valor; //Valor gerado pela 'aleatoriedade'.

		do {
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Soldado Zarkeano");
			Digita(hpUsuario + " \uD83D\uDC99", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita(hpMonstro01 + " \uD83D\uDDA4\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("       ESPECIAIS                     ");
			System.out.println();
			System.out.println("====================                ====================");

			System.out.println("Escolha seu ataque");
			System.out.println("1 - Ataque Cortante âš”ï¸� ");
			
			alternativa = entrada.next();

			switch (alternativa) {
			case "1":
				valor = ataqueForca.nextInt(6);
				if (valor == 0 || valor == 1 || valor == 2 || valor == 3) {
					dano = ataqueForca.nextInt(20) + 100;
					hpMonstro01 = hpMonstro01 - dano;
					Digita("Sacando a sua espada, vocÃª acerta um corte no joelho dele, que cai sangrando e o deixando exposto para um golpe final nas costas! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (valor == 4) {
					dano = ataqueForca.nextInt(50) + 100;
					hpMonstro01 = hpMonstro01 - dano;
					Digita("Sacando a sua espada, vocÃª acerta um golpe fatal em seu pescoÃ§o, fazendo-o sangrar atÃ© a morte! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (valor == 5) {
					dano = ataqueForca.nextInt(60) + 100;
					hpMonstro01 = hpMonstro01 - dano;
					Digita("Sacando a sua espada, vocÃª dÃ¡ um golpe em vertical em seu estÃ´mago, fazendo-o cair perante a ti! Dano " + dano + ".", TimeUnit.MILLISECONDS,
							temp_dialog);
				}
				System.out.println();

				if (hpMonstro01 <= 0) {
					vitoria = true;
					break;
				} 
				System.out.println();

				break;
			
				
			default:
			}

		} while (vitoria == false);
		vitoria = false;
		//Primeira luta termina aqui.
		System.out.println();

		Digita("Um Oficial Zarkeano vem em sua direÃ§Ã£o, montado em um cavalo em alta velocidade e tenta acertÃ¡-lo com a lanÃ§a. \n", TimeUnit.MILLISECONDS, temp_dialog);
		       
		int hpMonstro02 = 100; //Segundo inimigo comeÃ§a aqui

		do {
			valor = ataqueForca.nextInt(2) + 1;
			if (valor == 1) {
				Digita("Ele tenta acertÃ¡-lo no peito com a ponta de sua lanÃ§a, mas vocÃª desvia! Dano 0 ", TimeUnit.MILLISECONDS, temp_dialog);
			} else if (valor == 2) {
				Digita("Ele tenta acertÃ¡-lo na cabeÃ§a com a ponta de sua lanÃ§a, mas vocÃª desvia! Dano 0", TimeUnit.MILLISECONDS,
						temp_dialog);
			}
			System.out.println();
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Oficial Zarkeano");
			Digita(hpUsuario + " \uD83D\uDC99", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita(hpMonstro02 + " \uD83D\uDDA4\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("       ESPECIAIS                     ");
			System.out.println();
			System.out.println("====================                ====================");

			System.out.println("Escolha seu ataque");
			System.out.println("1 - Ataque Cortante \u2694\uFE0F ");
			
			alternativa = entrada.next();

			switch (alternativa) {
			case "1":
				valor = ataqueForca.nextInt(5);
				if (valor == 0 || valor == 1 || valor == 2 || valor == 3) {
					dano = ataqueForca.nextInt(20) + 100;
					hpMonstro02 = hpMonstro02 - dano;
					Digita("VocÃª atinge as pernas do cavalo com a espada, derrubando-os e deixando-os fora de combate! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (valor == 4) {
					dano = ataqueForca.nextInt(50) + 100;
					hpMonstro02 = hpMonstro02 - dano;
					Digita("VocÃª acerta um golpe vertical embaixo o braÃ§o que segurava a lanÃ§a, fazendo-o cair do morto! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
				} 
				System.out.println();
				if (hpMonstro02 <= 0) {
					vitoria = true;
					break;
				} 
				System.out.println();
				break;	
			default:
			}

		} while (vitoria == false);
		vitoria = false;
		//Segunda luta termina aqui
		System.out.println();
		
		Digita("	Mais dois soldados vÃªm em sua direÃ§Ã£o, vocÃª os despacha de forma rÃ¡pida. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª vÃª um vulto â€” um cachorro â€” vem em sua direÃ§Ã£o! O animal tenta mordÃª-lo, mas fica apenas mordendo a sua braÃ§adeira. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Asulf larga a espada e quebra o pescoÃ§o do animal, pegando sua arma do chÃ£o logo em seguida. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª acerta-o com um golpe de espada em arco que pega seu focinho e arranca a mandÃ­bula do animal. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Anton! â€” vocÃª berra. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	VocÃª olha ao redor e vÃª apenas a luta sangrenta que estourou no campo de batalha. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Os seus aliados matam e morrem para conseguir ter uma chance de invadir a cidade. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Utilizando golpes precisos vocÃª avanÃ§a entre os seus inimigos em busca dele. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” â€œOnde diabos ele foi parar?â€� \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A batalha continua por mais vinte minutos e gradualmente as forÃ§as inimigas que surpreenderam o seu exÃ©rcito comeÃ§am a perder as forÃ§as e recuar. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	VocÃª avista um pequeno grupo de quatro soldados cercando um garoto. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	No chÃ£o podem ser vistos cadÃ¡veres do que parece ter sido soldados que enfrentaram este menino. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("O garoto, agora surrado e sujo de sangue, usa uma armadura de couro com revestimento de uma cota de malha metÃ¡lica, botas leves e um capacete \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que cobre apenas a parte superior de seu rosto, comeÃ§ando pelo nariz e terminando em chifres colocados por ele mesmo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf dispara em direÃ§Ã£o Ã  luta! \n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		
		int hpMonstro03 = 100; //Terceiro inimigo comeÃ§a aqui
		do {
			System.out.println();
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Grupo de Soldados Zarkeanos");
			Digita(hpUsuario + " \uD83D\uDC99", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita(hpMonstro03 + " \uD83D\uDDA4\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita("	 100" + " \uD83D\uDDA4\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita("	 100" + " \uD83D\uDDA4\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita("	 100" + " \uD83D\uDDA4\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("       ESPECIAIS                     ");
			System.out.println();
			System.out.println("====================                ====================");
			System.out.println("Escolha seu ataque");
			System.out.println("1 - Ataque Cortante \u2694\uFE0F ");
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				hpMonstro03 = hpMonstro03 - 100;
				Digita("Com a espada em mÃ£os, vocÃª perfura as costas de um dos inimigos que estava virado para o menino! \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Sua espada fica presa na armadura e no tronco do soldado. VocÃª larga a arma e pula em direÃ§Ã£o do segundo soldado  \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("que ainda estava surpreso com o novo inimigo que despachou seu colega com tanta rapidez, e com suas prÃ³prias mÃ£os, \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("vocÃª levanta o guerreiro, que assustado, berra, ao ser arremessado em cima de um dos seus colegas. \n", TimeUnit.MILLISECONDS, temp_dialog);
				if (hpMonstro03 <= 0) {
					vitoria = true;
					break;
				} 
				break;	
			default:
			}

		} while (vitoria == false);
		vitoria = false;
		//Terceiro inimigo (grupo de inimigos) acaba aqui
		
		Digita("	Faltando apenas um inimigo de pÃ© apÃ³s a sua chegada, o garoto aproveita a oportunidade para usar as suas adagas e \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("perfurar o Ãºltimo soldado em um dos pontos fracos de sua armadura \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Vendo que nÃ£o tem mais chance, os dois soldados que estavam agora no chÃ£o, ajoelham-se e rendem-se. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” VocÃª nÃ£o aprendeu nada, Anton?! ä¸€  VocÃª exclama. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Quantas vezes nÃ£o te falei para nÃ£o se permitir ser cercado? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Mas pai... Estava tudo sob controle! ä¸€ Anton se defende. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Eu sabia que eles estavam atrÃ¡s de mim! JÃ¡ havia matado vÃ¡rios deles! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ele aponta para os cadÃ¡veres no chÃ£o e contando com os dois que acabaram de serem mortos, era possÃ­vel contar seis corpos jogados no chÃ£o. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Eles estavam com medo pai! Estavam hesitando em me atacar! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” E como vocÃª pode ter certeza disso? Ainda por cima fica utilizando estas adagas. â€” Asulf fala com desdÃ©m. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	â€” Essas lÃ¢minas sÃ£o muito curtas. VocÃª nÃ£o pode ficar chegando tÃ£o perto do inimigo toda vez que for lutar com alguÃ©m.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	â€” Foi a minha mÃ£e que me ensinou a lutar assim! ä¸€ Ele defende-se novamente, claramente irritado por ser criticado sobre sua forma de lutar. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Ela me ensinou a lutar desse jeito e estou indo muito bem assim! Eu estava bem! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Pelos deuses, Anton! â€” VocÃª faz uma pausa, falar de sua esposa sempre o chateia.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Usar essas armas, lutar desse jeito Ã© muito perigoso. VocÃª precisa seguir um estilo de luta que nÃ£o vai te ameaÃ§ar sempre que for lutar. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A discussÃ£o de vocÃªs Ã© interrompida quando vocÃª nota que o rosto de Anton torna-se pÃ¡lido. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Quando vocÃª se vira, nota um homem alto, com 1,90 de altura, barba longa castanha escura, com pinturas de guerra azuis em seu rosto e  \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("uma armadura que lembra as escamas de um dragÃ£o. O guerreiro se aproxima de vocÃª com espadas em punhos. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Uma espada longa em cada mÃ£o. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	VocÃª reconhece esta persona. Ele Ã© Siegfried, O Soldado MercenÃ¡rio que vem rechaÃ§ando todas as tropas enviadas atÃ© Zark. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ele foi o responsÃ¡vel por liderar as forÃ§as de resistÃªncia da cidade. Com sua lideranÃ§a, Zark se manteve impenetrÃ¡vel atÃ© os dias atuais.  \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ele Ã© conhecido por descer aos campos de batalha em momentos crÃ­ticos e transformar uma luta perdida em uma vitÃ³ria digna.  \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	VocÃª coloca a mÃ£o no ombro de seu filho e diz: \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Fique fora desta luta, Anton. Deixe que eu lido com isso! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” NÃ£o, pai! VocÃª conhece as histÃ³rias sobre ele! Ele Ã© muito forte! NÃ³s precisamos lutar com ele juntos! â€” O seu filho diz, tentando mostrar coragem. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf sorri, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Tudo bem, Filho... Eu tambÃ©m sou forte! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	VocÃª se vira para enfrentar seu inimigo. VocÃª nÃ£o se assusta e nÃ£o se preocupa. A tempos vocÃª entendeu que estes sentimentos nÃ£o te ajudam em combate. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Quando o rei Atreios soube que Siegfried estava protegendo Zark, enviou vÃ¡rios mensageiros oferecendo o dobro, o  \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("triplo e o quÃ¡druplo do que Zark lhe pagava, apenas para nÃ£o se envolver na luta. O primeiro mensageiro voltou dizendo que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ele negou a proposta, pois nÃ£o largava seus trabalhos pela metade. Depois disso, todos os mensageiros nÃ£o voltaram mais. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” VocÃª estÃ¡ Ã³timo, Asulf! Qual foi a Ãºltima vez que nos vimos? Foi quando defendemos Trakai? â€” Siegfried pergunta. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” NÃ£o, nÃ³s nos encontramos em um bar da Ãºltima vez que vocÃª veio para Volstalir.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Asulf, isso jÃ¡ faz 12 anos! â€” Siegfried gargalha â€” Naquela Ã©poca eu ainda era jovem e vocÃª jÃ¡ era velho. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Agora vocÃª deve ter no mÃ­nimo uns noventa anos. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Siegfried veio de uma famÃ­lia de mercenÃ¡rios, passou a vida inteira lutando em guerras que nÃ£o eram dele. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Com o tempo adquiriu certa fama e tornou-se um mercenÃ¡rio que fazia trabalhos recorrentes para o rei Alexander, recebendo \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("vÃ¡rios elogios por seu cÃ³digo de conduta, nada parecido com o de outros mercenÃ¡rios. VocÃª teve o prazer de lutar lado a lado com ele \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("em algumas ocasiÃµes, mas o novo rei Atreios nÃ£o gosta de ter mercenÃ¡rios em suas fileiras. Para ele toda forÃ§a militar do paÃ­s deve \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estar subjugada ao rei. Durante seu reinado, todos os mercenÃ¡rios foram dispensados. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” VocÃª sabe o porquÃª de estarmos aqui. â€” VocÃª diz \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	â€” Eu sei, Asulf... Mas eu nÃ£o posso deixar que vocÃªs entrem aqui e matem quem vocÃªs quiserem.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” NÃ³s nÃ£o somos assim, Siegfried! VocÃª sabe o cÃ³digo de Volstalir, vocÃª lutou ao nosso lado!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	VocÃª fala, ofendido por ele acreditar que seus soldados seriam capazes de massacrar civis. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Eu estou aqui para te fazer uma proposta, Siegfried... Chega de defender essa cidadezinha patÃ©tica!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Venha comigo! O rei Atreios prometeu lhe dar um espaÃ§o entre os principais generais dele! VocÃª pode comandar exÃ©rcitos! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª estÃ¡ recebendo uma honra que poucas pessoas tiveram. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” VocÃª nÃ£o entende, Asulf! Seu rei traiu meus soldados! â€” Ele fala com raiva â€” Depois de anos protegendo seu paÃ­s, nÃ³s fomos \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("enxotados de lÃ¡! Aqui nÃ³s temos a confianÃ§a do rei! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Siegfried, vocÃª sabe que nÃ£o foi isso que aconteceu! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Chega de conversa!! â€” Ele te interrompe, ficando em posiÃ§Ã£o de ataque â€” Ambos sabemos que nÃ£o vamos chegar em um acordo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Vamos acabar logo com isso!! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Tudo bem, Siegfried. Vamos acabar com isso!! \n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		//Quarta luta, Siegfried, comeÃ§a aqui
		
		int hpMonstro04 = 100; //Segundo inimigo comeÃ§a aqui
		int contador = 0;	//VariÃ¡vel utilizada para poder mudar os textos no loop.
		do {
			
			if (contador == 0) {
				Digita("Siegfried pula em sua direÃ§Ã£o, mais alto do que qualquer homem ordinÃ¡rio conseguiria. \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Com as suas duas espadas ele arremassa a si mesmo em sua direÃ§Ã£o! \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("VocÃª desvia do ataque! Dano 0. ", TimeUnit.MILLISECONDS, temp_dialog);	
			} else if (contador == 1) {
				Digita("Siegfried se vira girando as espadas em sua direÃ§Ã£o! \n", TimeUnit.MILLISECONDS,
						temp_dialog);
				Digita("Mas Asulf abaixa! Dano 0. ", TimeUnit.MILLISECONDS, temp_dialog);
			} else if (contador == 2) {
				Digita("Siegfried tenta mais uma vez lhe acertar com um golpe horizontal! \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Mas Asulf desvia pulando para trÃ¡s. Dano 0. ", TimeUnit.MILLISECONDS, temp_dialog);
				
			}
			System.out.println();
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Siegfried, O MercenÃ¡rio");
			Digita(hpUsuario + " \uD83D\uDC99", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita(hpMonstro04 + " \uD83D\uDDA4\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("       ESPECIAIS                     ");
			System.out.println();
			System.out.println("====================                ====================");

			System.out.println("Escolha seu ataque");
			System.out.println("1 - Ataque Cortante \u2694\uFE0F ");
			
			alternativa = entrada.next();

			switch (alternativa) {
			case "1":
				
				if (contador == 0) {
					hpMonstro04 = hpMonstro04 - 20;
					Digita("Desviando do ataque, vocÃª finca a sua espada na cintura da armadura de Siegfried! â€” Uma Ã¡rea que vocÃª sabe ser menos protegida. \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Este Ã© o primeiro ataque que vocÃª percebe que causa uma verdadeira perfuraÃ§Ã£o na armadura de dragÃ£o dele. Dano 20 ", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (contador == 1) {
					hpMonstro04 = hpMonstro04 - 30;
					Digita("Asulf acerta outro golpe, desta vez na perna de Siegfried! Dano 30.", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (contador == 2) {
					hpMonstro04 = hpMonstro04 - 50;
					Digita("Assim que coloca os pÃ©s no chÃ£o, Asulf pega impulso para avanÃ§ar em direÃ§Ã£o ao seu rival! \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Asulf dispara em direÃ§Ã£o de Siegfried! \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("E com sua lÃ¢mina, perfura o estÃ´mago de Siegfried! \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Fazendo-o largar as armas e cair no chÃ£o. Dano 50. ", TimeUnit.MILLISECONDS, temp_dialog);
				}
				System.out.println();
				if (hpMonstro04 <= 0) {
					vitoria = true;
					break;
				}
				contador++; //Aumenta o contador para ir trocando de falas.
				System.out.println();
				break;	
			default:
			}

		} while (vitoria == false);
		vitoria = false;
		//LUTA SIEGFRIED TERMINA AQUI
		
		Digita("	â€” Merda, Siegfried! VocÃª deveria ter aceitado a maldita proposta! â€” VocÃª diz segurando o seu companheiro de batalha. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Siegfried ri. Seu olhar parece estar longe, como se ele estivesse olhando para algo muito distante dali. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Tudo bem, Asulf... nÃ³s dois tÃ­nhamos uma missÃ£o. Pelo menos eu morri lutando e nÃ£o envenenado ou esfaqueado pelas costa. â€” Ele diz. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Fica calmo, Siegfried... eu vou chamar um curandeiro para vocÃª, eles vÃ£o te remendar!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” EstÃ¡ tudo bem, Asulf. â€” Ele tenta te acalmar â€” Por favor, sÃ³ me dÃ¡ um tempo... sÃ³ me dÃ¡...\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Siegfried cospe sangue. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Merda!! â€” VocÃª olha em direÃ§Ã£o de seu filho â€” Anton, busque um curandeiro... Agora!! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Mas, pai... â€” Seu filho fala com hesitaÃ§Ã£o â€” Ele jÃ¡... \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	VocÃª olha para Siegfried e percebe que nÃ£o existe mais vida em seus olhos. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Antes que Asulf pudesse falar algo, vocÃªs escutam um estrondo vindo da direÃ§Ã£o do combate que Asulf deixou para trÃ¡s. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Seus soldados conseguiram derrubar uma parte do muro de proteÃ§Ã£o da cidade. A queda desta parte gerou um efeito em cascata, que destruiu \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("boa parte do muro prÃ³ximo, abrindo um buraco enorme. Os soldados avanÃ§am para dentro da cidade, preparados para tomÃ¡-la de volta. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Fique atrÃ¡s de mim, Anton! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Pai, vocÃª estÃ¡ bem? â€” Ele pergunta preocupado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Claro que estou! â€” Asulf fala, claramente triste pelo seu companheiro de batalha.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	VocÃª se vira em direÃ§Ã£o da batalha. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Vamos tomar essa cidade!! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	 \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		capitulo2();
	}

	public static void capitulo2() throws InterruptedException {
		System.out.println();
		System.out.println("CapÃ­tulo 2: O Monge");
		
		Digita("	Os prÃ³ximos dias se provaram mais arrastados do que Asulf esperava. Antes\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de conseguirem invadir a cidade, os soldados que estavam nela organizaram boa\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("parte da nobreza, populaÃ§Ã£o e guerreiros restantes, e os levaram ao castelo principal\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("da regiÃ£o.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Analisando o local, percebe-se como ele foi pensado para ser uma verdadeira\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("fortaleza, comeÃ§ando por sua localizaÃ§Ã£o, fica na colina mais alta da regiÃ£o. Tentar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("chegar atÃ© os portÃµes do lugar sÃ³ irÃ¡ deixÃ¡-los expostos a troncos, flechas, Ã³leo\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("fervente e qualquer outra coisa que os refugiados puderem arremessar em sua\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("direÃ§Ã£o. De longe Ã© possÃ­vel avistar arqueiros preparados para atirar em qualquer um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que tentar subir. A estrutura do castelo Ã© de pedra maciÃ§a, construÃ­da do mesmo\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("material que os muros que defendiam a cidade.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf jÃ¡ havia ouvido falar desta categoria de defesa, muito provavelmente o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("castelo estÃ¡ abastecido com suprimentos para durar semanas, atÃ© mesmo meses. A\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("invasÃ£o havia sido planejada para retomar a cidade a seu antigo territÃ³rio. Ele envia\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("um mensageiro Ã  Volstalir para avisar sobre a invasÃ£o bem sucedida e pedir\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("suprimentos para um cerco que pode durar alguns meses,  atÃ© que os refugiados no\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("castelo fiquem sem mantimentos e nÃ£o vejam escolha alÃ©m de se renderem.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Asulf e seu filho se instalam em uma das casas vazias da regiÃ£o e comeÃ§am a se organizar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para uma estadia mais prolongada.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” NÃ£o acha que eles vÃ£o demorar para sair de lÃ¡? ä¸€ Anton pergunta.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” NÃ£o sei, Zarkeanos sÃ£o conhecidos por nÃ£o se renderem fÃ¡cil. Vai depender\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("muito de quem estÃ¡ no comando por lÃ¡.  ä¸€ afirma o pai do menino.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Tomara que isso nÃ£o dure mais do que o necessÃ¡rio, passar o inverno aqui\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nÃ£o estava nos meus planos para esse ano.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” NÃ£o se preocupe, logo reforÃ§os vÃ£o chegar e eles vÃ£o tomar conta da regiÃ£o por\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nÃ³s. Em dois meses no mÃ¡ximo nÃ³s estaremos em casa.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Tomara ä¸€ Anton responde, visivelmente entediado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		String alternativa;
		boolean alternativaCerta = false;
		
		do {
			System.out.println();
			System.out.println("1 - Perguntar a Anton por que ele parece cabisbaixo.");
			System.out.println("2 - Confortar Anton.");
			System.out.print("Escolha:");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":
				Digita("Asulf: Por que vocÃª estÃ¡ cabisbaixo, filho?\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Anton: Por que essas guerras sÃ£o muito longas e cansativas, gostaria de estar em casa\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("aproveitando o tempo com meus amigos ou sei lÃ¡.\n", TimeUnit.MILLISECONDS, temp_dialog);
				alternativaCerta = true;
				break;
			case "2":
				Digita("Asulf: Tudo vai dar certo, filho, logo jÃ¡ teremos retomado as terras do reino.\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Eu sei, pai, por que estamos juntos e tudo vai se resolver!\n", TimeUnit.MILLISECONDS, temp_dialog);
				alternativaCerta = true;
				break;
			default:
				System.out.println("Tenha confianÃ§a.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		
		
		Digita("	Parece que ele estÃ¡ mais preocupado com o que vai fazer quando voltar para\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("casa, do que com a retomada do reino. Seu instinto te fala que isso Ã© normal, ele\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ainda Ã© jovem, vai aprender a ter responsabilidade. Mas mesmo assim esse tipo de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pensamento egoÃ­sta te deixa consternado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Uma semana apÃ³s a invasÃ£o vÃªm chegando pelo norte uma procissÃ£o de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("monges. Todos vestidos com tÃºnicas cor vermelho carmesim, com capuzes cobrindo\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("os olhos, cada um deles segurando algum item diferente, uns seguram livros, outros\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("seguram tochas acesas mesmo estando de dia e outros carregam espadas ainda\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dentro de suas bainhas.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Na frente, um homem velho, extremamente alto com provavelmente 2,10m de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("altura e vestido com uma tÃºnica monÃ¡stica completamente branca. Em suas mÃ£os ele\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("carrega uma gaiola com uma coruja, em seu cinto Ã© possÃ­vel ver um chicote. Ele Ã© o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ãºnico dos homens que nÃ£o estÃ¡ com o rosto coberto por um capuz, mas seus olhos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estÃ£o cobertos por ataduras, como se ele tivesse sofrido alguma espÃ©cie de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ferimento nos globos oculares.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf reconhece um problema quando vÃª um, principalmente este problema.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Estes monges fazem parte de uma ordem chamada â€œA Ordem da Sabedoria do Sofrimento\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Sagradoâ€�.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Eles acreditam que o universo e os deuses sÃ£o muito grandes e que seu poder estÃ¡\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("muito alÃ©m da compreensÃ£o humana. A ponto de que um mero vislumbre desse poder\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pode gerar cicatrizes eternas no ser humano e atÃ© mesmo a morte. Mas que, ao\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mesmo tempo que a luz traz sofrimento, ela traz bondade, conhecimento e avanÃ§os\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para a humanidade. Para estes monges foi um beato deles que trouxe a medicin\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para o nosso mundo a centenas de anos atrÃ¡s. TambÃ©m teria sido um deles que um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dia conversou frente a frente com um dos deuses antigos da podridÃ£o e teria sido o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("primeiro necromante do mundo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Para eles a luz traz o conhecimento. Esse conhecimento pode ser usado de todas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("as formas possÃ­veis, desde que isso traga um avanÃ§o para algum espectro do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("conhecimento mortal, segundo eles nÃ£o existe bom e mau, sÃ³ evoluÃ§Ã£o ou regresso. Um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dos maiores pecados que alguÃ©m pode cometer Ã© ter medo de evoluir por causa destes\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("conceitos â€œatrasadosâ€� de moralidade. Esta filosofia gerou vÃ¡rias ramificaÃ§Ãµes dessa religiÃ£o.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Algumas sÃ£o mais brandas, que acreditam que a evoluÃ§Ã£o tambÃ©m ocorre com empatia,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("trabalho em equipe e amor ao prÃ³ximo. Mas outras seguem Ã  risca esta filosofia e fazem de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("tudo para o aprendizado humano. NÃ£o importando quem eles tenham que abrir, matar ou\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("reviver.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Sua Ãºnica esperanÃ§a Ã© que estes beatos sejam de uma ramificaÃ§Ã£o mais\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("branda, pois pelas histÃ³rias que ouviu, estes monges podem causar muitos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("problemas.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Todos conhecem a histÃ³ria de um sacerdote que invocou um demÃ´nio bem Ã  luz do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dia em uma cidade fronteiriÃ§a Ã  Volstalir. Foi necessÃ¡rio sacrificar todo o gado da cidade\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para um elemental da floresta da regiÃ£o que era capaz de matar o demÃ´nio. Mesmo assim,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("o demÃ´nio sÃ³ foi morto apÃ³s ceifar muitas vidas para o experimento do sacerdote.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ele defendeu-se dizendo que as almas e os corpos dos cidadÃ£os da cidade seriam\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("usados para criar um animal novo; que seria perfeito, podendo proteger o reino, servir de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("companhia para seu dono e alimentÃ¡-lo dando leite e carne sem precisar morrer para isso.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("O animal seria entregue ao rei, para servir de sÃ­mbolo de poder da nobreza local. Ele foi\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("queimado em praÃ§a pÃºblica, para servir de exemplo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Regozijem-se! â€” o sacerdote de branco exclama, enquanto levanta os\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("braÃ§os para o cÃ©u, apoiando a gaiola com apenas uma mÃ£o â€” Mais uma vez esta\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("terra estÃ¡ livre destes Zarkeanos que viviam na escuridÃ£o do regresso.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Por favor, me digam quem foi o responsÃ¡vel pela retomada desta cidade Ã  luz?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Quando o beato diz isso, Asulf nota que nenhum dos outros generais que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estavam ali com se pronunciaram, provavelmente ainda estavam impressionados\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com a caravana e com a estatura desta figura.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		do {
			System.out.println();
			System.out.println("1 - Se pronunciar.");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":				
				alternativaCerta = true;
				break;			
			default:
				System.out.println("Tenha confianÃ§a.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
	
		Digita("	â€” Foi um trabalho em conjunto, meu nobre sacerdote â€” diz Asulf dando um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("passo Ã  frente e ficando mais prÃ³ximo do monge.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Os generais de Volstalir trabalharam em equipe a mando do prÃ³prio rei Atreios,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para coordenar a retomada do nosso territÃ³rio.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Mas Ã© claro! â€” o sacerdote se virou em sua direÃ§Ã£o. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Ã‰ claro que o novo rei nÃ£o deixaria suas terras nas mÃ£os desse povo atrasado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Me diga nobre guerreiro, vocÃªs eliminaram toda a populaÃ§Ã£o daqui? Ou preferem deixar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que eles fujam para a mata para poderem aprender a sobreviver na natureza?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” NÃ³s preferimos a segunda opÃ§Ã£o ä¸€ diz Asulf ä¸€ Na verdade, as pessoas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que viviam aqui e nÃ£o fugiram, ainda poderÃ£o continuar aqui, mas agora terÃ£o que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pagar tributos Ã  Volstalir e seguir as nossas leis.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O homem fica visivelmente desapontado â€” Mas, se eles nÃ£o sofrerem, como\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("vÃ£o conseguir aprender algo?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	VocÃª entende que estÃ¡ Ã© uma oste de monges mais radical.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		do {
			System.out.println();
			System.out.println("1 - Argumentar.");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":				
				alternativaCerta = true;
				break;			
			default:
				System.out.println("Tenha confianÃ§a.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		
		Digita("	â€” NÃ³s nÃ£o pensamos assim por aqui. E o que traz o seu grupo de sacerdotes\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para cÃ¡? NÃ£o sabiam que a cidade estava em guerra? Entrar em uma cidade	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("recÃ©m-tomada pode ser perigoso dependendo do humor dos invasores â€” fala\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("esperando que eles entendam que nÃ£o sÃ£o bem-vindos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O monge ri\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” NÃ£o se preocupe, meu nobre guerreiro, nÃ³s nÃ£o temos medo de opressÃ£o, os\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("deuses nos dÃ£o forÃ§as para enfrentar qualquer um que entre no nosso caminho para achar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("a santa crianÃ§a.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Entendo â€” se lembrando da velha profecia. Estes monges buscam esta\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("crianÃ§a a sÃ©culos, com sorte, pode convencÃª-los de que a crianÃ§a nÃ£o estÃ¡ aqui e\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("eles irÃ£o partir sem causar muita animosidade.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” E como sabem que estÃ£o no caminho certo?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Ah, pequeno soldadoâ€¦ NÃ³s vamos saber! Os deuses da sabedoria sempre\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nos guiam na direÃ§Ã£o certa! â€” ele fala com satisfaÃ§Ã£o.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O sacerdote parece realmente feliz em ter esta conversa, como se todos os\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("soldados que comeÃ§aram a se reunir em volta para ver a procissÃ£o nÃ£o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("representasse nenhum risco. Como se entrar em uma cidade recÃ©m-invadida por um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("exÃ©rcito que nÃ£o se conhece nÃ£o fosse perigoso. Como se tudo o que aconteceu atÃ©\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("agora, todas as mortes, todo o sangue, todo o sofrimento que esta cidade e seus\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homens sofreram, nÃ£o fosse nada. Ele conversa com Asulf como se fossem dois\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("velhos amigos se reencontrando.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Anton se aproxima e fica ao seu lado, com seu amigo Rurik, um garoto de 20 anos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que ele fez amizade desde o inÃ­cio da missÃ£o. De lÃ¡ para cÃ¡ Rurik serviu como um irmÃ£o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mais velho para Anton, dando conselhos e ajudando quando colocava muitas tarefas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para seu filho fazer. VocÃª sempre os via juntos treinando e se divertindo. Rurik Ã© um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("garoto bom, meio cabeÃ§a quente Ã s vezes, mas Ã© um bom amigo e soldado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” O que estÃ¡ acontecendo aqui, pai?!  ä¸€ Antom pergunta.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Nada! Volte para casa! VÃ¡ treinar! ä¸€ fala de forma rÃ­spida.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” E quem Ã© este jovem? â€” o monge se vira para seu filho.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Um jovem guerreiro, filho do pequeno guerreiro? â€” ele se vira para Asulf.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” VocÃª parece ter a guerra em seu sangue, pequeno general! â€” ele te elogia.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Para trazer uma crianÃ§a Ã  guerra Ã© preciso ter certeza que ele consegue se virar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("no combate, ele deve ter treinado-o muito bem!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf nÃ£o diz nada. Anton parece confuso em ver um homem tÃ£o estranho\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("conversando de forma tÃ£o Ã­ntima com o seu pai. Ele nÃ£o possui muitos amigos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O desconforto entre seus soldados Ã© visÃ­vel, quase palpÃ¡vel. A atitude deste homem\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("alto de branco e o silÃªncio de seus seguidores Ã© muito estranha para todos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Sem aviso prÃ©vio, a coruja enjaulada nos braÃ§os do homem alto comeÃ§a a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("assobiar incessantemente, se mexendo na jaula, como se quisesse sair de lÃ¡ e voar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para o pico mais alto de todos os dezessete reinos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” O que foi, Ã�gda?! â€” o homem pergunta para a coruja, como se os dois\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pudessem realmente se comunicar.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A coruja continua a grasnar e se debater na gaiola, cada vez mais agitada. O\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homem abre um sorriso de mais pura felicidade.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Ã‰ isso!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ele se vira para seus seguidores de braÃ§os abertos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” A nossa busca terminou, meus queridos companheiros, nÃ³s finalmente\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("encontramos o procurÃ¡vamos a tanto tempo!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Os homens â€” antes sÃ©rios e calados â€” comeÃ§am a comemorar: uns gritam, outros\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("riem e se abraÃ§am e outros choram de felicidade.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Os seus soldados que agora os cercavam aos montes para tentar entender o que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estava acontecendo, ficam ainda mais confusos e receosos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€œEstes homens encontraram o que buscavam por aqui?â€� â€œO que eles estariam\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dispostos a fazer para tomar isso de nÃ³s?â€�\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Pequeno general! â€” o homem de branco se vira para Asuf.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Seu filho! Ele Ã© a crianÃ§a da profecia! Tem o potencial de aguentar o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mÃ¡ximo que a luz tem a oferecer! Ele vai ser o responsÃ¡vel pelo grande sacrifÃ­cio! A\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("humanidade irÃ¡ evoluir para o Ã¡pice da nossa espÃ©cie! NÃ³s finalmente seremos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dignos de estar do lado dos deuses! â€” ele exclama com uma felicidade parecida com\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("a de uma crianÃ§a que recebeu um brinquedo novo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Me desculpa, mas nÃ£o vou aguentar luz nenhuma nÃ£o! â€” seu filho fala â€”\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("NÃ£o quero ter que sacrificar nada! Eu sou sÃ³ mais um garoto!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Isso mesmo!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” NinguÃ©m aqui vai sacrificar nada a luz nenhuma! â€” afirma veemente.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O homem de branco se vira para seu filho.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” NÃ£o vÃª, menino!? Todo o bem que vai trazer... Ã‰ algo que nem o primeiro\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("necromante sonhou em fazer!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ele se aproxima para colocar a mÃ£o no ombro de Anton, mas Rurik entra na\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("frente de seu filho e afasta a mÃ£o do homem com um tapa.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” VocÃª nÃ£o ouviu? NÃ£o vai ter sacrifÃ­cio nenhum aqui!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Quando Rurik faz isso, o sorriso do homem some e todos os seus seguidores param\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de celebrar. Por um segundo ele olha para Rurik, como se estivesse pensando no que fazer\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("em resposta ao que aconteceu.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Mais rÃ¡pido do que Asulf consegue pensar, o homem acerta um tapa com as\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("costas da mÃ£o em Rurik, arremessando ele atÃ© uma das casas mais prÃ³ximas Ã \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("direita e atravessa a porta da casa como se tivesse sido atirado de dentro de um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("canhÃ£o. A porta se arrebenta e ele cai em cima de uma das mesas da casa, agora\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("destruÃ­da pelo peso dele.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Os soldados ao redor congelam ao ver a cena. O homem gigante que antes\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("sorria e festejava com os seus seguidores agora havia arremessado um de seus\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("companheiros como se nÃ£o fosse nada. Anton corre em socorro a Rurik que agora\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("parecia nÃ£o se mexer mais.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf rapidamente saca a sua espada e ataca, querendo enfiar a lÃ¢mina no\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("querendo enfiar a lÃ¢mina no estÃ´mago no homem.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		//Luta 05 Contra o Monge comeÃ§a aqui
		String hpMonstro05 = "?????";
		do {
			
			System.out.println();
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Sacerdote Branco");
			Digita(hpUsuario + " \uD83D\uDC99", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita(hpMonstro05 + " \uD83D\uDDA4\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("       ESPECIAIS                     ");
			System.out.println();
			System.out.println("====================                ====================");

			System.out.println("Escolha seu ataque");
			System.out.println("1 - Ataque Cortante \u2694\uFE0F ");
			
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":
								
				Digita("Asulf ataca em direÃ§Ã£o ao estÃ´mago o Sacerdote! \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Mas quando percebe ele estÃ¡ segurando a sua lÃ¢mina com uma Ãºnica mÃ£o!\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Ele bloqueou o seu ataque, sem ao menos soltar a gaiola que estava segurando! Dano 0\n", TimeUnit.MILLISECONDS, temp_dialog);
				System.out.println();
				alternativaCerta = true;
				break;	
			default:
			}
			
		} while (alternativaCerta == false);
		alternativaCerta = false;
		
		Digita("Dentro dela, a coruja se debate cada vez mais forte. Ele segura a sua\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("espada e a levanta, te puxando junto com ela. Asulf larga a espada, saca uma faca\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que guarda em seu cinto e tenta mais uma vez acertar o homem porÃ©m a faca ao\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("encostar no estÃ´mago dele, simplesmente rasga a sua roupa. A sensaÃ§Ã£o Ã© que Asulf\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("tentou esfaquear uma parede de pedras maciÃ§as.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Agora um dos generais berra para que seus guerreiros avancem contra o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homem e seus servos e ao fazer isso um dos homens vestidos de vermelho que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("segurava um livro, comeÃ§a a se contorcer, como se houvesse algo em sua barriga.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Assim que os soldados sacam as suas armas, o monge abre a boca e baratas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("voadoras saem dela em direÃ§Ã£o dos soldados, instaurando pÃ¢nico nos seus\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("companheiros.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	No meio do caos o sacerdote acerta um chute em seu peito, tirando por\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("completo seu fÃ´lego e arremessando-o para trÃ¡s com uma forÃ§a estarrecedora.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Mesmo com a armadura te protegendo, seu peito dÃ³i muito, ele acertou-te tÃ£o forte\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que parece que estÃ¡ prestes a ter um infarto. Quando foi arremessado nÃ£o atingiu\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nada que pudesse causar mais danos do que o homem jÃ¡ lhe causou. Quando\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("finalmente para encostado em algo, percebe que foi chutado a mais de 5 metros de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("distÃ¢ncia e que nÃ£o foi arremessado para cima, e sim para frente. EntÃ£o o que mais\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("doeu alÃ©m do chute foi sair rolando pelo chÃ£o atÃ© finalmente parar em um amontoado\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de barris de cerveja que estavam prÃ³ximos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Olhando em direÃ§Ã£o a batalha nota o caos que ela se tornou, vÃ¡rias baratas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("voando, soldados atacando monges. Alguns deles usam espadas, outros usam\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ataques mÃ¡gicos e atÃ© mesmo um dos monges se transformando em uma mistura\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("entre demÃ´nio, homem e lobo. Mas agora nÃ£o se importa com isso, sÃ³ se importa\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com o seu garoto, que ficou com Rurik. Onde ele pode estar?, pensa preocupado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf reÃºne todas as suas forÃ§as e levanta com uma dor descomunal em seu peito.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” Eu tÃ´ ficando velho pra isso.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	NÃ£o foi a primeira vez que lutou contra seres estranhos: demÃ´nios, magos,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("goblins e outros tipos de monstros sÃ£o comuns na vida de um guerreiro. Ã‰ natural\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que para se tornar realmente bom nesta vida, deve-se matar alguns bichos que nunca\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("imaginou que teria forÃ§as para vencer. Acabar com esse bando de monges lunÃ¡ticos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nÃ£o serÃ¡ a sua Ãºltima missÃ£o. Ã‰ melhor que eles nem pensem em encostar em um fio\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de cabelo de Anton.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf corre em direÃ§Ã£o Ã  luta e quando se aproxima vÃª um de seus\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("companheiros caÃ­do, o cheiro que jÃ¡ estÃ¡ acostumado chega em suas narinas, a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("batalha que acabou de comeÃ§ar jÃ¡ fede a sangue e pessoas recÃ©m-mortas. VocÃª \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("reconhece Lortes devido a sua arma, ele Ã© famoso por ser um guerreiro que cria os\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("prÃ³prios equipamentos a partir de metal e magia. Lortes fez sua prÃ³pria armadura,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("uma armadura muito resistente que aguenta ataques elementais mÃ¡gicos mais\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("simples como fogo e eletricidade.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Lortes estÃ¡ no chÃ£o, parece que mesmo com as suas habilidades nÃ£o foi pÃ¡reo para\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("o demÃ´nio lobo que estava atacando seus homens. Sua armadura foi despedaÃ§ada pelas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("garras do monstro e seus Ã³rgÃ£os estÃ£o expostos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		do {
			System.out.println();
			System.out.println("1 - Pegar espada.");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":				
				alternativaCerta = true;
				break;			
			default:
				System.out.println("Tenha confianÃ§a.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
			
		Digita("	Asulf pega a espada dele, uma lÃ¢mina avermelhada afiadÃ­ssima que quando\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("corta incendeia o ferimento causando uma dor gigantesca na vÃ­tima, pode fazer bom\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("uso dela.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	ä¸€ Me perdoe, meu amigo, obrigado pelos seus serviÃ§os ä¸€ Asulf diz ao\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cadÃ¡ver ä¸€ Obrigado por tudo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Indo em direÃ§Ã£o Ã  casa em que Anton estava, encontra Rurik no mesmo lugar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que estava antes, vocÃª pararia para checar seus batimentos cardÃ­acos mas a situaÃ§Ã£o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nÃ£o permite desperdiÃ§ar tempo e reza para ele estar apenas desmaiado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Asulf ouve um grito vindo em direÃ§Ã£o aos fundos da casa, correndo na direÃ§Ã£o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("do som, chega Ã  cozinha. O que a alguns momentos atrÃ¡s era uma cozinha comum\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("agora estava revirada devido Ã  luta. Possui um buraco na parede que leva aos fundos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("da casa onde provavelmente esta famÃ­lia usava para criar porcos. O que vÃª atravÃ©s do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("buraco Ã© seu filho coberto de lama e esterco, se arrastando para tentar fugir do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homem de branco que empunha seu chicote.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Enquanto o padre estÃ¡ apenas com a barra da batina suja pelo chÃ£o imundo,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("seu filho estÃ¡ gravemente ferido, com o corpo cheio de cortes causados pelo chicote,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com o lado esquerdo do rosto inchado pelo que provavelmente foi um soco fraco\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dado pelo padre e com uma de suas pernas quebradas, ele rasteja ferido e sangrando\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para longe do homem que se diverte com o seu sofrimento.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	ä¸€ Isso! Filho da crianÃ§a, vocÃª sente?! ä¸€ O homem diz ä¸€ O sangue, a dor, use\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ela para aprender! Sinta o que tem alÃ©m dela, sinta a santidade que estÃ¡ por trÃ¡s de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("todos os seus sentidos! ä¸€ o monge exclama.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	ä¸€ Vamos, pequenino! ä¸€ chicoteia seu filho ä¸€ Olhe alÃ©m desta dor mundana,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("use ela para se aproximar da iluminaÃ§Ã£o, esta serÃ¡ a sua primeira liÃ§Ã£o: nada Ã© bom,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nada Ã© mau, as coisas apenas aproximam-se ou afastam-se de viver o que Ã© a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("realidade de verdade.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ver a cena o enfurece mas o que esgota a sua paciÃªncia de vez, nÃ£o Ã© a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("batalha desnecessÃ¡ria, nÃ£o sÃ£o seus  amigos mortos, nÃ£o Ã© ter sido arremessado, Ã©\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("o cheiro! Sobre todo fedor de sangue, morte e esterco que sentiu hoje, um cheiro se\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("sobressai: o cheiro de sangueâ€¦ sangue do seu filho!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("O sangue de Asulf fervilha em suas veias, sua visÃ£o se avermelha e ele berra\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ä¸€ Sua luta Ã© comigo, monstro! NÃ£o encoste no meu filho!\n", TimeUnit.MILLISECONDS, temp_dialog);
	
		do {
			
			System.out.println();
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Sacerdote Branco");
			Digita(hpUsuario + " \uD83D\uDC99", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita(hpMonstro05 + " \uD83D\uDDA4\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("       ESPECIAIS                     ");
			System.out.println();
			System.out.println("====================                ====================");

			System.out.println("Escolha seu ataque");
			System.out.println("1 - Ataque Cortante \u2694\uFE0F ");
			
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":
								
				Digita("	Asulf nÃ£o espera que o homem se vire para enfrentÃ¡-lo frente a frente e corre \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("em direÃ§Ã£o ao padre, desferindo um golpe com sua nova espada. A lÃ¢mina atravessa\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("as roupas da criatura e atinge o homem de raspÃ£o, abrindo um corte em sua cintura! Dano ???\n", TimeUnit.MILLISECONDS, temp_dialog);
				System.out.println(); //parei aqui
				alternativaCerta = true;
				break;	
			default:
			}
			
		} while (alternativaCerta == false);
		alternativaCerta = false;
		
		
		
		
		
		
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		//Quinta luta termina aqui - O Sacerdote 
		System.out.println();
		
		
		
		
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		
		Digita("	CRACK!\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		
		capitulo3();
	}

	public static void capitulo3() throws InterruptedException {
		System.out.println();
		System.out.println("CapÃ­tulo 3 inicia");

		
		
		capitulo4();
	}

	public static void capitulo4() throws InterruptedException {
		System.out.println();
		System.out.println("CapÃ­tulo 4: 1Âº Andar - PortÃµes de Fogo");
		System.out.println();
		
		
		String alternativa;            //Utilizado para as escolhas do UsuÃ¡rio.
		int contador = 0;              //Contador Ã© utilizado para contar e dar mais chances em uma questÃ£o.
		boolean alternativaCerta = false; //Utilizado para quando o UsuÃ¡rio escolher uma alternativa certa, assim, saindo do loop e continuando a histÃ³ria.
		
		
		Digita("Aos poucos a sua visÃ£o vai se esvanecendo...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ao entrar na torre, vocÃª sente-se confortÃ¡vel e acolhido, como se uma chama envolvesse o seu coraÃ§Ã£o e aquecesse-o\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª olha Ã  sua frente e nÃ£o acredita no que estÃ¡ vendo.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("â€”â€” Neve!?\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Mas nÃ£o era uma neve comum. Ela era envolvida levemente com uma chama azul. Nem quente, nem fria.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ao observar mais o ambiente, vocÃª se choca com as criaturas que ali habitavam, antes nunca vistas por vocÃª.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Pareciam ser trÃªs raposas, mas com peculiaridades que tornavam-as Ãºnicas. Pareciam energia pura.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("â€”â€” Raposas? No mundo fora da Torre, sÃ£o animais solitÃ¡rios. Essas parecem nÃ£o se desgrudarem. â€”â€” VocÃª pensa.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Estavam correndo, como se estivesse brincando, uma indo Ã  frente da outra em perfeita harmonia. Mas ao mesmo tempo pareciam nÃ£o parar de observar vocÃª.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Uma era avermelhada, estava envolvida em chamas carmesim de um vermelho que parecia dar vida. Te encheu de determinaÃ§Ã£o.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Outra era azulada, encorberta por chamas azuis celeste. Encheu-o de confianÃ§a.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("E a Ãºltima era da cor de um roxo pÃºrpuro, envolvida por chamas negras. Deixou-o contemplativo e lembrou-te do motivo de estar ali.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("â€”â€” Meu filho...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª segue em frente.\n",TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("Passando por uma floresta de folhas envoltas em chamas da cor vermelha, mas que nÃ£o importava quanto tempo se passava, nÃ£o extinguiam-se.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª encontra um rio â€”â€” mas nÃ£o era um rio ordinÃ¡rio â€”â€” e sim um rio com Ã¡gua em chamas azuis, composto por peixes em chamas vermelhas nadando em sincronia.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª decide se ajoelhar Ã  beiro do rio e pegar punhado em suas mÃ£os dessa Ã¡gua em chamas. Ela nÃ£o te queima.\n",TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println("BebÃª-la?");
		System.out.println("1 - Sim");
		System.out.println("2 - NÃ£o");
				
				
		do {	
				alternativa = entrada.next();
				switch (alternativa) {
				case "1": 
					Digita("VocÃª a toma em uma sequÃªncia de trÃªs goles. Essa Ã¡gua encheo-o de energia.\n",TimeUnit.MILLISECONDS, temp_dialog);
					alternativaCerta = true;
					break;
				case "2":
					Digita("VocÃª estÃ¡ receoso com o ambiente desconhecido e prefere a precauÃ§Ã£o e observar mais a situaÃ§Ã£o.\n",TimeUnit.MILLISECONDS, temp_dialog);
					alternativaCerta = true;
					break;
				default:
					Digita("Lembre-se: 1 ou 2.\n",TimeUnit.MILLISECONDS, temp_dialog);
					break;
				}
				
				
		} while (alternativaCerta != true);	
		alternativaCerta = false;
		
		Digita("Ainda ajoelhado, vocÃª olha para a Ã¡gua do riacho e comeÃ§a a observar uma imagem formando-se.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Seria!? â€”â€” VocÃª pensa.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Era a imagem do seu filho formando-se nas Ã¡guas abrilhantadas do rio de chamas.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ã‰ possÃ­vel!? â€”â€” VocÃª questiona-se ao ouvir levemente as vozes do seu filho.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Aos poucos, sem perceber, vocÃª vai se aproximando mais e mais da Ã¡gua. AtÃ© que vocÃª houve algo.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("â€”â€” 01000011 01010101 01001001 01000100 01000001 01000100 01001111\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Pareceu ser um grito â€”â€” mas vocÃª nÃ£o conseguiu decifrar â€”â€” vindo do outro lado do riacho.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª olha para onde o barulho tinha saÃ­do e vÃª um velho.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ele tinha uma barba longa e branca, vestia-se com um manto preto, coberto levemente com as chamas negras.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("As beiradas prÃ³ximo Ã  perna e ao braÃ§o, contidos com as chamas azuis e, prÃ³ximo ao peito, uma leve chama avermelhada.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("â€”â€” O que foi?! â€”â€” VocÃª diz.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Ah...! EntÃ£o vocÃª nÃ£o se comunica na linguagem dos Iluminados.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª: Linguagem dos Iluminados...?\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª fala em tom baixo, se distraindo pensando nas vozes que tinha ouvido de seu filho.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Utilizando a linguagem BinÃ¡rios, utilizado pelos Iluminados, eu ter alertei para ter cuidado.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: VocÃª parece nÃ£o ser daqui...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Essas chamas, apesar de serem belas e confortÃ¡veis, tambÃ©m sÃ£o traiÃ§oeiras.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Se vocÃª nÃ£o tiver a vontade forte, essa energia vai comeÃ§ar a se alimentar de vocÃª.\n"	,TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Esse andar, Ã© uma regiÃ£o farta de energia. NÃ£o precisamos nos alimentar de animais, nem de vegetais, apenas manter a harmonia com as chamas.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: HÃ¡ aqueles que ao entrar em contato com tamanha energia amedrontam-se e perdem sua sanidade.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: TambÃ©m hÃ¡ aqueles que enlouquecem pelo desejo de obter cada vez mais poder e vÃ£o ao PortÃµes de Fogo, tentar subir ao prÃ³ximo andar.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Eles acabam virando 'Hollows', pessoas que se tornaram vazias por dentro e por fora. Tiveram sua razÃ£o destruÃ­da ao, por um momento, duvidarem de si mesmas.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: AtÃ© mesmo os animais nÃ£o estÃ£o livres disso e podem virar monstros inimaginÃ¡veis.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª: PortÃµes de Fogo!? Passar por um portÃ£o? Ã‰ sÃ³ isso o necessÃ¡rio para subir para o prÃ³ximo andar?!\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: VocÃª nÃ£o me ouviu? Essas chamas o irÃ£o te transformar em Hollow!\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: VocÃª desconhece atÃ© as mesmo a linguagem dos Iluminados e quer passar pelos PortÃµes de Fogo.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª: NÃ£o importa... eles levaram o meu filho e nÃ£o hÃ¡ chama nenhuma que irÃ¡ me parar.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Cuidado!!!\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: AtÃ© mesmo as virtudes podem levar ao vÃ­cio que destrÃ³i o carÃ¡ter dos homens.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: As chamas sentirÃ£o no seu Ã¢mago quando isso acontecer e vocÃª estarÃ¡ condenado.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Tenha PrudÃªncia. Ela dispÃµe a razÃ£o para discernir em todas as circustÃ¢ncias o verdadeiro bem e a escolher os justos meios para atingir...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Ela conduz a outras virtudes, indicando-lhes a regra e a medida.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª: Obrigado pelos conselhos, velho. Mas tenho que seguir adiante.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Espere!\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Aqui... pegue esse livro, ele te ajudarÃ¡ a entender a linguagem dos Iluminados.\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println("1 - Pegar");
		
		do {
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				System.out.println("VocÃª tem que seguir em frente... Pelo seu filho...");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;
		
		Digita("VocÃª pega o livro e o observa de ponta a ponta.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ã‰ um livro cheio de zeros (0) e uns (1). E tambÃ©m algumas palavras correlacionando essa linguagem com letras e nÃºmeros do mundo que Asulf conhecia.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: BinÃ¡rios, a linguagem dos Iluminados, Ã© uma linguagem que visa a LÃ³gica das coisas. O sim e o NÃ£o. Verdadeiro ou Falso. Ligado ou Desligado. O tudo ou o Nada... \n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Algumas pessoas ao se aprofundarem tanto nessa lÃ³gica, acabaram por verem tudo dessa maneira...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: ComeÃ§aram a tratar, observar as pessoas como se elas nÃ£o tivessem alma, fossem apenas um amontoado de uns (1) e zeros (0).\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Novamente... Tenha prudÃªncia.\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println("Pedir ajuda para entender a base do conceito da linguagem de BinÃ¡rios?");
		System.out.println("1 - Sim");
		System.out.println("2 - NÃ£o");
		
		do {
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				Digita("Velho: Claro que te ajudarei! Percebo que sua causa Ã© nobre.\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Velho: A linguagem BinÃ¡rio Ã© um sistema de numeraÃ§Ã£o posicional em que todas as quantidades se representam com base em dois nÃºmeros, zero e um (0 e 1).\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Velho: Para fazer uma 'traduÃ§Ã£o' dos nÃºmeros decimais para BinÃ¡rios, vocÃª precisarÃ¡ entender esse conceito:\n",TimeUnit.MILLISECONDS, temp_dialog);
				
				Digita("DECIMAL   |    BINÃ�RIO\n",TimeUnit.MILLISECONDS, ultra_Speed);
				Digita("   0      |      0    \n",TimeUnit.MILLISECONDS, ultra_Speed);
				Digita("   1      |      1    \n",TimeUnit.MILLISECONDS, ultra_Speed);
				Digita("   2      |     10    \n",TimeUnit.MILLISECONDS, ultra_Speed);
				Digita("   3      |     11    \n",TimeUnit.MILLISECONDS, ultra_Speed);
				Digita("   4      |    100    \n",TimeUnit.MILLISECONDS, ultra_Speed);
				Digita("   5      |    101    \n",TimeUnit.MILLISECONDS, ultra_Speed);
				Digita("   6      |    111    \n",TimeUnit.MILLISECONDS, ultra_Speed);
				Digita("   7      |   1000    \n",TimeUnit.MILLISECONDS, ultra_Speed);
				Digita("   8      |   1001    \n",TimeUnit.MILLISECONDS, ultra_Speed);
				Digita("   9      |   1010    \n",TimeUnit.MILLISECONDS, ultra_Speed);
				Digita("  10      |   1011    \n",TimeUnit.MILLISECONDS, ultra_Speed);
				
				System.out.println();
				Digita("Vamos pegar o exemplo do nÃºmero 1110(2), onde esse 2 em parenteses representa a linguagem BinÃ¡rio.\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Para fazer a 'traduÃ§Ã£o' de 1110 (zero, um, um, um) na linguagem BinÃ¡rio para a Decimal, vamos fazer desse jeito:\n",TimeUnit.MILLISECONDS, temp_dialog);
				System.out.println();
				Digita("O primeiro nÃºmero da direita Ã  esquerda, vocÃª vai multiplicÃ¡-lo por 2 elevado a 0.\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("O segundo nÃºmero da direita Ã  esquerda, vocÃª vai multiplicÃ¡-lo por 2 elevado a 1.\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("O terceiro nÃºmero da direita Ã  esquerda, vocÃª vai multiplicÃ¡-lo por 2 elevado a 2.\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("O quarto nÃºmero da direita Ã  esquerda, vocÃª vai multiplicÃ¡-lo por 2 elevado a 3.\n",TimeUnit.MILLISECONDS, temp_dialog);
				System.out.println();
				Digita("E por Ãºltimo, vocÃª vai somar os resultados e terÃ¡ um nÃºmero na linguagem Decimal.\n",TimeUnit.MILLISECONDS, temp_dialog);
				
				Digita("Voltando ao nÃºmero 1110(2), vamos deixÃ¡-lo desse jeito: -->  2â�° * 0  +   2Â¹ * 1   +   2Â² * 1   +   2Â³ * 1  \n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("FicarÃ¡ desse jeito:                         -------------->     0    +      2     +       4    +       8   \n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("E somando-os teremos a linguagem Decimal:   --------------> = 14(10)\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Simples, nÃ£o?\n",TimeUnit.MILLISECONDS, temp_dialog);
				
				do {
					System.out.println("1 - Continuar");
					alternativa = entrada.next();
					switch (alternativa) {
					case "1": 
						alternativaCerta = true;
						break;
					default:
						System.out.println("VocÃª estÃ¡ ficando desesperado? O andar anda mexendo com a sua mente...");
						System.out.println("Escolha 1 para continuar...");
						break;
					}
					
				} while (alternativaCerta != true);
				alternativaCerta = true;
				
				break;
			case "2": 
				alternativaCerta = true;
				break;
			default:
				System.out.println("Os desafios jÃ¡ estÃ£o complicados aqui? Novamente... Escolha entre 1 ou 2. ");
				break;
			}
			
			
		} while (alternativaCerta != true);
		alternativaCerta = false;
		
		
		Digita("VocÃª: Obrigado, velho... \n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª: desculpe-me, estou tÃ£o preocupado que esqueci os bons modos.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª: Eu sou Asulf, um guerreiro das terras de fora da torre. \n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Asulf?... talvez vocÃª seja a fator disruptivo que causarÃ¡ a queda dos velhos deuses... Prazer, eu sou LÃ³gos.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª: LÃ³gos... Eu guardarei seus conselhos na mente e seu livro como um rei guarda o seu tesouro.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª: Agora eu preciso ir... Adeus.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("LÃ³gos: Asulf... Os desafios na sua caminhada atÃ© os PortÃµes de Fogo servirÃ¡ para fortalecer sua mente. NÃ£o esqueÃ§a-os.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("LÃ³gos: Para passar dos PortÃµes de Fogo vocÃª precisarÃ¡ manter sua razÃ£o, suportar os desvaneio da mente e do coraÃ§Ã£o...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("LÃ³gos: conseguindo isso vocÃª terÃ¡ um coraÃ§Ã£o forte que nÃ£o perde para nada. Sim, um coraÃ§Ã£o mais quente que o fogo.\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println("1 - Continuar");
		do {
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				System.out.println("NÃ£o se esqueÃ§a da Sabedoria de LÃ³gos... Escolha 1 para continuar.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;
		
		Digita("VocÃª segue seu caminho pela floresta.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Aos poucos vai anoitecendo...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ao olhar ao cÃ©u, vocÃª nÃ£o consegue acreditar, mas as estrelas... As estrelas eram chamas.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("As chamas vermelhas balanÃ§avam levemente, como se fossem velas.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("... A beleza da noite comeÃ§a a te trazer emoÃ§Ãµes Ã  tona.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("... NÃ£o seja consumido por elas.\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("Para combater que as chamas te consuma por meio de suas emoÃ§Ã£os, utilize a linguagem dos Iluminados para manter a LÃ³gica.\n",TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println("");
		
		
		String opcaoCerta = "8"; //Essa String Ã© a resposta certa.
		do {
			List<String> urna = Arrays.asList("8", "11", "14", "17", "20");
			
			Collections.shuffle(urna);
			
			System.out.println("Mantenha a razÃ£o: faÃ§a a traduÃ§ao de 1000(2) da linguagem dos Iluminados (BinÃ¡rios) para a sua linguagem (Decimal)");
			System.out.println("a) " + urna.get(0));
			System.out.println("b) " + urna.get(1));
			System.out.println("c) " + urna.get(2));
			System.out.println("d) " + urna.get(3));
			System.out.println("e) " + urna.get(4));
			System.out.println();
			System.out.print("Informe a opÃ§Ã£o da traduÃ§Ã£o dos deuses: ");
			alternativa = entrada.next();
			
			switch (alternativa.toLowerCase()) {
			case "a":
				contador++;
				if (urna.get(0).equals(opcaoCerta)) {
					alternativaCerta = true;
				} else {
					System.out.println("Tentativa: " + contador);
					System.out.println("Resposta incorreta!");
			}
				break;
			case "b": 
				contador++;
				if (urna.get(1).equals(opcaoCerta)) {
					alternativaCerta = true;
				} else {
					System.out.println("Tentativa: " + contador);
					System.out.println("Resposta incorreta!");
				}
				break;
			case "c": 
				contador++;
				if (urna.get(2).equals(opcaoCerta)) {
					alternativaCerta = true;
				} else {
					System.out.println("Tentativa: " + contador);
					System.out.println("Resposta incorreta!");
				}
				break;	
			case "d": 
				contador++;
				if (urna.get(3).equals(opcaoCerta)) {
					alternativaCerta = true;
				} else {
					System.out.println("Tentativa: " + contador);
					System.out.println("Resposta incorreta!");
				}
				break;	
			case "e": 
				contador++;
				if (urna.get(4).equals(opcaoCerta)) {
					alternativaCerta = true;
				} else {
					System.out.println("Tentativa: " + contador);
					System.out.println("Resposta incorreta!");
				}
				break;	
			default: 
				contador ++;
				System.out.println("Tentativa: " + contador);
				System.out.println("VocÃª perdeu chance Ã  toa... InÃºtil...");
				System.out.println();
				break;	
				
			}
			
		} while (!alternativaCerta && contador < 3);
	
		
		if (alternativaCerta) {
			Digita("VocÃª estÃ¡ aprendendo a linguagem dos Iluminados! Isso te fortalecerÃ¡ para o desafio final.\n",TimeUnit.MILLISECONDS, temp_dialog);
		} else {
			System.out.println("Resposta incorreta nas 3 tentativas... ");
			System.out.println("Toda sua emoÃ§Ã£o comeÃ§a a consumi-lo... VocÃª tenta lembrar de seu filho... Mas nÃ£o consegue...");
			System.out.println("... VocÃª se tornou Vazio...");
			System.err.println("Derrotado pelas prÃ³prias emoÃ§Ãµes... DeplorÃ¡vel...");
			System.err.println("Fim de jogo.");
			System.exit(0);
		}
			alternativaCerta = false;
			contador = 0;
			
		Digita("VocÃª conseguiu nÃ£o perder a consciÃªncia Ã s emoÃ§Ãµes.\n",TimeUnit.MILLISECONDS, temp_dialog);	
		
		System.out.println("1 - Seguir em frente");
		do {
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				System.out.println("Utilize a razÃ£o... Escolha 1 para continuar.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;
		
		Digita("VocÃª continua adentrando a floresta das folhas em chamas.\n",TimeUnit.MILLISECONDS, temp_dialog);	
		Digita("VocÃª pensa: Novamente... Aquela sensaÃ§Ã£o...\n",TimeUnit.MILLISECONDS, temp_dialog);	
		Digita("Mantenha-se consciente a todo custo!\n",TimeUnit.MILLISECONDS, temp_dialog);	
		Digita("Foque em sua respiraÃ§Ã£o...\n",TimeUnit.MILLISECONDS, temp_dialog);	
		Digita("Respire...\n",TimeUnit.MILLISECONDS, temp_dialog);	
		
			
		do {
			System.out.println();
			System.out.println("NÃ£o deixe o cansaÃ§o abalar seu espÃ­rito: Encontre a quantidade de respiraÃ§Ãµes ideais para manter-se acordado.");
			System.out.println("Existe um nÃºmero que somado com seu dobro Ã© igual a 10100(2) adicionado a 1101(2). Esse serÃ¡ o nÃºmero ideal para te manter acordado.");
			System.out.println("a) 8");
			System.out.println("b) 11");
			System.out.println("c) 14");
			System.out.println("d) 17");
			System.out.println("e) 20");
			System.out.print("Informe a quantidade de respiraÃ§Ã£o ideal: ");
			alternativa = entrada.next();
			
			switch (alternativa.toLowerCase()) {
			case "a":
				contador++;
				System.out.println("Essa quantidade nÃ£o irÃ¡ te acalmar...");
				break;
			case "b":
				contador++;
				alternativaCerta = true;
				break;
			case "c":
				contador++;
				System.out.println("Essa quantidade nÃ£o irÃ¡ te acalmar...");
				break;
			case "d":
				contador++;
				System.out.println("Essa quantidade nÃ£o irÃ¡ te acalmar....");
				break;
			case "e":
				contador++;
				System.out.println("Essa quantidade nÃ£o irÃ¡ te acalmar....");
				break;
			default: 
				contador++;
				System.out.println("Respire...");
				break;
			}
				
		} while (!alternativaCerta && contador < 2);
		
		
		if (alternativaCerta) {
			Digita("VocÃª respira 11 vezes consecutivamente e consegue se acalmar...\n",TimeUnit.MILLISECONDS, temp_dialog);
		} else {
			System.out.println("VocÃª nÃ£o encontra a respiraÃ§Ã£o ideal... ");
			System.out.println("O teu corpo sente-se fraco...");
			System.out.println("As chamas... as chamas... estÃ£o tomando a sua consciÃªncia...");
			System.err.println("AtÃ© caminhar sobre esse andar Ã© muito para vocÃª... DeplorÃ¡vel...");
			System.err.println("Fim de jogo.");
			System.exit(0);
		}
		
		alternativaCerta = false;
		contador = 0;	
		
		System.out.println("1 - Caminhar mantendo a sua respiraÃ§Ã£o.");
		do {
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				System.out.println("Respire... e pense logicamente.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		
		Digita("VocÃª pensa: 'AtÃ© mesmo andar por aqui nÃ£o Ã© para os fracos de coraÃ§Ã£o...'\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		
		System.out.println("1 - Eu consigo...");
		do {
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				System.out.println("Tenha confianÃ§a.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		
		Digita("Ao sair da floresta de folhas em chamas, vocÃª vÃª o que parece ser um prado com as mais diversas cores de chamas.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ao andar por esse prado, vocÃª se vÃª rodeado por pequenas chamas. Parece ser seres vivos cochichando algo.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª se espenta: 'O que Ã© isso? Esses seres... essa quantidade de energia que estÃ¡ me rodeando...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Os seres cochicham mais alto e chegam mais perto.\n",TimeUnit.MILLISECONDS, temp_dialog);;
		Digita("VocÃª precisa escutÃ¡-los, senÃ£o a quantidade de energia que eles emanam irÃ¡ te derrubar.\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		do {
			System.out.println();
			Digita("Pequenos seres de chamas: 'para time, /+-*%1110%*-+/, MCDXIV, para time, four team \n",TimeUnit.MILLISECONDS, ultra_Speed);
			Digita("Pequenos seres de chamas: 'for team, para time, MCDXIV, /+-*%1110%*-+/, XLI\n",TimeUnit.MILLISECONDS, ultra_Speed);
			Digita("Pequenos seres de chamas: 110111001, 10110000110...\n",TimeUnit.MILLISECONDS, ultra_Speed);
			System.out.println();
			Digita("Use o seu conhecimento para entender esses seres, senÃ£o estarÃ¡ acabado para ti.\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Entenda os Pequenos seres de chamas: qual nÃºmero se assemelha mais ao que esses seres estÃ£o falando?\n",TimeUnit.MILLISECONDS, temp_dialog);
			System.out.println("a) 20");
			System.out.println("b) 11");
			System.out.println("c) 14");
			System.out.println("d) 17");
			System.out.println("e) 8"); 
			
			alternativa = entrada.next();
			
			switch (alternativa.toLowerCase()) {
			case "a":
				contador++;
				System.out.println("Utilize a sabedoria de LÃ³gos para te ajudar.");
				break;
			case "b":
				contador++;
				System.out.println("NÃ£o deixe esse quantidade de energia te derrubar!");
				break;	
			case "c":
				alternativaCerta = true;
				break;
			case "d":
				System.out.println("Mantenha-se firme!");
				contador++;
				break;
			case "e":
				System.out.println("Pelo seu filho...");
				contador++;
				break;
			default: 
				System.out.println("Lembre-se da lÃ­ngua dos Deuses, BinÃ¡rio...");
				break;
			}
			
		} while (alternativaCerta != true && contador < 2);
		
		if (alternativaCerta) {
			Digita("VocÃª finalmente consegue entendÃª-los com clareza.\n",TimeUnit.MILLISECONDS, temp_dialog);
		} else {
			Digita("NÃ£o parecia que esses pequenos seres de chamas estavam querendo te prejudicar...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Mas vocÃª Ã© tÃ£o fraco que nÃ£o conseguiu nem se manter de pÃ© ao se aproximarem...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("VocÃª perde o controle de sua respiraÃ§Ã£o...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("... Filho...\n",TimeUnit.MILLISECONDS, temp_dialogSlow);
			Digita("Chamas negras comeÃ§am a surgir de vocÃªs...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("VocÃª nÃ£o se lembra de mais nada...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Nem do seu prÃ³prio filho...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("VocÃª se tornou um Hollow\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Desequilibrado pelas energias dos outros... Vergonhoso.\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Fim de Jogo.\n",TimeUnit.MILLISECONDS, temp_dialog);
			System.exit(0);
			
		}	
		alternativaCerta = false;
		contador = 0;	
		
		System.out.println();
		Digita("Ao aguentar a quantidade imensa de energia que os pequeninos emanavam, vocÃª entende o que eles estavam querendo te dizer.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Que mais Ã  frente vocÃª encontraria um Monge que fazia parte da Ordem da Sabedoria e Sofrimento.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("O Monge estava corrompendo o local prÃ³ximo dos PortÃµes de Fogo, tomando para sim as energias corrompidas dos Hollows que ali habitavam.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Para seguir em frente, vocÃª precisaria aprender a manipular todas as chamas do lugar, principalmente as Chamas Negras.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VocÃª pensa: 'Por isso vocÃªs apareceram, se eu nÃ£o conseguisse nem suportar as energias que vocÃªs emanavam por conta prÃ³pria, eu nÃ£o seria nem capaz de chegar perto do local.'\n",TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("=================|                          |=================\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("-----------------| Chamas Negras APRENDIDA  |-----------------\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("=================|                          |=================\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		
		Digita("Ao continuar o caminho pelo prado, vocÃª avista de longe os PortÃµes de Fogo.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("E tambÃ©m, prÃ³ximo aos PortÃµes de Fogo, uma quantidade imensa de Hollows â€”â€” pessoas que nÃ£o conseguiram passar pelos PortÃµes.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("E lÃ¡ estava ele, o Monge que o pequenos seres de chamas te avisaram que estava corrompendo o lugar.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ao te ver, ele pega uma quantidade maior ainda de Energia Negra dos Hollows e cria um Monstro terrÃ­vel... Um Centopeia Corrompida!\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VENÃ‡A A TODO CUSTO!!!!\n",TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		
		boolean vitoria = false; 		//Utilizado quando o UsuÃ¡rio vence do 'Computador' e sai do loop.         
		int hpMonstro = 500; //Vida do Monge Corrompido
		Random ataqueForca = new Random(); // ForÃ§a do ataque dado por uma aleatoriedade.
		int dano = 0; //dano causado pelo ataque.
		int valor; //Valor gerado pela 'aleatoriedade'.

		do {
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Monge Corrompido");
			Digita(""+ hpUsuario + "" + " \uD83D\uDC99", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita(" " + hpMonstro + " \uD83D\uDDA4\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("       ESPECIAIS                     ");
			System.out.println("* Chamas Negras: " + chamasNegras);
			System.out.println("====================                ====================");

			System.out.println("Escolha seu ataque");
			System.out.println("1 - Ataque Cortante \u2694\uFE0F ");
			System.out.println("2 - Chamas Negras \uD83D\uDD25 ");
			alternativa = entrada.next();

			switch (alternativa) {
			case "1":
				valor = ataqueForca.nextInt(6);
				if (valor == 0) {
					valor = ataqueForca.nextInt(10) + 1;
					if (valor == 1 || valor == 2) {
						Digita("O Monge desviou de seu ataque! Dano 0. ", TimeUnit.MILLISECONDS, temp_dialog);
					} else {
						dano = ataqueForca.nextInt(10) + 10;
						hpMonstro = hpMonstro - dano;
						Digita("Fraco! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
					}
				} else if (valor == 1 || valor == 2 || valor == 3) {
					dano = ataqueForca.nextInt(20) + 10;
					hpMonstro = hpMonstro - dano;
					Digita("O seu ataque nÃ£o foi tÃ£o eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (valor == 4) {
					dano = ataqueForca.nextInt(50) + 40;
					hpMonstro = hpMonstro - dano;
					Digita("O seu ataque foi eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (valor == 5) {
					dano = ataqueForca.nextInt(60) + 60;
					hpMonstro = hpMonstro - dano;
					Digita("O seu ataque foi extremamente eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS,
							temp_dialog);
				}
				System.out.println();

				if (hpMonstro <= 0) {
					vitoria = true;
					break;
				} else {
					valor = ataqueForca.nextInt(10) + 1;
					if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5 || valor == 6
							|| valor == 7) {
						Digita("Asulf desvia do ataque da Centopeia!", TimeUnit.MILLISECONDS, temp_dialog);
					} else if (valor == 8 || valor == 9) {
						dano = ataqueForca.nextInt(10) + 10;
						hpUsuario = hpUsuario - dano;
						System.out.println();

						Digita("Monge usou Chamas EnÃ©rgicas dos Hollows! Dano " + dano, TimeUnit.MILLISECONDS,
								temp_dialog);
						System.out.println();

					} else if (valor == 10) {
						dano = ataqueForca.nextInt(30) + 30;
						hpUsuario = hpUsuario - dano;
						System.out.println();

						Digita("Monge usou Chamas Corrompidas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
						System.out.println();
					}
				}
				if (hpUsuario <= 0) {
					System.out.println();
					Digita("AtÃ© mesmo o Primeiro Andar Ã© demais para vocÃª...", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Derrotado pelo Monge Corrompido... Ele utiliza o seu corpo morto para corromper os PortÃµes de Fogo...", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Asulf torna-se uma marionete morta...", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Fim de jogo. ", TimeUnit.MILLISECONDS, temp_dialog);

					System.exit(0);
				}
				System.out.println();

				break;
			case "2":
				valor = ataqueForca.nextInt(2);

				if (chamasNegras > 0) {
					chamasNegras--;
					if (valor == 0) {
						hpMonstro = hpMonstro - 100;
						Digita("CHAMAS NEGRAS! Dano 100", TimeUnit.MILLISECONDS, temp_dialog);
					} else {
						hpMonstro = hpMonstro - 200;
						Digita("CHAMAS NEGRAS! Dano CRÃ�TICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
					}
				} else {
					hpUsuario = hpUsuario - 5;
					Digita("Ao tentar invocar as Chamas Negras sem energia, a Centopeia Corrompida ataca-o! Dano 5",
							TimeUnit.MILLISECONDS, temp_dialog);

				}
				System.out.println();

				if (hpMonstro <= 0) {
					vitoria = true;
					break;
					
				} else {
					valor = ataqueForca.nextInt(10) + 1;
					if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5 || valor == 6
							|| valor == 7) {
						Digita("Asulf desvia do ataque das Chamas Corrompidas do Monge!", TimeUnit.MILLISECONDS, temp_dialog);
					} else if (valor == 8 || valor == 9) {
						dano = ataqueForca.nextInt(10) + 10;
						hpUsuario = hpUsuario - dano;
						System.out.println();

						Digita("Centopeia Corrompida te atinge! Dano " + dano, TimeUnit.MILLISECONDS,
								temp_dialog);
						System.out.println();

					} else if (valor == 10) {
						dano = ataqueForca.nextInt(30) + 30;
						hpUsuario = hpUsuario - dano;
						System.out.println();

						Digita("Centopeia Corrompida te ataca com forÃ§a! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
						System.out.println();
						
					}
					
				}
				
				if (hpUsuario <= 0) {
					System.out.println();
					Digita("AtÃ© mesmo o Primeiro Andar Ã© demais para vocÃª...", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Derrotado pelo Monge Corrompido... Ele utiliza o seu corpo morto para corromper os PortÃµes de Fogo...", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Asulf torna-se uma marionete morta...", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Fim de jogo. ", TimeUnit.MILLISECONDS, temp_dialog);

					System.exit(0);
				}
				System.out.println();
				break;
				
			default:
			}

		} while (vitoria == false);
		vitoria = false;

		System.out.println();
		Digita("VocÃª vence o Monge Corrompido e sua Centopeia Monstruosa.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ao se aproximar do desafio final do andar, os PortÃµes de Fogo, pensamentos negativos comeÃ§am a vir Ã  mente.\n",TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
			
		Digita("VÃ¡ embora!\n",TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("...",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita(" Seu filho estÃ¡ morto.\n",TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("...",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita(" VocÃª fracassou.\n",TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("...",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita(" Como consegue ser tÃ£o inÃºtil???\n",TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("...",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita(" Decepcionante...\n",TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("...",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita(" VocÃª nunca irÃ¡ aprender?????\n",TimeUnit.MILLISECONDS, temp_dialogFast);
		Digita("...",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita(" DESISTA!!!!!!!!!!!!!!\n",TimeUnit.MILLISECONDS, temp_dialogFast);
		Digita("...",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita(" DESISTA!!!!!!!!!!!!!! \n",TimeUnit.MILLISECONDS, temp_dialogFast);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("... Esses pensamentos...\n",TimeUnit.MILLISECONDS, temp_dialogFast);
		Digita("...",TimeUnit.MILLISECONDS, temp_dots);
		System.out.println();
		Digita("... ESSES PENSAMENTOS!!!!!!!!!! \n",TimeUnit.MILLISECONDS, temp_dialogFaster);
		Digita("... AHHHRRG!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n",TimeUnit.MILLISECONDS, temp_dialogFaster);		
		System.out.println();
		System.out.println();
		
		
		
		do {     //OpÃ§Ã£o de entrar ou nÃ£o nos PortÃµes de Fogo. 2 escolhas.

			Digita("Entrar nos PortÃµes de Fogo?\n",TimeUnit.MILLISECONDS, temp_questions);
			System.out.println("1 - Sim");
			System.out.println("2 - NÃ£o");
			String opcao = entrada.next();
			
			switch (opcao) {
			case "1": 
				
				System.out.println();
				System.out.println();
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);
				System.out.print("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25  PortÃµes de Fogo  ");
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);			
				System.out.println();
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				System.out.print("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25  |      |      |  ");
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);					
				System.out.println();
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				System.out.print("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25  |      |      |  ");
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);					
				System.out.println();
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				System.out.print("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25  |    0 | 0    |  ");
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);					
				System.out.println();
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				System.out.print("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25  |      |      |  ");
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);					
				System.out.println();
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				System.out.print("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25  |      |      |  ");
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);					
				System.out.println();
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				System.out.print("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25  |      |      |  ");
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);	
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);					
				System.out.println();
				System.out.println("                                         â€”â€”â€”â€”â€”â€”â€”â€”â€”â€”â€”â€”â€”");
				
				alternativaCerta = true;
				break;
			case "2":
				Digita("VocÃª tenta voltar â€” mas as chamas distantes que antes pareciam nÃ£o queimar â€” agora fazem teu corpo todo arder.\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("VocÃª nÃ£o sabe dizer se Ã© uma dor fÃ­sica ou uma dor psicolÃ³gica...\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Aos poucos a sua visÃ£o vai se esvanecendo...\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Existe um muro",TimeUnit.MILLISECONDS, temp_dialogFast);
				Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
				Digita("Existe um quarto escuro",TimeUnit.MILLISECONDS, temp_dialogFast);
				Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
				Digita("Tudo estÃ¡ vindo abaixo",TimeUnit.MILLISECONDS, temp_dialogFast);
				Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
				Digita("Reduzindo ao pÃ³",TimeUnit.MILLISECONDS, temp_dialogFast);
				Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
				Digita("Os obstÃ¡culos sÃ£o intransponÃ­veis",TimeUnit.MILLISECONDS, temp_dialogFast);
				Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
				Digita("...",TimeUnit.MILLISECONDS, temp_dotsSlow);
				Digita(" Meu filho",TimeUnit.MILLISECONDS, temp_dialogSlow);
				Digita("...\n",TimeUnit.MILLISECONDS, temp_dotsSlow);
				System.err.println("VocÃª fugiu de suas lutas... LamentÃ¡vel");
				System.err.println("-- Fim de jogo --");
				System.exit(0);
				break;
			default:
				System.out.println();
				System.out.println("Entenda... VocÃª tem que escolher 1 ou 2.");
				break;
			}
		} while (alternativaCerta!= true);
		alternativaCerta = false;
		
		System.out.println("-----Jogue contra seus pensamentos-----");
		System.out.println("Corrida ao 20: somando 1 ou 2, alcance o 20 primeiro.");
		System.out.println("Ã‰ vocÃª contra vocÃª.");
		System.out.println();
		System.out.println("Tomar a iniciativa?");
		System.out.println();
		int placar = 0; //Utilizado para ser o placar do UsuÃ¡rio.
		int placarDerrota = 0; //Utilizado para ser o placar do 'computador' caso o usuÃ¡rio perca.
		System.out.println("Placar: " + placar);
		System.out.println("1 - Sim");
		System.out.println("2 - NÃ£o");
		Random aleatoriedade = new Random(); //Utilizado para escolha aleatÃ³ria do 'Computador' no comeÃ§o do jogo.
		
		do {
			int a = 0;  //vai ser o valor escolhido pelo 'computador', ou seja, 1 ou 2.
			String opcao = entrada.next();
			
			
			switch (opcao) {
			case "1": 
				
				do {
					System.out.println();
					System.out.println("Somar 1 ou somar 2?");
					System.out.println();
					System.out.print("-----------Sua Escolha---------------> ");
					String resposta = entrada.next(); //Utilizado para pegar a entrada do usuÃ¡rio. Ou 1 ou 2.
					
					switch (resposta) {
					case "1":
						placar = placar + 1;
						placarDerrota = placar;
						System.out.println();
						
						if (placar == 20) {
							System.out.println("-----------Placar--------------------= " + placar);
							vitoria = true;
							alternativaCerta = true;
							System.out.println();
							break;
						} else if (placar > 20) {
							System.err.println();
							System.err.println("A provaÃ§Ã£o foi demais para vocÃª...");
							System.exit(0);
						}
						
						if (placar == 10 || placar == 13 || placar == 16 || placar == 19) {
							placar = placar + 1;
							placarDerrota = placar;
							System.out.println("Escolha de suas pertubaÃ§Ãµes quÃ¢nticas: " + 1);
							System.out.println();
							System.out.println("-----------Placar--------------------= " + placar);
						} else if (placar == 12 || placar == 15 || placar == 18) {
							placar = placar + 2;
							placarDerrota = placar;
							System.out.println("Escolha de suas pertubaÃ§Ãµes quÃ¢nticas: " + 2);
							System.out.println();
							System.out.println("-----------Placar--------------------= " + placar);
						} else {
							a = aleatoriedade.nextInt(2) + 1;
							placar = placar + a;
							placarDerrota = placar;
							System.out.println("Escolha de suas pertubaÃ§Ãµes quÃ¢nticas: " + a);
							System.out.println();
							System.out.println("-----------Placar--------------------= " + placar);
						}
						if (placarDerrota == 20) {
							System.err.println();
							System.err.println("VocÃª fracassou...");
							System.err.println("O que serÃ¡ de seu filho agora?");
						    System.exit(0);
						}
						
						break;	
					case "2":
						placar = placar + 2;
						placarDerrota = placar;
						System.out.println();
						
						if (placar == 20) {
							vitoria = true;
							alternativaCerta = true;
							System.out.println("-----------Placar--------------------= " + placar);
							break;
						} else if (placar > 20) {
							System.err.println("...");
							System.err.println("A provaÃ§Ã£o foi demais para vocÃª...");
							System.exit(0);
						}
						
						if (placar == 10 || placar == 13 || placar == 16 || placar == 19) {
							placar = placar + 1;
							placarDerrota = placar;
							System.out.println("Escolha de suas pertubaÃ§Ãµes quÃ¢nticas: " + 1);
							System.out.println();
							System.out.println("-----------Placar--------------------= " + placar);
						} else if (placar == 12 || placar == 15 || placar == 18) {
							placar = placar + 2;
							placarDerrota = placar;
							System.out.println("Escolha de suas pertubaÃ§Ãµes quÃ¢nticas: " + 2);
							System.out.println();
							System.out.println("-----------Placar--------------------= " + placar);
						} else {
							a = aleatoriedade.nextInt(2) + 1;
							placar = placar + a;
							placarDerrota = placar;
							System.out.println("Escolha de suas pertubaÃ§Ãµes quÃ¢nticas: " + a);
							System.out.println();
							System.out.println("-----------Placar--------------------= " + placar);
						}
						if (placarDerrota == 20) {
							System.err.println();
							System.err.println("...");
							System.err.println("...VocÃª fracassou... ");
							System.err.println("O que serÃ¡ de seu filho agora?");
						    System.exit(0);
						}
								
						break;
					default:
						System.out.println();
						System.out.println("Miss click? Acontece nas melhores famÃ­lias. Tente novamente. :)");
						break;
					}
					
				} while (!vitoria);
				
				break;
			case "2": //Se nÃ£o tomar iniciativa, a "mÃ¡quina" comeÃ§a aqui.
				
				System.out.println("Somar 1 ou somar 2?");
				System.out.println();
				
				do {
					if (placar == 7 || placar == 10 || placar == 13 || placar == 16 || placar == 19) {
						placar = placar + 1;
						placarDerrota = placar;
						System.out.println();
						System.out.println("Escolha de suas pertubaÃ§Ãµes quÃ¢nticas: " + 1);
						
					} else if (placar == 6 || placar == 9 || placar == 12 || placar == 15 || placar == 18) {
						placar = placar + 2;
						placarDerrota = placar;
						System.out.println();
						System.out.println("Escolha de suas pertubaÃ§Ãµes quÃ¢nticas: " + 2);
						
					} else {
						a = aleatoriedade.nextInt(2) + 1;
						placar = placar + a;
						placarDerrota = placar;
						System.out.println();
						System.out.println("Escolha de suas pertubaÃ§Ãµes quÃ¢nticas: " + a);
		
					}
					
					
					if (placarDerrota == 20) {
						System.err.println("-----------Placar--------------------= " + placarDerrota);
						System.err.println("VocÃª fracassou...");
						System.err.println();
						System.err.println("O que serÃ¡ de seu filho agora?");
						System.exit(0);
					}

					System.out.print("-----------Sua Escolha---------------> ");
					String resposta = entrada.next();
							
					switch (resposta) {
					case "1":	
						placar = placar + 1;
						placarDerrota = placar;
						System.out.println("-----------Placar--------------------= " + placar);
						System.out.println();
						
						if (placar == 20) {
							vitoria = true;
							alternativaCerta = true;
							break;
						} else if (placar > 20) {
							System.err.println("-----------Placar--------------------= " + placarDerrota);
							System.err.println();
							System.err.println("A provaÃ§Ã£o foi demais para vocÃª...");
							System.exit(0);
						}
						
						break;	
					case "2":
						placar = placar + 2;
						placarDerrota = placar;
						System.out.println("-----------Placar--------------------= " + placar);
						System.out.println();
						
						if (placar == 20) {
							vitoria = true;
							alternativaCerta = true;
							System.out.println("-----------Placar--------------------= " + placar);
							break;
						} else if (placar > 20) {
							System.err.println();
							System.err.println("A provaÃ§Ã£o foi demais para vocÃª...");
							System.exit(0);
						}
								
						break;
					default:
						System.out.println();
						System.out.println("Miss click? Acontece nas melhores famÃ­lias. Tente novamente.");
						boolean erro = true; //A variÃ¡vel 'erro' serÃ¡ verdadeira se o UsuÃ¡rio nÃ£o usar as opÃ§Ãµes certas, ou seja, 1 e 2.
						do {	//Para o usuÃ¡rio que errar a tecla durante o jogo, apÃ³s ter escolhido nÃ£o tomar a iniciativa.
								//Ã‰ necessÃ¡rio para o "computador" nÃ£o fazer a sua jogada e somar ao 'placar'. 
							System.out.print("-----------Sua Escolha---------------> ");
							resposta = entrada.next();
							switch (resposta) {
							case "1":
								erro = false;
								placar = placar + 1;
								placarDerrota = placar;
								System.out.println("-----------Placar--------------------= " + placar);
								System.out.println();
								
								if (placar == 20) {
									vitoria = true;
									alternativaCerta = true;
									break;
								} else if (placar > 20) {
									System.err.println("-----------Placar--------------------= " + placarDerrota);
									System.err.println();
									System.err.println("A provaÃ§Ã£o foi demais para vocÃª...");
									System.exit(0);
								}
								
								break;
							case "2":
								erro = false;
								placar = placar + 2;
								placarDerrota = placar;
								System.out.println("-----------Placar--------------------= " + placar);
								System.out.println();
								
								if (placar == 20) {
									vitoria = true;
									alternativaCerta = true;
									System.out.println("-----------Placar--------------------= " + placar);
									break;
								} else if (placar > 20) {
									System.err.println();
									System.err.println("A provaÃ§Ã£o foi demais para vocÃª...");
									System.exit(0);
								}
								break;
							default: 
								erro = true;
								System.out.println();
								System.out.println("Miss click? Acontece nas melhores famÃ­lias. Tente novamente.");
								break;
								
							}
						} while (erro == true);
						
						break;
					}
					
				} while (!vitoria);
				
				
				break;
			default: 
				System.out.println("Ainda nÃ£o entendeu como funciona? Talvez vocÃª nÃ£o esteja pronto para esse desafio...");
				System.out.println("Mais uma vez: escolha 1 ou 2.");
				break;
			}	

		} while (!alternativaCerta);
			alternativaCerta = false;
		
		
		
		
		Digita(""
				+ ""
				+ "\n"
				+ "______________.s$$_________\n"
				+ "_____________s$$$______s__ \n"
				+ "___________.s$$$___ __.s$,_\n"
				+ "__________s$$$$Â³______.s$__ \n"
				+ "_____,____$$$$$.______s$Â³__ \n"
				+ "_____$___$$$$$$s_____s$Â³___\n"
				+ "____s$___Â³$$$$$$$s___$$$\n"
				+ "____$$____Â³$$$$$$s.__Â³$$s\n"
				+ "_____Â³$.____Â³$$$$$$$s_.s$$$\n"
				+ "____`$$.____Â³$$$$$$$_$$$$\n"
				+ "_____Â³$$s____Â³$$$$$$s$$$Â³\n"
				+ "______Â³$$s____$$$$$s$$$$`\n"
				+ "___s.__$$$$___s$$$$$$$$Â³_.s\n"
				+ "___$$_s$$$$..s$$$$$$$$$$$$$ Â³\n"
				+ "___s$.s$$$$s$$$$$$$$$$$$$$$ \n"
				+ "__s$$$$$$$$$$$$$$$$$$$$$$$\n"
				+ "_s$$ssss$$$$$$$$$$ssss$$$s\n"
				+ "$sÂ§Â§Â§Â§Â§Â§Â§Â§Â§s$$$$sÂ§Â§Â§Â§Â§Â§Â§Â§Â§\n"
				+ "Â³Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§s$sÂ§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§\n"
				+ "Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§sÂ§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§\n"
				+ "Â³Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§\n"
				+ "_Â³Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â³\n"
				+ "__Â³Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â³\n"
				+ "___Â³Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â³\n"
				+ "_____Â³Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â³\n"
				+ "_______Â³Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â§Â³\n"
				+ "_________Â³Â§Â§Â§Â§Â§Â§Â§Â§Â³\n"
				+ "____________Â³Â§Â§Â§Â§Â³\n"
				+ "______________Â³Â§Â³\n",TimeUnit.MILLISECONDS, ultra_Speed);
		
		
		
		Digita("PrÃ³ximo... PrÃ³ximo de meu filho...!!\n",TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita("HÃ¡ quartos que nÃ£o devemos entrar",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("...",TimeUnit.MILLISECONDS, temp_dots);
		Digita("Ira",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("...",TimeUnit.MILLISECONDS, temp_dots);
		Digita("Medo",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("qualquer paixÃ£o que leve a mente Ã  'possessÃ£o' que desintegra os homens na guerra",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("O hÃ¡bito serÃ¡ o meu campeÃ£o",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("Quando treinamos a mente a pensar de uma maneira",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("...",TimeUnit.MILLISECONDS, temp_dots);
		Digita(" quando recusamos deixÃ¡-la pensar de outra maneira",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("...",TimeUnit.MILLISECONDS, temp_dots);
		Digita(" e de uma Ãºnica maneira",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("...",TimeUnit.MILLISECONDS, temp_dots);
		Digita(" produzimos uma grande forÃ§a em combate.\n",TimeUnit.MILLISECONDS, temp_dialog);

		
		
		
		do {
			System.out.println("1 - Continuar no prÃ³ximo andar.");
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				System.out.println("Tenha confianÃ§a.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
	
		capitulo5();
		
		
		
		
		
		
		

	}
	
	public static void capitulo5() throws InterruptedException {
		System.out.println();
		System.out.println("CapÃ­tulo 5 inicia");
		System.out.println();
		
		Digita("	Asulf se coloca diante dos portões de fogo, sua pele arde e seus pensamentos \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("clamam para dar meia volta e desistir de tudo isso, mas agora é tarde já fez muito para desistir. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ao colocar as mãos nos portões, Asuf sente um frio gigantesco correr a sua \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("espinha, ele empurra as portas que se movem com certa facilidade, abrindo caminho \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para um lugar escuro, extremamente escuro. Ele não entende o que está acontecendo \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mas engole o medo e dá um passo à frente. Assim que coloca os dois pés dentro da \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("escuridão, os portões se fecham com força. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Olhando para o chão percebe que ele é feito de concreto, Asuf remove uma de \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("suas luvas para tatear melhor o terreno e percebe que ele também está úmido. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Está muito escuro, é impossível ver um palmo à sua frente e ele se encosta \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("contra a parede, o seu único ponto de referência. Ao encostar nela, Asuf sente sua \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("superfície gelada. Ele começa a seguir a parede para ver onde te leva e pouco tempo \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("depois ela se encontra com outra parede. Estou dentro de uma sala?, pensa. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Seguindo esta nova parede você tropeça em algo que parece ser uma escada. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Tudo bem... Estamos progredindo! 一Asulf fala para si mesmo e sobe as escadas e \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mais uma vez bate o rosto em algo. Uma porta!, Asulf tateia sua nova saída, louco \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para sair desta escuridão e achar algumas respostas sobre o lugar. Quando \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("finalmente encontra o puxador da porta e faz força para abri-la, ela simplesmente não se mexe. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Mas que diabos? 一 Asulf fala, enquanto empenha mais força para abrir a porta, sem sucesso. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A sensação é que existe algo atrás desta porta, algo que empurra para dentro da sala, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mas alguma coisa invisível no ambiente impede que esta força externa invada o cômodo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Depois de tentar puxar várias vezes a porta, um símbolo escarlate aparece em seu centro. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		//TESTE DE MEMÓRIA
		
		//FIM DO TESTE
		
		//A parte a seguir ficará dentro da função do Jorge (ainda será mais modificado)
		Digita("	Você se cansa disso, seus novos poderes não são inatos e para acessá-los precisa \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("querer “ativar” eles. E se lembra que junto com a sua força e magia, também adquiriu \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("forma de desativar magias. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf se concentra e busca em seu âmago toda força que seu pacto lhe conferiu e \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("puxou a porta de uma só vez, ele destrói a porta e a água  começa a jorrar no \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ambiente. O  resto de oxigênio abandona a sala e corre em direção à superfície, a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("água rapidamente inunda a sala e você logo se encontra submerso.", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Um bolsão de ar?, pensa, pego desprevenido pelo novo problema. Asulf nada para \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("fora da sala e finalmente enxerga a luz, ela vem de uma janela da casa submersa e ele \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nada em direção a fonte de luz, atravessando a janela percebe que não é somente a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("casa que está alagada, mas toda a rua! Ele olha para cima e nota que a água está a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mais de dezoito andares acima. Merda! Onde que eu tô?, pensa e começa a subir \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("desesperado em direção a margem. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf nada usando tudo o que consegue mas parece que a sua superforça não \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("funciona bem quando não se tem nenhum apoio além da água, seus pulmões ardem e \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("a sua visão fica cada vez mais avermelhada enquanto nada desesperadamente em \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("direção à superfície. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Subindo vê casas, igrejas, muros e até mesmo um castelo submerso, a única \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("coisa que não foi completamente submersa foi uma pequena montanha cujo castelo \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("era construído próximo, apenas uma parte de seu topo ainda continua fora da água. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Algo aconteceu a esta cidade, mas o que teria o poder para fazer isso com uma \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cidade inteira? Seria possível que aquele monge tivesse poder para fazer isso? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf continua a nadar e a margem continua distante, o resto de ar em seus \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pulmões começa a se esvair e a água começa a entrar em seu corpo, seus pulmões \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("gritam e a sua visão fica cada vez mais avermelhada. Anton, por favor, me diga que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("você sobreviveu a isto!, pensa ele. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Uma corrente de água fortíssima o arremessa para cima com tanta velocidade \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que todo o espaço que faltava entre ele e a borda se acabam em segundo. Você \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("começa a desacelerar e termina o caminho da subida nadando sozinho, Asulf a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cabeça para fora d’água e começa a vomitar toda a água que havia engolido enquanto\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estava lá embaixo e aos poucos consegue voltar a respirar normalmente e agradece \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("aos deuses por conseguir chegar à superfície. E então Asuf entende que os deuses \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("não dão bênçãos a homens que venderam a sua alma, os deuses não abençoam ninguém. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Se subiu para a superfície foi porque alguém ou algo físico o fez subir, algo \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que fez desta cidade submersa o seu novo lar. Ele olha ao redor, procurando o ser \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que poderia ter causado esta corrente d’água e o  avista. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Saindo da água vê uma criatura gigantesca, um ser tão grande que a mera \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("existência dele é uma afronta a tudo o que já via na sua vida. Com uma largura \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("“quilometral”, ele abre a suas asas demonstrando uma envergadura que poderia ser \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("comparada a apenas a largura de uma cidade. Seria belo, se não fosse assustador. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Pelos deuses 一 fala estarrecido. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Saindo da água vê uma arraia do mar, aprimeira imagem que vê desta criatura \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("são suas costas, costas gigantescas pintadas de azul e com manchas brancas. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Suas nadadeiras colossais têm a envergadura para poder cobrir toda uma cidade. Uma Arraia \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Manta gigantesca, um ser tão imenso que poderia ameaçar até os deuses caso ele quisesse. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf olha a distância para o leviatã, incrédulo que um ser como este possa \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("existir. Até que ele faz algo que te choca ainda mais. Suas nadadeiras começam a sair \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("da água e apontar para o céu, seu corpo começa a apontar para cima e o leviatã \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("começa a subir. Como se fossem asas, suas nadadeiras levam a criatura aos ares, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("subindo em direção às nuvens e começa a abrir caminho pelo ar. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O ser voa pelos céus como se fossem  água, como se o ar fosse apenas mais \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("uma extensão do seu domínio primário, ele gracioso começa a serpentear pelos céus \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("enquanto olha maravilhado. \,", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Saindo do torpor de ver a criatura, Asuf nota que boa parte da montanha que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("protegia o castelo continua fora d’água, seu topo é apenas uma rocha gigantesca, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mas ao menos é seco e pode pensar melhor sem se preocupar em passar uma noite \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com água até o pescoço e nem com outros predadores que possam estar escondidos \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("debaixo d’água. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Pelos seus cálculos a montanha deve estar a cerca de quatro quilômetros de \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("distância da onde está e com a sua força provavelmente conseguirá chegar em uma", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("hora de nado até a margem. Asulf se vira de costas para a criatura e começa a nadar", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para a montanha. Chegando próximo a ela mais uma coisa te surpreende, em sua \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("margem, tem uma criança acenando para você. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Chegando até a margem da montanha a criança se aproxima de e começa a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("puxar seu braço. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Senhor, por favor, eu preciso da ajuda! 一 Ele fala enquanto puxa seu braço, mal te \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dando tempo de ficar em pé direito. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Calma, garoto, o que está acontecendo? 一 Asulf pergunta confuso 一 O que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("aconteceu com essa cidade? Como você sobreviveu? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 A cidade já tá assim há muito tempo, ela já estava assim quando nasci 一 ele fala, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("como se uma cidade inteira inundada não fosse nada de mais. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf pisa firme no chão e não deixa mais a criança o levar a lugar nenhum. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一Espera, garoto! Mas como consegue sobreviver aqui sozinho? 一 pergunta \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("desconfiado que possa ser uma armadilha. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Onde estão seus pais? O que está acontecendo? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O garoto olha para você com a típica impaciência que só as crianças possuem. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Eu não sei! 一 ele grita com impaciência 一 Eu nem tava vivo quando a cidade foi \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("inundada 一 ele continua 一 Meu papai falou que foi alguma briga entre uns deuses \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que estavam zangados. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Calma, como assim? 一 pergunta confuso. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一Vamos moço, eu preciso de ajuda. Meu pai vai conseguir te explicar direito! 一 a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("criança fala impaciente 一 Mas agora eu preciso de ajuda! 一 o menino berra \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("impaciente. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Seu moleque! 一 Asulf berra de volta consternado com a audácia da criança 一 \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Onde estão os seus pais? Por que não pede ajuda para eles? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(	"	一PORQUE SÃO ELES QUE PRECISAM DE AJUDA! 一 ele berra de volta mais uma vez \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("e você fica sem reação. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Será que agora pode parar de reclamar e me ajudar? 一 ele pergunta, desta vez \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mantendo um pouco mais a compostura. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf respira fundo e diz 一 Tudo bem, me leve até eles. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A criança te guia pela montanha, que a distância parecia apenas o topo \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("rochoso de uma montanha castigada pelo mar que impede qualquer vegetação e a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("vida animal de prosperar sobre o seu solo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Mas, na verdade, possui uma pequena caverna próxima a sua costa. Os dois \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("adentram a caverna e seguem por uma sequência de túneis que os levam montanha \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para baixo. Asulf nota que os túneis não são naturais, é possível sentir um leve \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("aroma de magia no ar como se alguém houvesse escavado a montanha com magia \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pura. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Meu avô escavou esses túneis 一 a criança fala enquanto lidera o caminho. Sem \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ele provavelmente você se perderia entre os diversos caminhos que existem dentro \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("deste labirinto escondido. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Ele fez isso para se proteger da inundação? 一 Asulf pergunta intrigado. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Não, não 一 a criança esboça um pequeno sorriso 一 Ele era um tipo de mago \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("malvado no tempo dele, então ele fez estes túneis aqui em cima para ficar protegido \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dos soldados do rei. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 E por acaso seu avô ainda está por aqui? 一 pergunta com um tom de \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("preocupação. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Meu pai me disse que ele morreu quando eu era um bebê, ele disse que antes das \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("arraias chegarem, tinha um bicho muito malvado nas águas. Ele falou que o monstro \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("passava horas acertando a montanha. Como se ele estivesse atrás de nós! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(	"一 Será que não poderia estar atrás do seu avô? 一 o mais velho fala, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("surpreendentemente intrigado com a história do pequeno. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Eu pensava isso também, mas o papai me garantiu que não. Sabe, não foi só a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("minha família que sobreviveu à inundação. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Não foi? \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		
		
		
		
		
		
		
		//PARTE ARTHUR
		Digita("	— Não foi, meu papai me contou que veio como um alagamento, pareceu que um \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Deus matou outro e largou seu corpo no mar. Meu pai disse que ele era muito gordo e o \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("tamanho dele fez o nível do mar subir muito rápido — contou a criança rindo — Isso fez \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com que a cidade fosse inundada, mas não veio como uma onda, acho que o papai usou a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("palavra “nível do mar” — falou como se estivesse lembrando de uma palavra muito difícil. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Meu pai me falou que tinham vários barcos perto da montanha — continuou o \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("menino — Parece que o rei pensou rápido e colocou boa parte da população neles antes \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que a cidade fosse inundada. O rei então fez as pazes com o vovô se ele prometesse usar \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("sua magia para tirar o sal da água e dar para os sobreviventes, claro que isso era como \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("uma brincadeira para o vovô — contou com orgulho. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O homem mais velho olhou para o menino com certo interesse, pensativo sobre tudo \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que acabara de descobrir. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	— Mas aí esse monstro veio e destruiu todos os barcos, a gente só escapou porque \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("morava aqui dentro. — O menino fala com uma calma que assusta Asulf, pois ele nem \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("parecia a criança que pedia ajuda com tanto desespero momentos atrás. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Chegando em um local mais iluminado, o homem de cabelos castanhos pôde \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("avistar mais tochas com chamas alaranjadas dos que nos metrôs anteriores, mais a frente \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("conseguiu distinguir alguns tapetes no chão, móveis simples, mas aconchegantes, alguns \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("livros espalhados pelo cômodo. A criança correu até a pequena cama no canto onde um \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homem com aparência cansada e semblante abatido estava deitado, suas roupas \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("esfarrapadas pelo tempo e uma barba por fazer, o menino abraçou o mesmo e sorriu com \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("alegria. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Papai, esse homem vai nos ajudar! Ele vai salvar o senhor! — exclamou com \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("felicidade estampada no rosto. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf avaliou o homem enquanto puxava uma cadeira para se sentar, o mesmo não \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("aparentava ter mais de 50 anos, porém se encontrava extremamente debilitado. Seu cabelo \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estava caindo, ele estava magro e suas veias do pescoço estavam estranhamente escuras. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Meu nome é Asulf, qual o seu? — questionou. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	— Meu nome é Samkennd — engasgou pronunciando a meia voz — de onde veio, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("meu senhor? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O menino pegou um pequeno copo de água e ofereceu para o pai que aceitou de bom grado. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Vim de Volstalir porém é um lugar bem distante da onde estamos agora — \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("responde o com calma. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("— Samkennd tossiu arduamente — Não conheço este tal lugar de Volstair, da onde é? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— É um pouco complicado para explicar — responde o mesmo com calma — Seu \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("filho me disse que você precisa de ajuda. Meu tempo é curto, pode me dizer o que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("aconteceu? - questiona Asulf rapidamente. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Seu tempo está passando rápido demais e ajudar alguém estava fora de seus planos. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Samkennd tossiu novamente com mais força, o cenho franzindo com o esforço \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Estava mergulhando entre os destroços da cidade, buscando coisas úteis para \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("usarmos aqui em casa, quando tudo ao meu redor começou a ficar enevoado. Escutei um \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("grito sem fim, agonizando e sofrendo, quando notei um enorme monstro coberto de algas \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nadava em minha direção. Tentei subir à superfície para ir embora, mas meu corpo parecia \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ter congelado, meus músculos pareciam pesar toneladas e já era tarde demais quando ele \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("me atacou. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Então um homem estranho, muito alto apareceu nadando. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você se levanta na hora. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(	"	— Um homem? Um monge? - o velho guerreiro pergunta. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Sim! Este homem arrancou o coração do monstro com as próprias mãos- \ne", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Samkennd fala com o olhar abismado - eu nunca vi nada parecido com isso. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Depois suas asseclas me arrastaram para fora da água. Eu implorei para ele me levar \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("até a minha casa e me ajudar, meu braço doía muito… mas ele me disse que já havia me \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ajudado bastante e me pediu para eu mostrar o caminho para o próximo mundo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— E você mostrou esse caminho? - Asulf perguntou visivelmente preocupado.", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Por um lado é animador que este homem saiba o caminho de para o próximo mundo, mas é \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("revoltante saber que ele ajudou aquele maldito monge. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu falei para ele onde o portal fica, expliquei todo o caminho para ele, mas que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("somente eu poderia abrir o portal. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Ele estava com um jovem? - Asulf perguntou preocupado - esse monstro levou o \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("meu filho! Você o viu com ele? \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	O homem se mostra confuso. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	— Desculpe-me… mas as únicas pessoas que estavam com ele, eram estes homens \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("vestidos de vermelho… uma coruja… \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	Impossível \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Isso é impossível!!! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O que esse maldito fez com o meu filho... \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	O ódio consome o seu ser, Antom pode estar morto. Será que o monge não viu mais \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("potencial nele e simplesmente o matou e o largou pelo caminho? \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("Se ele tiver feito isso, Asulf caminhará por cada inferno, fará pactos com cada deus e \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("demônio e matará que estiver no seu caminho para arrancar o coração deste monstro maldito. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	— Onde esse monstro está? - o ódio é perceptível em suas palavras \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	— Ele já passou pelo portal - Samkennd fala temeroso pela sua mudança de postura \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— ele usou alguma magia de sangue para abrir uma fenda entre os mundos… ele usou os \n	", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("próprios sacerdotes para abrir o portal… \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	Você agarra o homem pelo pescoço e o levanta. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Onde está  o portal? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Não por favor! - o homem implora \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	Você aperta mais forte o pescoço dele. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	—  ONDE ESTÁ O MALDITO PORTAL? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— SOLTA O MEU PAI! \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	O menino corre em sua direção com uma pequena faca que ele tirou do bolso. Ele vem em \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("sua direção e com um tapa você arremessa ele contra a parede. Você ainda não se acostumou com a sua nova força. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A criança acerta a parede com força e cai no chão desmaiada. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Sune! —  o pai grita com lágrimas nos olhos, impossibilitado de ajudar o próprio \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("filho contra o monstro que está apertando o seu pescoço. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você olha para a criança e nota sangue escorrendo de sua cabeça. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Merda… merda —  você solta o homem e corre em direção a criança - me \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("desculpe, me desculpe! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Sune está com um pequeno corte na cabeça, mas está com as pupilas normais e com bons \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("batimentos cardíacos. Você rapidamente faz um curativo no machucado e o carrega para \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("colocá-lo na cama de seu pai. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	É difícil lutar contra a sensação ruim de saber que aquilo que fizeram com você meses \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("atrás, você fez com outra família indefesa, uma família que não tem culpa de nada do que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("você passou. Você machucou essa família, você foi o monstro deles. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	—  Me desculpe senhor - você entrega a criança no colo do pai —  eu vou te ajudar, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("me mostre o seu braço. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	O velho ainda assustando e vermelho pelo enforcamento levanta a barra da \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("camiseta. Asulf olhou com cuidado, as marcas pareciam de queimaduras em forma de mão \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("e o local parecia estar gelado. Suas suspeitas estavam certas. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	— Isso foi um Draugen, é uma espécie de fantasma de um homem que morreu no \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mar, ele queima o local em que toca e só cura com um antídoto certo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Entendo, esse nome não me parece estranho — resmunga o velho pensativo — \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Pegue o livro de capa verde-escura que está na pilha perto da mesa, por favor. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	Você anda para uma mesa cheia de pilhas de livros, encontra o livro e leva-o para \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Samkennd. O velho folheia o livro rapidamente até encontrar algo, lê com atenção e respira \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("fundo — Este livro está contando as histórias de vários monstros, inclusive o Draugen, vou \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("precisar da sua ajuda, Asulf — resmungou o doente com certa dificuldade. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	—  Apenas me diga o que devo fazer. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Vá até à mesa de alquimia que está um pouco mais à frente das tochas no \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("corredor para descobrir o antídoto! \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	Desorientado, o mesmo anda até a entrada do pequeno cômodo, avistando as \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("tochas com chamas alaranjadas, ele acena para Samkennd, andando em direção ao final \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("do corredor. Ao se afastar mais de onde estava, as tochas vão diminuindo fazendo com que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("o corredor fique mal iluminado e turvo, um vento corrente assobia de fundo enquanto Asulf \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cerra os olhos para enxergar a mesa. Mais alguns passos hesitantes e o mesmo encontra a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mesa embaixo de uma tocha lampejante enorme, a mesma está repleta de objetos de vidro, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("líquidos coloridos e diversas formas de coisas que nunca viu antes. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		//Desafio da mesa 
		
		
	
		
		
		//Após o Desafio
		Digita("	Asulf seguiu as orientações que lhe foram dadas e conseguiu encontrar o antídoto, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com isso o mesmo adquiriu o poder de cura com suas novas experiências. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O velho guerreiro pega o antídoto e volta para o túnel onde estavam Samkennd e \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("seu filho esperando seu retorno. Asulf caminha até o homem mais velho e lhe entrega o \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("frasco, o mesmo bebe rapidamente o conteúdo \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Vamos torcer para que a sua suposição esteja certa, esses remédios não fazem \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("muito bem quando são mal administrados - é possível ouvir um certo ressentimento em sua voz. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	— Se der errado você morre, se você não tivesse tomado, você também morreria, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("acredito que vale a pena tentar. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	Gradualmente a cor volta ao rosto pálido do homem. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita(" 	— Tudo bem, vamos tirá-lo daqui logo  — o homem fala se levantando com a ajuda \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de um cajado . \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	Você tenta ajudá-lo, mas ele afasta a sua mão com força. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita(" 	— Não tente agir como se nada tivesse acontecido!  — esbraveja  —  você me \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ajudou a me recuperar e agora eu te ajudo a sair daqui. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Tudo bem, tudo bem  —  o guerreiro fala envergonhado. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("A dupla caminha pelos túneis da montanha e chegam em um caminho que termina em um \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("buraco com pouco mais de 3 metros de largura e extremamente profundo, tão profundo que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("não é possível de se ver o fundo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Mostre o seu pescoço  —  Samkennd pede. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	O guerreiro o faz sem questionar", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	— Se meu pai estivesse aqui, com certeza arrancaria a sua pele só por encostar em \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("alguém da família dele — ele fala enquanto desenha um símbolo com tinta em seu pescoço \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mas infelizmente eu não sou um mago tão bom quanto ele era e nas minhas condições, não \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("consigo lidar com alguém que fez um pacto como o seu. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	—  Como você sabe? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("O homem ri \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	—  Você fede a trevas, qualquer pessoa mais sensitiva sabe que você mexeu com o \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que não deveria. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	—  Eu fiz o que era necessário, sem esse pacto eu não tenho chance nenhuma \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("contra o monge, você sabe do poder dele, você viu o que ele está disposto a fazer para \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("chegar aonde ele quer!", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	— Sim eu vi, mas saiba que seja lá o deus que você fez pacto, ele não vai deixar \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("barato essa sua chance de vingança, deuses das trevas não são muito conhecidos por \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("manterem as suas promessas. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Quando este momento chegar eu penso no que fazer —  Asulf fala cortando o \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("assunto —  já acabou o encantamento? \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	—  Pelos deuses como você é impaciente, cale a boca e me deixe concentrar —  o \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mago fala e logo em seguida começa a recitar versos antigos de uma magia que parece vir \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de deuses antigos de outra realidade. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("A marca feita em seu corpo começa a brilhar em tons de azul. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	—  Está feito, pode pular. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf olha para o buraco sem fundo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Você tem certeza que isto vai dar certo - o guerreiro pergunta receoso. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	—  Eu não sou tão bom quanto meu pai, mas ele fez questão de me ensinar como \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("abrir o portal, é uma função passada de geração a geração, pode ter certeza que vai dar \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("certo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	—  Mas você parece estar fraco ainda. \n", TimeUnit.MILLISECONDS, temp_dialog);		
		Digita("	—  Se pular e não der certo, você morre na queda, se não pular você fica aqui e \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("morre de velhice sem saber se seu filho está bem ou não, fica a sua escolha. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Samkennd fala dando meia volta e caminhando em direção a sua casa. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu não queria ter feito aquilo Samkennd, me desculpe, eu perdi o controle. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Vá logo homem, saia do meu reino e vá encontrar o seu filho logo — o mago fala \n", TimeUnit.MILLISECONDS, temp_dialog);		
		Digita("sem parar de caminhar. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	—  Fala para o seu filho que você me matou, ele vai gostar de pensar que o pai dele \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("me matou. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Se o feitiço não der certo eu vou ter matado mesmo — o mago fala e continua \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("caminhando até virar uma uma esquina da caverna e não poder ser mais visto. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf ri e olha em direção ao buraco \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— É melhor você estar vivo Anton, seu pai está fazendo muita coisa errada para \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("conseguir te encontrar. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Sem hesitar mais, o guerreiro pula em direção ao desconhecido. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		
		
		
		
		capitulo6();
		
	}
	
	public static void capitulo6() throws InterruptedException {
		System.out.println();
		System.out.println("CapÃ­tulo 6: 3Âº Andar - Anjos CaÃ­dos");
		
		int cont = 0; //contador
		boolean resp1v = false; //resposta certa
		String resp1 = "2021", ex1;   //resposta do desafio
		String alternativa; //escolha do jogador
		boolean alternativaCerta = false; //para quando acertar a resposta
		
		
		//CONEXÃƒO DO ANDAR ANTERIOR
		
		System.out.println();
		System.out
				.printf("        ____\r\n" + "       /    /\\____/ \\    /\\\r\n" + "      /\\   /   \\/    \\  / /\r\n"
						+ "     / /   \\   /  / \\ \\/  \\\r\n" + "    /  \\   /   / /   \\     \\\r\n"
						+ "    \\  /  /\\   \\/  \\  \\     \\\r\n" + "    /  \\/ \\ \\  / \\  \\/ \\    / \r\n"
						+ "    \\     /  \\/   \\/   /   / \r\n" + "    /    /            /    \\\r\n"
						+ "   /     /           /      \\\r\n" + "  /_____/____________\\_______\\");
		System.out.println();
		System.out.println();

		System.out.println("1 - Entrar");

		do {
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				Digita("Lembre-se... Lembre-se do seu filho...	\n", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}

		} while (alternativaCerta != true);
		alternativaCerta = false;
		System.out.println();

		Digita("	ApÃ³s alguns metros de caminhada vocÃª olha para trÃ¡s e percebe que nÃ£o hÃ¡ mais a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("entrada que vocÃª passou.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();

		do {
			System.out.println("1 - Seguir em frente");
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				Digita("CONTINUE!! CONTINUE!!	\n", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}

		} while (alternativaCerta != true);
		alternativaCerta = false;
		System.out.println();
		
		Digita("	Ao continuar o caminho estreito da caverna, Asulf vÃª uma luz roxa brilhante mais Ã \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("frente e pensa:	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	â€” â€œTalvez seja a saÃ­daâ€�.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Entrando onde essa luz roxa brilhava, ele se depara com o que parece ser uma sala\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("oval, formada por rochas e ametistas roxas. Ao centro dessa sala, parecia haver um painel	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com pedras ametistas em uma coluna de um metro e meio. A sala possuÃ­a trÃªs estÃ¡tuas de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("valquÃ­rias â€” deidades femininas que serviam Odin. Uma, de acordo com a  gravura na\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estÃ¡tua, chama-se Eir e segurava um escudo enorme. Outra chama-se Olrun e possuÃ­a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("armadura leve e asas notÃ¡veis. A mais notÃ¡vel entre elas, era Sigrun. De acordo com as\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("gravuras, ela era a Rainha das ValquÃ­rias. Elas estavam segurando espadas longas que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("apontavam para o chÃ£o ao redor do painel.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Observando o ambiente, Asulf percebe que nÃ£o hÃ¡ mais por onde passar e\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("aproxima-se do painel.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
	
		do {
			System.out.println("1 - Analisar pedras ametistas");
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				Digita("NÃ£o erre... Pelo seu filho...	\n", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}

		} while (alternativaCerta != true);
		alternativaCerta = false;
		System.out.println();
		
		Digita("	O painel Ã© formado por letras e nÃºmeros. Neste painel hÃ¡ gravuras da linguagem\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Hexadecimal. HÃ¡ uma histÃ³ria sendo contada. Tudo indica que hÃ¡ um ano em que os	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Deuses do Novo Mundo nascerÃ£o apÃ³s passar por diversos desafios e eliminar o antigo	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("paradigma. PorÃ©m, os falsos profetas irÃ£o sucumbir em ruÃ­nas.	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Esse ano estÃ¡ escrito na linguagem Hexadecimal. Traduza 7E5(16) para a sua\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("lÃ­ngua (decimal), colocando as pedras ametistas no painel.	\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println();
		do {
			System.out.print("Recite o ano informando-o na linguagem decimal(10): ");
			ex1 = entrada.next();
			if (ex1.equals(resp1)) {
				resp1v = true;
				cont++;
			} else if (cont == 0) {
				Digita("VocÃª sente um leve tremor e nada acontece.\n", TimeUnit.MICROSECONDS, temp_dialogSlow);
				cont++;
			} else if (cont == 1) {
				Digita("VocÃª sente novamente o tremor e ele estÃ¡ mais forte.\n", TimeUnit.MICROSECONDS, temp_dialog);
				cont = cont + 1;
			} else if (cont == 2) {
				Digita("A caverna treme muito agora e estÃ¡ prestes a desmoronar...\n", TimeUnit.MICROSECONDS,
						temp_dialogFast);
				cont = cont + 1;
			} else if (cont == 3) {
				Digita("	Tudo comeÃ§a cair aos pedaÃ§os...\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("	VocÃª jÃ¡ nÃ£o enxerga mais, apenas sente a dor de pedras caindo em seu corpo. Ã‰ uma dor agoniante... \n",
						TimeUnit.MILLISECONDS, temp_dialog);
				Digita("	VocÃª morreu soterrado na caverna...!\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("	Seu filho nunca mais o encontrarÃ¡...!\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("	Fim de jogo.\n", TimeUnit.MILLISECONDS, temp_dialog);
				System.exit(0);

			}

		} while (!resp1v);
		System.out.println();
		Digita("	ApÃ³s recitar e decifrar o enigma, a caverna comeÃ§a a se mover. Um novo caminho se abre.\n",
				TimeUnit.MICROSECONDS, temp_dialog);
		Digita("Asulf nota que hÃ¡ um pergaminho na boca de umas das valquÃ­rias. Ele aproxima-se.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		do {
			System.out.println("1 - Pegar pergaminho");
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				Digita("nÃ£o pare!\n", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}

		} while (alternativaCerta != true);
		alternativaCerta = false;
		System.out.println();
		Digita("=================|                          |=================\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("-----------------| Sabedoria de Odin OBTIDA |-----------------\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("=================|                          |=================\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		System.out.println();

		do {
			System.out.println("1 - Seguir pelo novo caminho");
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				Digita("NÃ£o pare!\n", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}

		} while (alternativaCerta != true);
		alternativaCerta = false;
		System.out.println();
		
		Digita("	Ao passar pelo caminho que se abriu, Asulf ouve um barulho vindo de trÃ¡s. As\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("valquÃ­rias estÃ£o vivas e estÃ£o vindo atrÃ¡s de vocÃª. Derrote-as!!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		
		boolean vitoria = false; 		//Utilizado quando o UsuÃ¡rio vence do 'Computador' e sai do loop.         
		int hpValquiria01 = 1000;
		int hpValquiria01Max = 1000; //Vida MÃ¡xima da ValquÃ­ria 01 (usado p/ quando ela se curar e sua vida nÃ£o ficar acima da vida mÃ¡xima)
		int aumentaVida200 = 200; //variÃ¡vel utilizada para aumentar a vida da valquÃ­ria01 - Sigrun
		int hpValquiria02 = 300;
		int hpValquiria03 = 300;
		Random ataqueForca = new Random(); // ForÃ§a do ataque dado por uma aleatoriedade.
		int dano = 0; //dano causado pelo ataque.
		int valor; //Valor gerado pela 'aleatoriedade'.
		
		do {
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Sigrun, a Rainha das ValquÃ­rias");
			Digita(""+ hpUsuario + "" + " \uD83D\uDC99", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                    ");
			Digita(" " + hpValquiria01 + " " + "\uD83D\uDDA4\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("                                         Olrun, a Veloz");
			
			System.out.print("                                          ");
			Digita("" + hpValquiria02 + "" + " \uD83D\uDDA4\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("                                         Eir, a Defensora");
			
			System.out.print("                                          ");
			Digita("" + hpValquiria03 + "" + " \uD83D\uDDA4\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("       ESPECIAIS                     ");
			System.out.println("* Chamas Negras: " + chamasNegras + "/5");
			System.out.println("* Elixir da Vida: " + elixirDaVida + "/15");
			System.out.println("* Sabedoria de Odin: " + sabedoriaDeOdin + "/10");
			System.out.println("====================                ====================");
			
			
			System.out.println("Qual ValquÃ­ria atacar?");
			System.out.println("1 - Sigrun, a Rainha das ValquÃ­rias");
			System.out.println("2 - Olrun, a Veloz");
			System.out.println("3 - Eir, a Defensora");
			System.out.println();
			System.out.print("Sua escolha: ");
			String escolha = entrada.next(); //escolha da valquÃ­ria
			System.out.println("Escolha seu ataque");
			System.out.println("1 - Ataque Cortante \u2694\uFE0F      3 - Elixir da vida  \u2764\uFE0F");
			System.out.println("2 - Chamas Negras \uD83D\uDD25        4 - Sabedoria de Odin \u26A1");
			System.out.println("X - Voltar");
			alternativa = entrada.next();

			switch (escolha) {
			case "1": //Atacando a valquiria01 SIGRUN
		
				switch (alternativa) {
				case "1": //Ataque Cortante
					
					if (hpValquiria01 > 0) {
					
						valor = ataqueForca.nextInt(6);//ataque do Protagonista
						if (valor == 0) {
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Sigrun desviou de seu ataque! Dano 0. ", TimeUnit.MILLISECONDS, temp_dialog);
							} else {
								dano = ataqueForca.nextInt(10) + 10;
								hpValquiria01 = hpValquiria01 - dano;
								Digita("Fraco! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
							}
						} else if (valor == 1 || valor == 2 || valor == 3) {
							dano = ataqueForca.nextInt(10) + 20;
							hpValquiria01 = hpValquiria01 - dano;
							Digita("O seu ataque nÃ£o foi tÃ£o eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
						} else if (valor == 4 || valor == 5) {
							dano = ataqueForca.nextInt(60) + 60;
							hpValquiria01 = hpValquiria01 - dano;
							Digita("O seu ataque foi eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
						} 
						
					} else {
						Digita("Asulf estÃ¡ atancando uma ValquÃ­ria morta! ASULF ESTÃ� ENLOUQUECENDO!?", TimeUnit.MILLISECONDS, temp_dialog);
					}
					
					System.out.println();
					System.out.println();
					if (hpValquiria01 < 0) { //para o hp nÃ£o ficar negativo no painel
						hpValquiria01 = 0;
					}
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					} else {
						//Ataque ValquÃ­ria
						if (hpValquiria01 > 0) { 
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| atira Ã  distÃ¢ncia suas penas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 7|| valor == 8) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;								
								Digita("|Sigrun| LanÃ§a Divina AmaldiÃ§oada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 9) {
								dano = ataqueForca.nextInt(10) + 50;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| VALHALLA!!!!!!!!!!!! \u2734\uFE0F LanÃ§a Divina AmaldiÃ§oada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 10) {
								if (hpValquiria01 == hpValquiria01Max) {
									Digita("|Sigrun| errou o ataque!", TimeUnit.MILLISECONDS,
											temp_dialog);
								} else {
									Digita("|Sigrun| se curou! \uD83D\uDDA4 Vida + " + aumentaVida200, TimeUnit.MILLISECONDS,
											temp_dialog);
									hpValquiria01 = hpValquiria01 + aumentaVida200;
									if (hpValquiria01 > hpValquiria01Max) {
										hpValquiria01 = hpValquiria01Max;
									}
								}
							
							} 
							System.out.println();
							System.out.println();
						}
						if (hpValquiria02 > 0) {
							valor = ataqueForca.nextInt(10) + 1; //Ataque ValquÃ­ria02
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 8;
								hpUsuario = hpUsuario - dano;	
								Digita("|Olrun| te ataca com velocidade! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);							
							} else {
								Digita("Asulf desvia do ataque de Olrun!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						if (hpValquiria03 > 0) { //ataque valquiria03
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;
								
								Digita("|Eir| te acerta com seu escudo! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
								
							} else {
								Digita("Asulf desvia do ataque de Eir!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						
					}
						
					if (hpUsuario <= 0) {
						Digita("Insuficiente... InÃºtil...!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Fim de jogo!", TimeUnit.MILLISECONDS, temp_dialog);
						System.exit(0);
					}
					System.out.println();
					System.out.println();
	
					break;
				case "2": //ataque das Chamas Negras
					
					if (hpValquiria01 > 0) {
											
						valor = ataqueForca.nextInt(2);
						if (chamasNegras > 0) {
							chamasNegras--;
							if (valor == 0) {
								hpValquiria01 = hpValquiria01 - 100;
								Digita("CHAMAS NEGRAS! Dano 100", TimeUnit.MILLISECONDS, temp_dialog);
							} else {
								hpValquiria01 = hpValquiria01 - 200;
								Digita("CHAMAS NEGRAS! Dano CRÃ�TICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
							}
						} else {
							hpUsuario = hpUsuario - 5;
							Digita("Ao tentar invocar as Chamas Negras sem energia, Asulf Ã© atacado! Dano 5",
									TimeUnit.MILLISECONDS, temp_dialog);
						}
					
					} else {				
						Digita("ASULF TENTOU USAR CHAMAS NEGRAS EM UMA VALQUÃ�RIA MORTA! ASULF ESTÃ� ENLOUQUECENDO?!", TimeUnit.MILLISECONDS, temp_dialog);
						if (chamasNegras > 0) {
							chamasNegras--;
						}
					}
					System.out.println();
					System.out.println();
					if (hpValquiria01 < 0) { //para o hp nÃ£o ficar negativo no painel
						hpValquiria01 = 0;
					}
					//ataque valquÃ­rias
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					} else {
						
						if (hpValquiria01 > 0) { //ataque valquiria01
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 6 || valor == 7 || valor == 8) {
								dano = ataqueForca.nextInt(5) + 10;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| se enfurece e vai para cima de Asulf! acertando uma sequÃªncia de socos! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 9 ||valor == 10) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| te ataca com forÃ§a! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						if (hpValquiria02 > 0) { //ataque valquiria02
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5) {
								dano = ataqueForca.nextInt(5) + 8;
								hpUsuario = hpUsuario - dano;
								Digita("|Olrun| te ataca com velocidade! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
							} else {
								Digita("Asulf desvia do ataque de Olrun!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						if (hpValquiria03 > 0) { //ataque valquiria03
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2 || valor == 3) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;
								Digita("|Eir| te acerta com seu escudo! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
							} else {
								Digita("Asulf desvia do ataque de Olrun!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						
					}
					
					if (hpUsuario <= 0) {
						Digita("Derrotado pelas ValquÃ­rias! Fim de jogo!", TimeUnit.MILLISECONDS, temp_dialog);
						System.exit(0);
					}
					System.out.println();
					break;
					
				case "3": //Usando o elixir da vida
					if (elixirDaVida > 0) {
						Digita("Asulf recupera vida! Vida + 75\n", TimeUnit.MILLISECONDS, temp_dialog);
						hpUsuario = hpUsuario + 75;
						elixirDaVida--;
						if (hpUsuario > 100) {
							hpUsuario = 100;
						}
					}
					System.out.println();
					System.out.println();
					
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					} else {
						if (hpValquiria01 > 0) { 
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| atira Ã  distÃ¢ncia suas penas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 7|| valor == 8) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;								
								Digita("|Sigrun| LanÃ§a Divina AmaldiÃ§oada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 9) {
								dano = ataqueForca.nextInt(10) + 50;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| VALHALLA!!!!!!!!!!!! \u2734\uFE0F LanÃ§a Divina AmaldiÃ§oada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 10) {
								if (hpValquiria01 == hpValquiria01Max) {
									Digita("|Sigrun| errou o ataque!", TimeUnit.MILLISECONDS,
											temp_dialog);
								} else {
									Digita("|Sigrun| se curou! \uD83D\uDDA4 Vida + " + aumentaVida200, TimeUnit.MILLISECONDS,
											temp_dialog);
									hpValquiria01 = hpValquiria01 + aumentaVida200;
									if (hpValquiria01 > hpValquiria01Max) {
										hpValquiria01 = hpValquiria01Max;
									}
								}
							
							} 
							System.out.println();
							System.out.println();
						}
						if (hpValquiria02 > 0) {
							valor = ataqueForca.nextInt(10) + 1; //Ataque ValquÃ­ria02
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 8;
								hpUsuario = hpUsuario - dano;
								
								Digita("|Olrun| te ataca com velocidade! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
								
							} else {
								Digita("Asulf desvia do ataque de Olrun!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						if (hpValquiria03 > 0) { //ataque valquiria03
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;
								
								Digita("|Eir| te acerta com seu escudo! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
								
							} else {
								Digita("Asulf desvia do ataque de Eir!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						
					}
						
					if (hpUsuario <= 0) {
						Digita("Insuficiente... InÃºtil...!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Fim de jogo!", TimeUnit.MILLISECONDS, temp_dialog);
						System.exit(0);
					}
					System.out.println();
					System.out.println();
	
					break;
				case "4":
					
					if (hpValquiria01 > 0) {
						valor = ataqueForca.nextInt(2);
						if (sabedoriaDeOdin > 0) {
							sabedoriaDeOdin--;
							if (valor == 0) {
								hpValquiria01 = hpValquiria01 - 100;
								Digita("ODIN!!!! Dano 100", TimeUnit.MILLISECONDS, temp_dialog);
							} else {
								hpValquiria01 = hpValquiria01 - 200;
								Digita("ODIN!!!! Dano CRÃ�TICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
							}
						} else {
							hpUsuario = hpUsuario - 5;
							Digita("Ao tentar invocar a Sabedoria de Odin sem energia, Asulf Ã© atacado! Dano 5",
									TimeUnit.MILLISECONDS, temp_dialog);
						}
						
					} else {
						Digita("ASULF ESTÃ� ATACANDO UMA VALQUÃ�RIA MORTA! ESTÃ� ENLOUQUECENDO?!", TimeUnit.MILLISECONDS, temp_dialog);
						if (sabedoriaDeOdin > 0) {
							sabedoriaDeOdin--;
						}
					}
					System.out.println();
					System.out.println();
					if (hpValquiria01 < 0) { //para o hp nÃ£o ficar negativo no painel
						hpValquiria01 = 0;
					}
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					}
					Digita("Ao utilizar a Sabedoria de Odin, Asulf fica mais rÃ¡pido que um raio. Nenhum inimigo o atingirÃ¡!\n", TimeUnit.MILLISECONDS, temp_dialog);
				default:
				}
				break;
			case "2": //Atacando a valquiria02 OLRUN
				
				switch (alternativa) {
				case "1": //Ataque Cortante
					
					if (hpValquiria02 > 0) {
					
					
						valor = ataqueForca.nextInt(10) + 1;//ataque do Protagonista
						if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5 || valor == 6) {					
							Digita("Olrun desviou de seu ataque! Ela Ã© muito rÃ¡pida! Dano 0. ", TimeUnit.MILLISECONDS, temp_dialog);				
						} else if (valor == 7 || valor == 8 || valor == 9) {
							dano = ataqueForca.nextInt(10) + 20;
							hpValquiria02 = hpValquiria02 - dano;
							Digita("O seu ataque nÃ£o foi tÃ£o eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
						} else if (valor == 10) {
							dano = ataqueForca.nextInt(30) + 60;
							hpValquiria02 = hpValquiria02 - dano;
							Digita("O seu ataque foi eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
						} 
					
					} else {
						Digita("ASULF ESTÃ� ATACANDO UMA VALQUÃ�RIA MORTA! ASULF ESTÃ� ENLOUQUECENDO?!", TimeUnit.MILLISECONDS, temp_dialog);
					}
					System.out.println();
					System.out.println();
					if (hpValquiria02 < 0) { //para o hp nÃ£o ficar negativo no painel
						hpValquiria02 = 0;
					}
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					} else {
						//Ataque ValquÃ­ria
						if (hpValquiria01 > 0) { 
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| atira Ã  distÃ¢ncia suas penas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 7|| valor == 8) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;								
								Digita("|Sigrun| LanÃ§a Divina AmaldiÃ§oada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 9) {
								dano = ataqueForca.nextInt(10) + 50;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| VALHALLA!!!!!!!!!!!! \u2734\uFE0F LanÃ§a Divina AmaldiÃ§oada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 10) {
								if (hpValquiria01 == hpValquiria01Max) {
									Digita("|Sigrun| errou o ataque!", TimeUnit.MILLISECONDS,
											temp_dialog);
								} else {
									Digita("|Sigrun| se curou! \uD83D\uDDA4 Vida + " + aumentaVida200, TimeUnit.MILLISECONDS,
											temp_dialog);
									hpValquiria01 = hpValquiria01 + aumentaVida200;
									if (hpValquiria01 > hpValquiria01Max) {
										hpValquiria01 = hpValquiria01Max;
									}
								}
							
							} 
							System.out.println();
							System.out.println();
						}
						if (hpValquiria02 > 0) {
							valor = ataqueForca.nextInt(10) + 1; //Ataque ValquÃ­ria02
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 8;
								hpUsuario = hpUsuario - dano;
								
								Digita("|Olrun| te ataca com velocidade! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
								
							} else {
								Digita("Asulf desvia do ataque de Olrun!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						if (hpValquiria03 > 0) { //ataque valquiria03
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;
								
								Digita("|Eir| te acerta com seu escudo! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
								
							} else {
								Digita("Asulf desvia do ataque de Eir!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						
					}
						
					if (hpUsuario <= 0) {
						Digita("Insuficiente... InÃºtil...!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Fim de jogo!", TimeUnit.MILLISECONDS, temp_dialog);
						System.exit(0);
					}
					System.out.println();
					System.out.println();
	
					break;
				case "2": //ataque das Chamas Negras
					
					if (hpValquiria02 > 0) {
																
						valor = ataqueForca.nextInt(2);
						if (chamasNegras > 0) {
							chamasNegras--;
							if (valor == 0) {
								hpValquiria02 = hpValquiria02 - 100;
								Digita("CHAMAS NEGRAS! Dano 100", TimeUnit.MILLISECONDS, temp_dialog);
							} else {
								hpValquiria02 = hpValquiria02 - 200;
								Digita("CHAMAS NEGRAS! Dano CRÃ�TICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
							}
						} else {
							hpUsuario = hpUsuario - 5;
							Digita("Ao tentar invocar as Chamas Negras sem energia, Asulf Ã© atacado! Dano 5",
									TimeUnit.MILLISECONDS, temp_dialog);
						}
					
					} else {
						Digita("ASULF ESTÃ� ATACANDO UMA VALQUÃ�RIA MORTA! ASULF ESTÃ� ENLOUQUECENDO?!!", TimeUnit.MILLISECONDS, temp_dialog);
						if (chamasNegras > 0) {
							chamasNegras--;
						}
					}
					System.out.println();
					System.out.println();
					if (hpValquiria02 < 0) { //para o hp nÃ£o ficar negativo no painel
						hpValquiria02 = 0;
					}
					//ataque valquÃ­rias
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					} else {
						
						if (hpValquiria01 > 0) { //ataque valquiria01
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 6 || valor == 7 || valor == 8) {
								dano = ataqueForca.nextInt(5) + 10;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| se enfurece e vai para cima de Asulf! acertando uma sequÃªncia de socos! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 9 ||valor == 10) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| te ataca com forÃ§a! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						if (hpValquiria02 > 0) { //ataque valquiria02
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5) {
								dano = ataqueForca.nextInt(5) + 8;
								hpUsuario = hpUsuario - dano;
								Digita("|Olrun| te ataca com velocidade! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
							} else {
								Digita("Asulf desvia do ataque de Olrun!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						if (hpValquiria03 > 0) { //ataque valquiria03
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2 || valor == 3) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;
								Digita("|Eir| te acerta com seu escudo! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
							} else {
								Digita("Asulf desvia do ataque de Olrun!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						
					}
					
					if (hpUsuario <= 0) {
						Digita("Derrotado pelas ValquÃ­rias! Fim de jogo!", TimeUnit.MILLISECONDS, temp_dialog);
						System.exit(0);
					}
					System.out.println();
					break;
					
				case "3": //Usando o elixir da vida
					if (elixirDaVida > 0) {
						Digita("Asulf recupera vida! Vida + 75\n", TimeUnit.MILLISECONDS, temp_dialog);
						hpUsuario = hpUsuario + 75;
						elixirDaVida--;
						if (hpUsuario > 100) {
							hpUsuario = 100;
						}
					}
					System.out.println();
					System.out.println();
					
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					} else {
						//Ataque ValquÃ­ria
						if (hpValquiria01 > 0) { 
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| atira Ã  distÃ¢ncia suas penas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 7|| valor == 8) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;								
								Digita("|Sigrun| LanÃ§a Divina AmaldiÃ§oada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 9) {
								dano = ataqueForca.nextInt(10) + 50;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| VALHALLA!!!!!!!!!!!! \u2734\uFE0F LanÃ§a Divina AmaldiÃ§oada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 10) {
								if (hpValquiria01 == hpValquiria01Max) {
									Digita("|Sigrun| errou o ataque!", TimeUnit.MILLISECONDS,
											temp_dialog);
								} else {
									Digita("|Sigrun| se curou! \uD83D\uDDA4 Vida + " + aumentaVida200, TimeUnit.MILLISECONDS,
											temp_dialog);
									hpValquiria01 = hpValquiria01 + aumentaVida200;
									if (hpValquiria01 > hpValquiria01Max) {
										hpValquiria01 = hpValquiria01Max;
									}
								}
							
							} 
							System.out.println();
							System.out.println();
						}
						if (hpValquiria02 > 0) {
							valor = ataqueForca.nextInt(10) + 1; //Ataque ValquÃ­ria02
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 8;
								hpUsuario = hpUsuario - dano;
								
								Digita("|Olrun| te ataca com velocidade! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
								
							} else {
								Digita("Asulf desvia do ataque de Olrun!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						if (hpValquiria03 > 0) { //ataque valquiria03
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;
								
								Digita("|Eir| te acerta com seu escudo! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
								
							} else {
								Digita("Asulf desvia do ataque de Eir!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						
					}
						
					if (hpUsuario <= 0) {
						Digita("Insuficiente... InÃºtil...!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Fim de jogo!", TimeUnit.MILLISECONDS, temp_dialog);
						System.exit(0);
					}
					System.out.println();
					System.out.println();
	
					break;
				case "4":
					
					if (hpValquiria02 > 0) {
					
					
						valor = ataqueForca.nextInt(2);
						if (sabedoriaDeOdin > 0) {
							sabedoriaDeOdin--;
							if (valor == 0) {
								hpValquiria02 = hpValquiria02 - 100;
								Digita("ODIN!!!! Dano 100", TimeUnit.MILLISECONDS, temp_dialog);
							} else {
								hpValquiria02 = hpValquiria02 - 200;
								Digita("ODIN!!!! Dano CRÃ�TICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
							}
						} else {
							hpUsuario = hpUsuario - 5;
							Digita("Ao tentar invocar a Sabedoria de Odin sem energia, Asulf Ã© atacado! Dano 5",
									TimeUnit.MILLISECONDS, temp_dialog);
						}
					
					} else {
						Digita("ASULF ESTÃ� ATACANDO UMA VALQUÃ�RIA MORTA! ASULF ESTÃ� ENLOUQUECENDO!?", TimeUnit.MILLISECONDS, temp_dialog);
						if (sabedoriaDeOdin > 0) {
							sabedoriaDeOdin--;
						}
					}
					System.out.println();	
					System.out.println();
					if (hpValquiria02 < 0) { //para o hp nÃ£o ficar negativo no painel
						hpValquiria02 = 0;
					}
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					}
					Digita("Ao utilizar a Sabedoria de Odin, Asulf fica mais rÃ¡pido que um raio. Nenhum inimigo o atingirÃ¡!\n", TimeUnit.MILLISECONDS, temp_dialog);
				default:
				}
				break;

			case "3": //Atacando a valquiria03 EIR
				
				switch (alternativa) {
				case "1": //Ataque Cortante
					
					if (hpValquiria03 > 0) {
					
					
						valor = ataqueForca.nextInt(10) + 1;//ataque do Protagonista
						if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5 || valor == 6) {	
							dano = ataqueForca.nextInt(5) + 5;
							hpValquiria03 = hpValquiria03 - dano;
							Digita("Asulf atacou Eir! Ela Ã© bem resistente! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);				
						} else if (valor == 7 || valor == 8 || valor == 9) {
							Digita("O seu ataque foi bloqueado pelo escudo de Eir! Dano 0.", TimeUnit.MILLISECONDS, temp_dialog);
						} else if (valor == 10) {
							dano = ataqueForca.nextInt(5) + 55;
							hpValquiria03 = hpValquiria03 - dano;
							Digita("O seu ataque foi eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
						} 
						
					} else {
						Digita("ASULF ESTÃ� ATACANDO UMA VALQUÃ�RIA MORTE! ASULF ESTÃ� ENLOUQUECENDO!?", TimeUnit.MILLISECONDS, temp_dialog);
					}
					if (hpValquiria03 < 0) { //para o hp nÃ£o ficar negativo no painel
						hpValquiria03 = 0;
					}
					System.out.println();
					System.out.println();
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					} else {
						//Ataque ValquÃ­ria
						if (hpValquiria01 > 0) { 
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| atira Ã  distÃ¢ncia suas penas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 7|| valor == 8) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;								
								Digita("|Sigrun| LanÃ§a Divina AmaldiÃ§oada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 9) {
								dano = ataqueForca.nextInt(10) + 50;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| VALHALLA!!!!!!!!!!!! \u2734\uFE0F LanÃ§a Divina AmaldiÃ§oada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 10) {
								if (hpValquiria01 == hpValquiria01Max) {
									Digita("|Sigrun| errou o ataque!", TimeUnit.MILLISECONDS,
											temp_dialog);
								} else {
									Digita("|Sigrun| se curou! \uD83D\uDDA4 Vida + " + aumentaVida200, TimeUnit.MILLISECONDS,
											temp_dialog);
									hpValquiria01 = hpValquiria01 + aumentaVida200;
									if (hpValquiria01 > hpValquiria01Max) {
										hpValquiria01 = hpValquiria01Max;
									}
								}
							
							} 
							System.out.println();
							System.out.println();
						}
						if (hpValquiria02 > 0) {
							valor = ataqueForca.nextInt(10) + 1; //Ataque ValquÃ­ria02
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 8;
								hpUsuario = hpUsuario - dano;
								
								Digita("|Olrun| te ataca com velocidade! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
								
							} else {
								Digita("Asulf desvia do ataque de Olrun!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						if (hpValquiria03 > 0) { //ataque valquiria03
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;
								
								Digita("|Eir| te acerta com seu escudo! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
								
							} else {
								Digita("Asulf desvia do ataque de Eir!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						
					}
						
					if (hpUsuario <= 0) {
						Digita("Insuficiente... InÃºtil...!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Fim de jogo!", TimeUnit.MILLISECONDS, temp_dialog);
						System.exit(0);
					}
					System.out.println();
					System.out.println();
	
					break;
				case "2": //ataque das Chamas Negras
					
					if (hpValquiria03 > 0) {
					
					
						valor = ataqueForca.nextInt(2);
						if (chamasNegras > 0) {
							chamasNegras--;
							if (valor == 0) {
								hpValquiria03 = hpValquiria03 - 100;
								Digita("CHAMAS NEGRAS! Dano 100", TimeUnit.MILLISECONDS, temp_dialog);
							} else {
								hpValquiria03 = hpValquiria03 - 200;
								Digita("CHAMAS NEGRAS! Dano CRÃ�TICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
							}
						} else {
							hpUsuario = hpUsuario - 5;
							Digita("Ao tentar invocar as Chamas Negras sem energia, Asulf Ã© atacado! Dano 5",
									TimeUnit.MILLISECONDS, temp_dialog);
						}
					
					} else {
						Digita("ASULF ESTÃ� ATACANDO UMA VALQUÃ�RIA MORTA! ASULF ESTÃ� ENLOUQUECENDO!?", TimeUnit.MILLISECONDS, temp_dialog);
						if (chamasNegras > 0) {
							chamasNegras--;
						}
					}
					System.out.println();
					System.out.println();
					if (hpValquiria03 < 0) { //para o hp nÃ£o ficar negativo no painel
						hpValquiria03 = 0;
					}
					//ataque valquÃ­rias
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					} else {
						
						if (hpValquiria01 > 0) { //ataque valquiria01
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 6 || valor == 7 || valor == 8) {
								dano = ataqueForca.nextInt(5) + 10;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| se enfurece e vai para cima de Asulf! acertando uma sequÃªncia de socos! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 9 ||valor == 10) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| te ataca com forÃ§a! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						if (hpValquiria02 > 0) { //ataque valquiria02
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5) {
								dano = ataqueForca.nextInt(5) + 8;
								hpUsuario = hpUsuario - dano;
								Digita("|Olrun| te ataca com velocidade! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
							} else {
								Digita("Asulf desvia do ataque de Olrun!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						if (hpValquiria03 > 0) { //ataque valquiria03
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2 || valor == 3) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;
								Digita("|Eir| te acerta com seu escudo! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
							} else {
								Digita("Asulf desvia do ataque de Olrun!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						
					}
					
					if (hpUsuario <= 0) {
						Digita("Derrotado pelas ValquÃ­rias! Fim de jogo!", TimeUnit.MILLISECONDS, temp_dialog);
						System.exit(0);
					}
					System.out.println();
					break;
					
				case "3": //Usando o elixir da vida
					if (elixirDaVida > 0) {
						Digita("Asulf recupera vida! Vida + 75\n", TimeUnit.MILLISECONDS, temp_dialog);
						hpUsuario = hpUsuario + 75;
						elixirDaVida--;
						if (hpUsuario > 100) {
							hpUsuario = 100;
						}
					}
					System.out.println();
					System.out.println();
					
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					} else {
						//Ataque ValquÃ­ria
						if (hpValquiria01 > 0) { 
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| atira Ã  distÃ¢ncia suas penas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 7|| valor == 8) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;								
								Digita("|Sigrun| LanÃ§a Divina AmaldiÃ§oada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 9) {
								dano = ataqueForca.nextInt(10) + 50;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| VALHALLA!!!!!!!!!!!! \u2734\uFE0F LanÃ§a Divina AmaldiÃ§oada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 10) {
								if (hpValquiria01 == hpValquiria01Max) {
									Digita("|Sigrun| errou o ataque!", TimeUnit.MILLISECONDS,
											temp_dialog);
								} else {
									Digita("|Sigrun| se curou! \uD83D\uDDA4 Vida + " + aumentaVida200, TimeUnit.MILLISECONDS,
											temp_dialog);
									hpValquiria01 = hpValquiria01 + aumentaVida200;
									if (hpValquiria01 > hpValquiria01Max) {
										hpValquiria01 = hpValquiria01Max;
									}
								}
							
							} 
							
							System.out.println();
							System.out.println();
						}
						if (hpValquiria02 > 0) {
							valor = ataqueForca.nextInt(10) + 1; //Ataque ValquÃ­ria02
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 8;
								hpUsuario = hpUsuario - dano;
								
								Digita("|Olrun| te ataca com velocidade! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
								
							} else {
								Digita("Asulf desvia do ataque de Olrun!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						if (hpValquiria03 > 0) { //ataque valquiria03
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;
								
								Digita("|Eir| te acerta com seu escudo! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
								
							} else {
								Digita("Asulf desvia do ataque de Eir!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						
					}
						
					if (hpUsuario <= 0) {
						Digita("Insuficiente... InÃºtil...!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Fim de jogo!", TimeUnit.MILLISECONDS, temp_dialog);
						System.exit(0);
					}
					System.out.println();
					System.out.println();
	
					break;
				case "4":
					
					if (hpValquiria03 > 0) {	
						valor = ataqueForca.nextInt(2);
						if (sabedoriaDeOdin > 0) {
							sabedoriaDeOdin--;
							if (valor == 0) {
								hpValquiria03 = hpValquiria03 - 100;
								Digita("ODIN!!!! Dano 100", TimeUnit.MILLISECONDS, temp_dialog);
							} else {
								hpValquiria03 = hpValquiria03 - 200;
								Digita("ODIN!!!! Dano CRÃ�TICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
							}
						} else {
							hpUsuario = hpUsuario - 5;
							Digita("Ao tentar invocar a Sabedoria de Odin sem energia, Asulf Ã© atacado! Dano 5",
									TimeUnit.MILLISECONDS, temp_dialog);
						}
					
					} else {
						Digita("ASULF ESTÃ� ATACANDO UMA VALQUÃ�RIA MORTE! ASULF ESTÃ� ENLOUQUECENDO!?", TimeUnit.MILLISECONDS, temp_dialog);
						if (sabedoriaDeOdin > 0) {
							sabedoriaDeOdin--;
						}
					}
					
					System.out.println();	
					System.out.println();
					if (hpValquiria03 < 0) { //para o hp nÃ£o ficar negativo no painel
						hpValquiria03 = 0;
					}
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					}
					Digita("Ao utilizar a Sabedoria de Odin, Asulf fica mais rÃ¡pido que um raio. Nenhum inimigo o atingirÃ¡!\n", TimeUnit.MILLISECONDS, temp_dialog);
				default:
				}
				break;
				
			default:		
			}	
		} while (vitoria == false);
		vitoria = false;
		
		System.out.println();
		Digita("	Derrotando a trindade das valquÃ­rias, Asulf segue seu pelo caminho que tinha se\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("aberto. Asulf avista uma uma ponte de concreto Ã  sua frente. A ponte Ã© impecÃ¡vel, sem\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nenhum defeito. Embaixo da ponte, um abismo que nÃ£o se enxergava nada. Do outro lado\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("da ponte, um portÃ£o enorme de concreto. Ã€ frente do portÃ£o, totens de madeira.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	HÃ¡ gravuras nesses totens. Encontre o Ãºnico totem diferente e coloque-o na posiÃ§Ã£o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("correta.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		int contador = 0;
		do { //InÃ­cio do desafio do totem
			System.out.println();
			int[][] matriz = new int[4][5];
			 matriz[0][0] = 0;
			 matriz[1][0] = 0;
			 matriz[2][0] = 1;
			 matriz[3][0] = 0;
			 
			 matriz[0][1] = 0;
			 matriz[1][1] = 1;
			 matriz[2][1] = 0;
			 matriz[3][1] = 0;
	
			 matriz[0][2] = 0;
			 matriz[1][2] = 1;
			 matriz[2][2] = 1;
			 matriz[3][2] = 0;
			 
			 matriz[0][3] = 1;
			 matriz[1][3] = 0;
			 matriz[2][3] = 0;
			 matriz[3][3] = 0;
			 
			 matriz[0][4] = 0;
			 matriz[1][4] = 1;
			 matriz[2][4] = 1;
			 matriz[3][4] = 1;
			 
			 for (int vetor[] : matriz) {
					for (int item: vetor) {
						System.out.print("[" + item +"]" + "\t");
					}
					System.out.println();
				}
			System.out.println(" A       B       C       D       E");
			
			System.out.println("\nQual totem Ã© diferente e estÃ¡ na posiÃ§Ã£o errada? ");
			System.out.print("\nAlternativa: ");
			alternativa = entrada.next();
			
			switch (alternativa.toUpperCase()) {
			case "A":
				Digita("	\nLembre-se dos ensinamentos de LÃ³gos...\n", TimeUnit.MILLISECONDS, temp_dialog);
				contador++;
				break;
			case "B":
				Digita("	\nLembre-se da linguagem dos Iluminados...\n", TimeUnit.MILLISECONDS, temp_dialog);
				contador++;
				break;
			case "C":
				Digita("	\nLembre-se dos ensinamentos de LÃ³gos e da linguagem dos iluminados...\n", TimeUnit.MILLISECONDS, temp_dialog);
				contador++;
				break;
			case "D":
				Digita("	\nLembre-se de BinÃ¡rios...\n", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			case "E": //alternativa correta
				alternativaCerta = true;
				break;
			default:
				System.out.println("\nInforme ou 'A' ou 'B' ou 'C' ou 'D' ou 'E'.");
			}
		} while (alternativaCerta == false && contador  < 2);
		
		if (alternativaCerta == false) {
			System.out.println("Asulf ativa erroneamente o dispositivo dos totens e a caverna comeÃ§a a tremer...");
			System.out.println("Asulf corre...");
			System.out.println("Mas pouco a pouco, pedras e mais pedras comeÃ§am a cair no chÃ£o.");
			System.out.println("NÃ£o hÃ¡ por onde fugir...");
			System.out.println("Esmagado.... ");
			System.out.println("Enterrado pela caverna...");
			System.out.println("Nunca mais verÃ¡ a luz...");
			System.out.println("Nunca mais verÃ¡ o seu filho...");
			System.out.println("Fim de jogo.");
			System.exit(0);
		} 
		
		//fim do desafio do totem
		
		
		System.out.println("\nTo be continued");
		
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	TO BE CONTINUED...\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		capitulo7();
		
	}
	
	
	
	public static void capitulo7() throws InterruptedException {
		System.out.println();
		System.out.println("CapÃ­tulo 7 inicia");
		
		
	
	}




	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException { //funÃ§Ã£o para animar as letras.
	    for (char caractere : mensagem.toCharArray()) {
	    System.out.print(caractere);
	    unit.sleep(tempo_mensagem);
	    }
	
	}
	
}
