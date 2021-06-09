import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ATorreDeGnosis {
	static Scanner entrada = new Scanner(System.in); //variável global de entrada
	static int hpUsuario = 100, chamasNegras = 10, elixirDaVida = 15, sabedoriaDeOdin = 5; //vida global do protagonista e habilidades
	static int temp_dialog = 0, temp_questions = 0, temp_dialogSlow = 0, temp_dialogFast = 0, temp_dialogFaster = 0, ultra_Speed = 0,  temp_dotsSlow = 0, temp_dots = 0;
	
	//Para não ter delay no jogo, coloque 0 em todas as variáveis acima.
	//Valor das variáveis caso vc queira zerar em cima e rodar sem delay, mas posteriormente colocando o valor certo:
	//temp_dialog = 50, temp_questions = 15, temp_dialogSlow = 200, temp_dialogFast = 80, temp_dialogFaster = 30, ultra_Speed = 10,  temp_dotsSlow = 400, temp_dots = 200;
	
	static boolean chamasNegrasStatus = false, elixirDaVidaStatus = false, sabedoriaDeOdinStatus = false; //Status que aparecerão no 'imprimirMenuStatus'
	static void imprimirMenuStatus(boolean chamasNegrasStatus, boolean elixirDaVidaStatus, boolean sabedoriaDeOdinStatus) throws InterruptedException {
		System.out.println();
		System.out.println("====================");
		System.out.println("Asulf   STATUS");
		Digita(hpUsuario + " \uD83D\uDC99", TimeUnit.MILLISECONDS, temp_dialogSlow);
		System.out.println();
		System.out.println("       ESPECIAIS                     ");
		System.out.println();
		if (chamasNegrasStatus == true) {
			System.out.println("* Chamas Negras: " + chamasNegras + "/10");
		}
		if (elixirDaVidaStatus == true) {
			System.out.println("* Elixir da Vida: " + elixirDaVida + "/15");
		}
		if (sabedoriaDeOdinStatus == true) {
			System.out.println("* Sabedoria de Odin: " + sabedoriaDeOdin + "/5");
		}
		System.out.println("====================");
		System.out.println();
	}
	
	static void descricaoDosAtaquesStatus(boolean ChamasNegrasStatus, boolean elixirDaVidaStatus, boolean sabedoriaDeOdinStatus) throws InterruptedException {
		System.out.println();
		System.out.println("	Ataque Cortante \u2694\uFE0F ");
		System.out.println("Utilizando uma espada de lâmina afiada, Asulf aproxima-se do oponente e desfere um ataque de Dano Físico.");
		System.out.println("A eficácia do Ataque Cortante varia conforme a força do inimigo.");
		System.out.println("Ao aproxima-se do inimigo, Asulf fica mais propenso a tomar dano.");
		System.out.println();
		if (chamasNegrasStatus == true) {
			System.out.println("	Chamas Negras \uD83D\uDD25 ");
			System.out.println("Conjurando as Chamas Negras, Asulf lança poderosas chamas que irão perseguir o inimigo até atingi-lo. ");
			System.out.println("Chamas Negras causa 100 de Dano Mágico e também contém altíssimas chances de causar Dano Crítico.");
			System.out.println();
		}
		if (elixirDaVidaStatus == true) {
			System.out.println("	Elixir da vida \u2764\uFE0F");
			System.out.println("Ao aprender a manipular a Alquimia, Asulf cria uma poção do Elixir da vida.");
			System.out.println("Essa poção sempre cura 75 de vida.");
			System.out.println();
		}
		if (sabedoriaDeOdinStatus == true) {
			System.out.println("	Sabedoria de Odin \u26A1");
			System.out.println("Ao ler escritos antigos, Asulf aprende a utilizar uma Sabedoria Divina.");
			System.out.println("Sabedoria de Odin possui 100% de precisão e o deixa invunerável a ataques de inimigos.");
			System.out.println("Sabedoria de Odin causa 100 de Dano Mágico e também possui uma altíssima chance de causar Dano Crítico.");
		}
			
		
	}
	
	static void ataqueDeAntonDeus(int hpAntonBossFight) throws InterruptedException {
		
		
		Random ataqueForca = new Random(); // Força do ataque dado por uma aleatoriedade.
		int dano = 0; //dano causado pelo ataque.
		int valor; //Valor gerado pela 'aleatoriedade'.
		
		if (hpAntonBossFight > 0) { 
			valor = ataqueForca.nextInt(10) + 1;
			if (valor == 1 || valor == 2) {
				System.out.println();
				Digita("Asulf desvia do ataque de Anton! Dano 0", TimeUnit.MILLISECONDS, temp_dialog);
			} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6) {
				System.out.println();
				dano = ataqueForca.nextInt(5) + 8;
				hpUsuario = hpUsuario - dano;	
				Digita("Anton atira esferas enérgicas de luz! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
			} else if (valor == 7|| valor == 8) {
				System.out.println();
				dano = ataqueForca.nextInt(5) + 20;
				hpUsuario = hpUsuario - dano;								
				Digita("Anton teleporta-se multiplas vezes, socando-o diversas vezes! Dano " + dano, TimeUnit.MILLISECONDS,
						temp_dialog);	
			} else if (valor == 9) {
				System.out.println();
				dano = ataqueForca.nextInt(10) + 20;
				hpUsuario = hpUsuario - dano;
				Digita("Anton voa para o céu e, com uma velocidade extrema, atinge-o diretamente! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);	
			} else if (valor == 10) {
				System.out.println();
				dano = ataqueForca.nextInt(20) + 35;
				hpUsuario = hpUsuario - dano;
				Digita("Anton: MORRA, PAI!!!!!!!!!!!!!!!!!!!!! \u2734\uFE0F Dano " + dano, TimeUnit.MILLISECONDS,
						temp_dialog);	
			} 
			System.out.println();
			System.out.println();
		}
		
	}
	
	static void creditos() throws InterruptedException {
	
		
		Digita("			Alan Siva dos Santos \uD83D\uDD96 \uD83D\uDC7D \n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		
		
		Digita("			https://github.com/ssantosalan \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\n", TimeUnit.MILLISECONDS, ultra_Speed);
		System.out.println();
		
	//
		
	
		Digita("			Arthur Solla Gregorut Favero \uD83D\uDD96 \uD83D\uDC7D \n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		
		
		
		Digita("			https://github.com/arthur-solla \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\n", TimeUnit.MILLISECONDS, ultra_Speed);
		System.out.println();
		//
		
		Digita("			Jorge Luiz dos Santos Oliveira \uD83D\uDD96 \uD83D\uDC7D \n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		
		
		
		Digita("			https://github.com/jorgelsol02 \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\n", TimeUnit.MILLISECONDS, ultra_Speed);
		System.out.println();
		//
		
		Digita("			Rafael Astorga Trancozo \uD83D\uDD96 \uD83D\uDC7D \n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		
		
		
		Digita("			https://github.com/RafaelAstorga \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\n", TimeUnit.MILLISECONDS, ultra_Speed);
		System.out.println();
		//
		
		Digita("			Vinicius Gava Pereira \uD83D\uDD96 \uD83D\uDC7D \n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		
		
		
		Digita("			https://github.com/ViniciusGavaPereira \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\uD83D\uDD39\n", TimeUnit.MILLISECONDS, ultra_Speed);
		System.out.println();
		//
		System.out.println();
		Digita("			          \n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		
	}
	
	public static void main(String[] args) throws Exception{
		String opcao;
		boolean tacerto = false;
		
		
		/*
		 * Explicação dos próximos comandos:
		 * 
		 * O "do" vai iniciar o Menu do jogo. E vai continuar rodando até o Usuário
		 * escolher "1 - Jogar", "4- Capítulos" ou "5- Sair". Na opção "4 - Capítulos",
		 * temos um "Switch" dentro que leva para o capítulo escolhido, ou o Usuário
		 * pode selecionar a opção "voltar" para retornar ao menu.
		 */

		do {
			System.out.println("=================");
			System.out.println("A Torre de Gnosis ");
			System.out.println("=================");
			System.out.println();
			System.out.println("1 - Jogar");
			System.out.println("2 - Instruções");
			System.out.println("3 - Créditos");
			System.out.println("4 - Capítulos");
			System.out.println("5 - Sair");
			opcao = entrada.next();

			switch (opcao.toLowerCase()) {
			case "1":
				capitulo1();
				tacerto = true;
				break;
			case "2":
				
				boolean instrucaoCerto = false; //variável p/ qnd o Usuário escolher uma opção válida e sair do loop.
				
				do {
					System.out.println("Instruções");
					System.out.println();
					System.out.println("O jogo é baseado em escolhas.");
					System.out.println("Você terá que informar ou '1' ou '2' ou '3' ou '4' ou '5' de acordo com as opções.");
					System.out.println("Também haverá momentos em que você deverá informar ou 'a' ou 'b' ou 'c' ou 'd' ou 'e' ou 'w' de acordo com as opções.");
					System.out.println("Também haverá momentos que terá a opção para digitar 'X' para 'voltar'.");
					System.out.println();
					System.out.println("X - Voltar");
					opcao = entrada.next();
					
					switch (opcao.toLowerCase()) {
					
					case "x": 
						instrucaoCerto = true;
						break;
						
					default:
						System.out.println();
						System.out.println("Informe 'x' para voltar.");
						System.out.println();
						break;
					}
					
				} while (!instrucaoCerto);
				
				break;
			case "3":
				creditos();
				break;

			case "4":
				
				boolean capituloCerto = false; //variável quando selecionar uma opção válida em 'capítulos'.
				
				do {
					System.out.println();
					System.out.println("1 - Capítulo 1: Pai e Filho");
					System.out.println("2 - Capítulo 2: O Monge");
					System.out.println("3 - Capítulo 3: O Pacto");
					System.out.println("4 - Capítulo 4: 1º Andar — Portões de Fogo");
					System.out.println("5 - Capítulo 5: 2º Andar — Compaixão na Cidade dos Leviatãs");
					System.out.println("6 - Capítulo 6: 3º Andar — Anjos Caídos");
					System.out.println("7 - Capítulo 7: 4º Andar — O Monge, o Deus e o Santo");
					System.out.println("X - Voltar ");
					System.out.print("Digite o capítulo desejado: ");
					opcao = entrada.next();
	
					switch (opcao.toLowerCase()) {
					case "1":
						capitulo1();
						capituloCerto = true;
						break;
					case "2":
						capitulo2();
						capituloCerto = true;
						break;
					case "3":
						capitulo3();
						capituloCerto = true;
						break;
					case "4":
						capitulo4();
						capituloCerto = true;
						break;
					case "5":
						capitulo5();
						capituloCerto = true;
						break;
					case "6":
						capitulo6();
						capituloCerto = true;
						break;
					case "7":
						capitulo7();
						capituloCerto = true;
						break;
					case "x":
						capituloCerto = true;
						break;
					default:
						System.out.println();
						System.out.println("Entenda que você tem que digitar 1 ou 2 ou 3 ou 4 ou 5 ou 6 ou 7 ou 'x'.");
						break;
					}
					
				} while (!capituloCerto);
				
				break;

			case "5":
				System.out.println("Jogo finalizado.");
				System.exit(0);
				break;
			default:
				System.out.println();
				System.out.println("Entenda que tem que digitar 1 ou 2 ou 3 ou 4 ou 5.");
				System.out.println();
				break;
			}

		} while (!tacerto);

		System.out.println();
		System.out.println();

		

	}
	//Capítulo 1 inicia-se aqui
	public static void capitulo1() throws InterruptedException{
		System.out.println();
		System.out.println("Capítulo 1: Pai e Filho");
		System.out.println();
		
		//A Profecia
		Digita("			A criança do lobo corre pelos mundos\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("			Sofrendo e aprendendo junto aos homens imundos\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("			Evoluindo a cada passo ela caminha\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("			Em direção aos deuses ela definha\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("			Clamando seu espaço no panteão\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("			Ela coloca o mundo em suas mãos\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		System.out.println();
		System.out.println();
		String alternativa;			//Alternativa do switch
		boolean alternativaContinuar = false; //alternativa p/ sair do loop
		
		do {
			System.out.println();
			System.out.println("1 - Continuar.");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":				
				alternativaContinuar = true;
				break;			
			default:
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaContinuar != true);
		alternativaContinuar = false;	
		
		
		Digita("	Corra! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Encontre ele! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Vá depressa! \n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Você está invadindo o território de Zark, um dos países vizinhos de sua terra natal, Volstalir. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ambos os reinos viviam um tenso período de paz. Após a morte do rei Alexander e da sucessão de seu filho Atreios. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Acordos mercadológicos começaram a ser cada vez mais desrespeitados por Zark e em resposta, às terras cedidas a Zark, foram retomadas à Volstalir. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	Após este evento, a tensão entre os dois reinos explodiu em disputas de territórios e lutas por pontos de suprimentos estratégicos. Agora você está invadindo \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mais um desses pontos estratégicos: uma cidade de médio porte cercada por muros, que concentra boa parte das trocas comerciais entre os reinos de Zark. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	Você é Asulf, um general veterano de muitos conflitos, responsável por guiar as tropas que devem derrubar os muros do lado oeste da cidade \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("enquanto outra tropa é responsável por destruir os portões principais. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	Após horas de luta, sua tropa consegue rechaçar a resistência restante em terra e com a ajuda de aríetes, estão começando o processo de destruição do muro. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Senhor, senhor, temos um problema! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você vê um jovem soldado correndo em sua direção. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— O que foi jovem? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Os portões, senhor! Os Zarkeanos abriram eles e soltaram a cavalaria e os cães! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você não espera que o soldado termine de falar e dispara em direção aos inimigos. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Quando chega no campo de batalha — um terreno plano de gramado verde — agora sujo com o vermelho do sangue dos corpos e dos feridos. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você percebe que além da cavalaria e dos cães, soldados que estavam na cidade também saíram para ajudar seus companheiros.  \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Um soldado vem em sua direção com a espada pronta para te acertar com um golpe. \n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		//Primeira luta começa aqui
		boolean vitoria = false; 		//Utilizado quando o Usuário vence do 'Computador' e sai do loop.   
		int hpMonstro01 = 100;		//Vida do inimigo
	
		Random ataqueForca = new Random(); // Força do ataque dado por uma aleatoriedade.
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
			System.out.println("1 - Ataque Cortante ⚔️ ");
			
			alternativa = entrada.next();

			switch (alternativa) {
			case "1":
				valor = ataqueForca.nextInt(6);
				if (valor == 0 || valor == 1 || valor == 2 || valor == 3) {
					dano = ataqueForca.nextInt(20) + 100;
					hpMonstro01 = hpMonstro01 - dano;
					Digita("Sacando a sua espada, você acerta um corte no joelho dele, que cai sangrando e o deixando exposto para um golpe final nas costas! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (valor == 4) {
					dano = ataqueForca.nextInt(50) + 100;
					hpMonstro01 = hpMonstro01 - dano;
					Digita("Sacando a sua espada, você acerta um golpe fatal em seu pescoço, fazendo-o sangrar até a morte! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (valor == 5) {
					dano = ataqueForca.nextInt(60) + 100;
					hpMonstro01 = hpMonstro01 - dano;
					Digita("Sacando a sua espada, você dá um golpe em vertical em seu estômago, fazendo-o cair perante a ti! Dano " + dano + ".", TimeUnit.MILLISECONDS,
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

		Digita("Um Oficial Zarkeano vem em sua direção, montado em um cavalo em alta velocidade e tenta acertá-lo com a lança. \n", TimeUnit.MILLISECONDS, temp_dialog);
		       
		int hpMonstro02 = 100; //Segundo inimigo começa aqui

		do {
			valor = ataqueForca.nextInt(2) + 1;
			if (valor == 1) {
				Digita("Ele tenta acertá-lo no peito com a ponta de sua lança, mas você desvia! Dano 0 ", TimeUnit.MILLISECONDS, temp_dialog);
			} else if (valor == 2) {
				Digita("Ele tenta acertá-lo na cabeça com a ponta de sua lança, mas você desvia! Dano 0", TimeUnit.MILLISECONDS,
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
					Digita("Você atinge as pernas do cavalo com a espada, derrubando-os e deixando-os fora de combate! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (valor == 4) {
					dano = ataqueForca.nextInt(50) + 100;
					hpMonstro02 = hpMonstro02 - dano;
					Digita("Você acerta um golpe vertical embaixo o braço que segurava a lança, fazendo-o cair do morto! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
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
		
		Digita("	Mais dois soldados vêm em sua direção, você os despacha de forma rápida. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você vê um vulto — um cachorro — vem em sua direção! O animal tenta mordê-lo, mas fica apenas mordendo a sua braçadeira. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Asulf larga a espada e quebra o pescoço do animal, pegando sua arma do chão logo em seguida. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você acerta-o com um golpe de espada em arco que pega seu focinho e arranca a mandíbula do animal. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Anton! — você berra. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você olha ao redor e vê apenas a luta sangrenta que estourou no campo de batalha. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Os seus aliados matam e morrem para conseguir ter uma chance de invadir a cidade. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Utilizando golpes precisos você avança entre os seus inimigos em busca dele. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— “Onde diabos ele foi parar?” \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A batalha continua por mais vinte minutos e gradualmente as forças inimigas que surpreenderam o seu exército começam a perder as forças e recuar. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	Você avista um pequeno grupo de quatro soldados cercando um garoto. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	No chão podem ser vistos cadáveres do que parece ter sido soldados que enfrentaram este menino. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("O garoto, agora surrado e sujo de sangue, usa uma armadura de couro com revestimento de uma cota de malha metálica, botas leves e um capacete \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que cobre apenas a parte superior de seu rosto, começando pelo nariz e terminando em chifres colocados por ele mesmo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf dispara em direção à luta! \n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		
		int hpMonstro03 = 100; //Terceiro inimigo começa aqui
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
				Digita("Com a espada em mãos, você perfura as costas de um dos inimigos que estava virado para o menino! \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Sua espada fica presa na armadura e no tronco do soldado. Você larga a arma e pula em direção do segundo soldado  \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("que ainda estava surpreso com o novo inimigo que despachou seu colega com tanta rapidez, e com suas próprias mãos, \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("você levanta o guerreiro, que assustado, berra, ao ser arremessado em cima de um dos seus colegas. \n", TimeUnit.MILLISECONDS, temp_dialog);
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
		
		Digita("	Faltando apenas um inimigo de pé após a sua chegada, o garoto aproveita a oportunidade para usar as suas adagas e \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("perfurar o último soldado em um dos pontos fracos de sua armadura \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Vendo que não tem mais chance, os dois soldados que estavam agora no chão, ajoelham-se e rendem-se. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Você não aprendeu nada, Anton?! —  Você exclama. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Quantas vezes não te falei para não se permitir ser cercado? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Mas pai... Estava tudo sob controle! — Anton se defende. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu sabia que eles estavam atrás de mim! Já havia matado vários deles! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ele aponta para os cadáveres no chão e contando com os dois que acabaram de serem mortos, era possível contar seis corpos jogados no chão. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eles estavam com medo pai! Estavam hesitando em me atacar! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— E como você pode ter certeza disso? Ainda por cima fica utilizando estas adagas. — Asulf fala com desdém. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	— Essas lâminas são muito curtas. Você não pode ficar chegando tão perto do inimigo toda vez que for lutar com alguém.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	— Foi a minha mãe que me ensinou a lutar assim! — Ele defende-se novamente, claramente irritado por ser criticado sobre sua forma de lutar. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Ela me ensinou a lutar desse jeito e estou indo muito bem assim! Eu estava bem! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Pelos deuses, Anton! — Você faz uma pausa, falar de sua esposa sempre o chateia.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Usar essas armas, lutar desse jeito é muito perigoso. Você precisa seguir um estilo de luta que não vai te ameaçar sempre que for lutar. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A discussão de vocês é interrompida quando você nota que o rosto de Anton torna-se pálido. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Quando você se vira, nota um homem alto, com 1,90 de altura, barba longa castanha escura, com pinturas de guerra azuis em seu rosto e  \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("uma armadura que lembra as escamas de um dragão. O guerreiro se aproxima de você com espadas em punhos. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Uma espada longa em cada mão. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você reconhece esta persona. Ele é Siegfried, O Soldado Mercenário que vem rechaçando todas as tropas enviadas até Zark. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ele foi o responsável por liderar as forças de resistência da cidade. Com sua liderança, Zark se manteve impenetrável até os dias atuais.  \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ele é conhecido por descer aos campos de batalha em momentos críticos e transformar uma luta perdida em uma vitória digna.  \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você coloca a mão no ombro de seu filho e diz: \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Fique fora desta luta, Anton. Deixe que eu lido com isso! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Não, pai! Você conhece as histórias sobre ele! Ele é muito forte! Nós precisamos lutar com ele juntos! — O seu filho diz, tentando mostrar coragem. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf sorri, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Tudo bem, Filho... Eu também sou forte! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	Você se vira para enfrentar seu inimigo. Você não se assusta e não se preocupa. A tempos você entendeu que estes sentimentos não te ajudam em combate. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Quando o rei Atreios soube que Siegfried estava protegendo Zark, enviou vários mensageiros oferecendo o dobro, o  \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("triplo e o quádruplo do que Zark lhe pagava, apenas para não se envolver na luta. O primeiro mensageiro voltou dizendo que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ele negou a proposta, pois não largava seus trabalhos pela metade. Depois disso, todos os mensageiros não voltaram mais. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Você está ótimo, Asulf! Qual foi a última vez que nos vimos? Foi quando defendemos Trakai? — Siegfried pergunta. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Não, nós nos encontramos em um bar da última vez que você veio para Volstalir.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Asulf, isso já faz 12 anos! — Siegfried gargalha — Naquela época eu ainda era jovem e você já era velho. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Agora você deve ter no mínimo uns noventa anos. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Siegfried veio de uma família de mercenários, passou a vida inteira lutando em guerras que não eram dele. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Com o tempo adquiriu certa fama e tornou-se um mercenário que fazia trabalhos recorrentes para o rei Alexander, recebendo \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("vários elogios por seu código de conduta, nada parecido com o de outros mercenários. Você teve o prazer de lutar lado a lado com ele \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("em algumas ocasiões, mas o novo rei Atreios não gosta de ter mercenários em suas fileiras. Para ele toda força militar do país deve \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estar subjugada ao rei. Durante seu reinado, todos os mercenários foram dispensados. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Você sabe o porquê de estarmos aqui. — vocifera Asulf \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	— Eu sei, Asulf... Mas eu não posso deixar que vocês entrem aqui e matem quem vocês quiserem.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Nós não somos assim, Siegfried! Você sabe o código de Volstalir, você lutou ao nosso lado!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você fala, ofendido por ele acreditar que seus soldados seriam capazes de massacrar civis. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu estou aqui para te fazer uma proposta, Siegfried... Chega de defender essa cidadezinha patética!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Venha comigo! O rei Atreios prometeu lhe dar um espaço entre os principais generais dele! Você pode comandar exércitos! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você está recebendo uma honra que poucas pessoas tiveram. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Você não entende, Asulf! Seu rei traiu meus soldados! — Ele fala com raiva — Depois de anos protegendo seu país, nós fomos \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("enxotados de lá! Aqui nós temos a confiança do rei! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Siegfried, você sabe que não foi isso que aconteceu! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Chega de conversa!! — Ele te interrompe, ficando em posição de ataque — Ambos sabemos que não vamos chegar em um acordo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Vamos acabar logo com isso!! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Tudo bem, Siegfried. Vamos acabar com isso!! \n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		//Quarta luta, Siegfried, começa aqui
		
		int hpMonstro04 = 100; //Segundo inimigo começa aqui
		int contador = 0;	//Variável utilizada para poder mudar os textos no loop.
		do {
			
			if (contador == 0) {
				Digita("Siegfried pula em sua direção, mais alto do que qualquer homem ordinário conseguiria. \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Com as suas duas espadas ele arremassa a si mesmo em sua direção! \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Você desvia do ataque! Dano 0. ", TimeUnit.MILLISECONDS, temp_dialog);	
			} else if (contador == 1) {
				Digita("Siegfried se vira girando as espadas em sua direção! \n", TimeUnit.MILLISECONDS,
						temp_dialog);
				Digita("Mas Asulf abaixa! Dano 0. ", TimeUnit.MILLISECONDS, temp_dialog);
			} else if (contador == 2) {
				Digita("Siegfried tenta mais uma vez lhe acertar com um golpe horizontal! \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Mas Asulf desvia pulando para trás. Dano 0. ", TimeUnit.MILLISECONDS, temp_dialog);
				
			}
			System.out.println();
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Siegfried, O Mercenário");
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
					Digita("Desviando do ataque, você finca a sua espada na cintura da armadura de Siegfried! — Uma área que você sabe ser menos protegida. \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Este é o primeiro ataque que você percebe que causa uma verdadeira perfuração na armadura de dragão dele. Dano 20 ", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (contador == 1) {
					hpMonstro04 = hpMonstro04 - 30;
					Digita("Asulf acerta outro golpe, desta vez na perna de Siegfried! Dano 30.", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (contador == 2) {
					hpMonstro04 = hpMonstro04 - 50;
					Digita("Assim que coloca os pés no chão, Asulf pega impulso para avançar em direção ao seu rival! \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Asulf dispara em direção de Siegfried! \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("E com sua lâmina, perfura o estômago de Siegfried! \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Fazendo-o largar as armas e cair no chão. Dano 50. ", TimeUnit.MILLISECONDS, temp_dialog);
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
		System.out.println();
		Digita("	— Merda, Siegfried! Você deveria ter aceitado a maldita proposta! — Você diz segurando o seu companheiro de batalha. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Siegfried ri. Seu olhar parece estar longe, como se ele estivesse olhando para algo muito distante dali. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Tudo bem, Asulf... nós dois tínhamos uma missão. Pelo menos eu morri lutando e não envenenado ou esfaqueado pelas costa. — Ele diz. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Fica calmo, Siegfried... eu vou chamar um curandeiro para você, eles vão te remendar!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Está tudo bem, Asulf. — Ele tenta te acalmar — Por favor, só me dá um tempo... só me dá...\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Siegfried cospe sangue. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Merda!! — Você olha em direção de seu filho — Anton, busque um curandeiro... Agora!! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Mas, pai... — Seu filho fala com hesitação — Ele já... \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você olha para Siegfried e percebe que não existe mais vida em seus olhos. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Antes que Asulf pudesse falar algo, vocês escutam um estrondo vindo da direção do combate que Asulf deixou para trás. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Seus soldados conseguiram derrubar uma parte do muro de proteção da cidade. A queda desta parte gerou um efeito em cascata, que destruiu \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("boa parte do muro próximo, abrindo um buraco enorme. Os soldados avançam para dentro da cidade, preparados para tomá-la de volta. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Fique atrás de mim, Anton! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Pai, você está bem? — Ele pergunta preocupado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Claro que estou! — Asulf fala, claramente triste pelo seu companheiro de batalha.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você se vira em direção da batalha. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Vamos tomar essa cidade!! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	 \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		boolean alternativaCerta = false;
		//boolean alternativaVoltar = false; //criada para 'voltar' o menu.
		
		do {
			imprimirMenuStatus(chamasNegrasStatus, elixirDaVidaStatus, sabedoriaDeOdinStatus); //vai imprimir o Status contendo HP e Especiais
			
			System.out.println("1 - Continuar para o Capítulo 2: O Monge");
			System.out.println("2 - Descrição dos Ataques");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":				
				alternativaCerta = true;
				break;	
			case "2": 
				boolean alternativaVoltar = false; //criada para 'voltar' o menu.
				do {
					descricaoDosAtaquesStatus(chamasNegrasStatus, elixirDaVidaStatus, sabedoriaDeOdinStatus);
					System.out.println();
					System.out.println("X - Voltar");
					alternativa = entrada.next();				
					switch (alternativa.toLowerCase()) {
					case "x":
						alternativaVoltar = true; //utilizado para 'Voltar' o menu.
						break;
					default:
						break;
					}
				} while (alternativaVoltar == false);
				
				break;
			default:
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		
		capitulo2();
	}

	public static void capitulo2() throws InterruptedException {
		System.out.println();
		System.out.println("Capítulo 2: O Monge");
		
		Digita("	Os próximos dias se provaram mais arrastados do que Asulf esperava. Antes\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de conseguirem invadir a cidade, os soldados que estavam nela organizaram boa\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("parte da nobreza, população e guerreiros restantes, e os levaram ao castelo principal\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("da região.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Analisando o local, percebe-se como ele foi pensado para ser uma verdadeira\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("fortaleza, começando por sua localização, fica na colina mais alta da região. Tentar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("chegar até os portões do lugar só irá deixá-los expostos a troncos, flechas, óleo\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("fervente e qualquer outra coisa que os refugiados puderem arremessar em sua\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("direção. De longe é possível avistar arqueiros preparados para atirar em qualquer um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que tentar subir. A estrutura do castelo é de pedra maciça, construída do mesmo\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("material que os muros que defendiam a cidade.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf já havia ouvido falar desta categoria de defesa, muito provavelmente o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("castelo está abastecido com suprimentos para durar semanas, até mesmo meses. A\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("invasão havia sido planejada para retomar a cidade a seu antigo território. Ele envia\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("um mensageiro à Volstalir para avisar sobre a invasão bem sucedida e pedir\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("suprimentos para um cerco que pode durar alguns meses,  até que os refugiados no\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("castelo fiquem sem mantimentos e não vejam escolha além de se renderem.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Asulf e seu filho se instalam em uma das casas vazias da região e começam a se organizar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para uma estadia mais prolongada.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Não acha que eles vão demorar para sair de lá? — Anton pergunta.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Não sei, Zarkeanos são conhecidos por não se renderem fácil. Vai depender\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("muito de quem está no comando por lá.  — afirma o pai do menino.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Tomara que isso não dure mais do que o necessário, passar o inverno aqui\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("não estava nos meus planos para esse ano.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Não se preocupe, logo reforços vão chegar e eles vão tomar conta da região por\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nós. Em dois meses no máximo nós estaremos em casa.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Tomara — Anton responde, visivelmente entediado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
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
				Digita("Asulf: Por que você está cabisbaixo, filho?\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Anton: Por que essas guerras são muito longas e cansativas, gostaria de estar em casa\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("aproveitando o tempo com meus amigos ou sei lá.\n", TimeUnit.MILLISECONDS, temp_dialog);
				alternativaCerta = true;
				break;
			case "2":
				Digita("Asulf: Tudo vai dar certo, filho, logo já teremos retomado as terras do reino.\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Eu sei, pai, por que estamos juntos e tudo vai se resolver!\n", TimeUnit.MILLISECONDS, temp_dialog);
				alternativaCerta = true;
				break;
			default:
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		
		
		Digita("	Parece que ele está mais preocupado com o que vai fazer quando voltar para\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("casa, do que com a retomada do reino. Seu instinto te fala que isso é normal, ele\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ainda é jovem, vai aprender a ter responsabilidade. Mas mesmo assim esse tipo de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pensamento egoísta te deixa consternado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Uma semana após a invasão vêm chegando pelo norte uma procissão de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("monges. Todos vestidos com túnicas cor vermelho carmesim, com capuzes cobrindo\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("os olhos, cada um deles segurando algum item diferente, uns seguram livros, outros\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("seguram tochas acesas mesmo estando de dia e outros carregam espadas ainda\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dentro de suas bainhas.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Na frente, um homem velho, extremamente alto com provavelmente 2,10m de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("altura e vestido com uma túnica monástica completamente branca. Em suas mãos ele\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("carrega uma gaiola com uma coruja, em seu cinto é possível ver um chicote. Ele é o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("único dos homens que não está com o rosto coberto por um capuz, mas seus olhos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estão cobertos por ataduras, como se ele tivesse sofrido alguma espécie de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ferimento nos globos oculares.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf reconhece um problema quando vê um, principalmente este problema.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Estes monges fazem parte de uma ordem chamada “A Ordem da Sabedoria do Sofrimento\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Sagrado”.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Eles acreditam que o universo e os deuses são muito grandes e que seu poder está\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("muito além da compreensão humana. A ponto de que um mero vislumbre desse poder\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pode gerar cicatrizes eternas no ser humano e até mesmo a morte. Mas que, ao\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mesmo tempo que a luz traz sofrimento, ela traz bondade, conhecimento e avanços\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para a humanidade. Para estes monges foi um beato deles que trouxe a medicin\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para o nosso mundo a centenas de anos atrás. Também teria sido um deles que um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dia conversou frente a frente com um dos deuses antigos da podridão e teria sido o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("primeiro necromante do mundo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Para eles a luz traz o conhecimento. Esse conhecimento pode ser usado de todas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("as formas possíveis, desde que isso traga um avanço para algum espectro do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("conhecimento mortal, segundo eles não existe bom e mau, só evolução ou regresso. Um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dos maiores pecados que alguém pode cometer é ter medo de evoluir por causa destes\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("conceitos “atrasados” de moralidade. Esta filosofia gerou várias ramificações dessa religião.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Algumas são mais brandas, que acreditam que a evolução também ocorre com empatia,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("trabalho em equipe e amor ao próximo. Mas outras seguem à risca esta filosofia e fazem de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("tudo para o aprendizado humano. Não importando quem eles tenham que abrir, matar ou\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("reviver.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Sua única esperança é que estes beatos sejam de uma ramificação mais\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("branda, pois pelas histórias que ouviu, estes monges podem causar muitos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("problemas.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Todos conhecem a história de um sacerdote que invocou um demônio bem à luz do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dia em uma cidade fronteiriça à Volstalir. Foi necessário sacrificar todo o gado da cidade\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para um elemental da floresta da região que era capaz de matar o demônio. Mesmo assim,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("o demônio só foi morto após ceifar muitas vidas para o experimento do sacerdote.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ele defendeu-se dizendo que as almas e os corpos dos cidadãos da cidade seriam\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("usados para criar um animal novo; que seria perfeito, podendo proteger o reino, servir de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("companhia para seu dono e alimentá-lo dando leite e carne sem precisar morrer para isso.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("O animal seria entregue ao rei, para servir de símbolo de poder da nobreza local. Ele foi\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("queimado em praça pública, para servir de exemplo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Regozijem-se! — o sacerdote de branco exclama, enquanto levanta os\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("braços para o céu, apoiando a gaiola com apenas uma mão — Mais uma vez esta\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("terra está livre destes Zarkeanos que viviam na escuridão do regresso.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Por favor, me digam quem foi o responsável pela retomada desta cidade à luz?\n", TimeUnit.MILLISECONDS, temp_dialog);
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
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
	
		Digita("	— Foi um trabalho em conjunto, meu nobre sacerdote — diz Asulf dando um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("passo à frente e ficando mais próximo do monge.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Os generais de Volstalir trabalharam em equipe a mando do próprio rei Atreios,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para coordenar a retomada do nosso território.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Mas é claro! — o sacerdote se virou em sua direção. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— É claro que o novo rei não deixaria suas terras nas mãos desse povo atrasado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Me diga nobre guerreiro, vocês eliminaram toda a população daqui? Ou preferem deixar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que eles fujam para a mata para poderem aprender a sobreviver na natureza?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Nós preferimos a segunda opção — diz Asulf — Na verdade, as pessoas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que viviam aqui e não fugiram, ainda poderão continuar aqui, mas agora terão que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pagar tributos à Volstalir e seguir as nossas leis.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O homem fica visivelmente desapontado — Mas, se eles não sofrerem, como\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("vão conseguir aprender algo?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você entende que está é uma oste de monges mais radical.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
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
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		
		Digita("	— Nós não pensamos assim por aqui. E o que traz o seu grupo de sacerdotes\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para cá? Não sabiam que a cidade estava em guerra? Entrar em uma cidade	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("recém-tomada pode ser perigoso dependendo do humor dos invasores — fala\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("esperando que eles entendam que não são bem-vindos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O monge ri\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Não se preocupe, meu nobre guerreiro, nós não temos medo de opressão, os\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("deuses nos dão forças para enfrentar qualquer um que entre no nosso caminho para achar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("a santa criança.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Entendo — se lembrando da velha profecia. Estes monges buscam esta\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("criança a séculos, com sorte, pode convencê-los de que a criança não está aqui e\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("eles irão partir sem causar muita animosidade.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— E como sabem que estão no caminho certo?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Ah, pequeno soldado… Nós vamos saber! Os deuses da sabedoria sempre\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nos guiam na direção certa! — ele fala com satisfação.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O sacerdote parece realmente feliz em ter esta conversa, como se todos os\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("soldados que começaram a se reunir em volta para ver a procissão não\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("representasse nenhum risco. Como se entrar em uma cidade recém-invadida por um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("exército que não se conhece não fosse perigoso. Como se tudo o que aconteceu até\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("agora, todas as mortes, todo o sangue, todo o sofrimento que esta cidade e seus\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homens sofreram, não fosse nada. Ele conversa com Asulf como se fossem dois\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("velhos amigos se reencontrando.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Anton se aproxima e fica ao seu lado, com seu amigo Rurik, um garoto de 20 anos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que ele fez amizade desde o início da missão. De lá para cá Rurik serviu como um irmão\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mais velho para Anton, dando conselhos e ajudando quando colocava muitas tarefas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para seu filho fazer. Você sempre os via juntos treinando e se divertindo. Rurik é um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("garoto bom, meio cabeça quente às vezes, mas é um bom amigo e soldado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— O que está acontecendo aqui, pai?!  — Antom pergunta.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Nada! Volte para casa! Vá treinar! — fala de forma ríspida.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— E quem é este jovem? — o monge se vira para seu filho.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Um jovem guerreiro, filho do pequeno guerreiro? — ele se vira para Asulf.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Você parece ter a guerra em seu sangue, pequeno general! — ele te elogia.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Para trazer uma criança à guerra é preciso ter certeza que ele consegue se virar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("no combate, ele deve ter treinado-o muito bem!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf não diz nada. Anton parece confuso em ver um homem tão estranho\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("conversando de forma tão íntima com o seu pai. Ele não possui muitos amigos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O desconforto entre seus soldados é visível, quase palpável. A atitude deste homem\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("alto de branco e o silêncio de seus seguidores é muito estranha para todos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Sem aviso prévio, a coruja enjaulada nos braços do homem alto começa a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("assobiar incessantemente, se mexendo na jaula, como se quisesse sair de lá e voar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para o pico mais alto de todos os dezessete reinos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— O que foi, Ágda?! — o homem pergunta para a coruja, como se os dois\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pudessem realmente se comunicar.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A coruja continua a grasnar e se debater na gaiola, cada vez mais agitada. O\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homem abre um sorriso de mais pura felicidade.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— É isso!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ele se vira para seus seguidores de braços abertos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— A nossa busca terminou, meus queridos companheiros, nós finalmente\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("encontramos o procurávamos a tanto tempo!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Os homens — antes sérios e calados — começam a comemorar: uns gritam, outros\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("riem e se abraçam e outros choram de felicidade.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Os seus soldados que agora os cercavam aos montes para tentar entender o que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estava acontecendo, ficam ainda mais confusos e receosos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	“Estes homens encontraram o que buscavam por aqui?” “O que eles estariam\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dispostos a fazer para tomar isso de nós?”\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Pequeno general! — o homem de branco se vira para Asuf.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Seu filho! Ele é a criança da profecia! Tem o potencial de aguentar o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("máximo que a luz tem a oferecer! Ele vai ser o responsável pelo grande sacrifício! A\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("humanidade irá evoluir para o ápice da nossa espécie! Nós finalmente seremos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dignos de estar do lado dos deuses! — ele exclama com uma felicidade parecida com\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("a de uma criança que recebeu um brinquedo novo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Me desculpa, mas não vou aguentar luz nenhuma não! — seu filho fala —\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Não quero ter que sacrificar nada! Eu sou só mais um garoto!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Isso mesmo!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Ninguém aqui vai sacrificar nada a luz nenhuma! — afirma veemente.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O homem de branco se vira para seu filho.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Não vê, menino!? Todo o bem que vai trazer... É algo que nem o primeiro\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("necromante sonhou em fazer!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ele se aproxima para colocar a mão no ombro de Anton, mas Rurik entra na\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("frente de seu filho e afasta a mão do homem com um tapa.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Você não ouviu? Não vai ter sacrifício nenhum aqui!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Quando Rurik faz isso, o sorriso do homem some e todos os seus seguidores param\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de celebrar. Por um segundo ele olha para Rurik, como se estivesse pensando no que fazer\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("em resposta ao que aconteceu.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Mais rápido do que Asulf consegue pensar, o homem acerta um tapa com as\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("costas da mão em Rurik, arremessando ele até uma das casas mais próximas à\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("direita e atravessa a porta da casa como se tivesse sido atirado de dentro de um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("canhão. A porta se arrebenta e ele cai em cima de uma das mesas da casa, agora\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("destruída pelo peso dele.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Os soldados ao redor congelam ao ver a cena. O homem gigante que antes\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("sorria e festejava com os seus seguidores agora havia arremessado um de seus\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("companheiros como se não fosse nada. Anton corre em socorro a Rurik que agora\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("parecia não se mexer mais.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf rapidamente saca a sua espada e ataca, querendo enfiar a lâmina no\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("querendo enfiar a lâmina no estômago no homem.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		//Luta 05 Contra o Monge começa aqui
		int hpMonstro05 = 2000;
		do {
			
			System.out.println();
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Monge Branco");
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
								
				Digita("Asulf ataca em direção ao estômago o Sacerdote! \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Mas quando percebe ele está segurando a sua lâmina com uma única mão!\n", TimeUnit.MILLISECONDS, temp_dialog);
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
		Digita("que guarda em seu cinto e tenta mais uma vez acertar o homem porém a faca ao\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("encostar no estômago dele, simplesmente rasga a sua roupa. A sensação é que Asulf\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("tentou esfaquear uma parede de pedras maciças. Dano 0\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Agora um dos generais berra para que seus guerreiros avancem contra o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homem e seus servos e ao fazer isso um dos homens vestidos de vermelho que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("segurava um livro, começa a se contorcer, como se houvesse algo em sua barriga.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Assim que os soldados sacam as suas armas, o monge abre a boca e baratas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("voadoras saem dela em direção dos soldados, instaurando pânico nos seus\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("companheiros.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	No meio do caos o sacerdote acerta um chute em seu peito, tirando por\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("completo seu fôlego e arremessando-o para trás com uma força estarrecedora. Dano 20\n", TimeUnit.MILLISECONDS, temp_dialog);
		hpUsuario = hpUsuario - 20;
		System.out.println();
		Digita("Mesmo com a armadura te protegendo, seu peito dói muito, ele acertou-te tão forte\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que parece que está prestes a ter um infarto. Quando foi arremessado não atingiu\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nada que pudesse causar mais danos do que o homem já lhe causou. Quando\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("finalmente para encostado em algo, percebe que foi chutado a mais de 5 metros de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("distância e que não foi arremessado para cima, e sim para frente. Então o que mais\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("doeu além do chute foi sair rolando pelo chão até finalmente parar em um amontoado\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de barris de cerveja que estavam próximos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Olhando em direção a batalha nota o caos que ela se tornou, várias baratas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("voando, soldados atacando monges. Alguns deles usam espadas, outros usam\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ataques mágicos e até mesmo um dos monges se transformando em uma mistura\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("entre demônio, homem e lobo. Mas agora não se importa com isso, só se importa\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com o seu garoto, que ficou com Rurik. Onde ele pode estar?, pensa preocupado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf reúne todas as suas forças e levanta com uma dor descomunal em seu peito.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu tô ficando velho pra isso.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Não foi a primeira vez que lutou contra seres estranhos: demônios, magos,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("goblins e outros tipos de monstros são comuns na vida de um guerreiro. É natural\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que para se tornar realmente bom nesta vida, deve-se matar alguns bichos que nunca\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("imaginou que teria forças para vencer. Acabar com esse bando de monges lunáticos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("não será a sua última missão. É melhor que eles nem pensem em encostar em um fio\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de cabelo de Anton.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf corre em direção à luta e quando se aproxima vê um de seus\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("companheiros caído, o cheiro que já está acostumado chega em suas narinas, a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("batalha que acabou de começar já fede a sangue e pessoas recém-mortas. Você \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("reconhece Lortes devido a sua arma, ele é famoso por ser um guerreiro que cria os\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("próprios equipamentos a partir de metal e magia. Lortes fez sua própria armadura,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("uma armadura muito resistente que aguenta ataques elementais mágicos mais\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("simples como fogo e eletricidade.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Lortes está no chão, parece que mesmo com as suas habilidades não foi páreo para\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("o demônio lobo que estava atacando seus homens. Sua armadura foi despedaçada pelas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("garras do monstro e seus órgãos estão expostos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
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
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
			
		Digita("	Asulf pega a espada dele, uma lâmina avermelhada afiadíssima que quando\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("corta incendeia o ferimento causando uma dor gigantesca na vítima, pode fazer bom\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("uso dela.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Me perdoe, meu amigo, obrigado pelos seus serviços — Asulf diz ao\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cadáver — Obrigado por tudo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Indo em direção à casa em que Anton estava, encontra Rurik no mesmo lugar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que estava antes, você pararia para checar seus batimentos cardíacos mas a situação\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("não permite desperdiçar tempo e reza para ele estar apenas desmaiado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Asulf ouve um grito vindo em direção aos fundos da casa, correndo na direção\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("do som, chega à cozinha. O que a alguns momentos atrás era uma cozinha comum\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("agora estava revirada devido à luta. Possui um buraco na parede que leva aos fundos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("da casa onde provavelmente esta família usava para criar porcos. O que vê através do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("buraco é seu filho coberto de lama e esterco, se arrastando para tentar fugir do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homem de branco que empunha seu chicote.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Enquanto o padre está apenas com a barra da batina suja pelo chão imundo,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("seu filho está gravemente ferido, com o corpo cheio de cortes causados pelo chicote,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com o lado esquerdo do rosto inchado pelo que provavelmente foi um soco fraco\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dado pelo padre e com uma de suas pernas quebradas, ele rasteja ferido e sangrando\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para longe do homem que se diverte com o seu sofrimento.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Isso! Filho da criança, você sente?! — O homem diz — O sangue, a dor, use\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ela para aprender! Sinta o que tem além dela, sinta a santidade que está por trás de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("todos os seus sentidos! — o monge exclama.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Vamos, pequenino! — chicoteia seu filho — Olhe além desta dor mundana,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("use ela para se aproximar da iluminação, esta será a sua primeira lição: nada é bom,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nada é mau, as coisas apenas aproximam-se ou afastam-se de viver o que é a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("realidade de verdade.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ver a cena o enfurece mas o que esgota a sua paciência de vez, não é a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("batalha desnecessária, não são seus  amigos mortos, não é ter sido arremessado, é\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("o cheiro! Sobre todo fedor de sangue, morte e esterco que sentiu hoje, um cheiro se\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("sobressai: o cheiro de sangue… sangue do seu filho!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("O sangue de Asulf fervilha em suas veias, sua visão se avermelha e ele berra\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("— Sua luta é comigo, monstro! Não encoste no meu filho!\n", TimeUnit.MILLISECONDS, temp_dialog);
		int contador = 0;
		do {
			
			System.out.println();
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Monge Branco");
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
				
				if (contador == 0) {
					Digita("	Asulf não espera que o homem se vire para enfrentá-lo frente a frente e corre \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("em direção ao padre, desferindo um golpe com sua nova espada. A lâmina atravessa\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("as roupas da criatura e atinge o homem de raspão, abrindo um corte em sua cintura! Dano 35\n", TimeUnit.MILLISECONDS, temp_dialog);
					hpMonstro05 = hpMonstro05 - 35;
					System.out.println();
					Digita("	O corte abre, incendeia-se e cauteriza-se logo em seguida. Uma consequência\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("da mágica embutida na espada. Após o corte ela queima o ferimento, causando uma\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("dor agoniante de queimadura à vítima. Em situações normais muitos homens\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("estariam berrando devido à queimadura mágica, mas esta magia parece trazer apena\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("irritação ao padre, que fecha seu semblante ao ver que o “pequeno guerreiro”\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("conseguiu lhe causar um dano.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	— Parece que o meu pequeno soldado aprende com os próprios erros — Ele\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("fala em um tom sarcástico, evidentemente tentando esconder o ódio. \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	— Onde conseguiu esta lâmina? Pegou emprestada de um de seus\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("soldadinhos? Ou do cadáver deles? Acredito que meus apóstatas mataram\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("alguns já — Ele sorri esperando uma resposta mas não a recebe.\n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println(); 
					
				} else if (contador == 1) {
					Digita("	Asulf avança desferindo um golpe vertical direto no peito do monstro e\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("com uma velocidade sobre-humana! O padre move seu corpo para a sua direita e esquiva do ataque! Dano 0\n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println();
					Digita("	Aproveitando o seu momento de fraqueza devido ao movimento do golpe, \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("o padre acerta um soco em seu rosto! Dano 20\n", TimeUnit.MILLISECONDS, temp_dialog);
					hpUsuario = hpUsuario - 20;
					System.out.println();
					Digita("	Claramente ele não usou toda a força. Caso fizesse isso, teria arremessado-o\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("novamente para longe da batalha e muito provavelmente quebraria o pescoço no processo.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Em vez disso, Asulf cai no chão com a força, o lado direito de seu rosto se\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("incha na hora e perde a visão de seu olho direito.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Agora, Asuf está próximo ao seu filho, quase na mesma situação dele.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	— Pai! — ele se arrasta em sua direção — Você tem que sair daqui! Levanta e foge!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	— Cala a boca, moleque! — diz, tentando manter a consciência — Eu sou\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("velho e você tem toda uma vida pela frente — fala cuspindo sangue.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	— Foge logo! É uma ordem!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	— Pai… por favor — Anton diz com lágrimas nos olhos.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	— É uma ordem! — berra.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	Com os olhos cheios de lágrimas, seu filho começa a se arrastar, tentando\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("fugir da luta e começa a gritar por socorro. Asulf une todas as suas forças para se\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("manter em pé, sua arma não está mais em suas mãos e se encontra no chão devido\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("ao golpe. Ele é muito forte, pensa.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	O soco em sua cabeça foi muito potente, parece que seu cérebro dançou\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("dentro do crânio e acertou todas as paredes gerando uma dor de cabeça excruciante\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("e o impedindo de pensar direito.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	“Consiga tempo..”, o homem anda calmamente em sua direção.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	“Levante os punhos” , entra em guarda.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	O homem olha para seu filho que se arrasta tentando aproveitar o tempo que\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("seu pai lhe deu.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	“Chame a atenção”\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	— Você não é nada! Eu vou te matar com as minhas próprias mãos! — grita\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("tentando manter-se de pé, devido a uma súbita vertigem que acossou-te após fazer o\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("simples ato de se levantar.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	— Que lindo! — O padre diz ao se aproximar — Um pai defendendo seu filho\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("com as suas últimas forças. Entendeu, meu pequeno general, você superou a dor em\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("prol do seu objetivo — Ele coloca as duas mãos em seu rosto.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	— Hoje meu pequeno soldado, conseguiu evoluir um pouco mais — ele te\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("agarra pela armadura, o suspende no ar e aproxima sua boca de seu ouvido.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	— Se um pai, velho e ferido já é assim, mal posso esperar para ver no que o filho vai\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("se tornar.\n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println();
					Digita("	Ele afasta o rosto e com as mãos livres arranca a sua armadura.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	— Vamos tirar isto daqui, é isso que está te protegendo tanto, né? Vamos ver\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("agora se aguenta outro dos meus arremessos!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	Asulf é arremessado no ar e passa por cima da casa destruída, por cima da rua\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("e após voar por mais dois metros finalmente começa a desacelerar, caindo em\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("direção ao telhado de madeira de uma das casas do vilarejo.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	Seu único pensamento é em colocar seus braços na frente do rosto para\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("protegê-lo e a gravidade começa a puxar Asulf, o telhado se aproximando cada vez\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("mais.\n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	CRACK!		Dano 35\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
					Digita("	\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
					Digita("	\n", TimeUnit.MILLISECONDS, temp_dialogSlow); //Pausa dramática
					System.out.println();
					System.out.println();
					System.out.println();
					
					
					
				}
				contador++;
				break;	
			default:
			}
			
		} while (contador < 2);
		alternativaCerta = false;
		
		
		
		
		//Quinta luta termina aqui - O Sacerdote 
	
			
		
		
		//Menu Descrição dos Ataques
		do {
			imprimirMenuStatus(chamasNegrasStatus, elixirDaVidaStatus, sabedoriaDeOdinStatus); //vai imprimir o Status contendo HP e Especiais
			
			System.out.println("1 - Continuar para o Capítulo 3: O Pacto");
			System.out.println("2 - Descrição dos Ataques");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":				
				alternativaCerta = true;
				break;	
			case "2": 
				
				boolean alternativaVoltar = false; //criada para 'voltar' o menu.
				
				do {
					descricaoDosAtaquesStatus(chamasNegrasStatus, elixirDaVidaStatus, sabedoriaDeOdinStatus);
					System.out.println();
					System.out.println("X - Voltar");
					alternativa = entrada.next();				
					switch (alternativa.toLowerCase()) {
					case "x":
						alternativaVoltar = true; //utilizado para 'Voltar' o menu.
						break;
					default:
						System.out.println();
						System.out.println("Acredite em você!");
						System.out.println();
						break;
					}
				} while (alternativaVoltar == false);
				
				break;
			default:
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		
		//Fim do Capítulo 2
		
		
		
		capitulo3();
	}

	public static void capitulo3() throws InterruptedException {
		System.out.println();
		System.out.println("Capítulo 3: O Pacto");
		System.out.println();
		System.out.println();
		hpUsuario = 100; //recuperando o HP de Asulf após a luta.
		
		Digita("	Não é a primeira vez que o velho general se encontra à beira da morte, as\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("batalhas ao longo dos anos sempre lhe custaram sacrifícios e sangue, mas nenhuma\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("luta se comparou com a deste monge. Asulf já lutou contra guerreiros, feras e até\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mesmo demônios, mas ele nunca viu um ser humano tão forte.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Tudo está escuro e seu corpo inteiro dói, é possível sentir que os seus braços\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estão presos, seu olho esquerdo arde como se alguém tivesse esfregado uma lixa em\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cima dele. Você se sente muito fraco, a menor tentativa de se mover lhe causa dor e\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("fraqueza. Com muito esforço  tenta mexer os pés e felizmente eles respondem.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Ótimo, não estou paraplégico. 一 pensa o soldado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Algo bloqueia a sua visão, o quarto em si não está escuro, algo em seu rosto\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("não te permite enxergar. Ao tentar mover os braços para remover a venda, Asulf\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("sente uma dor fortíssima, é como se os ligamentos que unem seus braços ao tronco\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estivessem moles, a sensação é que em qualquer momento eles irão desgrudar do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("seu corpo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Sem enxergar, sem saber onde está, sem poder mexer o corpo direito e pela\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("primeira vez, você se sente completamente vulnerável.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		String alternativa; //alternativa escolhida pelo usuário
		boolean alternativaCerta = false; //alternativa utilizada p/ sair do loop
		
		System.out.println();
		do {
			System.out.println();
			System.out.println("1 - Gritar por ajudar.");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":				
				alternativaCerta = true;
				break;			
			default:
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		System.out.println();
	
		Digita("	一 Tem alguém aí? 一 o guerreiro exclama 一 Por favor!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Tem um monge na cidade, ele está destruindo tudo, eu preciso de ajuda para\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Ele está querendo levar o meu filho! 一  Asulf grita desesperado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf se sente patético, um guerreiro não deve gritar por ajuda, o guerreiro é a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ajuda. Quando uma cidade é invadida, o general sai dos seus aposentos e lidera seus\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homens para conter a ameaça. Agora você está jogado em algum lugar, todo ferido e\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("indefeso, pedindo ajuda para qualquer um que possa acudir este soldado velho e\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("patético.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Ele acordou! 一 uma mulher exclama, de algum lugar que você não\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("consegue distinguir direito.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Por favor, eu preciso voltar para a batalha! Meus soldados estão em perigo!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Por favor, senhor, se acalme. Vai ficar tudo bem.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Asulf começa a se debater, ele precisa salvar seus homens e precisa encontrar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("seu filho!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Por favor, moça, preciso que você me ajude a levantar.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 De jeito nenhum! Você precisa deitar e descansar! Astrid traga a valerina! 一\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ela começa a empurrar seu corpo para baixo, impedindo-o de levantar.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Por favor, preciso voltar para a batalha!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Você vai ficar deitadinho aí! A batalha já acabou!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Esta frase o deixa mais agitado e você se debate nas mãos da mulher e berra\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para que ela a solte, até que haja uma segunda voz.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Aqui, madame!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Obrigado, Astrid. 一 a madame fala.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Depois desta frase, a madame recita algumas palavras de poder, palavras de poder\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que o general reconhece: fogo!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Uma fragrância começa a preencher o ar, um cheiro de camomila, alfazema e outras\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ervas irreconhecíveis para o guerreiro. Gradualmente seu corpo relaxa e você cai no sono.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Aos poucos, Asulf começa a recuperar a consciência, o cheiro de valerina é nítido \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("no ar, talvez por isso o soldado esteja tão calmo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Como está se sentindo, senhor? 一  uma voz familiar pergunta.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Rurik? 一 o velho pergunta, ainda sem poder enxergar.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Sim, senhor, sou eu. Eles realmente precisam manter estes curativos no seu\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("rosto? 一 o garoto fala e retira as faixas para você conseguir enxergar.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println();
		do {
			System.out.println();
			System.out.println("1 - Abrir os olhos.");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":				
				alternativaCerta = true;
				break;			
			default:
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		System.out.println();
		
		
		Digita("	A luz machuca seus olhos e olha em direção de Rurik e se espanta ao vê-lo\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("relativamente bem, ele parece forte como antes e tem apenas algumas ataduras em\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("seu braço direito. Mas algo está estranho…\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Meu... olho...\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 A sua queda foi muito alta, senhor. Você caiu no telhado de uma casa.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Quebrou e deslocou os dois braços, quando quebrou o telhado da casa, uma lasca de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("madeira arrancou uma parte do seu olho fora, você teve muita sorte...\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Sorte? Como você pode chamar isso de sorte, Rurik!? 一 o soldado gritaria, mas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("o excesso de remédios no seu corpo e a valerina empesteando o lugar não o permitem\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("fazer isso 一 Como Anton está? Por favor, me diga que aquele homem não o levou.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O garoto abaixou a cabeça envergonhado.\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		System.out.println();
		Digita("	一 Me desculpe, senhor, aquele monge… ele me acertou tão forte… quando eu\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("acordei, eles estavam procurando sobreviventes entre os corpos. 一 o menino fala\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cabisbaixo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Você não acredita no que ouviu.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Quanto tempo eu fiquei desmaiado?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Dois anos. 一 Rurik responde.\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		System.out.println();
		Digita("	一 Me solta! Você está dizendo que eu fiquei desmaiado por dois anos e até agora\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	vocês não conseguiram encontrar aquele sacerdote maldito? 一 Asulf berra.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Não é tão simples, senhor! Eles mataram mais de vinte homens nossos,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mais quinze ficaram muito feridos. Mesmo que nós encontrássemos eles, nós não\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("poderíamos fazer nada para salvar o Anton!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 VOCÊS NEM AO MENOS TENTARAM IR ATRÁS DELES???!!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Chame o general em comando, eu quero ter uma palavrinha com ele.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Senhor…\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 AGORA RURIK!!! Tira essa cara idiota da minha frente e vai me buscar alguém\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que possa me ajudar a salvar o meu filho!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O jovem fica nitidamente chateado. Ele te solta e vai atrás do general de plantão.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Não é culpa dele você sabe disso, ele é apenas um jovem que foi pego no meio de uma\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("briga de adultos, mas o general pode se desculpar depois, agora o que importa é montar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("uma expedição para encontrar o seu filho e colocar a cabeça daquele monge e uma maldita\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estaca.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 É muito bom saber que o nosso general está se recuperando bem 一 um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homem que não conhece fala. Ele entra e se senta próximo a você 一 É uma honra\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("conhecê-lo Asulf, é uma pena que a nossa primeira conversa tenha que ser sobre\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estas circunstâncias 一 o homem faz uma pequena reverência.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O homem aparenta estar por volta dos 35 anos, parece ter pouco mais de um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("metro e setenta e tem cabelos ruivos curtos. Ele está vestindo uma cota de malha que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("possui um leve reluzir azul-escuro, um sinal de que a armadura foi encantada. Na sua\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cintura é possível notar uma espada embainhada e em seu peito um símbolo\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Volstálico de comando.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Eu não te conheço, você veio para ajudar na invasão do castelo de Zark? 一 o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("general pergunta 一 eu preciso falar com o responsável pelas expedições dos soldados,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("onde está Bennick?! 一 o guerreiro se refere ao seu antigo colega de armas. Bennick foi um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dos generais que foi responsabilizado junto com Asulf a dominar Zark.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Sinto muito, senhor, mas o general Bennick veio a falecer na invasão dos monges\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	a alguns meses atrás 一 o novo comandante fala 一  eu estou aqui para substituí-lo, general\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Perce ao seu dispor.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Antigamente o velho guerreiro ficaria chocado com a morte do amigo, mas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("você já está velho e já perdeu muitos colegas de armas para a guerra, isso é apenas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mais um motivo para você ir atrás do monge, mais uma alma para você vingar.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Eu quero liderar uma equipe para ir atrás dos monges que nos atacaram. Eles\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("são perigosos, mataram nossos homens e podem ter planos que afetem Volstalir. É o nosso\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dever caçar estes homens e trazê-los à justiça Volstálica.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Desculpe, Asulf, mas isso não será possível.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 E por que não? 一 o guerreiro controla o máximo possível a sua raiva 一 eles\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mataram nossos homens e sequestraram um dos nossos para cumprir aquela maldita\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("profecia, se a profecia estiver certa, eles podem acessar um poder inimaginável! Se eles\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estão assim agora, eu não consigo nem pensar em como eles estarão se conseguirem se\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("aproximar destes deuses deles.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Pelos deuses, Asulf! 一 o homem exclama 一  esta profecia já existe a séculos,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nenhum destes malditos sacerdotes conseguiu nem chegar perto de encontrar a criança. Eu\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("não acredito que você esteja pensando que o que eles falam é verdade.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Verdade ou não, eles são um perigo para o nosso país. Você não estava lá\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("quando eles massacraram os meus homens!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Não, eu não estava! Mas é a minha responsabilidade manter Zark segura, e\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("eu não vou enviar um esquadrão atrás deles.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Já faz dois anos, Asulf. Eles nunca mais voltaram.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Como você pode pensar assim? 一 o general ferido fala 一  eles entram aqui,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("matam nossos companheiros, levam o meu filho e você vai deixar que eles saiam impunes?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Então é isso. 一 Perce fala de forma calma 一  eles levaram o seu filho e agora\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("você quer encontrá-lo… eu entendo, eu entendo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Você se insulta mentalmente, o general não poderia saber que esta seria uma\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("missão pessoal, você tentou convencê-lo de que esta era uma missão para eliminar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("uma ameaça à Volstalir, assim ele teria motivos sólidos para enviar uma tropa atrás\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dos monges. Mas o reino de Volstalir não se envolve em caçadas pessoais.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Eu sinto muito, Asulf, não há nada que eu possa fazer. Eu não posso arriscar os\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("meus homens para ir atrás deste monge, é muito perigoso. Fique à vontade para se\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("recuperar. Vou enviar uma carta para nosso rei, ele ficará feliz de me congratular com as\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("melhores honras!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Asulf está atônito.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Infelizmente, acredito que você não poderá mais voltar aos campos de batalha. 一\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Perce fala 一 mas não se preocupe, um general como o senhor com certeza terá uma\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("excelente aposentadoria!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O general se levanta, faz uma reverência e sai da sala.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Os dias consecutivos são uma mistura de dor, tristeza e ódio. Quanto mais o tempo\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("passa, mais seus ferimentos parecem demorar para se curar.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A pior parte é a visão. Como um velho, você já não tinha os melhores olhos, mas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("agora sem um deles, viver ficou mais difícil. Asulf não consegue enxergar seu quarto por\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("completo e sua percepção de profundidade foi severamente danificada. A cada movimento\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("os ligamentos dos seus braços parecem se descolar do tronco.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Sua mente está tão ruim quanto seu corpo. Depois da derrota tudo ficou cinza, seus\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homens morreram e seu filho está desaparecido por mais de dois anos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 “Anton onde você está?\" 一 o guerreiro se pergunta toda noite.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Os dias mais claros são cinzas como concreto. As curandeiras tentam animá-lo, te\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("incentivando a comer, sair da cama e fortificar seus músculos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Mas não existe sentido nisso.\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		System.out.println();
		Digita("	Você não pode sair em missões, qual o motivo de se alimentar bem?\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		System.out.println();
		Digita("	Seus músculos doem demais, por que exercita-los? A dor só seria maior.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O general proibiu missões de resgate para salvar o seu filho, então por que você\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("precisa levantar?\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		System.out.println();
		Digita("	Asulf falhou como guerreiro, como líder e como pai. Tudo que o velho general\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("construiu foi pisoteado em instantes. Um trabalho de uma vida toda, destruído em 20\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("minutos. Às vezes, a única coisa que te dá forças para abrir seus olhos é o ódio. O ódio é\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("tão grande que seu coração chega a arder, estes são os piores dias para conseguir pegar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("no sono.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Você está melhorando, senhor! 一  Astrid fala para animá-lo 一  eu ouvi dizer que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("você conseguiu beber água sozinho ontem, eu vou te dizer, isto é um tremendo avanço!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("Asulf não responde.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Sabe… estamos trazendo um bardo aqui para o nosso mosteiro, ele está\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cantando músicas para os pacientes, é muito bom ficar lá junto às pessoas.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Asulf não responde.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Bom… caso precise de algo... é só chamar! 一 ela fala, tentando mostrar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("entusiasmo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Asulf se vira e deita na cama.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Os dias se tornam semanas, que se tornam meses e aos poucos o velho guerreiro\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("começa a se recuperar de seus ferimentos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Asulf, você pediu uma encomenda? 一 Astrid pergunta enquanto limpa seu\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("quarto.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Você se levanta da cama em um salto.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();	
		Digita("	一 Onde está?! 一 o guerreiro pergunta 一  quero dizer, sim eu pedi!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 São os livros, livros que a minha esposa guardava em nossa casa, eu pedi para\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("trazerem para mim\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	A curandeira se assusta com a sua repentina mudança de atitude.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Sim, sim, ele chegou hoje de manhã!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Por favor, traga-o para mim.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Claro! Sem problemas! 一 a moça vai em direção a porta, para e se vira para\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("você e sorri 一 que bom que você está se sentindo melhor senhor.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Sua esposa Sofia foi uma exímia feiticeira. Sua maestria para feitiçaria era notável,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("aos 22 anos já era capaz de dominar diversos feitiços, e possuía preferência para feitiços\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de fogo. Ela dizia que combinava com seu cabelo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Aos 25 se alistou no exército real de Volstalir. O reino de Sophia sofreu invasões\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("bárbaras constantes, a maga se alistou no exército para fazer algo sobre isso.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Fora nas linhas de frente que Asulf a conheceu. O mais novo general de Volstalir foi\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("enviado para seu reino para ajudar contra as invasões constantes.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O general nunca vai esquecer da primeira vez que viram as estrelas juntos, em\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("todos os seus anos de vida, ele nunca havia conhecido uma mulher tão bela e obstinada,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("seu sorriso preenchia o coração de guerreiro de felicidade.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Anos depois seu filho Anton nasceu e Sofia decidiu se aposentar de seus tempos de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("guerra.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Mas nem tudo dura para sempre, quando Anton tinha apenas 13 anos, sua mãe\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ficou extremamente doente. Os remédios não faziam efeito, as magias de cura serviam\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("apenas para aliviar suas dores. Depois de sua morte, Asuf decidiu levar seu filho para suas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("campanhas, deixá-lo sozinho em casa parecia certo, e o guerreiro não conseguiria morar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("naquela casa sem Sofia, era muito doloroso.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O general passou noites em claro lendo os livros de sua amada, até achar o ritual\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("correto: “aprisionamento etéreo”.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Dois dias depois você tinha todo o necessário para fazer o ritual\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
			
		System.out.println();
		do {
			System.out.println();
			System.out.println("1 - Iniciar o ritual de Aprisionamento Etéreo.");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":				
				alternativaCerta = true;
				break;			
			default:
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		System.out.println();
		
		
		Digita("	Asulf se tranca em seu quarto e começa o processo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O jejum começa à meia-noite de domingo e dura até a meia-noite do próximo. Cada\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dia você faz um pequeno corte, e o deixa sangrar em um cálice. No último dia, à meia-noite\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("você deve marcar com um símbolo aquilo que você deseja prender neste plano. Asulf o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("desenha na própria carne.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Por último, o guerreiro bebe o sangue que armazenou durante a semana e entoa o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cântico indicado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Ao final do cântico, Asulf deve finalizar o feitiço.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O general sobe na cadeira de seu quarto, coloca a corda em seu pescoço e se\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("enforca.\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("			\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("	Agora o ritual começou\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("			\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		System.out.println();
		Digita("	Sua alma está presa ao corpo, o símbolo em sua pele o mantém aqui.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	No primeiro dia você revê todos os seus momentos felizes. Os momentos com sua\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("esposa, o dia do nascimento de seu filho, as suas aventuras quando era jovem e gostava\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de se arriscar pela floresta junto às suas irmãs\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	No segundo dia você vê o lado ruim de cada um destes dias. Sua esposa doente, o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dia que Anton se machucou enquanto seu país o treinava pela primeira vez e a primeira vez\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que o general, ainda pequeno, viu seu pai bater em sua mãe e irmãs sem poder fazer nada.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	No terceiro dia os diabretes apareceram. Pequenas criaturas vermelhas que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("atormentam o general por horas. Dizendo que seu filho estava morto e que sua esposa\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("sofre no submundo por saber que seu marido é um fraco que não conseguiu salvar nem\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("seu filho, nem ela.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	No quarto dia Asulf entendeu o conceito de inferno, os diabretes finalmente\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("decidiram começar a torturá-lo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	No quinto dia o guerreiro foi chicoteado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	No sexto dia o soldado foi incendiado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	No sétimo dia, Asulf reviu todas as pessoas que matou. Para retribuir, cada pessoa\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("assassinada teve a oportunidade de matar o general da mesma forma que foi morto.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	No oitavo dia, Asulf descansou.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	No nono dia, ela veio.\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		System.out.println();
		Digita("	À sua frente, uma mulher alta, de cabelos escuros, olhos completamente escuros e\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pele quase transparente. Ela veste um véu de ceda negro. De suas costas se estendem\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("asas negras de corvo, tão longas que ocupam quase todo o espaço da sala.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Há anos que não vejo um homem aplicar este ritual em si mesmo 一 a moça ri 一\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("normalmente eles são usados como método de tortura, me diga Asulf, como posso\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ajudá-lo?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Minha senhora 一  você se ajoelha perante a ela 一  eu venho lhe pedir um favor,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("eu preciso encontrar meu filho, ele foi sequestrado por um monge da Ordem da Sabedoria\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("do Sofrimento Sagrado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Ah... estes monges sempre causam problemas, não acha? 一  a voz dela é suave\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("e sedutora 一 eu detesto quando um deles tenta usar necromancia. Eles acreditam que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("podem ser que nem Cornelius, mas ninguém é que nem ele.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Por favor 一 Asulf suplica 一 eu preciso de poder! Aquele maldito monge de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("branco, ele é muito forte!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	A moça ri.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Os mortais sempre se mostram ser muito insistentes, não é mesmo?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Eu vi o que este monge é capaz, sabe Asulf, neste reino, eu sempre estou onde a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("morte está. E este monge vem chamando muito a minha atenção.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Você consente com o que aquele homem faz? 一 o velho questiona a deusa.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Eu não me importo com a morte, Asulf. Tudo morre um dia, você irá morrer, o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("monge também, até mesmo eu, a deusa do submundo, irá descansar um dia.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Somente meus pais não morrerão, somente os primeiros deuses são eternos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 O que eu não aceito é a aceleração não natural da morte. Isto me dá mais\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("trabalho.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Então me ajude a pará-lo! 一 você pede 一 por favor, Ereshkigal, deusa dos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mortos, rainha do submundo, me ajude a parar este monstro, me ajude a salvar meu filho!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Ereshkigal existe desde o início deste mundo, quando o primeiro ser vivo teve seu\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("primeiro respiro, Ereshkigal estava lá para recebê-lo no momento de sua morte.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Ela sempre é neutra, a morte deve vir para os bons e os maus, sem favoritismo. A\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("rainha dos mortos não controla a morte, ninguém pode controlar isso.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Ela apenas se responsabiliza pelo que acontece com você depois da morte e\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("garante que ninguém passe dos limites impostos pela natureza, apenas intervindo em\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("casos extremos. Através de seus servos do mundo material. Sua principal função é manter\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("o equilíbrio entre os vivos e os mortos, e manter todos os doze paraísos e vinte e três\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("infernos em ordem.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	A rainha dos mortos olhou compassivamente para o senhor ajoelhado à sua\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("frente.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Se eu te der poderes para enfrentá-lo, o que você pode fazer por mim? 一 a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("deusa pergunta 一 afinal de contas, eu posso esperar ele morrer e puni-lo quando a sua\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("hora chegar.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Se você fizer isto, quantas pessoas vão morrer pelas mãos dele? 一 Asulf\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("questiona a deusa 一 se você pode impedi-lo e não o faz, o sangue deles está em suas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mãos também!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Não tente me culpar por aquilo que vocês humanos fazem, Asulf. Isso é\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("contraprodutivo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Perdão, minha Senhora… eu.. eu posso servi-la, posso ajudá-la aqui no plano\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("terreno, cumprir as suas vontades, ser a sua lâmina!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Cuidado, Asulf 一 Ereshkigal avisa 一 trabalhar para mim não é um trabalho\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("simples, eu não sou obrigada a seguir a moralidade humana, eu não preciso seguir\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("moralidade alguma.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Não me importo, eu tenho apenas duas condições.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	 A deusa sorri\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Por favor, conte-as para mim.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Se eu trabalhar para a senhora, não me obrigue a matar meu filho, e ninguém de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("minha linhagem 一 o soldado faz uma pausa, receoso 一 e também... gostaria de poder\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("rever a minha esposa... eventualmente…\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	A deusa vê graça no pequeno primata com receio em pedir para rever seu amor.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Tudo bem, eu aceito a sua proposta general, levante-se.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println();
		do {
			System.out.println();
			System.out.println("1 - Levantar e aceitar o pacto de Ereshkigal.");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":				
				alternativaCerta = true;
				break;			
			default:
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		System.out.println();
		
		
		Digita("	O soldado obedece. Ereshkigal encosta suas mãos frias no guerreiro.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 A partir de agora, você, Asulf, terá meu poder. Terá a minha força, minha\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("resistência, os maiores seres o temerão.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Sua vida será dedicada a mim e apenas a mim, sua lâmina deve perfurar apenas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("quem impedi-lo de servir as minhas vontades, sua morte deve ser tardia, para servir-me o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("máximo possível.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Seu corpo começa a se regenerar automaticamente, você se sente forte como\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nunca, suas dores passam e pela primeira vez em meses, o general se sente\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("completamente revigorado. Apenas seu olho não se cura.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Enquanto não matar este monge e apresentá-lo para mim você continuará cego,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("é um lembrete da sua dívida comigo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Sim, minha senhora 一 o guerreiro concorda 一 você pode me levar até o monge,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("vou matá-lo assim que eu o vir!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Infelizmente não é tão fácil assim, Asulf, você conhece A Torre de Gnosis? \n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O guerreiro fica confuso, como algo pode não ser fácil para os deuses?\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 É um lugar de convergência de todos os mundos criados por meu pai. É uma\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("torre que conecta vários planos de existência que ele criou.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Existem outros mundos? 一  o velho pergunta \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Ah, pequeno Asulf... 一 a deusa ri e coloca suas mãos frias em seu rosto 一\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("existem tantas coisas que vocês pequenos primatas ainda não entendem.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Tudo bem, o que devo fazer para encontrá-lo?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Siga seu rastro! 一 a deusa ordena 一 as pessoas que entram na Torre de Gnosis\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("são aquelas que buscam conhecer as verdades do universo que meu pai criou, a maioria\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("das pessoas nunca volta, apenas o ato de atravessar o portal já é mortal para a maioria dos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("seres humanos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A deusa continua:\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Provavelmente ele deve estar procurando cumprir a profecia.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você se farta do falatório:\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Me leve até a torre, eu vou garantir que este monge maldito tenha o que merece!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Ereshkigal te observa intrigada. São raros os homens que ousam cortar sua linha de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("raciocínio. A rainha dos mortos se aproxima do guerreiro e encobre seu corpo com suas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("asas. De repente toda sua visão fica escura, um frio avassalador domina seu corpo e sua\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cabeça rodopia.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Quando Asulf recobra sua noção de espaço, o guerreiro se encontra em meio a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("uma floresta temperada, parecida com as florestas ao sul de Volstalir. A sua frente existe\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("uma pequena casa abandonada.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Aqui está, Asulf! Contemple o portal da Torre de Gnosis! 一 Ereshkigal fala em\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("tom sarcástico.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 É isto? Eu esperava algo...\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Mais suntuoso?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Mais limpo, mesmo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A deusa gargalha, uma risada alta e pouco humana, que assusta os animais faz as\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("folhas das árvores secarem.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Asulf, você me entretém! 一  a rainha exclama.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Se eu entrar neste mundo, como posso saber onde o monge está indo?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Não se preocupe com isto, um portal leva para a dimensão mais “próxima”,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("existem dois portais em cada mundo, pense como uma duas portas em uma sala, cada sala\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("possui apenas duas portas, que levam para salas que tem apenas duas portas, uma que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("você passou, e outra que leva para outro ambiente.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Então, seguindo a lógica, se ele está na sua frente, e não está no mesmo mundo,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("logo ele está no próximo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	A deusa o surpreende com a forma de simplificar algo tão complexo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Mas como posso saber se ele está no mesmo mundo que eu ou em outro lugar?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Você não possui somente as minhas forças, eu te ofereci os meus sentidos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("também 一 Ereshkigal fala 一 você pode localizar qualquer ser vivo ou morto em nosso\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mundo apenas pensando nele, esta habilidade se limita até os limites da dimensão em que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nós nos encontramos. Se você pensar no monge, e não conseguir senti-lo, provavelmente\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ele está em outra dimensão.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O guerreiro já ouviu o suficiente, chega de conversa, agora é a hora de começar sua\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("jornada. O senhor se ajoelha diante da deusa.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	一 Obrigado, minha senhora, serei eternamente grato. Eu juro por meus\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("antepassados que não se arrependerá da sua escolha.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Ereshkigal sorri\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		System.out.println();
		Digita("	一 Tenho certeza que não me arrependerei.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Você se vira em direção à casa, respira fundo e abre a porta.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println();
		
		
		//Menu Descrição dos Ataques
		do {
			imprimirMenuStatus(chamasNegrasStatus, elixirDaVidaStatus, sabedoriaDeOdinStatus); //vai imprimir o Status contendo HP e Especiais
			
			System.out.println("1 - Continuar para o Capítulo 4: 1º Andar — Portões de Fogo");
			System.out.println("2 - Descrição dos Ataques");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":				
				alternativaCerta = true;
				break;	
			case "2": 
				
				boolean alternativaVoltar = false; //criada para 'voltar' o menu.
				
				do {
					descricaoDosAtaquesStatus(chamasNegrasStatus, elixirDaVidaStatus, sabedoriaDeOdinStatus);
					System.out.println();
					System.out.println("X - Voltar");
					alternativa = entrada.next();				
					switch (alternativa.toLowerCase()) {
					case "x":
						alternativaVoltar = true; //utilizado para 'Voltar' o menu.
						break;
					default:
						break;
					}
				} while (alternativaVoltar == false);
				
				break;
			default:
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		
		//Fim do Capítulo 2
		
		
		capitulo4();
	}

	public static void capitulo4() throws InterruptedException {
		System.out.println();
		System.out.println("Capítulo 4: 1º Andar — Portões de Fogo");
		System.out.println();
		
		
		String alternativa;            //Utilizado para as escolhas do Usuário.
		int contador = 0;              //Contador é utilizado para contar e dar mais chances em uma questão.
		boolean alternativaCerta = false; //Utilizado para quando o Usuário escolher uma alternativa certa, assim, saindo do loop e continuando a história.
		
		
		Digita("Aos poucos a sua visão vai se esvanecendo...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ao entrar na torre, você sente-se confortável e acolhido, como se uma chama envolvesse o seu coração e aquecesse-o\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você olha à sua frente e não acredita no que está vendo.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("—— Neve!?\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Mas não era uma neve comum. Ela era envolvida levemente com uma chama azul. Nem quente, nem fria.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ao observar mais o ambiente, você se choca com as criaturas que ali habitavam, antes nunca vistas por você.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Pareciam ser três raposas, mas com peculiaridades que tornavam-as únicas. Pareciam energia pura.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("—— Raposas? No mundo fora da Torre, são animais solitários. Essas parecem não se desgrudarem. —— Você pensa.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Estavam correndo, como se estivesse brincando, uma indo à frente da outra em perfeita harmonia. Mas ao mesmo tempo pareciam não parar de observar você.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Uma era avermelhada, estava envolvida em chamas carmesim de um vermelho que parecia dar vida. Te encheu de determinação.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Outra era azulada, encorberta por chamas azuis celeste. Encheu-o de confiança.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("E a última era da cor de um roxo púrpuro, envolvida por chamas negras. Deixou-o contemplativo e lembrou-te do motivo de estar ali.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("—— Meu filho...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você segue em frente.\n",TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("Passando por uma floresta de folhas envoltas em chamas da cor vermelha, mas que não importava quanto tempo se passava, não extinguiam-se.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você encontra um rio —— mas não era um rio ordinário —— e sim um rio com água em chamas azuis, composto por peixes em chamas vermelhas nadando em sincronia.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você decide se ajoelhar à beiro do rio e pegar punhado em suas mãos dessa água em chamas. Ela não te queima.\n",TimeUnit.MILLISECONDS, temp_dialog);
						
				
		do {	
			
			System.out.println();
			System.out.println("Bebê-la?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			alternativa = entrada.next();
			switch (alternativa) {
			case "1": 
				Digita("Você a toma em uma sequência de três goles. Essa água encheo-o de energia.\n",TimeUnit.MILLISECONDS, temp_dialog);
				alternativaCerta = true;
				break;
			case "2":
				Digita("Você está receoso com o ambiente desconhecido e prefere a precaução e observar mais a situação.\n",TimeUnit.MILLISECONDS, temp_dialog);
				alternativaCerta = true;
				break;
			default:
				Digita("Lembre-se: 1 ou 2.\n",TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}
			
				
		} while (alternativaCerta != true);	
		alternativaCerta = false;
		
		Digita("Ainda ajoelhado, você olha para a água do riacho e começa a observar uma imagem formando-se.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Seria!? —— Você pensa.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Era a imagem do seu filho formando-se nas águas abrilhantadas do rio de chamas.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("É possível!? —— Você questiona-se ao ouvir levemente as vozes do seu filho.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Aos poucos, sem perceber, você vai se aproximando mais e mais da água. Até que você houve algo.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("—— 01000011 01010101 01001001 01000100 01000001 01000100 01001111\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Pareceu ser um grito —— mas você não conseguiu decifrar —— vindo do outro lado do riacho.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você olha para onde o barulho tinha saído e vê um velho.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ele tinha uma barba longa e branca, vestia-se com um manto preto, coberto levemente com as chamas negras.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("As beiradas próximo à perna e ao braço, contidos com as chamas azuis e, próximo ao peito, uma leve chama avermelhada.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("—— O que foi?! —— Você diz.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Ah...! Então você não se comunica na linguagem dos Iluminados.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você: Linguagem dos Iluminados...?\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você fala em tom baixo, se distraindo pensando nas vozes que tinha ouvido de seu filho.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Utilizando a linguagem Binários, utilizado pelos Iluminados, eu ter alertei para ter cuidado.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Você parece não ser daqui...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Essas chamas, apesar de serem belas e confortáveis, também são traiçoeiras.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Se você não tiver a vontade forte, essa energia vai começar a se alimentar de você.\n"	,TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Esse andar, é uma região farta de energia. Não precisamos nos alimentar de animais, nem de vegetais, apenas manter a harmonia com as chamas.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Há aqueles que ao entrar em contato com tamanha energia amedrontam-se e perdem sua sanidade.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Também há aqueles que enlouquecem pelo desejo de obter cada vez mais poder e vão ao Portões de Fogo, tentar subir ao próximo andar.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Eles acabam virando 'Hollows', pessoas que se tornaram vazias por dentro e por fora. Tiveram sua razão destruída ao, por um momento, duvidarem de si mesmas.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Até mesmo os animais não estão livres disso e podem virar monstros inimagináveis.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você: Portões de Fogo!? Passar por um portão? É só isso o necessário para subir para o próximo andar?!\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Você não me ouviu? Essas chamas o irão te transformar em Hollow!\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Você desconhece até as mesmo a linguagem dos Iluminados e quer passar pelos Portões de Fogo.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você: Não importa... eles levaram o meu filho e não há chama nenhuma que irá me parar.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Cuidado!!!\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Até mesmo as virtudes podem levar ao vício que destrói o caráter dos homens.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: As chamas sentirão no seu âmago quando isso acontecer e você estará condenado.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Tenha Prudência. Ela dispõe a razão para discernir em todas as circustâncias o verdadeiro bem e a escolher os justos meios para atingir...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Ela conduz a outras virtudes, indicando-lhes a regra e a medida.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você: Obrigado pelos conselhos, velho. Mas tenho que seguir adiante.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Espere!\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Aqui... pegue esse livro, ele te ajudará a entender a linguagem dos Iluminados.\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		
		do {
			System.out.println();
			System.out.println("1 - Pegar");
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				System.out.println("Você tem que seguir em frente... Pelo seu filho...");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;
		
		Digita("Você pega o livro e o observa de ponta a ponta.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("É um livro cheio de zeros (0) e uns (1). E também algumas palavras correlacionando essa linguagem com letras e números do mundo que Asulf conhecia.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Binários, a linguagem dos Iluminados, é uma linguagem que visa a Lógica das coisas. O sim e o Não. Verdadeiro ou Falso. Ligado ou Desligado. O tudo ou o Nada... \n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Algumas pessoas ao se aprofundarem tanto nessa lógica, acabaram por verem tudo dessa maneira...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Começaram a tratar, observar as pessoas como se elas não tivessem alma, fossem apenas um amontoado de uns (1) e zeros (0).\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Novamente... Tenha prudência.\n",TimeUnit.MILLISECONDS, temp_dialog);
	
		do {
			System.out.println();
			System.out.println("Pedir ajuda para entender a base do conceito da linguagem de Binários?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				Digita("Velho: Claro que te ajudarei! Percebo que sua causa é nobre.\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Velho: A linguagem Binário é um sistema de numeração posicional em que todas as quantidades se representam com base em dois números, zero e um (0 e 1).\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Velho: Para fazer uma 'tradução' dos números decimais para Binários, você precisará entender esse conceito:\n",TimeUnit.MILLISECONDS, temp_dialog);
				
				Digita("DECIMAL   |    BINÁRIO\n",TimeUnit.MILLISECONDS, ultra_Speed);
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
				Digita("Vamos pegar o exemplo do número 1110(2), onde esse 2 em parenteses representa a linguagem Binário.\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Para fazer a 'tradução' de 1110 (zero, um, um, um) na linguagem Binário para a Decimal, vamos fazer desse jeito:\n",TimeUnit.MILLISECONDS, temp_dialog);
				System.out.println();
				Digita("O primeiro número da direita à esquerda, você vai multiplicá-lo por 2 elevado a 0.\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("O segundo número da direita à esquerda, você vai multiplicá-lo por 2 elevado a 1.\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("O terceiro número da direita à esquerda, você vai multiplicá-lo por 2 elevado a 2.\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("O quarto número da direita à esquerda, você vai multiplicá-lo por 2 elevado a 3.\n",TimeUnit.MILLISECONDS, temp_dialog);
				System.out.println();
				Digita("E por último, você vai somar os resultados e terá um número na linguagem Decimal.\n",TimeUnit.MILLISECONDS, temp_dialog);
				
				Digita("Voltando ao número 1110(2), vamos deixá-lo desse jeito: -->  2⁰ * 0  +   2¹ * 1   +   2² * 1   +   2³ * 1  \n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Ficará desse jeito:                         -------------->     0    +      2     +       4    +       8   \n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("E somando-os teremos a linguagem Decimal:   --------------> = 14(10)\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Simples, não?\n",TimeUnit.MILLISECONDS, temp_dialog);
				
				do {
					System.out.println("1 - Continuar");
					alternativa = entrada.next();
					switch (alternativa) {
					case "1": 
						alternativaCerta = true;
						break;
					default:
						System.out.println("Você está ficando desesperado? O andar anda mexendo com a sua mente...");
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
				System.out.println("Os desafios já estão complicados aqui? Novamente... Escolha entre 1 ou 2. ");
				break;
			}
			
			
		} while (alternativaCerta != true);
		alternativaCerta = false;
		
		
		Digita("Você: Obrigado, velho... \n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você: desculpe-me, estou tão preocupado que esqueci os bons modos.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você: Eu sou Asulf, um guerreiro das terras de fora da torre. \n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Velho: Asulf?... talvez você seja a fator disruptivo que causará a queda dos velhos deuses... Prazer, eu sou Lógos.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você: Lógos... Eu guardarei seus conselhos na mente e seu livro como um rei guarda o seu tesouro.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você: Agora eu preciso ir... Adeus.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Lógos: Asulf... Os desafios na sua caminhada até os Portões de Fogo servirá para fortalecer sua mente. Não esqueça-os.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Lógos: Para passar dos Portões de Fogo você precisará manter sua razão, suportar os desvaneio da mente e do coração...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Lógos: conseguindo isso você terá um coração forte que não perde para nada. Sim, um coração mais quente que o fogo.\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println("1 - Continuar");
		do {
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				System.out.println("Não se esqueça da Sabedoria de Lógos... Escolha 1 para continuar.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;
		
		Digita("Você segue seu caminho pela floresta.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Aos poucos vai anoitecendo...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ao olhar ao céu, você não consegue acreditar, mas as estrelas... As estrelas eram chamas.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("As chamas vermelhas balançavam levemente, como se fossem velas.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("... A beleza da noite começa a te trazer emoções à tona.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("... Não seja consumido por elas.\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("Para combater que as chamas te consuma por meio de suas emoçãos, utilize a linguagem dos Iluminados para manter a Lógica.\n",TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println("");
		
		
		String opcaoCerta = "8"; //Essa String é a resposta certa.
		do {
			List<String> urna = Arrays.asList("8", "11", "14", "17", "20");
			
			Collections.shuffle(urna);
			
			System.out.println("Mantenha a razão: faça a traduçao de 1000(2) da linguagem dos Iluminados (Binários) para a sua linguagem (Decimal)");
			System.out.println("a) " + urna.get(0));
			System.out.println("b) " + urna.get(1));
			System.out.println("c) " + urna.get(2));
			System.out.println("d) " + urna.get(3));
			System.out.println("e) " + urna.get(4));
			System.out.println();
			System.out.print("Informe a opção da tradução dos deuses: ");
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
				System.out.println("Você perdeu chance à toa... Inútil...");
				System.out.println();
				break;	
				
			}
			
		} while (!alternativaCerta && contador < 3);
	
		
		if (alternativaCerta) {
			Digita("Você está aprendendo a linguagem dos Iluminados! Isso te fortalecerá para o desafio final.\n",TimeUnit.MILLISECONDS, temp_dialog);
		} else {
			Digita("Toda sua emoção começa a consumi-lo... Você tenta lembrar de seu filho... Mas não consegue...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("... Você se tornou Vazio...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Derrotado pelas próprias emoções... Deplorável...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Fim de jogo.\n",TimeUnit.MILLISECONDS, temp_dialog);
			
			System.exit(0);
		}
			alternativaCerta = false;
			contador = 0;
			
		Digita("Você conseguiu não perder a consciência às emoções.\n",TimeUnit.MILLISECONDS, temp_dialog);	
		
		System.out.println("1 - Seguir em frente");
		do {
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				System.out.println("Utilize a razão... Escolha 1 para continuar.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;
		
		Digita("Você continua adentrando a floresta das folhas em chamas.\n",TimeUnit.MILLISECONDS, temp_dialog);	
		Digita("Você pensa: Novamente... Aquela sensação...\n",TimeUnit.MILLISECONDS, temp_dialog);	
		Digita("Mantenha-se consciente a todo custo!\n",TimeUnit.MILLISECONDS, temp_dialog);	
		Digita("Foque em sua respiração...\n",TimeUnit.MILLISECONDS, temp_dialog);	
		Digita("Respire...\n",TimeUnit.MILLISECONDS, temp_dialog);	
		
			
		do {
			System.out.println();
			System.out.println("Não deixe o cansaço abalar seu espírito: Encontre a quantidade de respirações ideais para manter-se acordado.");
			System.out.println("Existe um número que somado com seu dobro é igual a 10100(2) adicionado a 1101(2). Esse será o número ideal para te manter acordado.");
			System.out.println("a) 8");
			System.out.println("b) 11");
			System.out.println("c) 14");
			System.out.println("d) 17");
			System.out.println("e) 20");
			System.out.print("Informe a quantidade de respiração ideal: ");
			alternativa = entrada.next();
			
			switch (alternativa.toLowerCase()) {
			case "a":
				contador++;
				System.out.println("Essa quantidade não irá te acalmar...");
				break;
			case "b":
				contador++;
				alternativaCerta = true;
				break;
			case "c":
				contador++;
				System.out.println("Essa quantidade não irá te acalmar...");
				break;
			case "d":
				contador++;
				System.out.println("Essa quantidade não irá te acalmar....");
				break;
			case "e":
				contador++;
				System.out.println("Essa quantidade não irá te acalmar....");
				break;
			default: 
				contador++;
				System.out.println("Respire...");
				break;
			}
				
		} while (!alternativaCerta && contador < 2);
		
		
		if (alternativaCerta) {
			Digita("Você respira 11 vezes consecutivamente e consegue se acalmar...\n",TimeUnit.MILLISECONDS, temp_dialog);
		} else {
			Digita("Você não encontra a respiração ideal...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("O teu corpo sente-se fraco...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("As chamas... as chamas... estão tomando a sua consciência...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Até caminhar sobre esse andar é muito para você... Deplorável...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Fim de jogo.\n",TimeUnit.MILLISECONDS, temp_dialog);
			System.exit(0);
		}
		
		alternativaCerta = false;
		contador = 0;	
	
		do {
			System.out.println();
			System.out.println("1 - Caminhar mantendo a sua respiração.");
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
		
		Digita("Você pensa: 'Até mesmo andar por aqui não é para os fracos de coração...'\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		
		do {
			System.out.println("1 - Eu consigo...");
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		
		Digita("Ao sair da floresta de folhas em chamas, você vê o que parece ser um prado com as mais diversas cores de chamas.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ao andar por esse prado, você se vê rodeado por pequenas chamas. Parece ser seres vivos cochichando algo.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você se espenta: 'O que é isso? Esses seres... essa quantidade de energia que está me rodeando...\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Os seres cochicham mais alto e chegam mais perto.\n",TimeUnit.MILLISECONDS, temp_dialog);;
		Digita("Você precisa escutá-los, senão a quantidade de energia que eles emanam irá te derrubar.\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		do {
			System.out.println();
			Digita("Pequenos seres de chamas: 'para time, /+-*%1110%*-+/, MCDXIV, para time, four team \n",TimeUnit.MILLISECONDS, ultra_Speed);
			Digita("Pequenos seres de chamas: 'for team, para time, MCDXIV, /+-*%1110%*-+/, XLI\n",TimeUnit.MILLISECONDS, ultra_Speed);
			Digita("Pequenos seres de chamas: 110111001, 10110000110...\n",TimeUnit.MILLISECONDS, ultra_Speed);
			System.out.println();
			Digita("Use o seu conhecimento para entender esses seres, senão estará acabado para ti.\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Entenda os Pequenos seres de chamas: qual número se assemelha mais ao que esses seres estão falando?\n",TimeUnit.MILLISECONDS, temp_dialog);
			System.out.println("a) 20");
			System.out.println("b) 11");
			System.out.println("c) 14");
			System.out.println("d) 17");
			System.out.println("e) 8"); 
			
			alternativa = entrada.next();
			
			switch (alternativa.toLowerCase()) {
			case "a":
				contador++;
				System.out.println("Utilize a sabedoria de Lógos para te ajudar.");
				break;
			case "b":
				contador++;
				System.out.println("Não deixe esse quantidade de energia te derrubar!");
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
				System.out.println("Lembre-se da língua dos Deuses, Binário...");
				break;
			}
			
		} while (alternativaCerta != true && contador < 2);
		
		if (alternativaCerta) {
			Digita("Você finalmente consegue entendê-los com clareza.\n",TimeUnit.MILLISECONDS, temp_dialog);
		} else {
			Digita("Não parecia que esses pequenos seres de chamas estavam querendo te prejudicar...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Mas você é tão fraco que não conseguiu nem se manter de pé ao se aproximarem...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Você perde o controle de sua respiração...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("... Filho...\n",TimeUnit.MILLISECONDS, temp_dialogSlow);
			Digita("Chamas negras começam a surgir de vocês...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Você não se lembra de mais nada...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Nem do seu próprio filho...\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Você se tornou um Hollow\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Desequilibrado pelas energias dos outros... Vergonhoso.\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Fim de Jogo.\n",TimeUnit.MILLISECONDS, temp_dialog);
			System.exit(0);
			
		}	
		alternativaCerta = false;
		contador = 0;	
		
		System.out.println();
		Digita("Ao aguentar a quantidade imensa de energia que os pequeninos emanavam, você entende o que eles estavam querendo te dizer.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Que mais à frente você encontraria um Monge que fazia parte da Ordem da Sabedoria e Sofrimento.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("O Monge estava corrompendo o local próximo dos Portões de Fogo, tomando para sim as energias corrompidas dos Hollows que ali habitavam.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Para seguir em frente, você precisaria aprender a manipular todas as chamas do lugar, principalmente as Chamas Negras.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você pensa: 'Por isso vocês apareceram, se eu não conseguisse nem suportar as energias que vocês emanavam por conta própria, eu não seria nem capaz de chegar perto do local.'\n",TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("=================|                          |=================\n", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("-----------------| Chamas Negras APRENDIDA  |-----------------\n", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("=================|                          |=================\n", TimeUnit.MILLISECONDS, ultra_Speed);
		System.out.println();
		chamasNegrasStatus = true; //Chamas Negras aparecerá no status

		Digita("Ao continuar o caminho pelo prado, você avista de longe os Portões de Fogo.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("E também, próximo aos Portões de Fogo, uma quantidade imensa de Hollows —— pessoas que não conseguiram passar pelos Portões.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("E lá estava ele, o Monge que o pequenos seres de chamas te avisaram que estava corrompendo o lugar.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ao te ver, ele pega uma quantidade maior ainda de Energia Negra dos Hollows e cria um Monstro terrível... Um Centopeia Corrompida!\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VENÇA A TODO CUSTO!!!!\n",TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		
		boolean vitoria = false; 		//Utilizado quando o Usuário vence do 'Computador' e sai do loop.         
		int hpMonstro = 500; //Vida do Monge Corrompido
		Random ataqueForca = new Random(); // Força do ataque dado por uma aleatoriedade.
		int dano = 0; //dano causado pelo ataque.
		int valor; //Valor gerado pela 'aleatoriedade'.

		do {
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Monge Corrompido");
			Digita(""+ hpUsuario + "" + " \uD83D\uDC99", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita(" " + hpMonstro + " \uD83D\uDDA4\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("       ESPECIAIS                     ");
			System.out.println("* Chamas Negras: " + chamasNegras + "/10");
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
						dano = ataqueForca.nextInt(10) + 20;
						hpMonstro = hpMonstro - dano;
						Digita("Fraco! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
					}
				} else if (valor == 1 || valor == 2 || valor == 3) {
					dano = ataqueForca.nextInt(10) + 30;
					hpMonstro = hpMonstro - dano;
					Digita("O seu ataque não foi tão eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (valor == 4) {
					dano = ataqueForca.nextInt(10) + 50;
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

						Digita("Monge usou Chamas Enérgicas dos Hollows! Dano " + dano, TimeUnit.MILLISECONDS,
								temp_dialog);
						System.out.println();

					} else if (valor == 10) {
						dano = ataqueForca.nextInt(10) + 20;
						hpUsuario = hpUsuario - dano;
						System.out.println();

						Digita("Monge usou Chamas Corrompidas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
						System.out.println();
					}
				}
				if (hpUsuario <= 0) {
					System.out.println();
					Digita("Até mesmo o Primeiro Andar é demais para você...\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Derrotado pelo Monge Corrompido... Ele utiliza o seu corpo morto para corromper os Portões de Fogo...\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Asulf torna-se uma marionete morta...\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Fim de jogo. \n", TimeUnit.MILLISECONDS, temp_dialog);

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
						Digita("CHAMAS NEGRAS! Dano CRÍTICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
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

						Digita("Centopeia Corrompida te ataca com força! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
						System.out.println();
						
					}
					
				}
				
				if (hpUsuario <= 0) {
					System.out.println();
					Digita("Até mesmo o Primeiro Andar é demais para você...\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Derrotado pelo Monge Corrompido... Ele utiliza o seu corpo morto para corromper os Portões de Fogo...\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Asulf torna-se uma marionete morta...\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Fim de jogo. \n", TimeUnit.MILLISECONDS, temp_dialog);

					System.exit(0);
				}
				System.out.println();
				break;
				
			default:
			}

		} while (vitoria == false);
		vitoria = false;

		System.out.println();
		Digita("Você vence o Monge Corrompido e sua Centopeia Monstruosa.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ao se aproximar do desafio final do andar, os Portões de Fogo, pensamentos negativos começam a vir à mente.\n",TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
			
		Digita("Vá embora!\n",TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("...",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita(" Seu filho está morto.\n",TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("...",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita(" Você fracassou.\n",TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("...",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita(" Como consegue ser tão inútil???\n",TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("...",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita(" Decepcionante...\n",TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("...",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita(" Você nunca irá aprender?????\n",TimeUnit.MILLISECONDS, temp_dialogFast);
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
		
		
		
		do {     //Opção de entrar ou não nos Portões de Fogo. 2 escolhas.

			Digita("Entrar nos Portões de Fogo?\n",TimeUnit.MILLISECONDS, temp_questions);
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			String opcao = entrada.next();
			
			switch (opcao) {
			case "1": 
				
				System.out.println();
				System.out.println();
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);
				Digita("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",TimeUnit.MILLISECONDS, ultra_Speed);
				System.out.print("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25  Portões de Fogo  ");
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
				System.out.println("                                         —————————————");
				
				alternativaCerta = true;
				break;
			case "2":
				Digita("Você tenta voltar — mas as chamas distantes que antes pareciam não queimar — agora fazem teu corpo todo arder.\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Você não sabe dizer se é uma dor física ou uma dor psicológica...\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Aos poucos a sua visão vai se esvanecendo...\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Existe um muro",TimeUnit.MILLISECONDS, temp_dialogFast);
				Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
				Digita("Existe um quarto escuro",TimeUnit.MILLISECONDS, temp_dialogFast);
				Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
				Digita("Tudo está vindo abaixo",TimeUnit.MILLISECONDS, temp_dialogFast);
				Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
				Digita("Reduzindo ao pó",TimeUnit.MILLISECONDS, temp_dialogFast);
				Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
				Digita("Os obstáculos são intransponíveis",TimeUnit.MILLISECONDS, temp_dialogFast);
				Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
				Digita("...",TimeUnit.MILLISECONDS, temp_dotsSlow);
				Digita(" Meu filho",TimeUnit.MILLISECONDS, temp_dialogSlow);
				Digita("...\n",TimeUnit.MILLISECONDS, temp_dotsSlow);
				Digita("Você fugiu de suas lutas... Lamentável\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Você fugiu de suas lutas... Lamentável\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("Fim de jogo.\n", TimeUnit.MILLISECONDS, temp_dialog);
				System.exit(0);
				break;
			default:
				System.out.println();
				System.out.println("Entenda... Você tem que escolher 1 ou 2.");
				break;
			}
		} while (alternativaCerta!= true);
		alternativaCerta = false;
		
		System.out.println("-----Jogue contra seus pensamentos-----");
		System.out.println("Corrida ao 20: somando 1 ou 2, alcance o 20 primeiro.");
		System.out.println("É você contra você.");
		System.out.println();
		System.out.println("Tomar a iniciativa?");
		System.out.println();
		int placar = 0; //Utilizado para ser o placar do Usuário.
		int placarDerrota = 0; //Utilizado para ser o placar do 'computador' caso o usuário perca.
		System.out.println("Placar: " + placar);
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		Random aleatoriedade = new Random(); //Utilizado para escolha aleatória do 'Computador' no começo do jogo.
		
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
					String resposta = entrada.next(); //Utilizado para pegar a entrada do usuário. Ou 1 ou 2.
					
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
							System.err.println("A provação foi demais para você...");
							System.exit(0);
						}
						
						if (placar == 10 || placar == 13 || placar == 16 || placar == 19) {
							placar = placar + 1;
							placarDerrota = placar;
							System.out.println("Escolha de suas pertubações quânticas: " + 1);
							System.out.println();
							System.out.println("-----------Placar--------------------= " + placar);
						} else if (placar == 12 || placar == 15 || placar == 18) {
							placar = placar + 2;
							placarDerrota = placar;
							System.out.println("Escolha de suas pertubações quânticas: " + 2);
							System.out.println();
							System.out.println("-----------Placar--------------------= " + placar);
						} else {
							a = aleatoriedade.nextInt(2) + 1;
							placar = placar + a;
							placarDerrota = placar;
							System.out.println("Escolha de suas pertubações quânticas: " + a);
							System.out.println();
							System.out.println("-----------Placar--------------------= " + placar);
						}
						if (placarDerrota == 20) {
							System.err.println();
							System.err.println("Você fracassou...");
							System.err.println("O que será de seu filho agora?");
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
							System.err.println("A provação foi demais para você...");
							System.exit(0);
						}
						
						if (placar == 10 || placar == 13 || placar == 16 || placar == 19) {
							placar = placar + 1;
							placarDerrota = placar;
							System.out.println("Escolha de suas pertubações quânticas: " + 1);
							System.out.println();
							System.out.println("-----------Placar--------------------= " + placar);
						} else if (placar == 12 || placar == 15 || placar == 18) {
							placar = placar + 2;
							placarDerrota = placar;
							System.out.println("Escolha de suas pertubações quânticas: " + 2);
							System.out.println();
							System.out.println("-----------Placar--------------------= " + placar);
						} else {
							a = aleatoriedade.nextInt(2) + 1;
							placar = placar + a;
							placarDerrota = placar;
							System.out.println("Escolha de suas pertubações quânticas: " + a);
							System.out.println();
							System.out.println("-----------Placar--------------------= " + placar);
						}
						if (placarDerrota == 20) {
							System.err.println();
							System.err.println("...");
							System.err.println("...Você fracassou... ");
							System.err.println("O que será de seu filho agora?");
						    System.exit(0);
						}
								
						break;
					default:
						System.out.println();
						System.out.println("Miss click? Acontece nas melhores famílias. Tente novamente. :)");
						break;
					}
					
				} while (!vitoria);
				
				break;
			case "2": //Se não tomar iniciativa, a "máquina" começa aqui.
				
				System.out.println("Somar 1 ou somar 2?");
				System.out.println();
				
				do {
					if (placar == 7 || placar == 10 || placar == 13 || placar == 16 || placar == 19) {
						placar = placar + 1;
						placarDerrota = placar;
						System.out.println();
						System.out.println("Escolha de suas pertubações quânticas: " + 1);
						
					} else if (placar == 6 || placar == 9 || placar == 12 || placar == 15 || placar == 18) {
						placar = placar + 2;
						placarDerrota = placar;
						System.out.println();
						System.out.println("Escolha de suas pertubações quânticas: " + 2);
						
					} else {
						a = aleatoriedade.nextInt(2) + 1;
						placar = placar + a;
						placarDerrota = placar;
						System.out.println();
						System.out.println("Escolha de suas pertubações quânticas: " + a);
		
					}
					
					
					if (placarDerrota == 20) {
						System.err.println("-----------Placar--------------------= " + placarDerrota);
						System.err.println("Você fracassou...");
						System.err.println();
						System.err.println("O que será de seu filho agora?");
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
							System.err.println("A provação foi demais para você...");
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
							System.err.println("A provação foi demais para você...");
							System.exit(0);
						}
								
						break;
					default:
						System.out.println();
						System.out.println("Miss click? Acontece nas melhores famílias. Tente novamente.");
						boolean erro = true; //A variável 'erro' será verdadeira se o Usuário não usar as opções certas, ou seja, 1 e 2.
						do {	//Para o usuário que errar a tecla durante o jogo, após ter escolhido não tomar a iniciativa.
								//É necessário para o "computador" não fazer a sua jogada e somar ao 'placar'. 
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
									System.err.println("A provação foi demais para você...");
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
									System.err.println("A provação foi demais para você...");
									System.exit(0);
								}
								break;
							default: 
								erro = true;
								System.out.println();
								System.out.println("Miss click? Acontece nas melhores famílias. Tente novamente.");
								break;
								
							}
						} while (erro == true);
						
						break;
					}
					
				} while (!vitoria);
				
				
				break;
			default: 
				System.out.println("Ainda não entendeu como funciona? Talvez você não esteja pronto para esse desafio...");
				System.out.println("Mais uma vez: escolha 1 ou 2.");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
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
				+ "__________s$$$$³______.s$__ \n"
				+ "_____,____$$$$$.______s$³__ \n"
				+ "_____$___$$$$$$s_____s$³___\n"
				+ "____s$___³$$$$$$$s___$$$\n"
				+ "____$$____³$$$$$$s.__³$$s\n"
				+ "_____³$.____³$$$$$$$s_.s$$$\n"
				+ "____`$$.____³$$$$$$$_$$$$\n"
				+ "_____³$$s____³$$$$$$s$$$³\n"
				+ "______³$$s____$$$$$s$$$$`\n"
				+ "___s.__$$$$___s$$$$$$$$³_.s\n"
				+ "___$$_s$$$$..s$$$$$$$$$$$$$ ³\n"
				+ "___s$.s$$$$s$$$$$$$$$$$$$$$ \n"
				+ "__s$$$$$$$$$$$$$$$$$$$$$$$\n"
				+ "_s$$ssss$$$$$$$$$$ssss$$$s\n"
				+ "$s§§§§§§§§§s$$$$s§§§§§§§§§\n"
				+ "³§§§§§§§§§§§§s$s§§§§§§§§§§§\n"
				+ "§§§§§§§§§§§§§§s§§§§§§§§§§§§\n"
				+ "³§§§§§§§§§§§§§§§§§§§§§§§§§§\n"
				+ "_³§§§§§§§§§§§§§§§§§§§§§§§§³\n"
				+ "__³§§§§§§§§§§§§§§§§§§§§§§³\n"
				+ "___³§§§§§§§§§§§§§§§§§§§§³\n"
				+ "_____³§§§§§§§§§§§§§§§§³\n"
				+ "_______³§§§§§§§§§§§§³\n"
				+ "_________³§§§§§§§§³\n"
				+ "____________³§§§§³\n"
				+ "______________³§³\n",TimeUnit.MILLISECONDS, ultra_Speed);
		
		
		
		Digita("Próximo... Próximo de meu filho...!!\n",TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dotsSlow);
		Digita("Há quartos que não devemos entrar",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("...",TimeUnit.MILLISECONDS, temp_dots);
		Digita("Ira",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("...",TimeUnit.MILLISECONDS, temp_dots);
		Digita("Medo",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("qualquer paixão que leve a mente à 'possessão' que desintegra os homens na guerra",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("O hábito será o meu campeão",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("Quando treinamos a mente a pensar de uma maneira",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("...",TimeUnit.MILLISECONDS, temp_dots);
		Digita(" quando recusamos deixá-la pensar de outra maneira",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("...",TimeUnit.MILLISECONDS, temp_dots);
		Digita(" e de uma única maneira",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("...\n",TimeUnit.MILLISECONDS, temp_dots);
		Digita("...",TimeUnit.MILLISECONDS, temp_dots);
		Digita(" produzimos uma grande força em combate.\n",TimeUnit.MILLISECONDS, temp_dialog);

		boolean alternativaVoltar = false; //criada para 'voltar' o menu.
		
		do {
			imprimirMenuStatus(chamasNegrasStatus, elixirDaVidaStatus, sabedoriaDeOdinStatus); //vai imprimir o Status contendo HP e Especiais
			
			System.out.println("1 - Continuar para o Capítulo 5: 2º Andar — Compaixão na Cidade dos Leviatãs");
			System.out.println("2 - Descrição dos Ataques");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":				
				alternativaCerta = true;
				break;	
			case "2": 
				
				do {
					descricaoDosAtaquesStatus(chamasNegrasStatus, elixirDaVidaStatus, sabedoriaDeOdinStatus);
					System.out.println();
					System.out.println("X - Voltar");
					alternativa = entrada.next();				
					switch (alternativa.toLowerCase()) {
					case "x":
						alternativaVoltar = true; //utilizado para 'Voltar' o menu.
						break;
					default:
						break;
					}
				} while (alternativaVoltar == false);
				
				break;
			default:
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
	
		capitulo5();
		
		
		
		
		
		
		

	}
	
	public static void capitulo5() throws InterruptedException {
		System.out.println();
		System.out.println("Capítulo 5: 2º Andar — Compaixão na Cidade dos Leviatãs");
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
		Digita("	— Tudo bem... Estamos progredindo! — Asulf fala para si mesmo e sobe as escadas e \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mais uma vez bate o rosto em algo. Uma porta! Asulf tateia sua nova saída, louco \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para sair desta escuridão e achar algumas respostas sobre o lugar. Quando \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("finalmente encontra o puxador da porta e faz força para abri-la, ela simplesmente não se mexe. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Mas que diabos? — Asulf fala, enquanto empenha mais força para abrir a porta, sem sucesso. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A sensação é que existe algo atrás desta porta, algo que empurra para dentro da sala, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mas alguma coisa invisível no ambiente impede que esta força externa invada o cômodo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Depois de tentar puxar várias vezes a porta, um símbolo escarlate aparece em seu centro. \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("	一 Filhos da puta! 一 berra e reconhece o símbolo, ele estava estampado em algumas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("peças de roupa dos lacaios do monge de branco! Aquele maldito passou por aqui e\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("trancou a passagem para que ninguém conseguisse segui-los.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Será que ele sabe que estou atrás dele? 一 pensa, mas logo deixa este pensamento de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("lado e foca em uma coisa: precisa destruir o selo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		//Parte Jorge
		
		/**
         * 62631 decimal == 172247 octal//F4A7 hexadecimal == 62631 decimal
         * 0111100101000111100 == 745074 octal
         */
		
        Random aleatorio = new Random();
        String porta1, porta2;
        String porta3;
        String opcaoPorta;
        int contadorPorta = 0;
        int cc = 0;
        boolean respostaTrue = false, portaTrue = false;
        String respostaPorta;
        int dado;

        
        Digita("Você se cansa disso, seus novos poderes não são inatos e para acessá-los você precisa \n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("querer “ativar” eles. Lembre-se que junto com a sua força, você também adquiriu forma de desativar magias.\n", TimeUnit.MILLISECONDS, temp_dialog);     
        
        
        System.out.println();
        System.out.println("Para conseguir abrir a porta de uma só vez, você precisa mostrar que sabe desativar a magia da porta.");
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
			System.out.println();
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
				System.out.println("A indecisão pode te custar caro... Escolha ou 1 ou 2 ou 3. ");
				System.out.println();
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
			System.out.println();
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
					System.out.println("Resposta certa!");
					respostaTrue = true;

				} else {
					System.out.println("Resposta errada!");
					cc++;
				}
				break;
			case "745074":
				if (urna.get(dado).equals(porta3)) {
					System.out.println("Resposta certa!");
					respostaTrue = true;

				} else {
					System.out.println("Resposta errada!");
					cc++;
				}
				break;
			default:
				System.out.println("Resposta errada!");
				cc++;
			}
			if (cc == 3) {
				System.out.println("Você errou demais!");
				System.out.println("Fim de jogo!");
				System.exit(0);
			}
		} while (!respostaTrue || cc == 3);

		if (respostaTrue) {
			System.out.println("Você desativou a magia perfeitamente!");
		}
                System.out.println();
                Digita("	Asulf se concentra e busca em seu âmago toda força que seu pacto lhe conferiu e \n", TimeUnit.MILLISECONDS, temp_dialog);
                Digita("puxou a porta de uma só vez. Assim, destruindo a porta. A água começa a jorrar no \n", TimeUnit.MILLISECONDS, temp_dialog);
                Digita("ambiente. O resto de oxigênio abandona a sala e corre em direção à superfície. A \n", TimeUnit.MILLISECONDS, temp_dialog);
                Digita("água rapidamente inunda a sala e você logo se encontra submerso. \n", TimeUnit.MILLISECONDS, temp_dialog);
                
                
   
		
		Digita("\n", TimeUnit.MILLISECONDS, temp_dialog);

		//FIM PARTE JORGE
		
		
		
		
		
		Digita("	Um bolsão de ar? — pensa, pego desprevenido pelo novo problema. Asulf nada para \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("fora da sala e finalmente enxerga a luz, ela vem de uma janela da casa submersa e ele \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nada em direção a fonte de luz, atravessando a janela percebe que não é somente a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("casa que está alagada, mas toda a rua! Ele olha para cima e nota que a água está a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mais de dezoito andares acima. Merda! Onde que eu tô? — pensa e começa a subir \n", TimeUnit.MILLISECONDS, temp_dialog);
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
		Digita("	Uma corrente de água fortíssima o arremessa para cima com tanta velocidade \n", TimeUnit.MILLISECONDS, temp_dialog);
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
		Digita("	— Pelos deuses — fala estarrecido. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Saindo da água vê uma arraia do mar, a primeira imagem que vê desta criatura \n", TimeUnit.MILLISECONDS, temp_dialog);
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
		Digita("enquanto olha maravilhado. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Saindo do torpor de ver a criatura, Asuf nota que boa parte da montanha que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("protegia o castelo continua fora d’água, seu topo é apenas uma rocha gigantesca, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mas ao menos é seco e pode pensar melhor sem se preocupar em passar uma noite \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com água até o pescoço e nem com outros predadores que possam estar escondidos \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("debaixo d’água. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Pelos seus cálculos a montanha deve estar a cerca de quatro quilômetros de \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("distância da onde está e com a sua força provavelmente conseguirá chegar em uma \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("hora de nado até a margem. Asulf se vira de costas para a criatura e começa a nadar \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para a montanha. Chegando próximo a ela mais uma coisa te surpreende, em sua \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("margem, tem uma criança acenando para você. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Chegando até a margem da montanha a criança se aproxima de e começa a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("puxar seu braço. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Senhor, por favor, eu preciso da ajuda! — Ele fala enquanto puxa seu braço, mal te \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dando tempo de ficar em pé direito. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Calma, garoto, o que está acontecendo? — Asulf pergunta confuso — O que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("aconteceu com essa cidade? Como você sobreviveu? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— A cidade já tá assim há muito tempo, ela já estava assim quando nasci — ele fala, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("como se uma cidade inteira inundada não fosse nada de mais. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf pisa firme no chão e não deixa mais a criança o levar a lugar nenhum. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Espera, garoto! Mas como consegue sobreviver aqui sozinho? — pergunta \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("desconfiado que possa ser uma armadilha. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Onde estão seus pais? O que está acontecendo? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O garoto olha para você com a típica impaciência que só as crianças possuem. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu não sei! — ele grita com impaciência — Eu nem tava vivo quando a cidade foi \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("inundada — ele continua — Meu papai falou que foi alguma briga entre uns deuses \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que estavam zangados. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Calma, como assim? — pergunta confuso. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Vamos moço, eu preciso de ajuda. Meu pai vai conseguir te explicar direito! — a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("criança fala impaciente — Mas agora eu preciso de ajuda! — o menino berra \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("impaciente. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Seu moleque! — Asulf berra de volta consternado com a audácia da criança — \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Onde estão os seus pais? Por que não pede ajuda para eles? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(	"	— PORQUE SÃO ELES QUE PRECISAM DE AJUDA! — ele berra de volta mais uma vez \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("e você fica sem reação. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Será que agora pode parar de reclamar e me ajudar? — ele pergunta, desta vez \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mantendo um pouco mais a compostura. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf respira fundo e diz — Tudo bem, me leve até eles. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A criança te guia pela montanha, que a distância parecia apenas o topo \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("rochoso de uma montanha castigada pelo mar que impede qualquer vegetação e a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("vida animal de prosperar sobre o seu solo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Mas, na verdade, possui uma pequena caverna próxima a sua costa. Os dois \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("adentram a caverna e seguem por uma sequência de túneis que os levam montanha \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para baixo. Asulf nota que os túneis não são naturais, é possível sentir um leve \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("aroma de magia no ar como se alguém houvesse escavado a montanha com magia \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pura. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Meu avô escavou esses túneis — a criança fala enquanto lidera o caminho. Sem \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ele provavelmente você se perderia entre os diversos caminhos que existem dentro \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("deste labirinto escondido. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Ele fez isso para se proteger da inundação? — Asulf pergunta intrigado. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Não, não — a criança esboça um pequeno sorriso — Ele era um tipo de mago \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("malvado no tempo dele, então ele fez estes túneis aqui em cima para ficar protegido \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dos soldados do rei. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— E por acaso seu avô ainda está por aqui? — pergunta com um tom de \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("preocupação. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Meu pai me disse que ele morreu quando eu era um bebê, ele disse que antes das \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("arraias chegarem, tinha um bicho muito malvado nas águas. Ele falou que o monstro \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("passava horas acertando a montanha. Como se ele estivesse atrás de nós! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(	"— Será que não poderia estar atrás do seu avô? — o mais velho fala, \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("surpreendentemente intrigado com a história do pequeno. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu pensava isso também, mas o papai me garantiu que não. Sabe, não foi só a \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("minha família que sobreviveu à inundação. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Não foi? \n", TimeUnit.MILLISECONDS, temp_dialog);








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
		Digita("	— Samkennd tossiu arduamente — Não conheço este tal lugar de Volstalir, da onde é? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— É um pouco complicado para explicar — responde o mesmo com calma — Seu \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("filho me disse que você precisa de ajuda. Meu tempo é curto, pode me dizer o que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("aconteceu? — questiona Asulf rapidamente. \n", TimeUnit.MILLISECONDS, temp_dialog);
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
		Digita(	"	— Um homem? Um monge? — o velho guerreiro pergunta. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Sim! Este homem arrancou o coração do monstro com as próprias mãos- \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Samkennd fala com o olhar abismado — eu nunca vi nada parecido com isso. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Depois suas asseclas me arrastaram para fora da água. Eu implorei para ele me levar \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("até a minha casa e me ajudar, meu braço doía muito… mas ele me disse que já havia me \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ajudado bastante e me pediu para eu mostrar o caminho para o próximo mundo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— E você mostrou esse caminho? — Asulf perguntou visivelmente preocupado. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Por um lado é animador que este homem saiba o caminho de para o próximo mundo, mas é \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("revoltante saber que ele ajudou aquele maldito monge. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu falei para ele onde o portal fica, expliquei todo o caminho para ele, mas que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("somente eu poderia abrir o portal. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Ele estava com um jovem? - Asulf perguntou preocupado — esse monstro levou o \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("meu filho! Você o viu com ele? \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("	O homem se mostra confuso. \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("	— Desculpe-me... mas as únicas pessoas que estavam com ele, eram estes homens \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("vestidos de vermelho... uma coruja... \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("	Impossível \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Isso é impossível!!! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O que esse maldito fez com o meu filho... \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("	O ódio consome o seu ser, Antom pode estar morto. Será que o monge não viu mais \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("potencial nele e simplesmente o matou e o largou pelo caminho? \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("Se ele tiver feito isso, Asulf caminhará por cada inferno, fará pactos com cada deus e \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("demônio e matará que estiver no seu caminho para arrancar o coração deste monstro maldito. \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("	— Onde esse monstro está? — o ódio é perceptível em suas palavras \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("	— Ele já passou pelo portal — Samkennd fala temeroso pela sua mudança de postura \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— ele usou alguma magia de sangue para abrir uma fenda entre os mundos... ele usou os \n	", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("próprios sacerdotes para abrir o portal… \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("	Você agarra o homem pelo pescoço e o levanta. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Onde está  o portal? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Não por favor! — o homem implora \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("	Você aperta mais forte o pescoço dele. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— ONDE ESTÁ O MALDITO PORTAL? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— SOLTA O MEU PAI! \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("	O menino corre em sua direção com uma pequena faca que ele tirou do bolso. Ele vem em \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("sua direção e com um tapa você arremessa ele contra a parede. Você ainda não se acostumou com a sua nova força. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A criança acerta a parede com força e cai no chão desmaiada. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Sune! — o pai grita com lágrimas nos olhos, impossibilitado de ajudar o próprio \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("filho contra o monstro que está apertando o seu pescoço. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você olha para a criança e nota sangue escorrendo de sua cabeça. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Merda... merda — você solta o homem e corre em direção a criança - me \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("desculpe, me desculpe! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Sune está com um pequeno corte na cabeça, mas está com as pupilas normais e com bons \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("batimentos cardíacos. Você rapidamente faz um curativo no machucado e o carrega para \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("colocá-lo na cama de seu pai. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	É difícil lutar contra a sensação ruim de saber que aquilo que fizeram com você meses \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("atrás, você fez com outra família indefesa, uma família que não tem culpa de nada do que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("você passou. Você machucou essa família, você foi o monstro deles. \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("	— Me desculpe, senhor — você entrega a criança no colo do pai —  eu vou te ajudar, \n", TimeUnit.MILLISECONDS, temp_dialog);
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

		Digita("	— Apenas me diga o que devo fazer. \n", TimeUnit.MILLISECONDS, temp_dialog);
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
		System.out.println();
		System.out.println();
		
		String result;
		int tentativa = 0, pass = 0;
		boolean ok = false;
			
		do {
			
			System.out.println("Vá até a mesa de alquimia para descobrir o antídoto antes que o veneno faça efeito! Depressa!");
			System.out.println("É preciso solucionar a equação para encontrar a mistura exata dos ingredientes! ");
			System.out.println("Misture o pó de silício com as pepitas de ouro e hidróxido de cálcio!");
			System.out.println();
			
		List<String> urna2 = Arrays.asList("19", "21", "6", "23", "12");
			
		Collections.shuffle(urna2);
		
		String certo = "21";
		
		System.out.println("Qual o resultado da equação: ");
		System.out.println();
		System.out.println("10y - 5 (1 + y) = 3 (2y - 2) - 20");
		System.out.println();
		System.out.println("(A)" + urna2.get(0));
		System.out.println("(B)" + urna2.get(1));
		System.out.println("(C)" + urna2.get(2));
		System.out.println("(D)" + urna2.get(3));
		System.out.println("(E)" + urna2.get(4));
		System.out.println();
		System.out.println("Digite a alternativa correta: ");
		result = entrada.next();
		
		switch (result.toLowerCase()) {
		
		case "a":
			tentativa++;
			if (urna2.get(0).equals(certo)) {
				ok = true;
			} else {
				
				System.out.println("Mistura incorreta! A cor não coincide com a esperada.");
				System.out.println("*-------------------------------*");
			} break;
			
		case "b":
			tentativa++;
			if (urna2.get(1).equals(certo)) {
				ok = true;
			} else {
				
				System.out.println("Mistura incorreta! Não deve acontecer uma pequena explosão.");
				System.out.println("*-------------------------------*");
			} break;
			
		case "c":
			tentativa++;
			if (urna2.get(2).equals(certo)) {
				ok = true;
			} else {
				
				System.out.println("Mistura incorreta! A fórmula certa não possui névoa roxa.");
				System.out.println("*-------------------------------*");
			} break;
			
		case "d":
			tentativa++;
			if (urna2.get(3).equals(certo)) {
				ok = true;
			} else {
				
				System.out.println("Mistura incorreta! Talvez te transforme em um sapo.");
				System.out.println("*-------------------------------*");
			} break;
			
		case "e":
			tentativa++;
			if (urna2.get(4).equals(certo)) {
				ok = true;
			} else {
				
				System.out.println("Mistura incorreta! Não é normal sair faíscas.");
				System.out.println("*-------------------------------*");
			} break;
		
		default:
			System.out.println("Operação inválida!");
			System.out.println("*-------------------------------*");
		}
		
		} while (!ok && tentativa < 3);
		
		if (ok) {
			pass++;	
			System.out.println("Resposta correta! Você acertou as medidas exatas da fórmula!");
		} else {
			System.out.println("Resposta incorreta nas 3 tentativas");
		}
		
		tentativa = 0;
		ok = false;
		System.out.println();
		System.out.println("Os iluministas não usam a mesma língua e sistema númeral que nós. ");
		System.out.println("Faça a converção para saber qual é o frasco com reagente certo!");
		do {
			
			List<String> urna2 = Arrays.asList("1 0100", "1 1010", "1 0000", "1 0101", "1 0010");
			
			Collections.shuffle(urna2);
			
			String certo = "1 0101";
			
			System.out.println("Converta o número de y para saber qual reagente correto: ");
			System.out.println();
			System.out.println("y = 21");
			System.out.println();
			System.out.println("(A)" + urna2.get(0));
			System.out.println("(B)" + urna2.get(1));
			System.out.println("(C)" + urna2.get(2));
			System.out.println("(D)" + urna2.get(3));
			System.out.println("(E)" + urna2.get(4));
			System.out.println();
			System.out.println("Digite a alternativa correta: ");
			result = entrada.next();
			
			switch (result.toLowerCase()) {
			
			case "a":
				tentativa++;
				if (urna2.get(0).equals(certo)) {
					ok = true;
				} else {
				
					System.out.println("Reagente incorreto! Este não é o aspecto correto");
					System.out.println("*-------------------------------*");
				} break;
				
			case "b":
				tentativa++;
				if (urna2.get(1).equals(certo)) {
					ok = true;
				} else {
				
					System.out.println("Reagente incorreto! A cor não bate com a certa");
					System.out.println("*-------------------------------*");
				} break;
				
			case "c":
				tentativa++;
				if (urna2.get(2).equals(certo)) {
					ok = true;
				} else {
					
					System.out.println("Reagente incorreto! A quantidade é menor do que desejada");
					System.out.println("*-------------------------------*");
				} break;
				
			case "d":
				tentativa++;
				if (urna2.get(3).equals(certo)) {
					ok = true;
				} else {
					
					System.out.println("Reagente incorreto! O correto não possui partes de animais na composição");
					System.out.println("*-------------------------------*");
				} break;
				
			case "e":
				tentativa++;
				if (urna2.get(4).equals(certo)) {
					ok = true;
				} else {
				
					System.out.println("Reagente incorreto! O cheiro deste não me parece muito bom");
					System.out.println("*-------------------------------*");
				} break;
			
			default:
				System.out.println("Operação inválida!");
			}
			
			} while (!ok && tentativa < 3);
		
		if (ok) {
			pass++;	
			System.out.println("Resposta correta!");
		} else {
			System.out.println("Resposta incorreta nas 3 tentativas");
		}
		
		tentativa = 0;
		ok = false;
		System.out.println();
		System.out.println("Ótimo... Ótimo... Agora é preciso que você descubra a dosagem exata do antídoto.");
		System.out.println();
		
		do {
			
			List<String> urna2 = Arrays.asList("4,5", "5", "4,4", "4", "6");
			
			Collections.shuffle(urna2);
			
			String certo = "4,5";
			
			System.out.println("Extraia a raiz quadrada do número para saber a dosagem correta: ");
			System.out.println();
			System.out.println("21");
			System.out.println();
			System.out.println("(A)" + urna2.get(0));
			System.out.println("(B)" + urna2.get(1));
			System.out.println("(C)" + urna2.get(2));
			System.out.println("(D)" + urna2.get(3));
			System.out.println("(E)" + urna2.get(4));
			System.out.println();
			System.out.println("Digite a alternativa correta: ");
			result = entrada.next();
			
			switch (result.toLowerCase()) {
			
			case "a":
				tentativa++;
				if (urna2.get(0).equals(certo)) {
					ok = true;
				} else {
				
					System.out.println("Resposta incorreta!");
					System.out.println("*-------------------------------*");
				} break;
				
			case "b":
				tentativa++;
				if (urna2.get(1).equals(certo)) {
					ok = true;
				} else {
					
					System.out.println("Resposta incorreta!");
					System.out.println("*-------------------------------*");
				} break;
				
			case "c":
				tentativa++;
				if (urna2.get(2).equals(certo)) {
					ok = true;
				} else {
					
					System.out.println("Resposta incorreta!");
					System.out.println("*-------------------------------*");
				} break;
				
			case "d":
				tentativa++;
				if (urna2.get(3).equals(certo)) {
					ok = true;
				} else {
				
					System.out.println("Resposta incorreta!");
					System.out.println("*-------------------------------*");
				} break;
				
			case "e":
				tentativa++;
				if (urna2.get(4).equals(certo)) {
					ok = true;
				} else {
			
					System.out.println("Resposta incorreta!");
					System.out.println("*-------------------------------*");
				} break;
			
			default:
				System.out.println("Operação inválida!");
			}
			
			} while (!ok && tentativa < 3);

			if (ok) {
				pass++;	
				System.out.println();
				System.out.println("Resposta correta!");
				System.out.println();
				System.out.println("Parabéns! Você conseguiu formular o antídoto!");
			} else {
				System.out.println("Você fracassou!");
			}
		System.out.println(pass);
		System.out.println();

		System.out.println();
		Digita("=================|                          |=================\n", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("-----------------| Elixir da Vida APRENDIDA |-----------------\n", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("=================|                          |=================\n", TimeUnit.MILLISECONDS, ultra_Speed);
		System.out.println();
		chamasNegrasStatus = true; //Chamas Negras aparecerá no status
		elixirDaVidaStatus = true; //Elixir da Vida aparecerá no status

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
		Digita("de um cajado. \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("	Você tenta ajudá-lo, mas ele afasta a sua mão com força. \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita(" 	— Não tente agir como se nada tivesse acontecido!  — esbraveja  —  você me \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ajudou a me recuperar e agora eu te ajudo a sair daqui. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Tudo bem, tudo bem — o guerreiro fala envergonhado. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("A dupla caminha pelos túneis da montanha e chegam em um caminho que termina em um \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("buraco com pouco mais de 3 metros de largura e extremamente profundo, tão profundo que \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("não é possível de se ver o fundo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Mostre o seu pescoço  —  Samkennd pede. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	O guerreiro o faz sem questionar. \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("	— Se meu pai estivesse aqui, com certeza arrancaria a sua pele só por encostar em \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("alguém da família dele — ele fala enquanto desenha um símbolo com tinta em seu pescoço \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mas infelizmente eu não sou um mago tão bom quanto ele era e nas minhas condições, não \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("consigo lidar com alguém que fez um pacto como o seu. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Como você sabe? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("O homem ri \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Você fede a trevas, qualquer pessoa mais sensitiva sabe que você mexeu com o \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que não deveria. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu fiz o que era necessário, sem esse pacto eu não tenho chance nenhuma \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("contra o monge, você sabe do poder dele, você viu o que ele está disposto a fazer para \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("chegar aonde ele quer!", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("	— Sim eu vi, mas saiba que seja lá o deus que você fez pacto, ele não vai deixar \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("barato essa sua chance de vingança, deuses das trevas não são muito conhecidos por \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("manterem as suas promessas. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Quando este momento chegar eu penso no que fazer — Asulf fala cortando o \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("assunto — já acabou o encantamento? \n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("	— Pelos deuses como você é impaciente, cale a boca e me deixe concentrar — o \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mago fala e logo em seguida começa a recitar versos antigos de uma magia que parece vir \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de deuses antigos de outra realidade. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("A marca feita em seu corpo começa a brilhar em tons de azul. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Está feito, pode pular. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf olha para o buraco sem fundo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Você tem certeza que isto vai dar certo? — o guerreiro pergunta receoso. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu não sou tão bom quanto meu pai, mas ele fez questão de me ensinar como \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("abrir o portal, é uma função passada de geração a geração, pode ter certeza que vai dar \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("certo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Mas você parece estar fraco ainda. \n", TimeUnit.MILLISECONDS, temp_dialog);		
		Digita("	— Se pular e não der certo, você morre na queda, se não pular você fica aqui e \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("morre de velhice sem saber se seu filho está bem ou não, fica a sua escolha. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Samkennd fala dando meia volta e caminhando em direção a sua casa. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu não queria ter feito aquilo Samkennd, me desculpe, eu perdi o controle. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Vá logo homem, saia do meu reino e vá encontrar o seu filho logo — o mago fala \n", TimeUnit.MILLISECONDS, temp_dialog);		
		Digita("sem parar de caminhar. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Fala para o seu filho que você me matou, ele vai gostar de pensar que o pai dele \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("me matou. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Se o feitiço não der certo, eu vou ter matado mesmo. — o mago fala e continua \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("caminhando até virar uma uma esquina da caverna e não poder ser mais visto. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf ri e olha em direção ao buraco \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— É melhor você estar vivo Anton, seu pai está fazendo muita coisa errada para \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("conseguir te encontrar. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Sem hesitar mais, o guerreiro pula em direção ao desconhecido. \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		//FINAL DO CAPÍTULO 5
		
		boolean alternativaCerta = false;
		boolean alternativaVoltar = false; //criada para 'voltar' o menu.
		String alternativa;
		
		do {
			imprimirMenuStatus(chamasNegrasStatus, elixirDaVidaStatus, sabedoriaDeOdinStatus); //vai imprimir o Status contendo HP e Especiais
			
			System.out.println("1 - Continuar para o Capítulo 6: 3º Andar — Anjos Caídos");
			System.out.println("2 - Descrição dos Ataques");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":				
				alternativaCerta = true;
				break;	
			case "2": 
				
				do {
					descricaoDosAtaquesStatus(chamasNegrasStatus, elixirDaVidaStatus, sabedoriaDeOdinStatus);
					System.out.println();
					System.out.println("X - Voltar");
					alternativa = entrada.next();				
					switch (alternativa.toLowerCase()) {
					case "x":
						alternativaVoltar = true; //utilizado para 'Voltar' o menu.
						break;
					default:
						break;
					}
				} while (alternativaVoltar == false);
				
				break;
			default:
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		
		capitulo6();
		
	}
	
	public static void capitulo6() throws InterruptedException {
		System.out.println();
		System.out.println("Capítulo 6: 3º Andar — Anjos Caídos");
		
		int cont = 0; //contador
		boolean resp1v = false; //resposta certa
		String resp1 = "2021", ex1;   //resposta do desafio
		String alternativa; //escolha do jogador
		boolean alternativaCerta = false; //para quando acertar a resposta
		
		
		//CONEXÃO DO ANDAR ANTERIOR
		
		Digita("	Asulf cai cada vez mais rápido em direção a escuridão da caverna, o vento\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("zombe em seus ouvidos e seus olhos lacrimejam pelo contato com o vento da queda.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Aos poucos, uma luz azul e roxa começa a se formar ao seu redor. Seu corpo começa\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("a ficar cada vez mais dormente, até que a escuridão cessa.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Cego pelas luzes azuis arroxeadas, você é mais uma vez arremessado. Este\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("portal, acessado por uma queda, sai em um plano horizontal, impedindo-te de acertar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("o chão diretamente, fazendo você rolar pelo chão de pedras.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ao se levantar o guerreiro olha ao redor. O ambiente consiste em uma caverna\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com um corredor extremamente amplo, composto por pedras ametistas. O único\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("caminho possível é para frente.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Quase lá Anton, eu estou chegando!\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		
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
				System.out.println("1 - Entrar");
				break;
			}

		} while (alternativaCerta != true);
		alternativaCerta = false;
		System.out.println();

		Digita("	Após alguns metros de caminhada você olha para trás e percebe que não há mais a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("entrada que você passou.\n", TimeUnit.MILLISECONDS, temp_dialog);
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
		
		
		
		Digita("	\n", TimeUnit.MILLISECONDS, temp_dialog);
	
		Digita("	Após alguns metros de caminhada você olha para trás e percebe que não há\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mais a entrada em que passou. Ao continuar o caminho estreito da caverna, Asulf vê\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("uma luz roxa brilhante mais à frente.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— “Talvez seja a saída — ele pensa.”.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Entrando onde essa luz roxa brilhava, ele se depara com o que parece ser uma sala\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("oval, formada por uma mistura de pedras ametistas e mármore lapidado. Este ambiente não\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("é mais apenas uma caverna. Ele é uma estrutura arquitetônica feita pelas mãos de algum\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homem ou deus. À sua volta é possível ver oito colunas, dispostas uniformemente nos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cantos da sala oval. As colunas seguem por cinco metros até o seu teto abobadado. Não\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("existem outras portas ou saídas.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Tá, e agora?  — o soldado indaga.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	A sala possui corpos espalhados pelo chão, os mantos dos homens feridos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("denunciam quem eles eram. Os seguidores do monge mais uma vez foram usados\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("como oferenda. Este monstro abre caminho entre as dimensões simplesmente\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("sacrificando os seus homens, se eles não fossem parte da Ordem da Sabedoria do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Sofrimento Sagrado, você sentiria raiva por suas mortes.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	É possível notar quatro cadáveres espalhados pela sala, analisando o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ambiente você percebe algo que te chama a atenção. Um pequeno animal encontra-se\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("jogado no chão, sua penugem está coberta de sangue e suas asas foram arrancadas.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("A coruja do monge!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf olha para o animal, suas penas estão em frangalhos e você nota\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("sofrimento nos olhos do pequeno ser. Ele respira pesadamente e solta pequenos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("grasnidos de dor.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Calma pequenino, calma — Asulf coloca o animal ferido em suas mãos, e utiliza\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("seu poder de cura na criatura.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Gradualmente os grasnidos de dor da criatura se acalmam e ela pega no sono,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("é possível notar um alívio em sua alma. O general encosta a criatura em um dos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cantos da sala e escaneia o espaço.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ao centro dessa sala, há um painel com pedras ametistas em uma coluna de um metro e\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("meio, a sala possui três estátuas de mármore. As estátuas representam uma trindade de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("valquírias lendárias — deidades femininas que serviam aos deuses. Elas estão\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("posicionadas em formato triangular ao redor do painel. Uma, de acordo com a gravura na\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estátua, chama-se Eir e segura um escudo gigantesco. Outra chama-se Olrun e possui\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("armadura leve e asas notáveis. A mais notável entre elas, era Sigrun. De acordo com as\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("gravuras, ela era a Rainha das Valquírias. Elas seguram espadas longas que apontavam\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para o chão ao redor do painel.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	Observando o ambiente, Asulf percebe que não há mais por onde passar e\n", TimeUnit.MILLISECONDS, temp_dialog);
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
				Digita("Não erre... Pelo seu filho...	\n", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}

		} while (alternativaCerta != true);
		alternativaCerta = false;
		System.out.println();
		
		Digita("	O painel é formado por letras e números. Neste painel há gravuras da linguagem\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Hexadecimal. Há uma história sendo contada. Tudo indica que há um ano em que os	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Deuses do Novo Mundo nascerão após passar por diversos desafios e eliminar o antigo	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("paradigma. Porém, os falsos profetas irão sucumbir em ruínas.	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Esse ano está escrito na linguagem Hexadecimal. Traduza 7E5(16) para a sua\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("língua (decimal), colocando as pedras ametistas no painel.	\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println();
		do {
			System.out.print("Recite o ano informando-o na linguagem decimal(10): ");
			ex1 = entrada.next();
			if (ex1.equals(resp1)) {
				resp1v = true;
				cont++;
			} else if (cont == 0) {
				Digita("Você sente um leve tremor e nada acontece.\n", TimeUnit.MICROSECONDS, temp_dialogSlow);
				cont++;
			} else if (cont == 1) {
				Digita("Você sente novamente o tremor e ele está mais forte.\n", TimeUnit.MICROSECONDS, temp_dialog);
				cont = cont + 1;
			} else if (cont == 2) {
				Digita("A caverna treme muito agora e está prestes a desmoronar...\n", TimeUnit.MICROSECONDS,
						temp_dialogFast);
				cont = cont + 1;
			} else if (cont == 3) {
				Digita("	Tudo começa cair aos pedaços...\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("	Você já não enxerga mais, apenas sente a dor de pedras caindo em seu corpo. É uma dor agoniante... \n",
						TimeUnit.MILLISECONDS, temp_dialog);
				Digita("	Você morreu soterrado na caverna...!\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("	Seu filho nunca mais o encontrará...!\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("	Fim de jogo.\n", TimeUnit.MILLISECONDS, temp_dialog);
				System.exit(0);

			}

		} while (!resp1v);
		System.out.println();
		
		Digita("	Ao resolver o enigma, as mãos de pedra de Sigrun se movem até o seu manto,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que continha um pequeno pergaminho, e estendem as mãos à frente do seu corpo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Como se o oferecessem para você.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		
		do {
			System.out.println("1 - Pegar pergaminho");
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				Digita("Não pare!\n", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}

		} while (alternativaCerta != true);
		alternativaCerta = false;
		System.out.println();
		
		Digita("	Uma magia transpassa seu corpo, você sente uma corrente elétrica passar o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("seu corpo.\n", TimeUnit.MILLISECONDS, temp_dialog);
	
		System.out.println();
		Digita("=================|                          |=================\n", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("-----------------| Sabedoria de Odin OBTIDA |-----------------\n", TimeUnit.MILLISECONDS, ultra_Speed);
		Digita("=================|                          |=================\n", TimeUnit.MILLISECONDS, ultra_Speed);
		System.out.println();
		System.out.println();	
		chamasNegrasStatus = true; //Chamas Negras aparecerá no status
		elixirDaVidaStatus = true; //Elixir da Vida aparecerá no status
		sabedoriaDeOdinStatus = true; //Sabedoria De Odin aparecerá no Status
		
		Digita("	Assim que a sensação passa, Sigrun recolhe os braços e rapidamente tenta\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("acertar um soco em seu peito!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Seus reflexos o protegem, o guerreiro coloca as mãos na frente do soco, mas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("a força é muito grande, mesmo você não se machucando, o soco te empurra até o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("centro da sala.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Olhando ao redor você percebe que as outras valquírias também começam a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("se mexer.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Ótimo, vamos aquecer.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		
		do {
			System.out.println("1 - Continuar");
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				Digita("Não pare!\n", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}

		} while (alternativaCerta != true);
		alternativaCerta = false;
		System.out.println();
		
		
		System.out.println();
		
		boolean vitoria = false; 		//Utilizado quando o Usuário vence do 'Computador' e sai do loop.         
		int hpValquiria01 = 1000;
		int hpValquiria01Max = 1000; //Vida Máxima da Valquíria 01 (usado p/ quando ela se curar e sua vida não ficar acima da vida máxima)
		int aumentaVida200 = 200; //variável utilizada para aumentar a vida da valquíria01 - Sigrun
		int hpValquiria02 = 300;
		int hpValquiria03 = 300;
		Random ataqueForca = new Random(); // Força do ataque dado por uma aleatoriedade.
		int dano = 0; //dano causado pelo ataque.
		int valor; //Valor gerado pela 'aleatoriedade'.
		
		do {
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Sigrun, a Rainha das Valquírias");
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
			System.out.println("* Chamas Negras: " + chamasNegras + "/10");
			System.out.println("* Elixir da Vida: " + elixirDaVida + "/15");
			System.out.println("* Sabedoria de Odin: " + sabedoriaDeOdin + "/5");
			System.out.println("====================                ====================");
			
			
			System.out.println("Qual Valquíria atacar?");
			System.out.println("1 - Sigrun, a Rainha das Valquírias");
			System.out.println("2 - Olrun, a Veloz");
			System.out.println("3 - Eir, a Defensora");
			System.out.println();
			System.out.print("Sua escolha: ");
			String escolha = entrada.next(); //escolha da valquíria
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
					
						valor = ataqueForca.nextInt(10);//ataque do Protagonista
						if (valor == 0 || valor == 1 || valor == 2) {
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Sigrun desviou de seu ataque! Dano 0. ", TimeUnit.MILLISECONDS, temp_dialog);
							} else {
								dano = ataqueForca.nextInt(10) + 20;
								hpValquiria01 = hpValquiria01 - dano;
								Digita("Fraco! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
							}
						} else if (valor == 4 || valor == 5 || valor == 6 || valor == 7) {
							dano = ataqueForca.nextInt(10) + 50;
							hpValquiria01 = hpValquiria01 - dano;
							Digita("O seu ataque não foi tão eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
						} else if (valor == 8) {
							dano = ataqueForca.nextInt(60) + 60;
							hpValquiria01 = hpValquiria01 - dano;
							Digita("O seu ataque foi eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
						} else if (valor == 9) {
							dano = ataqueForca.nextInt(20) + 100;
							hpValquiria01 = hpValquiria01 - dano;
							Digita("O seu ataque foi eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
						}
						
					} else {
						Digita("Asulf está atancando uma Valquíria morta! ASULF ESTÁ ENLOUQUECENDO!?", TimeUnit.MILLISECONDS, temp_dialog);
					}
					
					System.out.println();
					System.out.println();
					if (hpValquiria01 < 0) { //para o hp não ficar negativo no painel
						hpValquiria01 = 0;
					}
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					} else {
						//Ataque Valquíria
						if (hpValquiria01 > 0) { 
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| atira à distância suas penas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 7|| valor == 8) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;								
								Digita("|Sigrun| Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 9) {
								dano = ataqueForca.nextInt(10) + 30;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| VALHALLA!!!!!!!!!!!! \u2734\uFE0F Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
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
							valor = ataqueForca.nextInt(10) + 1; //Ataque Valquíria02
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
						Digita("Insuficiente... Inútil...!\n", TimeUnit.MILLISECONDS, temp_dialog);
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
								Digita("CHAMAS NEGRAS! Dano CRÍTICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
							}
						} else {
							hpUsuario = hpUsuario - 5;
							Digita("Ao tentar invocar as Chamas Negras sem energia, Asulf é atacado! Dano 5",
									TimeUnit.MILLISECONDS, temp_dialog);
						}
					
					} else {				
						Digita("ASULF TENTOU USAR CHAMAS NEGRAS EM UMA VALQUÍRIA MORTA! ASULF ESTÁ ENLOUQUECENDO?!", TimeUnit.MILLISECONDS, temp_dialog);
						if (chamasNegras > 0) {
							chamasNegras--;
						}
					}
					System.out.println();
					System.out.println();
					if (hpValquiria01 < 0) { //para o hp não ficar negativo no painel
						hpValquiria01 = 0;
					}
					//ataque valquírias
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					} else {
						
						if (hpValquiria01 > 0) { //ataque valquiria01
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6 || valor == 7) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| atira à distância suas penas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 8) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;								
								Digita("|Sigrun| Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 9) {
								dano = ataqueForca.nextInt(10) + 30;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| VALHALLA!!!!!!!!!!!! \u2734\uFE0F Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
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
								Digita("Asulf desvia do ataque de Eir!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						
					}
					
					if (hpUsuario <= 0) {
						Digita("Derrotado pelas Valquírias! Fim de jogo!", TimeUnit.MILLISECONDS, temp_dialog);
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
						if (hpValquiria01 > 0) { //ataque valquiria01
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| atira à distância suas penas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 7|| valor == 8) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;								
								Digita("|Sigrun| Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 9) {
								dano = ataqueForca.nextInt(10) + 30;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| VALHALLA!!!!!!!!!!!! \u2734\uFE0F Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
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
							valor = ataqueForca.nextInt(10) + 1; //Ataque Valquíria02
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
						Digita("Insuficiente... Inútil...!\n", TimeUnit.MILLISECONDS, temp_dialog);
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
								Digita("ODIN!!!! Dano CRÍTICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
							}
						} else {
							hpUsuario = hpUsuario - 5;
							Digita("Ao tentar invocar a Sabedoria de Odin sem energia, Asulf é atacado! Dano 5",
									TimeUnit.MILLISECONDS, temp_dialog);
						}
						
					} else {
						Digita("ASULF ESTÁ ATACANDO UMA VALQUÍRIA MORTA! ESTÁ ENLOUQUECENDO?!", TimeUnit.MILLISECONDS, temp_dialog);
						if (sabedoriaDeOdin > 0) {
							sabedoriaDeOdin--;
						}
					}
					System.out.println();
					System.out.println();
					if (hpValquiria01 < 0) { //para o hp não ficar negativo no painel
						hpValquiria01 = 0;
					}
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					}
					Digita("Ao utilizar a Sabedoria de Odin, Asulf fica mais rápido que um raio. Nenhum inimigo o atingirá!\n", TimeUnit.MILLISECONDS, temp_dialog);
				default:
				}
				break;
			case "2": //Atacando a valquiria02 OLRUN
				
				switch (alternativa) {
				case "1": //Ataque Cortante
					
					if (hpValquiria02 > 0) {
					
					
						valor = ataqueForca.nextInt(10) + 1;//ataque do Protagonista
						if (valor == 1 || valor == 2 || valor == 3 || valor == 4) {					
							Digita("Olrun desviou de seu ataque! Ela é muito rápida! Dano 0. ", TimeUnit.MILLISECONDS, temp_dialog);				
						} else if (valor == 5 || valor == 6 || valor == 7) {
							dano = ataqueForca.nextInt(10) + 50;
							hpValquiria02 = hpValquiria02 - dano;
							Digita("O seu ataque não foi tão eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
						} else if (valor == 8 || valor == 9 ||valor == 10) {
							dano = ataqueForca.nextInt(60) + 60;
							hpValquiria02 = hpValquiria02 - dano;
							Digita("O seu ataque foi eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
						} 
					
					} else {
						Digita("ASULF ESTÁ ATACANDO UMA VALQUÍRIA MORTA! ASULF ESTÁ ENLOUQUECENDO?!", TimeUnit.MILLISECONDS, temp_dialog);
					}
					System.out.println();
					System.out.println();
					if (hpValquiria02 < 0) { //para o hp não ficar negativo no painel
						hpValquiria02 = 0;
					}
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					} else {
						//Ataque Valquíria
						if (hpValquiria01 > 0) { 
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| atira à distância suas penas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 7|| valor == 8) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;								
								Digita("|Sigrun| Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 9) {
								dano = ataqueForca.nextInt(10) + 30;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| VALHALLA!!!!!!!!!!!! \u2734\uFE0F Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
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
							valor = ataqueForca.nextInt(10) + 1; //Ataque Valquíria02
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
						Digita("Insuficiente... Inútil...!\n", TimeUnit.MILLISECONDS, temp_dialog);
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
								Digita("CHAMAS NEGRAS! Dano CRÍTICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
							}
						} else {
							hpUsuario = hpUsuario - 5;
							Digita("Ao tentar invocar as Chamas Negras sem energia, Asulf é atacado! Dano 5",
									TimeUnit.MILLISECONDS, temp_dialog);
						}
					
					} else {
						Digita("ASULF ESTÁ ATACANDO UMA VALQUÍRIA MORTA! ASULF ESTÁ ENLOUQUECENDO?!!", TimeUnit.MILLISECONDS, temp_dialog);
						if (chamasNegras > 0) {
							chamasNegras--;
						}
					}
					System.out.println();
					System.out.println();
					if (hpValquiria02 < 0) { //para o hp não ficar negativo no painel
						hpValquiria02 = 0;
					}
					//ataque valquírias
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					} else {
						
						if (hpValquiria01 > 0) { //ataque valquiria01
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6 || valor == 7) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| atira à distância suas penas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 8) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;								
								Digita("|Sigrun| Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 9) {
								dano = ataqueForca.nextInt(10) + 30;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| VALHALLA!!!!!!!!!!!! \u2734\uFE0F Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
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
								Digita("Asulf desvia do ataque de Eir!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						
					}
					
					if (hpUsuario <= 0) {
						Digita("Derrotado pelas Valquírias! Fim de jogo!", TimeUnit.MILLISECONDS, temp_dialog);
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
						//Ataque Valquíria
						if (hpValquiria01 > 0) { 
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| atira à distância suas penas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 7|| valor == 8) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;								
								Digita("|Sigrun| Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 9) {
								dano = ataqueForca.nextInt(10) + 30;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| VALHALLA!!!!!!!!!!!! \u2734\uFE0F Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
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
							valor = ataqueForca.nextInt(10) + 1; //Ataque Valquíria02
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
						Digita("Insuficiente... Inútil...!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Fim de jogo!", TimeUnit.MILLISECONDS, temp_dialog);
						System.exit(0);
					}
					System.out.println();
					System.out.println();
	
					break;
				case "4": //Usando Sabedoria de Odin
					
					if (hpValquiria02 > 0) {
					
					
						valor = ataqueForca.nextInt(2);
						if (sabedoriaDeOdin > 0) {
							sabedoriaDeOdin--;
							if (valor == 0) {
								hpValquiria02 = hpValquiria02 - 100;
								Digita("ODIN!!!! Dano 100", TimeUnit.MILLISECONDS, temp_dialog);
							} else {
								hpValquiria02 = hpValquiria02 - 200;
								Digita("ODIN!!!! Dano CRÍTICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
							}
						} else {
							hpUsuario = hpUsuario - 5;
							Digita("Ao tentar invocar a Sabedoria de Odin sem energia, Asulf é atacado! Dano 5",
									TimeUnit.MILLISECONDS, temp_dialog);
						}
					
					} else {
						Digita("ASULF ESTÁ ATACANDO UMA VALQUÍRIA MORTA! ASULF ESTÁ ENLOUQUECENDO!?", TimeUnit.MILLISECONDS, temp_dialog);
						if (sabedoriaDeOdin > 0) {
							sabedoriaDeOdin--;
						}
					}
					System.out.println();	
					System.out.println();
					if (hpValquiria02 < 0) { //para o hp não ficar negativo no painel
						hpValquiria02 = 0;
					}
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					}
					Digita("Ao utilizar a Sabedoria de Odin, Asulf fica mais rápido que um raio. Nenhum inimigo o atingirá!\n", TimeUnit.MILLISECONDS, temp_dialog);
				default:
				}
				break;

			case "3": //Atacando a valquiria03 EIR
				
				switch (alternativa) {
				case "1": //Ataque Cortante
					
					if (hpValquiria03 > 0) {
					
					
						valor = ataqueForca.nextInt(10) + 1;//ataque do Protagonista
						if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5 || valor == 6) {	
							dano = ataqueForca.nextInt(10) + 40;
							hpValquiria03 = hpValquiria03 - dano;
							Digita("Asulf atacou Eir! Ela é bem resistente! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);				
						} else if (valor == 7 || valor == 8 || valor == 9) {
							Digita("O seu ataque foi bloqueado pelo escudo de Eir! Dano 0.", TimeUnit.MILLISECONDS, temp_dialog);
						} else if (valor == 10) {
							dano = ataqueForca.nextInt(10) + 55;
							hpValquiria03 = hpValquiria03 - dano;
							Digita("O seu ataque foi eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
						} 
						
					} else {
						Digita("ASULF ESTÁ ATACANDO UMA VALQUÍRIA MORTE! ASULF ESTÁ ENLOUQUECENDO!?", TimeUnit.MILLISECONDS, temp_dialog);
					}
					if (hpValquiria03 < 0) { //para o hp não ficar negativo no painel
						hpValquiria03 = 0;
					}
					System.out.println();
					System.out.println();
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					} else {
						//Ataque Valquíria
						if (hpValquiria01 > 0) { 
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| atira à distância suas penas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 7|| valor == 8) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;								
								Digita("|Sigrun| Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 9) {
								dano = ataqueForca.nextInt(10) + 30;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| VALHALLA!!!!!!!!!!!! \u2734\uFE0F Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
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
							valor = ataqueForca.nextInt(10) + 1; //Ataque Valquíria02
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
						Digita("Insuficiente... Inútil...!\n", TimeUnit.MILLISECONDS, temp_dialog);
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
								Digita("CHAMAS NEGRAS! Dano CRÍTICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
							}
						} else {
							hpUsuario = hpUsuario - 5;
							Digita("Ao tentar invocar as Chamas Negras sem energia, Asulf é atacado! Dano 5",
									TimeUnit.MILLISECONDS, temp_dialog);
						}
					
					} else {
						Digita("ASULF ESTÁ ATACANDO UMA VALQUÍRIA MORTA! ASULF ESTÁ ENLOUQUECENDO!?", TimeUnit.MILLISECONDS, temp_dialog);
						if (chamasNegras > 0) {
							chamasNegras--;
						}
					}
					System.out.println();
					System.out.println();
					if (hpValquiria03 < 0) { //para o hp não ficar negativo no painel
						hpValquiria03 = 0;
					}
					//ataque valquírias
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					} else {
						
						if (hpValquiria01 > 0) { //ataque valquiria01
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6 || valor == 7) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| atira à distância suas penas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 8) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;								
								Digita("|Sigrun| Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 9) {
								dano = ataqueForca.nextInt(10) + 30;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| VALHALLA!!!!!!!!!!!! \u2734\uFE0F Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
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
								Digita("Asulf desvia do ataque de Eir!", TimeUnit.MILLISECONDS, temp_dialog);
							}
						}
						System.out.println();
						System.out.println();
						
					}
					
					if (hpUsuario <= 0) {
						Digita("Derrotado pelas Valquírias! Fim de jogo!", TimeUnit.MILLISECONDS, temp_dialog);
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
						//Ataque Valquíria
						if (hpValquiria01 > 0) { 
							valor = ataqueForca.nextInt(10) + 1;
							if (valor == 1 || valor == 2) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 3 || valor == 4 || valor == 5 || valor == 6) {
								dano = ataqueForca.nextInt(5) + 5;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| atira à distância suas penas! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 7|| valor == 8) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;								
								Digita("|Sigrun| Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
										temp_dialog);	
							} else if (valor == 9) {
								dano = ataqueForca.nextInt(10) + 30;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| VALHALLA!!!!!!!!!!!! \u2734\uFE0F Lança Divina Amaldiçoada! Dano " + dano, TimeUnit.MILLISECONDS,
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
							valor = ataqueForca.nextInt(10) + 1; //Ataque Valquíria02
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
						Digita("Insuficiente... Inútil...!\n", TimeUnit.MILLISECONDS, temp_dialog);
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
								Digita("ODIN!!!! Dano CRÍTICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
							}
						} else {
							hpUsuario = hpUsuario - 5;
							Digita("Ao tentar invocar a Sabedoria de Odin sem energia, Asulf é atacado! Dano 5",
									TimeUnit.MILLISECONDS, temp_dialog);
						}
					
					} else {
						Digita("ASULF ESTÁ ATACANDO UMA VALQUÍRIA MORTE! ASULF ESTÁ ENLOUQUECENDO!?", TimeUnit.MILLISECONDS, temp_dialog);
						if (sabedoriaDeOdin > 0) {
							sabedoriaDeOdin--;
						}
					}
					
					System.out.println();	
					System.out.println();
					if (hpValquiria03 < 0) { //para o hp não ficar negativo no painel
						hpValquiria03 = 0;
					}
					if (hpValquiria01 <= 0 && hpValquiria02 <= 0 && hpValquiria03 <= 0) {
						vitoria = true;
						break;
					}
					Digita("Ao utilizar a Sabedoria de Odin, Asulf fica mais rápido que um raio. Nenhum inimigo o atingirá!\n", TimeUnit.MILLISECONDS, temp_dialog);
				default:
				}
				break;
				
			default:		
			}	
		} while (vitoria == false);
		vitoria = false;
		
		System.out.println();
		Digita("	Derrotando a trindade das valquírias, Asulf se apoia em seus joelhos para\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("recuperar o fôlego, as guerreiras implacáveis agora não passam de estátuas de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mármore quebradas.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Após a luta, uma das paredes da sala se move e abre um caminho para você\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("seguir. Antes de seguir em frente, Asulf olha para trás e nota a pequena coruja,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mesmo dormindo ela respira pesadamente. Mesmo que a coruja tenha sido o estopim\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para tudo isso, o guerreiro sente pena do pobre bichinho. Você rasga pedaços das\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("túnicas dos seguidores do monge, e com seus trapos, monta uma mochila\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("improvisada e coloca a coruja em suas costas.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Uma companhia pode me fazer bem no final das contas.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você segue pelo corredor de mármore por quinze minutos, até avistar uma\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ponte à sua frente. A ponte é feita de um mármore impecável. Embaixo da ponte, um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("abismo que não se enxergava nada. Do outro lado da ponte, um portão enorme de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("concreto. À frente do portão, totens de madeira.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Há gravuras nesses totens. Encontre o único totem diferente e coloque-o na posição\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("correta.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		int contador = 0;
		do { //Início do desafio do totem
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
			
			System.out.println("\nQual totem é diferente e está na posição errada? ");
			System.out.print("\nAlternativa: ");
			alternativa = entrada.next();
			
			switch (alternativa.toUpperCase()) {
			case "A":
				Digita("	\nLembre-se dos ensinamentos de Lógos...\n", TimeUnit.MILLISECONDS, temp_dialog);
				contador++;
				break;
			case "B":
				Digita("	\nLembre-se da linguagem dos Iluminados...\n", TimeUnit.MILLISECONDS, temp_dialog);
				contador++;
				break;
			case "C":
				Digita("	\nLembre-se dos ensinamentos de Lógos e da linguagem dos iluminados...\n", TimeUnit.MILLISECONDS, temp_dialog);
				contador++;
				break;
			case "D":
				Digita("	\nLembre-se de Binários...\n", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			case "E": //alternativa correta
				alternativaCerta = true;
				break;
			default:
				System.out.println("\nInforme ou 'A' ou 'B' ou 'C' ou 'D' ou 'E'.");
			}
		} while (alternativaCerta == false && contador  < 2);
		
		if (alternativaCerta == false) {
			System.out.println("Asulf ativa erroneamente o dispositivo dos totens e a caverna começa a tremer...");
			System.out.println("Asulf corre...");
			System.out.println("Mas pouco a pouco, pedras e mais pedras começam a cair no chão.");
			System.out.println("Não há por onde fugir...");
			System.out.println("Esmagado.... ");
			System.out.println("Enterrado pela caverna...");
			System.out.println("Nunca mais verá a luz...");
			System.out.println("Nunca mais verá o seu filho...");
			System.out.println("Fim de jogo.");
			System.exit(0);
		} 
		
		//fim do desafio do totem
		System.out.println();
		
		Digita("	Encaixando o totem em seu devido lugar, eles começam a reluzir uma luz\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("azulada, aos poucos os portões se abrem. Dentro deles você enxerga um vale.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Uma simples com grama verde cortado por um rio cristalino. Muito à frente é possível\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("avistar um castelo. Do topo da fortificação um raio de luz branca vai em direção até\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("as estrelas.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você está mais próximo do que nunca de acabar com isso de uma vez por todas.\n", TimeUnit.MILLISECONDS, temp_dialog);

		System.out.println();
		
		alternativaCerta = false;
		
		do {
			imprimirMenuStatus(chamasNegrasStatus, elixirDaVidaStatus, sabedoriaDeOdinStatus); //vai imprimir o Status contendo HP e Especiais
			
			System.out.println("1 - Continuar para o Capítulo 7: 4º Andar — O Monge, o Deus e o Santo");
			System.out.println("2 - Descrição dos Ataques");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":				
				alternativaCerta = true;
				break;	
			case "2": 
				
				boolean alternativaVoltar = false; //criada para 'voltar' o menu.
				do {
					descricaoDosAtaquesStatus(chamasNegrasStatus, elixirDaVidaStatus, sabedoriaDeOdinStatus);
					System.out.println();
					System.out.println("X - Voltar");
					alternativa = entrada.next();				
					switch (alternativa.toLowerCase()) {
					case "x":
						alternativaVoltar = true; //utilizado para 'Voltar' o menu.
						break;
					default:
						break;
					}
				} while (alternativaVoltar == false);
				
				break;
			default:
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		
		capitulo7();
		
	}
	
	
	
	public static void capitulo7() throws InterruptedException {
		System.out.println();
		System.out.println("Capítulo 7: 4º Andar — O Monge, o Deus e o Santo");
		System.out.println();
		
		
		Digita("	Concentrando suas forças em suas pernas, você consegue correr mais rápido,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("um caminho que levaria três horas para ser percorrido, o soldado consegue percorrer\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("em menos de trinta minutos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O edifício mede cerca de 30 metros de altura, é feito de pedra cinza maciça e possui\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("quatro torres anexadas a ele, uma em cada extremidade. Seu olfato apurado, sente o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("aroma de magia a quilômetros de distância, este castelo possui está envolto de muito poder\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ao seu redor. Todo o ambiente está assim, é como se algo neste lugar liberasse tanto poder,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que todo o ambiente se beneficia disso.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O castelo fica instalado próximo ao fim do vale, atrás dele é possível notar que não\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("existe mais chão. Ele foi construído próximo a um desfiladeiro que cai em direção a um mar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("extremamente revolto.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ao chegar às portas do castelo, Asulf nota que os portões já estão abertos, entrando\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("no hall do castelo, você vê um lugar suntuoso, cheio de tapeçarias vermelhas e douradas. A\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("sua frente existe uma escadaria dourada que o leva até os próximos andares.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		
		String alternativa;
		boolean alternativaCerta = false;
		
		System.out.println();
		do {
			System.out.println();
			System.out.println("1 - Subir para o próximo andar.");
			System.out.println("2 - Não subir.");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":				
				alternativaCerta = true;
				break;			
			case "2":
				Digita("	Você pensa em não subir, mas após tudo que passou, agora é um\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("caminho sem volta, e só lhe resta um destino.\n", TimeUnit.MILLISECONDS, temp_dialog);
				alternativaCerta = true;
				break;
			default:
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		System.out.println();
		
		
		Digita("	Asulf percorre as escadas em direção ao local em que a energia mágica é mais\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("forte, esta tarefa não é difícil, a magia no ambiente é quase palpável, praticamente uma\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("energia física, você só precisa correr em direção de onde a magia é mais densa.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ao se aproximar da sala com a maior fonte de energia, a coruja que antes dormia\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("calmamente, começa a se debater e grasnar com força, você a coloca-a em seus braços.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Calma, pequenina, vai ficar tudo bem. Você está comigo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Isto não importa para ela, ela se debate veementemente e busca com todas as suas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("forças fugir dali.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf tenta controlar a coruja, até que da porta da sala onde existe mais energia, sai\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("um homem...\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O MONGE!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Pequeno guerreiro!?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ele está diferente. Seu olhar parece perdido, todas as suas roupas estão rasgadas. Sua\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Sua pele que antes era clara, quase como papel, agora está extremamente avermelhada e\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com várias feridas de queimaduras. As ataduras em seus olhos caíram, o sacerdote não\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("possui os dois olhos, no lugar deles existem apenas dois buracos que revelam a parte\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("interna do crânio.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Você coloca o animal no chão e ele foge para um dos quartos do castelo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Você sobreviveu!??? — sua voz está fraca, ele para por um momento, te analisa e\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("começa a gargalhar — você fez um pacto?\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Sua risada tão macabra quanto antes. Uma mistura de alegria, euforia e loucura.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Asulf não responde e saca a sua espada.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu não acredito, pequeno guerreiro, você realmente vendeu a sua alma para\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ereshkigal?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu pensava que os Volstalicos não veneravam estes tipos de deuses — ele para\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de falar por um segundo — mas é claro!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Essa deusa vai te escravizar pela eternidade!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Por isso ela deve ter te dado muito poder em troca!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Me sinto honrado pequeno guerreiro, você fez tudo isso só para podermos ir\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("juntos alcançar a divindade? Sinto lhe informar que o poder dos deuses foi demais até para\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mim — ele apontando para si mesmo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O sacerdote está fraco, sua voz está baixa e seu corpo está extremamente\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("machucado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Onde está meu filho?! —  Asulf finalmente pergunta.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Anton é um bom garoto pequeno guerreiro, você o ensinou bem, ele é um ótimo\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("aprendiz!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf se assusta com as palavras do sacerdote, Anton nunca se aliaria a estes\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("loucos, muito menos aprenderia com eles.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Fale a verdade, seu maldito! — o guerreiro berra —  onde você está escondendo\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ele?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Mas eu nunca escondi ele, Asulf — o homem fala o seu nome com um sorriso\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("malicioso nos lábios — eu fiz muito mais que isso, eu o ensinei, eu o ajudei a ver a verdade,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("depois que conversamos ele me implorou para ensiná-lo — o sacerdote faz uma pausa —\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ele que deu a ideia de usarmos a energia vital dos meus seguidores como fonte de energia\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para passarmos pelos portais. o seu filho é muito sábio, Asulf!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Anton nunca faria isso, ele não é um carniceiro.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— No início, ele realmente não queria se unir a mim — o sacerdote abre um sorriso\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("largo — mas eu apenas cravei alguns símbolos em sua pele e entoei alguns cânticos e ele\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ficou bem mais influenciável.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Com a raiva tomando controle de seus pensamentos, você larga a espada e avança\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com as mãos nuas em direção ao sacerdote. Com os punhos cerrados, Asulf acerta um\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("soco certeiro no rosto do homem, que não tenta reagir.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ele é arremessado contra a parede e começa a gargalhar. O guerreiro corre em\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("direção do homem, agarra-o pela perna e arremessa ele em direção ao hall principal.\n", TimeUnit.MILLISECONDS, temp_dialog);
			
		System.out.println();
		do {
			System.out.println();
			System.out.println("1 - Conter sua fúria.");
			System.out.println("2 - Atacar o monge.");
			alternativa = entrada.next();
			System.out.println();
			switch (alternativa) {
			case "1":		
				Digita("	Você tenta conter sua fúria, mas o ódio em seus olhos ao ver o monge é\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("maior que sua consciência.\n", TimeUnit.MILLISECONDS, temp_dialog);
				alternativaCerta = true;
				break;			
			case "2":
				
				alternativaCerta = true;
				break;
			default:
				System.out.println("Tenha confiança.");
				System.out.println("");
				break;
			}
			
		} while (alternativaCerta != true);
		alternativaCerta = false;	
		System.out.println();	
		
		Digita("	Vocês estão no quarto andar, quando o sacerdote cai no chão, você sobe em cima\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dele e começa a socá-lo no rosto.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	ONDE\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("	ESTÁ\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("	O\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("	MEU\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("	FILHO?!\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		System.out.println();
		Digita("	O monge louco gargalha enquanto você o acerta. Sua pele não parece mais como\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pedra, Asulf não sabe se é por causa da sua nova força, ou por seus ferimentos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Não importa.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O guerreiro para de acertar o sacerdote, quando termina de soca-lo, seu rosto está\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("completamente desfigurado, seus dentes estão quebrados e seu nariz foi afundado para\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dentro da cabeça. O monge balbucia:\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu vi, pequeno guerreiro, eu vi os deuses.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— O quê?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— É lindo, Asulf, nós somos tão pequenos comparados a tudo, toda a humanidade\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("— ele cospe sangue — não passa de uma pequena flor no universo, nós somos pequenas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("flores!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Do que você está falando? — Asulf fala extremamente confuso.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Você não concorda, Asulf? — o monge fala debilmente — somos como uma\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("flor… se plantados em solo bom e bem cuidados, nos desabrochamos de forma bela,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("quando nascemos em solo ruim em somos pisados e devorados por insetos, nós morremos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de forma dolorosa e patética.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Ele continua em seu delírio\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Os deuses são como o pólen. Eles passam nos mundos e trazem a vida para\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cada um deles, alguns ficam, alguns vão, mas todos deixam a sua marca por onde passam.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— A humanidade é como uma pequena flor e, como toda flor, ela não tem ideia do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("quão vasto é o jardim que ela habita.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Chega de conversa! — você berra enquanto aperta o pescoço do homem —\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("onde está o meu filho?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Seu filho? — o moribundo parece sair de seu transe — ele está lá, na sala do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("trono — o homem sorri — seu filho é como o jardineiro.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Asulf coloca as mãos no pescoço do monge e aperta ativando as chamas negras. O\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homem começa a se contorcer em suas mãos, ele tenta se soltar de seu aperto sem\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("sucesso. Seu rosto fica cada vez mais avermelhado e sua boca se abre buscando ar, as\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("chamas em suas mãos queimam a carne do monge de forma dolorosa, a pele de seu\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pescoço começa a derreter como calor e o cheiro de carne queimada começa a entrar em\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("suas narinas.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O sacerdote se debate e tenta escapar de suas mãos. Com a sua força, Asulf\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("esmaga a traqueia do monge, esmigalhando todos os ossos do seu pescoço e fazendo o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("corpo dele ficar mole.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Por um breve instante, Asulf sente que seus problemas acabaram. O homem que o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("humilhou, o espancou e sequestrou seu filho agora está morto. Pegar fogo, afogar-se, lutar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("contra Valquírias, tudo isso valeu a pena, para poder esganar o homem que causou tanto\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mal a você e seus homens. É como se o velho soldado conseguisse respirar ar puro pela\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("primeira vez depois de muito tempo debaixo d’água.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O guerreiro se levanta e corre na direção da sala para reencontrar seu filho perdido.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("A sala que você entra é um cômodo espaçoso com 200 metros de distância de uma ponta a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("outra e cinquenta metros de largura. O ambiente está extremamente claro, como se\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("houvesse um sol ali dentro irradiando uma luz branca que queima a sua pele por dentro da\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("armadura. Quando a luz te atinge, seu corpo automaticamente começa a se curar, mas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mesmo assim é um processo doloroso ser queimado e regenerado incessantemente. Como\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("o monge conseguiu ficar dentro deste ambiente tão hostil sem poderes de cura?\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Gradualmente a luz diminui para apenas um reluzir,  com a diminuição do poder sua\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pele descansa e você pode enxergar que a luz que domina a sala é a mesma que vinha do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("céu e entrava no castelo. O cômodo possui duas mesas longas colocadas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("perpendicularmente uma ao lado da outra, com várias cadeiras em volta e tapetes de cor\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("vermelha e dourada. Provavelmente era onde o antigo rei do castelo se reunia para festejar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com seus amigos e fazer banquetes. A luz vem do céu e cai diretamente em um trono que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("se encontra no final da sala. Está sentado no trono um jovem de cabelos negros, que veste\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("uma túnica vermelha, característica dos monges seguidores do sacerdote que você acabara\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de matar. Em sua cabeça, um capacete que cobre apenas a parte superior de seu rosto,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com chifres que ele mesmo colocou.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Anton! — grita correndo em direção de seu filho\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O menino se vira para o pai atordoado. Quando o vê, avança em sua direção.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Flutuando, não correndo. Em segundos vocês atravessam a sala e se abraçam, Asulf sente\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("uma felicidade tão grande que nem percebe que seu filho não toca o chão.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Pai! — seu filho abraça-o — eu senti tanta a sua falta.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu também, Anton. — Asulf fala com lágrimas nos olhos — não se preocupe, vai\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("tudo ficar bem agora, o monge nunca mais vai encostar a mão em você.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O garoto se afasta do seu abraço.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Como assim pai? Você fez algo com o senhor Brant?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O velho guerreiro se incomoda com o afastamento do menino.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Este era o nome do monge? — indaga — sim, filho, eu matei aquele monge\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("maldito.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Anton se mostra verdadeiramente desapontado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu não acredito que o senhor Brant morreu —  o garoto mostra um fraco sorriso\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("— parece que até mesmo os mais fortes acabam caindo um dia, não é mesmo?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Anton bate em seu ombro.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Para vencer ele você deve ter melhorado muito não é mesmo pai? — ele tenta\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("sorrir —  chega a ser poético, o homem que você ajudou, é o responsável por sua queda.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Ajudou? — Asulf fala sem acreditar no que estava ouvindo — aquele monstro\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("matou nossos companheiros! Ele me arremessou pelos ares e quase me aleijou, depois\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("disso te sequestrou e te arrastou para esse maldito mundo! — o guerreiro berra — como\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("você pode dizer que este homem nos ajudou em algo?\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Anton expressa um sorriso carinhoso, como um pai que vê o filho preocupado com\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("pequenas trivialidades.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
	
		Digita("	— Mas agora você está aqui, não está?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Tudo o que você sofreu no final das contas valeu a pena, agora você está mais\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("forte do que nunca!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— E nossos companheiros, Anton!?  — você esbraveja —  eles estão mais fortes\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("agora?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eles estão mortos, filho! Aquele monstro os matou!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Anton franze o cenho.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Mas pai... se nossos colegas morreram lutando com ele, por que devemos nos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("importar? — o menino indaga — se eles morreram na luta, eles não foram aptos para\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("vencer o inimigo, e  não foram aptos para enxergar uma luta perdida e recuar — Anton ri — \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("eles conseguiram ser fracos demais para vencer e burros demais por não fugir quando\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("podiam.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Asulf se afasta do filho.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Anton… você entende o que está falando?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Claro que entendo pai! — o jovem fala —  pela primeira vez na minha vida eu\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("entendo tudo!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu sofri por você pai, sofri por toda a humanidade!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— O sofrimento é o que guia a humanidade para a sua evolução!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu sofri por todos e usei esse sofrimento para me unir aos deuses!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O menino aponta para o trono no final da sala.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Aquele trono é o trono do primeiro de todos, pai, foi ali que o primeiro de todos os\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("deuses se sentou quando veio à terra.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— O que você está falando, Anton? — o homem pergunta com medo das\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Quando o mundo era apenas uma esfera de água e lama, ele se sentou aqui, o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nosso criador se fez carne!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Ele desceu das estrelas e nos ajudou a evoluir de macacos nojentos para o que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("somos hoje!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Agora ele voltou lá para cima, buscando novos mundos para poder semear a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("vida, deixando os seus filhos, os deuses que nós pensávamos serem os verdadeiros\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("criadores, para cuidar do nosso mundo, mas agora chega, chega de sermos escravos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("destes deuses patéticos, agora a humanidade vai ditar as regras, nós vamos guiar o rumo\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dos nossos próprios destinos!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Ao falar isto, Anton coloca os braços aos céus, assim como o monge.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Filho... o que ele fez com você…\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Não se preocupe pai, eu sou forte agora, como você queria, lembra?\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu consegui absorver os poderes dos deuses antigos — ele olha para as próprias\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mãos — com esse poder eu posso melhorar o mundo, eu vou continuar o trabalho do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("primeiro deus, eu sou a reencarnação dele pai, eu sou a divindade encarnada!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O medo percorre a espinha de Asulf. Um deus raramente vem para o plano físico.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Raríssimos são os casos em que deuses desceram à terra e fizeram o bem. Em sua\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("maioria, os deuses trazem apenas morte e destruição quando vem ao plano material, se o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("deus for realmente bondoso, ele sabe que deve se manter afastado da humanidade,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ajudando-a de forma indireta.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Se Anton possuir o poder deste “primeiro deus”, deste suposto criador que é pai de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("todos os outros seres divinos, ninguém pode prever o que ele pode fazer com tamanho\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("poder.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Como você pretende continuar o trabalho dele? — o guerreiro pergunta, temendo\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("a resposta.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Anton sorri, feliz por seu pai ter perguntado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Eu vou destruir todos os reinos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Um calafrio percorre a sua espinha.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Anton...\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu vou invadir cada reino, cada vilarejo, cada mundo, e obrigá-los a lutarem uns\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com os outros — Asulf não reconhece mais o seu filho — quando apenas um ficar de pé, eu\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("vou trazê-lo para cá — o menino aponta para o trono — o vencedor de seu reino terá a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("honra de sentar no trono, e caso ele sobreviva, ele se tornará um novo indivíduo, assim\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("como eu. Desta forma, vamos selecionar apenas os melhores dos melhores, nós vamos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("lapidar a humanidade e torná-la a joia mais bela de toda a criação.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Você será o primeiro, pai! Juntos nós vamos garantir que a humanidade chegue\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ao próximo nível!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Asulf está sem palavras. Seu menino que antes se preocupava com as pessoas,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("agora fala de assassinato em massa e da criação de uma nova raça. Mesmo morto, o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("monge consegue causar mal a sua família, ele enfeitiçou seu filho, você precisa trazê-lo de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("volta!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Não se preocupe, Anton, seu pai vai te consertar!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		//
		
		System.out.println();
		//Última luta, Anton - BOSS FIGHT, começa aqui
		
		int hpAntonBossFight = 3000; 
		int contador = 0;	//Variável utilizada para poder mudar os textos no loop, no Ataque Cortante.
		int contadorChamasNegras = 0; //Variável utilizada para poder mudar os textos no ataque de Chamas Negras.
		int contadorElixirDaVida = 0; //Variável utilizada para poder mudar os textos no Elixir da Vida.
		int contadorSabedoriaDeOdin = 0; //Variável utilizada para poder mudar os textos no ataque de Sabedoria De Odin.
		boolean vitoria = false;
		Random ataqueForca = new Random(); // Força do ataque dado por uma aleatoriedade.
		int dano = 0; //dano causado pelo ataque.
		int valor; //Valor gerado pela 'aleatoriedade'.
		
		
		do {
			
			System.out.println();
			System.out.println();
			Digita("\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39",TimeUnit.MILLISECONDS, ultra_Speed);
			Digita("\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n",TimeUnit.MILLISECONDS, ultra_Speed);
			Digita("\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39",TimeUnit.MILLISECONDS, ultra_Speed);
			Digita("\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39",TimeUnit.MILLISECONDS, ultra_Speed);
			System.out.println();
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Deus Anton");
			Digita(hpUsuario + " \uD83D\uDC99", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                    ");
			Digita(hpAntonBossFight + " \uD83E\uDEC0\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("       ESPECIAIS                     ");
			System.out.println("* Chamas Negras: " + chamasNegras + "/10");
			System.out.println("* Elixir da Vida: " + elixirDaVida + "/15");
			System.out.println("* Sabedoria de Odin: " + sabedoriaDeOdin + "/5");
			System.out.println("====================                ====================");

			System.out.println("Escolha seu ataque");
			System.out.println("1 - Ataque Cortante \u2694\uFE0F      3 - Elixir da vida  \u2764\uFE0F");
			System.out.println("2 - Chamas Negras \uD83D\uDD25        4 - Sabedoria de Odin \u26A1");
			
			alternativa = entrada.next();

			switch (alternativa) {
			case "1":
				
				System.out.println();
				valor = ataqueForca.nextInt(10);//ataque do Protagonista
				
				if (contador == 0) {
					dano = 200;
					hpAntonBossFight = hpAntonBossFight - dano;
					Digita("\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Asulf imbui sua espada com as Chamas Negras e ataca ferozmente Anton! Dano " + dano +"\n", TimeUnit.MILLISECONDS, temp_dialog);
					dano = 20;
					hpUsuario = hpUsuario - dano;
					System.out.println();
					Digita("Anton, com sua mão brilhando com uma luz extremamente forte, teleporta-se atrás de Asulf e o soca com força!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Asulf tenta defender! Mas o impacto do golpe é tão forte que o joga contra a parede, quebrando-a e  \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("fazendo-o cair fora do castelo, junto às flores do andar! Dano " + dano +"\n", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (contador == 5 ) {
					dano = 200;
					hpAntonBossFight = hpAntonBossFight - dano;
					Digita("Asulf corre com uma velocidade tremenda em direção a Anton, com sua espada em mãos e\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("lança dois golpes na diagonal, marcando um 'x' no peito de Anton! Dano " + dano +"\n", TimeUnit.MILLISECONDS, temp_dialog);
					dano = 25;
					hpUsuario = hpUsuario - dano;
					System.out.println();
					Digita("Anton voa para o alto e com as duas mãos, começa a lançar centenas de esferas enérgicas em Asulf!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Asulf corre em zig-zag no prado florido, escapando das esferas enérgicas!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Mas Anton teleporta-se para o franco de Asulf, transferindo um soco em sua costela! Dano " + dano + "\n", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (contador == 10) {
					dano = 200;
					hpAntonBossFight = hpAntonBossFight - dano;
					Digita("Asulf, utilizando a Sabedoria de Odin, imbui sua arma novamente!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Agora seus ataques estão mais velozes! Asulf em passos largos aproxima-se de Anton! \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Anton teleporta-se para trás de Asulf! \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Mas Asulf parece saber examente a posição que Anton teleportaria! \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Asulf rapidamente vira para trás e, com sua arma imbuída, golpea Anton 5 vezes! \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("E todos os golpes miravam exatamente no símbolo que controlava Anton! Dano " + dano + "\n", TimeUnit.MILLISECONDS, temp_dialog);
					dano = 30;
					hpUsuario = hpUsuario - dano;
					System.out.println();
					Digita("Anton enfurece-se!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Ele não recua após os golpes e, parecendo imitar o pai, soca Asulf 5 vezes!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("três golpes no estômago e dois golpes na cabeça de Asulf! Dano " + dano + "\n", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (contador == 12) {
					dano = 200;
					hpAntonBossFight = hpAntonBossFight - dano;
					Digita("AHHHHHHHHHHHHHHHHHHHHG!!!!! — Asulf grita. \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("— UM DEUS!!!!???? VOCÊ AINDA TEM MUITO QUE APRENDER, MOLEQUE!\n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println();
					Digita("Anton sai de sua posição celestial e cai em terra igual um meteoro!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Causando um terromoto por todo o andar!!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Com o choque, o chão emite ondas em direção de Asulf!!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Asulf aproveita as ondas em direção dele para pegar impulso!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Com três impulsos, Asulf incurta uma distância de 50 metros entre ele e Anton!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Com a velocidade, Asulf espeta Anton nos ombros! Dano " + dano + "\n", TimeUnit.MILLISECONDS, temp_dialog);
					dano = 35;
					hpUsuario = hpUsuario - dano;
					System.out.println();
					Digita("Anton força a musculatura de seu corpo, prendendo-o a espada de Asulf em seu ombro!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Abrindo sua boca, como se fosse gritar, seus olhos e sua boca começam a emiter uma luz branca!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Anton ataca Asulf com essa energia! \n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Por pouco, Asulf escapa, porém seu braço esquerdo está destruído! Dano " + dano + "\n", TimeUnit.MILLISECONDS, temp_dialog);
				} else if (contador == 14) {
					dano = 200;
					hpAntonBossFight = hpAntonBossFight - dano;
					
					Digita("— ANTON!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println();
					Digita("— PAI!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println();
					Digita("\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Anton sofreu " + dano +"\n", TimeUnit.MILLISECONDS, temp_dialog);
					dano = 40;
					hpUsuario = hpUsuario - dano;
					System.out.println();
					Digita("Asulf sofreu " + dano +"\n", TimeUnit.MILLISECONDS, temp_dialog);
				} else {
					
					if (valor == 0) {
						Digita("Anton desvia do ataque! Dano 0\n", TimeUnit.MILLISECONDS, temp_dialog);		
						
					} else if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5) {
						dano = ataqueForca.nextInt(20) + 80;
						hpAntonBossFight = hpAntonBossFight - dano;
						Digita("O seu ataque não foi tão eficaz! Dano " + dano + ".\n", TimeUnit.MILLISECONDS, temp_dialog);
					} else if (valor == 6 || valor == 7 || valor == 8) {
						dano = ataqueForca.nextInt(60) + 100;
						hpAntonBossFight = hpAntonBossFight - dano;
						Digita("O seu ataque foi eficaz! Dano " + dano + ".\n", TimeUnit.MILLISECONDS, temp_dialog);
					} else if (valor == 9) {
						dano = ataqueForca.nextInt(60) + 120;
						hpAntonBossFight = hpAntonBossFight - dano;
						Digita("O seu ataque foi eficaz! Dano " + dano + ".\n", TimeUnit.MILLISECONDS, temp_dialog);
					}
					
					ataqueDeAntonDeus(hpAntonBossFight); //Ataque do Anton Deus
				}
				

		
				contador++; //Aumenta o contador para ir trocando de falas.
				
				System.out.println();
				break;	
			case "2": //ataque das Chamas Negras
				
				System.out.println();
				if (chamasNegras > 0) {
					chamasNegras--;
					
					if (contadorChamasNegras == 0) {
						
						dano = 200;
						hpAntonBossFight = hpAntonBossFight - dano;
						Digita("Cobrindo todo o seu corpo com a energias das Chamas! \n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Asulf lança em si mesmo as Chamas Negras!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Tendo as Chamas Negras como um manto quente, ele avança em direção Anton! \n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("O impacto é tão grande que nem a áurea de luz branca de Anton é capaz de resistir! Dano " + dano +"\n", TimeUnit.MILLISECONDS, temp_dialog);
						dano = 20;
						hpUsuario = hpUsuario - dano;
						System.out.println();
						Digita("Anton, parecendo copiar Asulf, cobre-se inteiro de energia branca divina!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Anton avança em direção a Asulf!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("O impacto é tanto que a própria torre de Gnosis treme! Dano " + dano + "\n", TimeUnit.MILLISECONDS, temp_dialog);
					} else if (contadorChamasNegras == 2 ) {
						dano = 200;
						hpAntonBossFight = hpAntonBossFight - dano;
						Digita("Asulf levanta as duas mãos para o alto, invocando dois monstros!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Dois Dragões Negros saem da magia de Asulf!!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Os dois vão em direção a Anton, um atacando-o por cima, outro por baixo e Asulf pelo meio!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Os dois Dragões atingem Anton, causando uma explosão de Chamas Negras! Dano " + dano +"\n", TimeUnit.MILLISECONDS, temp_dialog);
						dano = 25;
						hpUsuario = hpUsuario - dano;
						System.out.println();
						Digita("Anton voa para o alto e com as duas mãos, invoca dois demônios!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Os demônios vão em direção a Asulf!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Asulf desvia do monstro!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Mas Anton teleporta-se acima de Asulf, transferindo uma cotovelada em suas costas! Dano " + dano + "\n", TimeUnit.MILLISECONDS, temp_dialog);
					} else if (contadorChamasNegras == 4) {
						dano = 200;
						hpAntonBossFight = hpAntonBossFight - dano;
						Digita("Asulf, utilizando as Chamas Negras, voa em direção a Anton!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Jogando a energia no chão, assim pegando impulso!  \n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Asulf aproximando-se de Anton no céu, gira! \n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Lançando as Chamas Negras em aspiral em direção de Anton! \n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("UM FURACÃO DE CHAMAS!!!!!! Dano " + dano + "\n", TimeUnit.MILLISECONDS, temp_dialog);
						dano = 30;
						hpUsuario = hpUsuario - dano;
						System.out.println();
						Digita("Anton é pego pelas chamas!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Entretando, não recua após o golpe direto!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Ele gira em direção a Asulf, lançando-o um contra-golpe!!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("UM ASPIRAL DIVINO!!!!!! Dano " + dano + "\n", TimeUnit.MILLISECONDS, temp_dialog);
					} else {
						
						valor = ataqueForca.nextInt(2);
						
						if (valor == 0) {
							hpAntonBossFight = hpAntonBossFight - 100;
							Digita("CHAMAS NEGRAS! Dano 100", TimeUnit.MILLISECONDS, temp_dialog);
						} else {
							hpAntonBossFight = hpAntonBossFight - 200;
							Digita("CHAMAS NEGRAS! Dano CRÍTICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
						}
						
						System.out.println();
						ataqueDeAntonDeus(hpAntonBossFight); //Ataque do Anton Deus
						
					}
				
				} else {
					hpUsuario = hpUsuario - 5;
					Digita("Ao tentar invocar as Chamas Negras sem energia, Asulf é atacado! Dano 5",
							TimeUnit.MILLISECONDS, temp_dialog);
				}
				contadorChamasNegras++; //Aumenta o contador para ir trocando de falas no ataque de chamas negras.
				
				
				break;
			case "3": //Usando o elixir da vida
				

				System.out.println();
				if (elixirDaVida > 0) {
					hpUsuario = hpUsuario + 75;
					elixirDaVida--;
					if (hpUsuario > 100) {
						hpUsuario = 100;
					}
					
					if (contadorElixirDaVida == 0) {
									
						Digita("Filho... Vida + 75\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
						
					} else if (contadorElixirDaVida == 2 ) {
						
						Digita("Eu vou te salvar... Vida + 75\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
					
					} else if (contadorElixirDaVida == 4) {
						
						Digita("Anton... Vida + 75\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
						
					} else if (contadorElixirDaVida == 6) {
						Digita("O que eles fizeram contigo, Anton... Vida + 75\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
					
					} else if (contadorElixirDaVida == 8) {
						Digita("Nunca irei perdoá-los... Vida + 75\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
						
					} else if (contadorElixirDaVida == 10) {
						Digita("MALDITOS!!! Vida + 75\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
						
					} else if (contadorElixirDaVida == 12) {
						Digita("ANTON! Vida + 75\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
						
					} else {
						
						Digita("Asulf recupera vida! Vida + 75\n", TimeUnit.MILLISECONDS, temp_dialog);
						
						System.out.println();
						ataqueDeAntonDeus(hpAntonBossFight); //Ataque do Anton Deus
						
					}
				
				} else {
					hpUsuario = hpUsuario - 5;
					Digita("Ao tentar curar-se sem o Elixir da Vida, Asulf é atacado! Dano 5",
							TimeUnit.MILLISECONDS, temp_dialog);
				}
				contadorElixirDaVida++; //Aumenta o contador para ir trocando de falas.
				
				
				break;
			case "4": //Usando Sabedoria de Odin
				
				System.out.println();
				if (sabedoriaDeOdin > 0) {
					sabedoriaDeOdin--;
					
					if (contadorSabedoriaDeOdin == 0) {
						
						dano = 200;
						hpAntonBossFight = hpAntonBossFight - dano;
						Digita("Respirando fundo, uma áurea elétrica percorre Asulf! \n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Asulf em um piscar de olho aparece no flanco de Anton!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Anton olha à direita, mas Asulf já está à esquerda! \n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Anton vira novamente, mas Asulf já está em suas costas! \n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Um... dois... três ataques rápidos! Mirando exatamento no símbolo que controla Anton! Dano " + dano +"\n", TimeUnit.MILLISECONDS, temp_dialog);
						dano = 0;
						hpUsuario = hpUsuario - dano;
						System.out.println();
						Digita("Anton, tenta acertar Asulf, mas sua velocidade é divina! Dano " + dano + "\n", TimeUnit.MILLISECONDS, temp_dialog);
						
					} else if (contadorSabedoriaDeOdin == 1 ) {
						dano = 200;
						hpAntonBossFight = hpAntonBossFight - dano;
						Digita("Asulf vai em direção a Anton que está à frente do castelo!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Anton tenta acertá-lo, mas Asulf desvia!!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Socando-o para os céus!!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Ainda voando com a potência do golpe, Asulf aparece acima de Anton!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Com sua espada apontada aos céus, Asulf materializa um raio!!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("O raio atinge Anton em cheio, fazendo um estrondo que podia-se ouvir por toda A Torre de Gnosis! Dano " + dano +"\n", TimeUnit.MILLISECONDS, temp_dialog);
						dano = 6;
						hpUsuario = hpUsuario - dano;
						System.out.println();
						Digita("Anton parece não se abalar!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Anton tenta segurar Asulf com as mãos!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Mas Asulf escapa!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Porém esse aperto causado no braço, é o suficiente para causar dano à Asulf e sua armadura! Dano " + dano + "\n", TimeUnit.MILLISECONDS, temp_dialog);
					} else if (contadorSabedoriaDeOdin == 2) {
						dano = 200;
						hpAntonBossFight = hpAntonBossFight - dano;
						Digita("Asulf, utilizando sua velocidade, voa em direção a Anton!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Anton, no topo do castelo, joga esferas enérgicas em Asulf!  \n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Asulf desvia com destreza! \n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Aproximando-se de tanto e socando-o para o chão! \n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Asulf acerta 50 golpes em sequência!!!!!! Dano " + dano + "\n", TimeUnit.MILLISECONDS, temp_dialog);
						dano = 7;
						hpUsuario = hpUsuario - dano;
						System.out.println();
						Digita("Dos 50 golpes dados por Asulf!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Anton consegue somente reagir acertando um golpe de raspão! Dano " + dano + "\n", TimeUnit.MILLISECONDS, temp_dialog);
					} else {
						
						valor = ataqueForca.nextInt(2);
						
						if (valor == 0) {
							hpAntonBossFight = hpAntonBossFight - 100;
							Digita("ODIN!!!! Dano 100", TimeUnit.MILLISECONDS, temp_dialog);
						} else {
							hpAntonBossFight = hpAntonBossFight - 200;
							Digita("ODIN!!!! Dano CRÍTICO! 200", TimeUnit.MILLISECONDS, temp_dialog);
						}
						
						System.out.println();
						ataqueDeAntonDeus(hpAntonBossFight); //Ataque do Anton Deus
						
					}
				
				} else {
					hpUsuario = hpUsuario - 5;
					Digita("Ao tentar invocar a Sabedoria de Odin sem energia, Asulf é atacado! Dano 5",
							TimeUnit.MILLISECONDS, temp_dialog);
				}
				contadorSabedoriaDeOdin++; //Aumenta o contador para ir trocando de falas no ataque de chamas negras.
				
				break;
			default:
				break;
			}
			
			if (hpUsuario <= 0) {
				Digita("Morto pelo próprio filho...\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
				Digita("Uma trágedia predestinada pelo destino...\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
				Digita("Ou decidida pela sua própria fraqueza...?\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
				System.out.println();
				Digita("Fim de Jogo.\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
				System.exit(0);
			}
			
			if (hpAntonBossFight <= 300) {
				vitoria = true;
				break;
			}

		} while (vitoria == false);
		vitoria = false;
		//LUTA ANTON - BOSS FIGHT, TERMINA AQUI.
		System.out.println();
		System.out.println();

		Digita("	— Chega, pai! Eu estou cansado de você! Acredito que o senhor não se encaixa no\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("meu novo mundo, MORRA!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O jovem começa a liberar todo o seu poder acumulado. Toda a energia que ele\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("recebeu do universo agora é transportada para fora de seu corpo em forma de luz branca. A\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("energia é tão poderosa que queima completamente a sua armadura e suas armas, as\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("fortificações do castelo são destruídas, o mar começa a secar e a sua pele está em\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("chamas.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O guerreiro luta para se manter de pé e não ser arremessado pelo poder de seu\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("filho.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Além da dor excruciante, Asulf sente outra coisa. A liberação de poder do Anton está\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("causando rachaduras no tecido do espaço-tempo deste universo, se ele não for parado, a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("barreira que divide os mundos pode sofrer danos irreversíveis, unindo vários mundos em\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("um e gerando o caos. Você precisa pará-lo agora!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Anton está cada vez mais fraco, liberar esta quantidade gigantesca de poder não faz\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("bem para a sua carcaça humana. Seu corpo arde, suas roupas monásticas foram\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("destruídas e sua pele fica cada vez mais vermelha, por alguns segundos o menino sent\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("tontura e seu poder cessar.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Asulf vê seu filho extremamente ferido por todos seus ataques, seu corpo está cheio\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("de cicatrizes, suas veias estão extremamente dilatadas, suas roupas estão rasgadas e o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("menino sangra litros. Em seu peito é possível ver um símbolo, o símbolo que o monge\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cravou nele.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Quando o garoto diminui a liberação de poder, Asulf vê uma chance. Ele pode atacar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para tentar destruir o símbolo, um ataque direto e certeiro no peito, está talvez seja a única\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("forma de trazer seu filho de volta ao senso, mas um ataque direto contra um semideus deve\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ser muito bem calculado, Anton não é burro, o menino irá revidar.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		
		int contadorW = 0; //contador troca de falas
		
		do {
			
			System.out.println();
			System.out.println();
			Digita("\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39",TimeUnit.MILLISECONDS, ultra_Speed);
			Digita("\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n",TimeUnit.MILLISECONDS, ultra_Speed);
			Digita("\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39",TimeUnit.MILLISECONDS, ultra_Speed);
			Digita("\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39",TimeUnit.MILLISECONDS, ultra_Speed);
			System.out.println();
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Deus Anton");
			Digita(hpUsuario + " \uD83D\uDC99", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                    ");
			Digita(hpAntonBossFight + " \uD83E\uDEC0\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("       ESPECIAIS                     ");
			System.out.println("* Chamas Negras: " + chamasNegras + "/10");
			System.out.println("* Elixir da Vida: " + elixirDaVida + "/15");
			System.out.println("* Sabedoria de Odin: " + sabedoriaDeOdin + "/5");
			System.out.println("====================                ====================");
			System.out.println();
			System.out.println("Digite 'W' para avançar! \u3030\uFE0F");
			
			alternativa = entrada.next();

			switch (alternativa.toLowerCase()) {
			case "w":
				
				if (contadorW == 0) {
					
					Digita("	Asulf corre para cima de Anton, o menino responde com uma rajada de energia\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("mágica apontada diretamente para o peito de seu pai.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	O guerreiro se esquiva da primeira rajada, pula para a direita esquivando da\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("segunda e rola no chão para desviar das próximas duas, até que Anton finalmente o acerta\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("com um raio contínuo que o acerta em seu braço esquerdo.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	Asulf não pode desistir agora, ele está tão perto!\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	Recebendo a rajada de energia, o velho se levanta, coloca o braço esquerdo na\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("frente do ataque e avança!\n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println();
					contadorW ++;
					
				} else if (contadorW == 1) {
					
					Digita("	Asulf avança enquanto o raio começa a fritar a sua mão.\n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println();
					contadorW++;
					
				} else if (contadorW == 2) {
					
					Digita("	Chegando cada vez mais perto, o menino se encontra paralisado com o avanço de\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("seu pai, que resiste ao poder dos seres ancestrais, ele só consegue mandar rajadas mais\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("fortes.\n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println();
					contadorW++;
					
				} else if (contadorW == 3) {
					
					Digita("	Sua mão começa a derreter em contato com o poder de seu filho, Asulf se aproxima\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("cada vez mais e, quando está a meio metro do jovem, pula em sua direção e afasta sua\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("mão direita, que liberava a rajada.\n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println();
					Digita("	— VELHO MALDITO, morre logo! — Anton berra, e com sua esquerda, acerta um\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("golpe em cheio no peito de seu pai.\n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println();
					Digita("	A mão atravessa o peito de Asulf, abrindo um buraco em seu tórax, deixando o seu\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("corpo mole.\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("	— Eu não posso morrer filho — o velho vomita sangue — não enquanto você estiver\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("em perigo — Asulf sorri para o menino —  é isso que um pai faz.\n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println();
					contadorW++;
					
				} else if (contadorW == 4) {
					
					Digita("	O velho guerreiro envolve sua mão intacta com chamas negras e com suas últimas\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("forças, repousa no símbolo de Anton.\n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println();
					Digita("	O menino berra de dor. O símbolo que influenciava sua mente agora foi substituído\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("por uma queimadura no formato da mão de seu pai. Sua visão que antes estava turva pelo\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("uso excessivo de poder, gradualmente clareia para revelar uma cena dantesca: o braço\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("esquerdo do jovem atravessado no peito de seu pai, que está mole em seus braços cheio\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("de feridas, queimaduras e vomita muito sangue.\n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println();
						
					vitoria = true;
				} 
				
			
				
			
				break;
			
			default:
			}

		} while (vitoria == false);
		vitoria = false;
	
		System.out.println();
	
		Digita("	— Pai? Meu deus, me perdoa! — Anton coloca seu pai em seu colo — eu não\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("queria fazer isso, eu tava confuso — as lágrimas começam a escorrer pelos seus olhos.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Seu velho sorri.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Tudo bem filho, você está bem, é isso que importa — o velho soldado tenta\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("acalmar o menino — por favor, Anton, você tem esses poderes agora... use-os direito.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O menino soluça incessantemente enquanto as lágrimas turvam a sua visão.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— O mundo não é justo, Anton, eu vi tanta morte, tanto sangue... agora você tem \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("esse poder — Asulf cospe mais sangue — use-o... use-o, Anton, para tornar esse mundo\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("um lugar um pouquinho melhor.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu prometo, pai! Eu prometo! — Anton tenta enxugar as lágrimas do próprio\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("rosto, mas novas sempre entram em seu lugar — por favor, continue comigo!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Sem você e sem a mamãe... eu não sei o que eu vou fazer!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Quando a morte se aproxima, aquilo que é verdadeiramente importante fica claro.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Asulf não sente mais seu corpo, o frio toma conta de seus sentidos e sua mente está\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("enevoada. Ele tenta se focar no que é mais importante, seu filho, que finalmente está com\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("você de novo, mas Ereshkigal chama por sua alma.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Você tem tanto potencial, filho...\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Pai, por favor, eu posso curá-lo!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Desculpa, Anton, eu preciso ir... eu acho que consigo ouvir ela, Anton... sua\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("mãe…\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O soldado está com o olhar perdido.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	O jovem utiliza seus poderes para curar seu pai, mas nada faz efeito, nem os\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("poderes do primeiro deus consegue curar Asulf. Quando a morte demanda por uma vida\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("não há nada que se possa fazer.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— MALDIÇÃO!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— FUNCIONA, PODERES MALDITOS! FAÇAM ALGUMA COISA!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Por favor, Deus... deuses... por favor, não deixem ele morrer — Anton suplica\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("desesperado — POR FAVOR, NÃO DEIXEM EU MATAR MEU PAI!\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	Asulf coloca as mãos no rosto de Anton.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Tudo bem, filho…\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Sua mãe e eu vamos estar sempre com você…\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Um fraco sorriso se abre no rosto de Asulf. O primeiro sorriso que ele esboça em\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("anos, talvez o sorriso mais feliz da sua vida.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("	— Eu te amo, filho.\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		System.out.println(); 
		//Pausa dramática
		Digita("	        \n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		//Fim da Pausa dramática
		Digita("			O garoto abraça seu pai, o velho guerreiro cumpriu sua missão.\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("			Seu filho está seguro.\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		Digita("			Agora você pode descansar.\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		
		Digita("	       \n", TimeUnit.MILLISECONDS, temp_dialogSlow);
		System.out.println();
		System.out.println();
		System.out.println();
		creditos();
	
		
		
	
	}




	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException { //função para animar as letras.
	    for (char caractere : mensagem.toCharArray()) {
	    System.out.print(caractere);
	    unit.sleep(tempo_mensagem);
	    }
	
	}
	
}
