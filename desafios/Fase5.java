
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static torredegnose.Fase1.capitulo1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Fase5 {
	
   
	public static void alquimia(){
		
		String result;
		int tentativa = 0, pass = 0, vidas =0;
		boolean ok = false;
		
		Scanner entrada = new Scanner(System.in);
			
		do {
			
			System.out.println("Vá até a mesa de alquimia para descobrir o antídoto antes que o veneno faça efeito! Depressa!");
			System.out.println("É preciso solucionar a equação para encontrar a mistura exata dos ingredientes! Misture o pó de silício com as pepitas de ouro e hidróxido de cálcio!");
			
		List<String> urna = Arrays.asList("19", "21", "6", " 23", "12");
			
		Collections.shuffle(urna);
		
		String certo = "21";
		
		System.out.println("Qual o resultado da equação: ");
		System.out.println("10y - 5 (1 + y) = 3 (2y - 2) - 20");
		
		System.out.println("(A)" + urna.get(0));
		System.out.println("(B)" + urna.get(1));
		System.out.println("(C)" + urna.get(2));
		System.out.println("(D)" + urna.get(3));
		System.out.println("(E)" + urna.get(4));
		
		System.out.println("Digite a alternativa correta: ");
		result = entrada.next();
		
		switch (result.toLowerCase()) {
		
		case "a":
			tentativa++;
			if (urna.get(0).equals(certo)) {
				ok = true;
			} else {
				vidas++;
				System.out.println("Mistura incorreta, a cor não coincide com a esperada");
				System.out.println("*-------------------------------*");
			} break;
			
		case "b":
			tentativa++;
			if (urna.get(1).equals(certo)) {
				ok = true;
			} else {
				vidas++;
				System.out.println("Mistura incorreta, não deve acontecer uma pequena explosão");
				System.out.println("*-------------------------------*");
			} break;
			
		case "c":
			tentativa++;
			if (urna.get(2).equals(certo)) {
				ok = true;
			} else {
				vidas++;
				System.out.println("Mistura incorreta, a fórmula certa não possui névoa roxa");
				System.out.println("*-------------------------------*");
			} break;
			
		case "d":
			tentativa++;
			if (urna.get(3).equals(certo)) {
				ok = true;
			} else {
				vidas++;
				System.out.println("Mistura incorreta, talvez te transforme em um sapo");
				System.out.println("*-------------------------------*");
			} break;
			
		case "e":
			tentativa++;
			if (urna.get(4).equals(certo)) {
				ok = true;
			} else {
				vidas++;
				System.out.println("Mistura incorreta, não é normal sair faíscas");
				System.out.println("*-------------------------------*");
			} break;
		
		default:
			System.out.println("Operação ínvalida!");
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
		System.out.println("Os iluministas não usam a mesma lingua e sistema númeral que nós, faça a converção para saber qual é o frasco com reagente certo!");
		
		do {
			
			List<String> urna = Arrays.asList("1 0100", "1 1010", "1 0000", "1 0101", "1 0010");
			
			Collections.shuffle(urna);
			
			String certo = "1 0101";
			
			System.out.println("Converta o número de y para saber qual  reagente correto: ");
			System.out.println("y = 21");
			
			System.out.println("(A)" + urna.get(0));
			System.out.println("(B)" + urna.get(1));
			System.out.println("(C)" + urna.get(2));
			System.out.println("(D)" + urna.get(3));
			System.out.println("(E)" + urna.get(4));
			
			System.out.println("Digite a alternativa correta: ");
			result = entrada.next();
			
			switch (result.toLowerCase()) {
			
			case "a":
				tentativa++;
				if (urna.get(0).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Reagente incorreto, este não é o aspecto correto");
					System.out.println("*-------------------------------*");
				} break;
				
			case "b":
				tentativa++;
				if (urna.get(1).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Reagente incorreto, a cor não bate com a certa");
					System.out.println("*-------------------------------*");
				} break;
				
			case "c":
				tentativa++;
				if (urna.get(2).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Reagente incorreto, quantidade é menor do que desejada");
					System.out.println("*-------------------------------*");
				} break;
				
			case "d":
				tentativa++;
				if (urna.get(3).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Reagente incorreto, o correto não possui partes de animais na composição");
					System.out.println("*-------------------------------*");
				} break;
				
			case "e":
				tentativa++;
				if (urna.get(4).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Reagente incorreto, o cheiro deste não me parece muito bom");
					System.out.println("*-------------------------------*");
				} break;
			
			default:
				System.out.println("Operação ínvalida!");
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
		System.out.println("Ótimo... Ótimo... Agora é preciso que você descubra a dosagem exata do antídoto!");
do {
			
			List<String> urna = Arrays.asList("4,5", "5", "4,4", "4", "6");
			
			Collections.shuffle(urna);
			
			String certo = "4,5";
			
			System.out.println("Extraia a raiz quadrada do número para saber a dosagem correta: ");
			System.out.println("21");
			
			System.out.println("(A)" + urna.get(0));
			System.out.println("(B)" + urna.get(1));
			System.out.println("(C)" + urna.get(2));
			System.out.println("(D)" + urna.get(3));
			System.out.println("(E)" + urna.get(4));
			
			System.out.println("Digite a alternativa correta: ");
			result = entrada.next();
			
			switch (result.toLowerCase()) {
			
			case "a":
				tentativa++;
				if (urna.get(0).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Resposta incorreta!");
					System.out.println("*-------------------------------*");
				} break;
				
			case "b":
				tentativa++;
				if (urna.get(1).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Resposta incorreta!");
					System.out.println("*-------------------------------*");
				} break;
				
			case "c":
				tentativa++;
				if (urna.get(2).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Resposta incorreta!");
					System.out.println("*-------------------------------*");
				} break;
				
			case "d":
				tentativa++;
				if (urna.get(3).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Resposta incorreta!");
					System.out.println("*-------------------------------*");
				} break;
				
			case "e":
				tentativa++;
				if (urna.get(4).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Resposta incorreta!");
					System.out.println("*-------------------------------*");
				} break;
			
			default:
				System.out.println("Operação ínvalida!");
			}
			
			} while (!ok && tentativa < 3);

			if (ok) {
				pass++;	
				System.out.println("Resposta correta!");
				System.out.println("Parabéns, você conseguiu formular o antídoto");
			} else {
				System.out.println("Você fracassou!");
			}
					System.out.println(pass);
	
		
		}

	
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    static int temp_dialog = 40, temp_questions = 15, temp_dialogSlow = 200, temp_dialogFast = 80, temp_dialogFaster = 30, ultra_Speed = 10,  temp_dotsSlow = 400, temp_dots = 200;
	//As variáveis em cima são para a velocidadae que você quer da letra. Quanto menor o número, mais rápida. Quanto maior, mais lenta. 
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner (System.in);
		

            System.out.println();

           capitulo5();
	}
	
	
	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
        }

       
    }

        
        // Digita("",TimeUnit.MILLISECONDS,temp_dialogFaster);
        
    public static void capitulo5() throws InterruptedException {

        Scanner input = new Scanner(System.in);
         
        Digita("Você se coloca diante dos portões de fogo. \nSua pele arde e seus pensamentos clamam para dar meia volta e desistir de tudo isso, mas agora é tarde você já fez muito para desistir agora.\n", TimeUnit.MILLISECONDS, temp_dialogFaster);
        Digita("Ao colocar as mãos nos portões, Asulf sente um frio gigantesco correr a sua espinha.\nEle empurra as portas que se movem com certa facilidade, abrindo caminho para um lugar escuro, extremamente escuro.\nVocê não entende o que está acontecendo, mas engole o medo e dá um passo a frente.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Assim que você coloca os dois pés dentro da escuridão, os portões atrás de você se fecham com força.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita(" - Merda! - você diz enquanto se vira e corre em direção a porta.\n",TimeUnit.MILLISECONDS,temp_questions);
        Digita("Você corre em direção a porta e acerta o rosto em uma parede de concreto, perdendo o equilíbrio e caindo no chão.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("“Humilhante” - você pensa enquanto coloca as mãos em seu nariz dolorido.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Sentado no chão, você percebe que ele é feito de concreto.\nAsulf remove uma de suas luvas para tatear melhor o terreno e percebe que o chão não é só de concreto, mas o concreto também está úmido.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        
        Digita("Está muito escuro, é impossível ver um palmo a sua frente. Você se recosta contra a parede, o seu único ponto de referência.\nAo encostar nela Asulf sente sua superfície gelada.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Você começa a seguir a parede para ver aonde ela te leva, e pouco tempo depois você se encontra com outra parede.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("- “Estou dentro de uma sala?” - você pensa.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("- Tudo bem….estamos progredindo - Asulf fala para si mesmo.",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Você sobe as escadas e mais uma vez bate o rosto em algo. Uma porta! Asulf tateia sua nova saída, louco para sair desta escuridão e achar\nalgumas respostas sobre este lugar.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Quando você finalmente encontra o puxador da porta e faz força para abri-la.",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Ela simplesmente não se mexe.",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("- Mas que diabos? - Asulf fala, enquanto empenha mais força para abrir a porta, sem sucesso.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("A sensação, é que existe uma algo atrás desta porta.\nAlgo que empurra para dentro da sala, mas alguma coisa invisível no \nambiente impede que está força externa invada o cômodo.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Depois de tentar puxar várias vezes a porta, um símbolo escarlate aparece em seu centro.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        //Simbolo aparece
        Digita("Asulf busca em sua mente sobre este simbolo\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Resolva a equação a seguir utilizando bhaskara e insira a alternativa correta:\nX^2 - 8x + 12 ",TimeUnit.MILLISECONDS,temp_questions);
                            //Resposta correta
        Digita("Respostas: \n1) S = {2,6}\n2) S = {4,12}\n3) S = {1,23}\n4) S = {2,3}\n5) S = {6,13}\n",TimeUnit.MILLISECONDS,temp_questions);
        
        String resposta1 = input.next();
              
        switch(resposta1){
            case"1":
                Digita("Maldito! - você berra.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
                Digita("Você reconhece este simbolo. Ele estava estampado em várias peças de roupa dos lacaios do monge de branco!\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
                Digita("Aquele maldito passou por aqui e trancou a passagem para que ninguém conseguisse segui-los!\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
                Digita("Aquele maldito passou por aqui e trancou a passagem para que ninguém conseguisse segui-los!\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
                break;
        
            default:
                 Digita("Você sente a sensação de já ter visto este simbolo antes, mas nada lhe vem a cabeça.",TimeUnit.MILLISECONDS,temp_dialogFaster);;
                 Digita("Parece que você terá que descobrir como quebrar este selo, sem nem ao mesmo saber direito para o que ele serve.",TimeUnit.MILLISECONDS,temp_dialogFaster);
                 break;
        }
        
        // Colocar a seguir a mecânica do Jorge:
        
        
        //Fim da mecanica de luta do Jorge:
        Digita("Você nada para fora da sala e finalmente enxerga a luz. Ela vem de uma janela da casa submersa.\nVocê nada em direção a fonte de luz, atravessando a janela você percebe que não é somente a casa que está alagada, mas toda a rua!\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Você olha para cima e nota que a água está a mais de dezoito andares acima de você.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("“Merda! Onde que eu tô?” - você pensa e começa subir desesperado em direção a margem.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Você nada usando tudo o que consegue, mas parece que a sua superforça não funciona bem quando você não tem nenhum apoio além da água.\nSeus pulmões ardem e a sua visão fica cada vez mais avermelhada enquanto você nada desesperadamente em direção a superfície.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Subindo você vê casas, igrejas, muros e até mesmo um castelo submerso. A única coisa que não foi completamente submersa, foi uma pequena montanha cujo castelo\nera construído próximo, apenas uma parte de seu topo ainda continua fora da água. \nAlgo aconteceu a está cidade, mas o que teria o poder para fazer isso com uma cidade inteira? Seria possível que aquele monge tenha poder para fazer isso?\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Asulf continua a nadar e a margem continua distante, o resto de ar em seus pulmões começa a se esvair e a água começa a entrar em seu corpo. \nSeus pulmões gritam e a sua visão fica cada vez mais avermelhada.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("- “Anton, por favor, me diga que você sobreviveu a isto!” - você pensa \n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Uma corrente de água fortíssima o arremessa para cima. Com tanta velocidade que todo o espaço que faltava entre você e a borda se acabam em segundos.\nVocê começa a desacelerar e termina o caminho da subida nadando sozinho.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Você tira a sua cabeça para fora d’água e começa a vomitar toda a água que havia engolido enquanto estava lá em baixo, ao poucos você consegue voltar a respirar \nnormalmente e agradece aos deuses por conseguir chegar a superfície. \n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Mas Asulf entende que os deuses não dão bençãos a homens que venderam a sua alma. Os deuses não abençoam ninguém.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Se você subiu para a superfície, foi porque alguém ou algo físico o fez subir, algo que fez desta cidade submersa o seu novo lar.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Você olha ao redor, procurando o ser que poderia ter causado esta corrente d’água e você o  avista.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Saindo da água você vê uma criatura gigantesca. Um ser tão grande que a mera existência dele é uma afronta a tudo o que você já via na sua vida. \nCom uma largura de ‘quilometral’, ele abre a suas asas demostrando uma envergadura que poderia ser comparada a apenas a largura de uma cidade. Seria belo, se não fosse assustador.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("- Pelos deuses - você fala estarrecido.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Saindo da água você vê uma arraia do mar. A primeira imagem que você vê desta criatura são suas costas. Costas gigantescas pintadas de azul e com manchas brancas.\nSuas nadadeira colossais tem a envergadura para poder cobrir toda uma cidade. Uma Arraia Manta gigantesca, um ser tão imenso que poderia ameaçar até os deuses caso ele quisesse.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Você olha a distância para o leviatã, incrédulo que um ser como estes possa existir. Até que ele faz algo que te choca ainda mais. \n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Suas nadadeiras começam a sair da água e apontar para o céu, seu corpo começa a apontar para cima e o leviatã começa a subir.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Como se fossem asas, suas nadadeiras levam a criatura aos ares, subindo em direção as nuvens e começa a abrir caminho pelo ar.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("O ser voa pelos céus como se fossem  água.  \nComo se o ar fosse apenas mais uma extensão do seu domínio primário, um ser gracioso começa a serpentear pelos céus enquanto você olha maravilhado. \n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Saindo do torpor de ver a criatura.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Asulf nota que boa parte da montanha que protegia o castelo continua para fora d’água.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Seu topo é apenas uma rocha gigantesca, mas ao menos é seco, e você pode pensar melhor sem se preocupar em passar uma noite com água ate o pescoço e nem com outros predadores que possam estar escondidos debaixo d’água.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
                
        Digita("Pelos seus cálculos, a montanha deve estar a cerca de quatro kilometros de distância da onde você está, com a sua força, Asulf provavelmente conseguirá chegar em uma hora de nado até a margem.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Você se vira de costas para a criatura e começa a nadar para a montanha. \n",TimeUnit.MILLISECONDS,temp_dialogFaster);
       
        
        
        
        
        // Versão revisada:
        Digita("Chegando próximo a ela mais uma coisa te surpreende, em sua margem, tem uma criança acenando para você.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("Chegando até a margem da montanha a criança se aproxima de e começa a puxar seu braço.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("- Senhor, por favor, eu preciso da ajuda! 一 Ele fala enquanto puxa seu braço, mal te dando tempo de ficar em pé direito. \n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("- Calma, garoto, o que está acontecendo? 一 Asulf pergunta confuso 一 O que aconteceu com essa cidade? Como você sobreviveu?\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("- A cidade já tá assim há muito tempo, ela já estava assim quando nasci 一 ele fala, como se uma cidade inteira inundada não fosse nada de mais.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("Asulf pisa firme no chão e não deixa mais a criança o levar a lugar nenhum.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("- Espera, garoto! Mas como consegue sobreviver aqui sozinho? 一 \npergunta desconfiado que possa ser uma armadilha.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("- Onde estão seus pais? O que está acontecendo? \n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("O garoto olha para você com a típica impaciência que só as crianças possuem.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("- Eu não sei! 一 ele grita com impaciência 一 Eu nem tava vivo quando a cidade foi inundada \n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("- ele continua 一 Meu papai falou que foi alguma briga entre uns deuses que estavam zangados.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("- Calma, como assim? 一 pergunta confuso.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("- Vamos moço, eu preciso de ajuda. Meu pai vai conseguir te explicar direito! 一 a criança fala impaciente 一 Mas agora eu preciso de ajuda!\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("A criança fala impaciente \n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("- Mas agora eu preciso de ajuda! - o menino berra inpaciente.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("- Seu moleque! 一 Asulf berra de volta consternado com a audácia da criança\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("Aonde estão os seus pais? Por que não pede ajuda para eles?\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("- PORQUE SÃO ELES QUE PRECISAM DE AJUDA! 一 ele berra de volta mais uma vez e você fica sem reação.\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("- Será que agora pode parar de reclamar e me ajudar? 一 ele pergunta, desta vez mantendo um pouco mais a compostura.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("Asulf respira fundo e diz 一 Tudo bem, me leve até eles.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("A criança te guia pela montanha, que a distância parecia apenas o topo rochoso de uma montanha castigada\n pelo mar que impede qualquer vegetação e a vida animal de prosperar sobre o seu solo. \n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("Mas, na verdade, possui uma pequena caverna próxima a sua costa. \n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("Os dois adentram a caverna e seguem por uma sequência de túneis que os levam montanha à baixo.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("Asulf nota que os túneis não são naturais, é possível sentir um leve aroma de magia no ar como se alguém houvesse escavado a montanha com magia pura.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Meu avô escavou esses túneis 一 a criança fala enquanto lidera o caminho.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Sem ele provavelmente você se perderia entre os diversos caminhos que existem dentro deste labirinto escondido.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Ele fez isso para se proteger da inundação? 一 Asulf pergunta intrigado. \n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Não, não 一 acriança esboça um pequeno sorriso \n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Ele era um tipo de mago malvado no tempo dele, então ele fez estes túneis aqui em cima para ficar protegido dos soldados do rei.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— E por acaso seu avô ainda está por aqui? 一 pergunta com um tom de preocupação.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Meu pai me disse que ele morreu quando eu era um bebê, ele disse que antes das arraias chegarem, tinha um bicho muito malvado nas águas.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Ele falou que o monstro passava horas acertando a montanha. Como se ele estivesse atrás de nós!\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Será que não poderia estar atrás do seu avô? 一 o mais velho fala, surpreendentemente intrigado com a história do pequeno.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Eu pensava isso também, mas o papai me garantiu que não. Sabe, não foi só a minha família que sobreviveu à inundação.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Não foi?\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Não foi, meu papai me contou que veio como um alagamento, pareceu que um Deus matou outro e largou seu corpo no mar. \n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Meu pai disse que ele era muito gordo e o tamanho dele fez o nível do mar subir muito rápido — contou a criança rindo\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Isso fez com que a cidade fosse inundada, mas não veio como uma onda, acho que o papai usou a palavra “nível do mar” — falou como se estivesse lembrando de uma palavra muito difícil. \n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Meu pai me falou que tinham vários barcos perto da montanha — continuou o menino\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Parece que o rei pensou rápido e colocou boa parte da população neles antes que a cidade fosse inundada.\nO rei então fez as pazes com o vovô se ele prometesse usar sua magia para tirar o sal da água e dar para os sobreviventes, claro que isso era como uma brincadeira para o vovô — contou com orgulho.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("O homem mais velho olhou para o menino com certo interesse, pensativo sobre tudo que acabara de descobrir.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Mas aí esse monstro veio e destruiu todos os barcos, a gente só escapou porque morava aqui dentro. \n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— O menino fala com uma calma que assusta Asulf, pois ele nem parecia a criança que pedia ajuda com tanto desespero momentos atrás.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("Andando por mais alguns minutos, Asulf e a criança atravessam diversos túneis que formavam um labirinto extenso, com toda certeza sem ajuda alguém se perderia facilmente ali. \n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita(" Chegando em um local mais iluminado, o homem de cabelos castanhos pôde avistar mais tochas com chamas alaranjadas dos que nos metrôs anteriores, mais a frente conseguiu distinguir alguns tapetes no chão, móveis simples, mas aconchegantes, alguns livros espalhados pelo cômodo.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita(" A criança correu até a pequena cama no canto onde um homem com aparência cansada e semblante abatido estava deitado, suas roupas esfarrapadas pelo tempo e uma barba por fazer, o menino abraçou o mesmo e sorriu com alegria.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Papai, esse homem vai nos ajudar! Ele vai salvar o senhor! — exclamou com felicidade estampada no rosto.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("Asulf avaliou o homem enquanto puxava uma cadeira para se sentar, o mesmo não aparentava ter mais de 50 anos, porém se encontrava extremamente debilitado. \n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("Seu cabelo estava caindo, ele estava magro e suas veias do pescoço estavam estranhamente escuras.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Meu nome é Asulf, qual o seu? — questionou.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Meu nome é Samkennd — engasgou pronunciando a meia voz — de onde veio, meu senhor?\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("O menino pegou um pequeno copo de água e ofereceu para o pai que aceitou de bom grado.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Vim de Volstalir porém é um lugar paralelo da onde estamos agora — responde o com calma.  \n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Samkennd tossiu arduamente — Não conheço este tal lugar de Volstair, da onde é?\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— É um pouco complicado para explicar — responde o mesmo com calma — Seu filho me disse que você precisa de ajuda. \nMeu tempo é curto, pode me dizer o que aconteceu? - questiona Asulf rapidamente.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("Seu tempo está passando rápido demais e ajudar alguém estava fora de seus planos. Samkennd tossiu novamente com mais força, o cenho franzindo com o esforço \n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Estava mergulhando entre os destroços da cidade, buscando coisas uteis para usarmos aqui em casa, quando tudo ao meu redor começou a ficar enevoado.\nEscutei um grito sem fim, agonizando e sofrendo, quando notei um enorme monstro coberto de algas nadava em minha direção.\n Tentei subir à superfície para ir embora, mas meu corpo parecia ter congelado, meus músculos pareciam pesar toneladas e já era tarde demais quando ele me atacou.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Então um homem estranho, muito alto apareceu nadando.\n",TimeUnit.MILLISECONDS   ,temp_dialog); 
        Digita("Você se levanta na hora.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Um homem? Um monge? - o velho guerreiro pergunta.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Sim! Este homem arrancou o coração do monstro com as próprias mãos  -  Samkennd fala com o olhar abismado - eu nunca vi nada parecido com isso.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Depois seus asseclas me arrastaram para fora da água. \nEu implorei para ele me levar até a minha casa e me ajudar, meu braço doía muito...mas ele me disse que já havia ajudado o bastante e me pediu para eu mostrar o caminho para a próxima mundo.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— E você mostrou esse caminho? - Asulf pergunta visivelmente preocupado.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("Por um lado é animador que este homem saiba o caminho de para o próximo mundo, mas é revoltante saber que ele ajudou aquele maldito monge.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Eu falei para ele onde o portal fica, expliquei todo o caminho para ele, mas que somente eu poderia abrir o portal. \n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Ele estava com um jovem? - Asulf perguntou preocupado - esse monstro levou o meu filho! Você o viu com ele?\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("O homem se mostra confuso.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Desculpe….mas as únicas pessoas que estavam com ele, eram estes homens vestidos de vermelho…uma coruja…\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("Impossível\n",TimeUnit.MILLISECONDS,temp_dialogFaster); 
        Digita("Isso é impossível!!!\n",TimeUnit.MILLISECONDS,temp_dialogFaster); 
        Digita("O que esse maldito fez com o meu filho!!!\n",TimeUnit.MILLISECONDS,temp_dialogFaster);
        Digita("O ódio consome o seu ser, Antom pode estar morto. Será que o monge não viu mais potencial nele e simplesmente o matou e o largou pelo caminho?\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("Se ele tiver feito isso, Asulf caminhará por cada inferno, fará pactos com cada deus e demônio e matará que estiver no seu caminho para arrancar o coração deste monstro maldito.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Onde esse monstro está? - o ódio é perceptível em suas palavras \n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Ele já passou pelo portal - Samkennd fala temeroso pela sua mudança de postura \n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Ele usou alguma magia de sangue para abri uma fenda entre os mundos….ele usou os próprios sacerdotes para abrir o portal….\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("Você agarra o homem pelo pescoço e o levanta.\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Onde está  o portal?\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— Não por favor! - o homem implora\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("Você aperta mais forte o pescoço dele.\n",TimeUnit.MILLISECONDS,temp_dialogFaster); 
        Digita("—  ONDE ESTÁ O MALDITO PORTAL?\n",TimeUnit.MILLISECONDS,temp_dialog); 
        Digita("— SOLTA O MEU PAI!\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("O menino corre em sua direção com uma pequena faca que ele tirou do bolso.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("Ele vem em sua direção e com um tapa você arremessa ele contra a parede. Você ainda não se acostumou com a sua nova força.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("A criança acerta a parede com força e cai no chão desmaiada.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Sune! —  o pai grita com lagrimas nos olhos, impossibilitado de ajudar o próprio filho contra o monstro que está apertando o seu pescoço.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("Você olha para a criança e nota sangue escorrendo de sua cabeça.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Merda…merda —  você solta o homem e corre em direção a criança - me desculpe, me desculpe!\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("Sune está com um pequeno corte na cabeça, mas está com as pupilas normais e com bons batimentos cardíacos. Você rapidamente faz um curativo no machucado e o carrega para coloca-lo na cama de seu pai.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("É difícil lutar contra a sensação ruim de saber que aquilo que fizeram com você meses atrás, você fez com outra família indefesa, uma família que não tem culpa de nada do que você passou. \n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita(" Você machucou essa família, você foi o monstro deles.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("—  Me desculpe senhor - você entrega a criança no colo do pai —  eu vou te ajudar, me mostre o seu braço.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("O velho ainda assustando e vermelho pelo enforcamento levanta a barra da camiseta. Asulf olhou com cuidado, as marcas pareciam de queimaduras em forma de mão e o local parecia estar gelado.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("Suas suspeitas estavam certas.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Isso foi um Draugen, é uma espécie de fantasma de um homem que morreu no mar, ele queima o local em que toca e só cura com um antídoto certo.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Entendo, esse nome não me parece estranho — resmunga o velho pensativo — Pegue o livro de capa verde-escura que está na pilha perto da mesa, por favor.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("Você anda para uma mesa cheia de pilhas de livros, encontra o livro e leva-o para Samkennd. \n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("O velho folheia o livro rapidamente até encontrar algo, lê com atenção e respirou fundo — Este livro está contando as histórias de vários monstros, inclusive o Draugen, vou precisar da sua ajuda, Asulf — resmungou o doente com certa dificuldade.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("—  Apenas me diga o que devo fazer. \n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Vá até à mesa de alquimia que está um pouco mais a frente das tochas no corredor para descobrir o antídoto!\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("Desorientado, o mesmo anda até a entrada do pequeno cômodo, avistando as tochas com chamas alaranjadas, ele acena para Samkennd, andando em direção ao final do corredor. \n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita(" Ao se afastar mais de onde estava, as tochas vão diminuindo fazendo com que o corredor fique mal iluminado e turvo, um vento corrente assobia de fundo enquanto Asulf cerra os olhos para enxergar a mesa.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("Mais alguns passos hesitantes e o mesmo encontra a mesa embaixo de uma tocha lampejante enorme, a mesma está repleta de objetos de vidro, líquidos coloridos e diversas formas de coisas que nunca viu antes.\n",TimeUnit.MILLISECONDS,temp_dialog);
        alquimia();
        
        
        
        
        
        
        
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("\n",TimeUnit.MILLISECONDS,temp_dialog);
        
        
        
        
        
        
        
        
        
        



        
    }
    
}
