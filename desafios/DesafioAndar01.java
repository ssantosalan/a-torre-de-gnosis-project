import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DesafioAndar01 {

	static int temp_dialog = 50, temp_questions = 15, temp_dialogSlow = 200, temp_dialogFast = 80, temp_dialogFaster = 30, ultra_Speed = 10,  temp_dotsSlow = 400, temp_dots = 200;
	//Para não ter delay no jogo, coloque 0 em todas as variáveis acima.
	//Valor das variáveis caso vc queira zerar em cima e rodar sem delay, mas posteriormente colocando o valor certo:
	//temp_dialog = 50, temp_questions = 15, temp_dialogSlow = 200, temp_dialogFast = 80, temp_dialogFaster = 30, ultra_Speed = 10,  temp_dotsSlow = 400, temp_dots = 200;
	
	public static void main(String[] args) throws Exception{
		Scanner entrada = new Scanner(System.in);	
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
			System.err.println("Derrota pelas próprias emoções... Deplorável...");
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
			Digita("Não parecia que esses pequeninos estavam querendo te prejudicar...",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Mas você é tão fraco que não conseguiu nem se manter de pé ao se aproximarem...",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Você perde o controle de sua respiração...",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("... Filho...",TimeUnit.MILLISECONDS, temp_dialogSlow);
			Digita("Chamas negras começam a surgir de vocês...",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Você não se lembra de mais nada...",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Nem do seu próprio filho...",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Você se tornou um Hollow",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Desequilibrado pelas energias dos outros... Vergonhoso.",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("Fim de Jogo.",TimeUnit.MILLISECONDS, temp_dialog);
			System.exit(0);
			
		}	
		alternativaCerta = false;
		contador = 0;	
		
		System.out.println();
		Digita("Ao aguentar a quantidade imensa de energia que os pequeninos emanavam, você entender o que eles estavam querendo te dizer.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Que mais à frente você encontraria um Monge que fazia parte da Ordem da Sabedoria e Sofrimento.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("O Monge estava corrompendo o local próximo dos Portões de Fogo, tomando para sim as energias corrompidas dos Hollows que ali habitavam.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Para seguir em frente, você precisaria aprender a manipular todas as chamas do lugar, principalmente as Chamas Negras.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Você pensa: 'Por isso vocês apareceram, se eu não conseguisse nem suportar as energias que vocês emanavam por conta própria, eu não seria nem capaz de chegar perto do local.'\n",TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("------------Chamas Negras APRENDIDA!!!!!------------\n",TimeUnit.MILLISECONDS, temp_dialogSlow);
		System.out.println();
		int chamasNegras = 5; //quantidade de Especial
		
		Digita("Ao continuar o caminho pelo prado, você avista de longe os Portões de Fogo.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("E também, próximo aos Portões de Fogo, uma quantidade imensa de Hollows —— pessoas que não conseguiram passar pelos Portões.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("E lá estava ele, o Monge que os pequeninos te avisaram que estava corrompendo o lugar.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("Ao te ver, ele paga uma quantidade maior ainda de Energia Negra dos Hollows e cria um Monstro terrível... Um Centopeia Corrompida!\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("VENÇA A TODO CUSTO!!!!\n",TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		
		boolean vitoria = false; 		//Utilizado quando o Usuário vence do 'Computador' e sai do loop.
		int hpUsuario = 100;          
		int hpMonstro = 500;
		Random ataqueForca = new Random(); // Força do ataque dado por uma aleatoriedade.
		int dano = 0; //dano causado pelo ataque.
		int valor; //Valor gerado pela 'aleatoriedade'.

		do {
			System.out.println("====================                ====================");
			System.out.println("Asulf   STATUS                           Monge Corrompido");
			Digita(hpUsuario + " 💙", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.print("                                   ");
			Digita(hpMonstro + " 🖤\n", TimeUnit.MILLISECONDS, temp_dialogSlow);
			System.out.println("       ESPECIAIS                     ");
			System.out.println("* Chamas Negras: " + chamasNegras);
			System.out.println("====================                ====================");

			System.out.println("Escolha seu ataque");
			System.out.println("1 - Ataque Cortante ⚔️     3 - Chamas 🔥");
			System.out.println("2 - Chamas Negras ✴️ ♠️    4 - Odin   ⚡");
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
					System.err.println("Fim de Jogo. ");

					System.exit(0);
				}
				System.out.println();

				break;
			case "2":
				valor = ataqueForca.nextInt(1);

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
						Digita("Asulf desvia do ataque das Chamas Corropidas do Monge!", TimeUnit.MILLISECONDS, temp_dialog);
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
					System.err.println("Fim de Jogo. ");

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
				System.out.println("                                       —————————————");
				
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
							System.out.println("Escolha de suas pertubações quânticas: " + a);
							System.out.println();
							System.out.println("-----------Placar--------------------= " + placar);
						} else if (placar == 12 || placar == 15 || placar == 18) {
							placar = placar + 2;
							placarDerrota = placar;
							System.out.println("Escolha de suas pertubações quânticas: " + a);
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
							System.out.println("Escolha de suas pertubações quânticas: " + a);
							System.out.println();
							System.out.println("-----------Placar--------------------= " + placar);
						} else if (placar == 12 || placar == 15 || placar == 18) {
							placar = placar + 2;
							placarDerrota = placar;
							System.out.println("Escolha de suas pertubações quânticas: " + a);
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

		
		
		System.out.println("1 - Continuar no próximo andar.");
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
				
				
				
				
				
				
				
				
				
	}
				
	
	
	
				
	
				public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException { //função para animar as letras.
			        for (char caractere : mensagem.toCharArray()) {
			        System.out.print(caractere);
			        unit.sleep(tempo_mensagem);
			        }

			    }
				
			}
