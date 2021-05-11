import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ATorreDeGnosis {
	//static int hpProtagonista = 100; variável global para o HP do protagonista
	
	static int temp_dialog = 0, temp_questions = 15, temp_dialogSlow = 200, temp_dialogFast = 80, temp_dialogFaster = 30, ultra_Speed = 10,  temp_dotsSlow = 400, temp_dots = 200;
	//Para não ter delay no jogo, coloque 0 em todas as variáveis acima.
	//Valor das variáveis caso vc queira zerar em cima e rodar sem delay, mas posteriormente colocando o valor certo:
	//temp_dialog = 50, temp_questions = 15, temp_dialogSlow = 200, temp_dialogFast = 80, temp_dialogFaster = 30, ultra_Speed = 10,  temp_dotsSlow = 400, temp_dots = 200;
	
	public static void main(String[] args) throws Exception{
		Scanner entrada = new Scanner(System.in);
		String opcao;
		Boolean tacerto = false;

		/*
		 * Explicação dos próximos comandos:
		 * 
		 * O "do" vai iniciar o Menu do jogo. E vai continuar rodando até o cliente
		 * escolher "1 - Jogar", "4- Capítulos" ou "5- Sair". Na opção "4 - Capítulos",
		 * temos um "Switch" dentro que leva para o capítulo escolhido, ou o cliente
		 * pode selecionar a opção "voltar" para retornar ao menu.
		 */

		do {

			System.out.println("1 - Jogar");
			System.out.println("2 - Instruções");
			System.out.println("3 - Créditos");
			System.out.println("4 - Capítulos");
			System.out.println("5 - Sair");
			opcao = entrada.next();

			switch (opcao) {
			case "1":
				capitulo1();
				tacerto = true;
				break;
			case "2":
				System.out.println("Instruções");
				break;
			case "3":
				System.out.println("Roteiro por Alan Siva dos Santos");
				System.out.println("Motor gráfico por Alan Silva dos Santos");
				System.out.println("Revisão por Alan Silva dos Santos");
				System.out.println("Obrigado!");
				break;

			case "4":
				System.out.println("1 - Capítulo 1");
				System.out.println("2 - Capítulo 2");
				System.out.println("3 - Capítulo 3");
				System.out.println("4 - Capítulo 4");
				System.out.println("5 - Voltar ");
				System.out.print("Digite o capítulo desejado: ");
				opcao = entrada.next();

				switch (opcao) {
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
		System.out.println("Capítulo 1 inicia");
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
		Digita("enquanto outra tropa é responsável por destruir os portões principais.  \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("	Após horas de luta, sua tropa consegue rechaçar a resistência restante em terra e com a ajuda de aríetes, estão começando o processo de destruição do muro. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Senhor, senhor, temos um problema! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você vê um jovem soldado correndo em sua direção. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— O que foi jovem? \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Os portões senhor, os Zarkeanos abriram eles e soltaram a cavalaria e os cães! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Você não espera que o soldado termine de falar e dispara em direção aos inimigos. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Quando chega no campo de batalha — um terreno plano de gramado verde — agora se sujo com o vermelho do sangue dos corpos e dos feridos. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você percebe que além da cavalaria e dos cães, soldados que estavam na cidade também saíram para ajudar seus companheiros.  \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Um soldado vem em sua direção com a espada pronta para te acertar com um golpe. \n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		//Primeira luta começa aqui
		Scanner entrada = new Scanner(System.in);
		boolean vitoria = false; 		//Utilizado quando o Usuário vence do 'Computador' e sai do loop.
		int hpUsuario = 100;      	//Vida do protagonista    
		int hpMonstro01 = 100;		//Vida do inimigo
		String alternativa;			//Alternativa do switch
		Random ataqueForca = new Random(); // Força do ataque dado por uma aleatoriedade.
		int dano = 0; //dano causado pelo ataque.
		int valor; //Valor gerado pela 'aleatoriedade'.

		do {
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Soldado Zarkeano");
			Digita(hpUsuario + " 💙", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita(hpMonstro01 + " 🖤\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
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
			Digita(hpUsuario + " 💙", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita(hpMonstro02 + " 🖤\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("       ESPECIAIS                     ");
			System.out.println();
			System.out.println("====================                ====================");

			System.out.println("Escolha seu ataque");
			System.out.println("1 - Ataque Cortante ⚔️ ");
			
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
		Digita("No chão podem ser vistos cadáveres do que parece ter sido soldados que enfrentaram este menino. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	O garoto, agora surrado e sujo de sangue, usa uma armadura de couro com revestimento de uma cota de malha metálica, botas leves e um capacete \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("que cobre apenas a parte superior de seu rosto, começando pelo nariz e terminando em chifres colocados por ele mesmo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	Asulf dispara em direção à luta! \n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		
		int hpMonstro03 = 100; //Terceiro inimigo começa aqui
		do {
			System.out.println();
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Grupo de Soldados Zarkeanos");
			Digita(hpUsuario + " 💙", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita(hpMonstro03 + " 🖤\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita("	 100" + " 🖤\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita("	 100" + " 🖤\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita("	 100" + " 🖤\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("       ESPECIAIS                     ");
			System.out.println();
			System.out.println("====================                ====================");
			System.out.println("Escolha seu ataque");
			System.out.println("1 - Ataque Cortante ⚔️ ");
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
		Digita("	— Você não aprendeu nada, Anton? 一  Você exclama. \n", TimeUnit.MILLISECONDS, temp_dialog);
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
		Digita("triplo o quádruplo do que Zark lhe pagava, apenas para não se envolver na luta. O primeiro mensageiro voltou dizendo que \n", TimeUnit.MILLISECONDS, temp_dialog);
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
		Digita("	— Você não entende, Asulf! Seu rei traiu meus soldados! — Ele fala com raiva — Depois de anos protegendo seu país nós \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("enxotados de lá! Aqui nós temos a confiança do rei! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Siegfried, você sabe que não foi isso que aconteceu! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Chega de conversa! — Ele te interrompe, ficando em posição de ataque — Ambos sabemos que não vamos chegar em um acordo. \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Vamos acabar logo com isso! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("	— Tudo bem, Siegfried. Vamos acabar com isso! \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" \n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(" \n", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println("TO BE CONTINUED...");
	}

	public static void capitulo2() {
		System.out.println();
		System.out.println("Capítulo 2 inicia");

	}

	public static void capitulo3() {
		System.out.println();
		System.out.println("Capítulo 3 inicia");

	}

	public static void capitulo4() {
		System.out.println();
		System.out.println("Capítulo 4 inicia");

	}




	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException { //função para animar as letras.
	    for (char caractere : mensagem.toCharArray()) {
	    System.out.print(caractere);
	    unit.sleep(tempo_mensagem);
	    }
	
	}
	
}
