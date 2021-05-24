import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ATorreDeGnosis {
	static Scanner entrada = new Scanner(System.in); //variável global de entrada
	static int hpUsuario = 110, chamasNegras = 5, elixirDaVida = 15, sabedoriaDeOdin = 10; //vida global do protagonista e habilidades
	static int temp_dialog = 0, temp_questions = 15, temp_dialogSlow = 200, temp_dialogFast = 80, temp_dialogFaster = 30, ultra_Speed = 10,  temp_dotsSlow = 400, temp_dots = 200;
	//Para não ter delay no jogo, coloque 0 em todas as variáveis acima.
	//Valor das variáveis caso vc queira zerar em cima e rodar sem delay, mas posteriormente colocando o valor certo:
	//temp_dialog = 50, temp_questions = 15, temp_dialogSlow = 200, temp_dialogFast = 80, temp_dialogFaster = 30, ultra_Speed = 10,  temp_dotsSlow = 400, temp_dots = 200;
	
	public static void main(String[] args) throws Exception{
		String opcao;
		Boolean tacerto = false;

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
				System.out.println("Instruções");
				System.out.println();
				System.out.println("O jogo é baseado em escolhas.");
				System.out.println("Você terá que informar ou '1' ou '2' ou '3' ou '4' ou '5' de acordo com as opções.");
				System.out.println("Também haverá momentos em que você deverá informar ou 'a' ou 'b' ou 'c' ou 'd' ou 'e' de acordo com as opções.");
				System.out.println("Também haverá momentos que terá a opção para digitar 'X' para 'voltar'.");
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
				System.out.println("1 - Capítulo 1: Pai e Filho");
				System.out.println("2 - Capítulo 2: O Monge");
				System.out.println("3 - Capítulo 3");
				System.out.println("4 - Capítulo 4: 1º Andar - Portões de Fogo");
				System.out.println("5 - Capítulo 5");
				System.out.println("6 - Capítulo 6: 3º Andar - Anjos Caídos");
				System.out.println("7 - Capítulo 7: 4º Andar - BOSS FIGHT - Would you kill your son?");
				System.out.println("X - Voltar ");
				System.out.print("Digite o capítulo desejado: ");
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
					System.out.println("Entenda que você tem que digitar 1 ou 2 ou 3 ou 4 ou 5.");
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
	//Capítulo 1 inicia-se aqui
	public static void capitulo1() throws InterruptedException{
		System.out.println();
		System.out.println("Capítulo 1: Pai e Filho");
		System.out.println();
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
		String alternativa;			//Alternativa do switch
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
		Digita("	— Você não aprendeu nada, Anton?! 一  Você exclama. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Quantas vezes não te falei para não se permitir ser cercado? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Mas pai... Estava tudo sob controle! 一 Anton se defende. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eu sabia que eles estavam atrás de mim! Já havia matado vários deles! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ele aponta para os cadáveres no chão e contando com os dois que acabaram de serem mortos, era possível contar seis corpos jogados no chão. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Eles estavam com medo pai! Estavam hesitando em me atacar! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— E como você pode ter certeza disso? Ainda por cima fica utilizando estas adagas. — Asulf fala com desdém. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	— Essas lâminas são muito curtas. Você não pode ficar chegando tão perto do inimigo toda vez que for lutar com alguém.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" 	— Foi a minha mãe que me ensinou a lutar assim! 一 Ele defende-se novamente, claramente irritado por ser criticado sobre sua forma de lutar. \n", TimeUnit.MILLISECONDS, temp_dialog);
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
		Digita("	— Você sabe o porquê de estarmos aqui. — Você diz \n", TimeUnit.MILLISECONDS, temp_dialog);
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
		Digita("	— Não acha que eles vão demorar para sair de lá? 一 Anton pergunta.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Não sei, Zarkeanos são conhecidos por não se renderem fácil. Vai depender\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("muito de quem está no comando por lá.  一 afirma o pai do menino.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Tomara que isso não dure mais do que o necessário, passar o inverno aqui\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("não estava nos meus planos para esse ano.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Não se preocupe, logo reforços vão chegar e eles vão tomar conta da região por\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nós. Em dois meses no máximo nós estaremos em casa.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Tomara 一 Anton responde, visivelmente entediado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		
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
		Digita("	— Nós preferimos a segunda opção 一 diz Asulf 一 Na verdade, as pessoas\n", TimeUnit.MILLISECONDS, temp_dialog);
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
		Digita("	— O que está acontecendo aqui, pai?!  一 Antom pergunta.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Nada! Volte para casa! Vá treinar! 一 fala de forma ríspida.\n", TimeUnit.MILLISECONDS, temp_dialog);
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
		Digita("tentou esfaquear uma parede de pedras maciças.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Agora um dos generais berra para que seus guerreiros avancem contra o\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homem e seus servos e ao fazer isso um dos homens vestidos de vermelho que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("segurava um livro, começa a se contorcer, como se houvesse algo em sua barriga.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Assim que os soldados sacam as suas armas, o monge abre a boca e baratas\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("voadoras saem dela em direção dos soldados, instaurando pânico nos seus\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("companheiros.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	No meio do caos o sacerdote acerta um chute em seu peito, tirando por\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("completo seu fôlego e arremessando-o para trás com uma força estarrecedora.\n", TimeUnit.MILLISECONDS, temp_dialog);
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
		Digita("	一 Me perdoe, meu amigo, obrigado pelos seus serviços 一 Asulf diz ao\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("cadáver 一 Obrigado por tudo.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Indo em direção à casa em que Anton estava, encontra Rurik no mesmo lugar\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que estava antes, você pararia para checar seus batimentos cardíacos mas a situação\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("não permite desperdiçar tempo e reza para ele estar apenas desmaiado.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Asulf ouve um grito vindo em direção aos fundos da casa, correndo na direção\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("do som, chega à cozinha. O que a alguns momentos atrás era uma cozinha comum\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("agora estava revirada devido à luta. Possui um buraco na parede que leva aos fundos\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("da casa onde provavelmente esta família usava para criar porcos. O que vê através do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("buraco é seu filho coberto de lama e esterco, se arrastando para tentar fugir do\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("homem de branco que empunha seu chicote.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Enquanto o padre está apenas com a barra da batina suja pelo chão imundo,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("seu filho está gravemente ferido, com o corpo cheio de cortes causados pelo chicote,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com o lado esquerdo do rosto inchado pelo que provavelmente foi um soco fraco\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("dado pelo padre e com uma de suas pernas quebradas, ele rasteja ferido e sangrando\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("para longe do homem que se diverte com o seu sofrimento.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Isso! Filho da criança, você sente?! 一 O homem diz 一 O sangue, a dor, use\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("ela para aprender! Sinta o que tem além dela, sinta a santidade que está por trás de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("todos os seus sentidos! 一 o monge exclama.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	一 Vamos, pequenino! 一 chicoteia seu filho 一 Olhe além desta dor mundana,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("use ela para se aproximar da iluminação, esta será a sua primeira lição: nada é bom,\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nada é mau, as coisas apenas aproximam-se ou afastam-se de viver o que é a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("realidade de verdade.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Ver a cena o enfurece mas o que esgota a sua paciência de vez, não é a\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("batalha desnecessária, não são seus  amigos mortos, não é ter sido arremessado, é\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("o cheiro! Sobre todo fedor de sangue, morte e esterco que sentiu hoje, um cheiro se\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("sobressai: o cheiro de sangue… sangue do seu filho!\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("O sangue de Asulf fervilha em suas veias, sua visão se avermelha e ele berra\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("一 Sua luta é comigo, monstro! Não encoste no meu filho!\n", TimeUnit.MILLISECONDS, temp_dialog);
	
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
								
				Digita("	Asulf não espera que o homem se vire para enfrentá-lo frente a frente e corre \n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("em direção ao padre, desferindo um golpe com sua nova espada. A lâmina atravessa\n", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("as roupas da criatura e atinge o homem de raspão, abrindo um corte em sua cintura! Dano ???\n", TimeUnit.MILLISECONDS, temp_dialog);
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
		System.out.println("Capítulo 3 inicia");

		
		
		capitulo4();
	}

	public static void capitulo4() throws InterruptedException {
		System.out.println();
		System.out.println("Capítulo 4: 1º Andar - Portões de Fogo");
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
		System.out.println("Bebê-la?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
				
				
		do {	
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
		
		System.out.println("1 - Pegar");
		
		do {
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
		
		System.out.println("Pedir ajuda para entender a base do conceito da linguagem de Binários?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		
		do {
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
			System.out.println("Resposta incorreta nas 3 tentativas... ");
			System.out.println("Toda sua emoção começa a consumi-lo... Você tenta lembrar de seu filho... Mas não consegue...");
			System.out.println("... Você se tornou Vazio...");
			System.err.println("Derrotado pelas próprias emoções... Deplorável...");
			System.err.println("Fim de jogo.");
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
			System.out.println("Você não encontra a respiração ideal... ");
			System.out.println("O teu corpo sente-se fraco...");
			System.out.println("As chamas... as chamas... estão tomando a sua consciência...");
			System.err.println("Até caminhar sobre esse andar é muito para você... Deplorável...");
			System.err.println("Fim de jogo.");
			System.exit(0);
		}
		
		alternativaCerta = false;
		contador = 0;	
		
		System.out.println("1 - Caminhar mantendo a sua respiração.");
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
		
		Digita("Você pensa: 'Até mesmo andar por aqui não é para os fracos de coração...'\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		
		System.out.println("1 - Eu consigo...");
		do {
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
		Digita("=================|                          |=================\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("-----------------| Chamas Negras APRENDIDA  |-----------------\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("=================|                          |=================\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		
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
					Digita("O seu ataque não foi tão eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
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

						Digita("Monge usou Chamas Enérgicas dos Hollows! Dano " + dano, TimeUnit.MILLISECONDS,
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
					Digita("Até mesmo o Primeiro Andar é demais para você...", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Derrotado pelo Monge Corrompido... Ele utiliza o seu corpo morto para corromper os Portões de Fogo...", TimeUnit.MILLISECONDS, temp_dialog);
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
					Digita("Até mesmo o Primeiro Andar é demais para você...", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Derrotado pelo Monge Corrompido... Ele utiliza o seu corpo morto para corromper os Portões de Fogo...", TimeUnit.MILLISECONDS, temp_dialog);
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
				System.err.println("Você fugiu de suas lutas... Lamentável");
				System.err.println("-- Fim de jogo --");
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

		
		
		
		do {
			System.out.println("1 - Continuar no próximo andar.");
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
	
		capitulo5();
		
		
		
		
		
		
		

	}
	
	public static void capitulo5() throws InterruptedException {
		System.out.println();
		System.out.println("Capítulo 5 inicia");
		
		
		capitulo6();
		
	}
	
	public static void capitulo6() throws InterruptedException {
		System.out.println();
		System.out.println("Capítulo 6: 3º Andar - Anjos Caídos");
		
		int cont = 0; //contador
		boolean resp1v = false; //resposta certa
		String resp1 = "2021", ex1;   //resposta do desafio
		String alternativa; //escolha do jogador
		boolean alternativaCerta = false; //para quando acertar a resposta
		
		
		//CONEXÃO DO ANDAR ANTERIOR
		
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
		
		Digita("	Ao continuar o caminho estreito da caverna, Asulf vê uma luz roxa brilhante mais à\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("frente e pensa:	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— “Talvez seja a saída”.\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Entrando onde essa luz roxa brilhava, ele se depara com o que parece ser uma sala\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("oval, formada por rochas e ametistas roxas. Ao centro dessa sala, parecia haver um painel	\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("com pedras ametistas em uma coluna de um metro e meio. A sala possuía três estátuas de\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("valquírias — deidades femininas que serviam Odin. Uma, de acordo com a  gravura na\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("estátua, chama-se Eir e segurava um escudo enorme. Outra chama-se Olrun e possuía\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("armadura leve e asas notáveis. A mais notável entre elas, era Sigrun. De acordo com as\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("gravuras, ela era a Rainha das Valquírias. Elas estavam segurando espadas longas que\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("apontavam para o chão ao redor do painel.\n", TimeUnit.MILLISECONDS, temp_dialog);
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
		Digita("	Após recitar e decifrar o enigma, a caverna começa a se mover. Um novo caminho se abre.\n",
				TimeUnit.MICROSECONDS, temp_dialog);
		Digita("Asulf nota que há um pergaminho na boca de umas das valquírias. Ele aproxima-se.\n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		do {
			System.out.println("1 - Pegar pergaminho");
			alternativa = entrada.next();
			switch (alternativa) {
			case "1":
				alternativaCerta = true;
				break;
			default:
				Digita("não pare!\n", TimeUnit.MILLISECONDS, temp_dialog);
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
				Digita("Não pare!\n", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}

		} while (alternativaCerta != true);
		alternativaCerta = false;
		System.out.println();
		
		Digita("	Ao passar pelo caminho que se abriu, Asulf ouve um barulho vindo de trás. As\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("valquírias estão vivas e estão vindo atrás de você. Derrote-as!!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
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
			System.out.println("* Chamas Negras: " + chamasNegras + "/5");
			System.out.println("* Elixir da Vida: " + elixirDaVida + "/15");
			System.out.println("* Sabedoria de Odin: " + sabedoriaDeOdin + "/10");
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
							Digita("O seu ataque não foi tão eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
						} else if (valor == 4 || valor == 5) {
							dano = ataqueForca.nextInt(60) + 60;
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
								dano = ataqueForca.nextInt(10) + 50;
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
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 6 || valor == 7 || valor == 8) {
								dano = ataqueForca.nextInt(5) + 10;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| se enfurece e vai para cima de Asulf! acertando uma sequência de socos! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 9 ||valor == 10) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| te ataca com força! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
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
								dano = ataqueForca.nextInt(10) + 50;
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
						if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5 || valor == 6) {					
							Digita("Olrun desviou de seu ataque! Ela é muito rápida! Dano 0. ", TimeUnit.MILLISECONDS, temp_dialog);				
						} else if (valor == 7 || valor == 8 || valor == 9) {
							dano = ataqueForca.nextInt(10) + 20;
							hpValquiria02 = hpValquiria02 - dano;
							Digita("O seu ataque não foi tão eficaz! Dano " + dano + ".", TimeUnit.MILLISECONDS, temp_dialog);
						} else if (valor == 10) {
							dano = ataqueForca.nextInt(30) + 60;
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
								dano = ataqueForca.nextInt(10) + 50;
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
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 6 || valor == 7 || valor == 8) {
								dano = ataqueForca.nextInt(5) + 10;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| se enfurece e vai para cima de Asulf! acertando uma sequência de socos! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 9 ||valor == 10) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| te ataca com força! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
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
								dano = ataqueForca.nextInt(10) + 50;
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
							dano = ataqueForca.nextInt(5) + 5;
							hpValquiria03 = hpValquiria03 - dano;
							Digita("Asulf atacou Eir! Ela é bem resistente! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);				
						} else if (valor == 7 || valor == 8 || valor == 9) {
							Digita("O seu ataque foi bloqueado pelo escudo de Eir! Dano 0.", TimeUnit.MILLISECONDS, temp_dialog);
						} else if (valor == 10) {
							dano = ataqueForca.nextInt(5) + 55;
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
								dano = ataqueForca.nextInt(10) + 50;
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
							if (valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 5) {
								Digita("Asulf desvia do ataque de Sigrun!", TimeUnit.MILLISECONDS, temp_dialog);
							} else if (valor == 6 || valor == 7 || valor == 8) {
								dano = ataqueForca.nextInt(5) + 10;
								hpUsuario = hpUsuario - dano;	
								Digita("|Sigrun| se enfurece e vai para cima de Asulf! acertando uma sequência de socos! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);						
							} else if (valor == 9 ||valor == 10) {
								dano = ataqueForca.nextInt(5) + 20;
								hpUsuario = hpUsuario - dano;
								Digita("|Sigrun| te ataca com força! Dano " + dano, TimeUnit.MILLISECONDS, temp_dialog);
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
								dano = ataqueForca.nextInt(10) + 50;
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
		Digita("	Derrotando a trindade das valquírias, Asulf segue seu pelo caminho que tinha se\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("aberto. Asulf avista uma uma ponte de concreto à sua frente. A ponte é impecável, sem\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("nenhum defeito. Embaixo da ponte, um abismo que não se enxergava nada. Do outro lado\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("da ponte, um portão enorme de concreto. À frente do portão, totens de madeira.\n", TimeUnit.MILLISECONDS, temp_dialog);
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
		System.out.println("Capítulo 7 inicia");
		
		
	
	}




	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException { //função para animar as letras.
	    for (char caractere : mensagem.toCharArray()) {
	    System.out.print(caractere);
	    unit.sleep(tempo_mensagem);
	    }
	
	}
	
}
