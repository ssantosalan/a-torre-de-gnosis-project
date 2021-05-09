package torredegnose;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;




public class  Fase1 {
    
	static int temp_dialog = 50, temp_questions = 15, temp_dialogSlow = 200, temp_dialogFast = 80, temp_dialogFaster = 30, ultra_Speed = 10,  temp_dotsSlow = 400, temp_dots = 200;
	//As variáveis em cima são para a velocidadae que você quer da letra. Quanto menor o número, mais rápida. Quanto maior, mais lenta. 
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner (System.in);
		

            System.out.println();

            capitulo1();
	}
	
	
	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
        }

       
    }
        
        
	
        
        
    public static void capitulo1() throws InterruptedException{
        
        Scanner input = new Scanner(System.in);
    
        Digita("Corra!\n", TimeUnit.MILLISECONDS, temp_dialogFaster);
        Digita("Encontre ele!\n", TimeUnit.MILLISECONDS, temp_dialogFaster);
        Digita("Vá depressa!\n", TimeUnit.MILLISECONDS, temp_dialogFaster);
        
        Digita("Você está invadindo o território de Zark, um dos países vizinhos de sua terra natal, Volstalir.\nAmbos os reinos viviam um tenso período de paz. Após a morte do rei Alexander e da sucessão de seu filho Atreios.\n Acordos mercadológicos começaram a ser cada vez mais desrespeitados por Zark e em resposta, às terras cedidas a Zark, foram retomadas à Volstalir.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Após este evento, a tensão entre os dois reinos explodiu em disputas de territórios e lutas por pontos de suprimentos estratégicos.\nAgora você está invadindo mais um desses pontos estratégicos: uma cidade de médio porte cercada por muros, que concentra boa parte das trocas comerciais entre os reinos de Zark.\n", TimeUnit.MILLISECONDS,temp_dialog);
        Digita("Você é Asulf, um general veterano de muitos conflitos, responsável por guiar as tropas que devem derrubar os muros do lado oeste da cidade enquanto outra tropa é responsável por destruir os portões principais\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Após horas de luta, sua tropa consegue rechaçar a resistência restante em terra e com a ajuda de aríetes, estão começando o processo de destruição do muro.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Senhor, senhor, temos um problema!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Você vê um jovem soldado correndo em sua direção.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("— O que foi jovem?\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("— Os portões senhor, os Zarkeanos abriram eles e soltaram a cavalaria e os cães!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Você não espera que o soldado termine de falar e dispara em direção aos inimigos.\nQuando chega no campo de batalha — um terreno plano de gramado verde — agora sujo com o vermelho do sangue dos corpos e dos feridos.\n Você percebe que além da cavalaria e dos cães, soldados que estavam na cidade também saíram para ajudar seus companheiros.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Um soldado vem em sua direção com a espada pronta para te acertar com um golpe.\n", TimeUnit.MILLISECONDS, temp_dialog);   
        
        //Luta aqui
        Digita("Você escapa por pouco  do ataque e se posiciona ao flanco do soldado.\nSacando a sua espada, você acerta um corte no joelho dele, que cai sangrando e o deixando exposto para um golpe final nas costas.\n", TimeUnit.MILLISECONDS, temp_dialogFaster);
        Digita("Outro soldado vem em sua direção, montado em um cavalo em alta velocidade e tenta acertá-lo com a lança. ", TimeUnit.MILLISECONDS, temp_dialogFaster);
        //Luta aqui
        Digita("Ele acerta seu peito em cheio com a sua a ponta de sua lança.\nO que deveria causar uma perfuração em seu peito, que o mataria instantaneamente, causa apenas um aperto no peito, sua armadura absorve o  ataque, mas isso não o impede de ser jogado para trás com o impacto da armar.\nO cavaleiro foi pego desprevenido com resistência de seus equipamentos, e é arremessado para trás.\nSeu cavalo corre em disparada pelo campo de batalha. Quando você se levanta, percebe que o soldado não faz o mesmo. Provavelmente sua espinha foi quebrada devido à queda.\n", TimeUnit.MILLISECONDS, temp_dialogFaster);     
        //Luta aqui
        Digita("Mais dois soldados vêm em sua direção, você os despacha de forma rápida. Você vê um vulto.\nVocê vê um vulto. Um cachorro  vem em sua direção!", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("O animal tenta ataca-lo, mas fica apenas mordendo a sua braçadeira, Asulf larga a espada e quebra o pescoço do animal, pegando sua arma do chão logo em seguida.",TimeUnit.MILLISECONDS,temp_dialogFaster);     
        Digita("— Anton! — você berra.\n", TimeUnit.MILLISECONDS,temp_dialog);
        Digita("Você olha ao redor e vê apenas a luta sangrenta que estourou no campo de batalha.\n", TimeUnit.MILLISECONDS,temp_dialog);
        Digita("Os seus aliados matam e morrem para conseguir ter uma chance de invadir a cidade.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Utilizando golpes precisos você avança entre os seus inimigos em busca dele.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("— “Onde diabos ele foi parar?”\n", TimeUnit.MILLISECONDS, temp_dialog); 
        Digita("A batalha continua por mais vinte minutos e gradualmente as forças inimigas que surpreenderam o seu exército começam a perder as forças e recuar.\n", TimeUnit.MILLISECONDS, temp_dialog); 
        Digita("Você avista um pequeno grupo de quatro soldados cercando um garoto. No chão podem ser vistos cadáveres do que parece ter sido soldados que enfrentaram este menino.\n", TimeUnit.MILLISECONDS, temp_dialog); 
        Digita("O garoto, agora surrado e sujo de sangue, usa uma armadura de couro com revestimento de uma cota de malha metálica,\n botas leves e um capacete que cobre apenas a parte superior de seu rosto, começando pelo nariz e terminando em chifres colocados por ele mesmo. \n", TimeUnit.MILLISECONDS, temp_dialog); 
        Digita("Asulf dispara em direção à luta.\n", TimeUnit.MILLISECONDS, temp_dialog);
        //Luta aqui
        Digita("Asulf dispara em direção à luta. Com a espada em mãos, você perfura as costas de um dos inimigos que estava virado para o menino.\n", TimeUnit.MILLISECONDS, temp_dialog); 
        Digita("Sua espada fica presa na armadura e no tronco do soldado.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita(" Você larga a arma e pula em direção do segundo soldado — ainda surpreso com o novo inimigo que despachou seu colega com tanta rapidez — com suas próprias mãos, você levanta o guerreiro, que assustado, berra, ao ser arremessado em cima de um dos seus colegas..\n", TimeUnit.MILLISECONDS, temp_dialog); 
        Digita("Faltando apenas um inimigo de pé após a sua chegada, o garoto aproveita a oportunidade para usar as suas adagas e perfurar o último soldado em um dos pontos fracos de sua armadura.\n", TimeUnit.MILLISECONDS, temp_dialog); 
        Digita("Vendo que não tem mais chance, os dois soldados que estavam agora no chão, se ajoelham e se rendem.\n", TimeUnit.MILLISECONDS, temp_dialog); 
        Digita("— Você não aprendeu nada, Anton? 一  Você exclama.\n— Quantas vezes não te falei para não se permitir ser cercado?\n— Mas pai... estava tudo sob controle!  一 Anton se defende.\n— Eu sabia que eles estavam atrás de mim! Já havia matado vários deles! ", TimeUnit.MILLISECONDS, temp_dialogFaster); 
        Digita("Ele aponta para os cadáveres no chão, e contando com os dois que acabaram de ser mortos, era possível contar seis corpos jogados no chão.\n",TimeUnit.MILLISECONDS,temp_dialog);
        Digita("— Eles estavam com medo pai! Estavam hesitando em me atacar!\n",TimeUnit.MICROSECONDS,temp_dialogFaster);
        Digita("— E como você pode ter certeza disso? Ainda por cima fica utilizando estas adagas.\n",TimeUnit.MICROSECONDS,temp_dialogFaster);
        Digita("Asulf fala com desdém.\n",TimeUnit.MICROSECONDS,temp_dialogFaster);
        Digita("— Essas lâminas são muito curtas. Você não pode ficar chegando tão perto do inimigo toda vez que for lutar com alguém.\n",TimeUnit.MICROSECONDS,temp_dialogFaster);
        Digita("— Foi a mamãe que me ensinou a lutar assim! 一 ele se defende de novo, claramente irritado por ser criticado sobre sua forma de lutar.\n",TimeUnit.MICROSECONDS,temp_dialogFaster);
        Digita("— Ela me ensinou a lutar desse jeito e estou indo muito bem assim! Eu estava bem!\n",TimeUnit.MICROSECONDS,temp_dialogFaster);
        Digita("— Pelos deuses, Anton!\n",TimeUnit.MICROSECONDS,temp_dialogFaster);
        Digita("Você faz uma pausa, falar de sua esposa sempre o chateia.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("— Usar essas armas, lutar desse jeito é muito perigoso. Você precisa seguir um estilo de luta que não vai te ameaçar sempre que for lutar.\n",TimeUnit.MICROSECONDS,temp_dialogFaster);
        Digita("A discussão de vocês é interrompida quando você nota que o rosto de Anton empalidece.\n",TimeUnit.MICROSECONDS,temp_dialogFaster);        
        Digita("Quando você se vira, nota um homem alto, com 1,90 de altura, barba longa castanha escura, com pinturas de guerra azuis em seu rosto e uma armadura que lembra as escamas de um dragão.\nO guerreiro se aproxima de você com espadas em punhos.Uma espada longa em cada mão.\n",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Você reconhece esta persona, ele é Siegfried, o soldado mercenário que vem rechaçando todas as tropas enviadas até Zark.\nEle  foi o responsável por liderar as forças de resistência da cidade. Com sua liderança, Zark se manteve impenetrável até os dias atuais.\nEle é conhecido por descer aos campos de batalha em momentos criticos e transformar uma luta perdida em uma vitória digna. \n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("Você coloca a mão no ombro de seu filho e diz:\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("— Fique fora desta luta Anton, deixe que eu lido com isso.!\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("—Não pai você conhece as histórias sobre ele, ele é muito forte, nós precisamos lutar com ele juntos!- O seu filho diz, tentando mostrar coragem.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("Asulf sorri\n",TimeUnit.MICROSECONDS,temp_dialog);      
        Digita("—Tudo bem filho, eu também sou forte.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("Você se  vira para enfrentar seu inimigo. Você não se assusta e não se preocupa, a tempos você entendeu que estes sentimentos não te ajudam em combate. \n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("Quando o rei Atreios soube que Siegfried estava protegendo Zark, enviou vários mensageiros oferecendo o dobro, o triplo o quadruplo do  que Zark lhe pagava, apenas para não se envolver na luta.\nO primeiro mensageiro voltou dizendo que ele negou a proposta, pois não largava seus trabalhos pela metade, depois disso, todos os mensageiros não voltaram mais.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("Você está ótimo Asulf! Qual foi a última vez que nos vimos? Foi quando defendemos Trakai? - Siegfried pergunta.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("— Não, nós nos encontramos em um bar da última vez que você veio para Volstalir.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("—Asulf isso já faz 12 anos! - Siegfried gargalha\n- Naquela época eu ainda era jovem e você já era velho. Agora você deve ter no mínimo uns noventa anos.\n",TimeUnit.MICROSECONDS,temp_dialogFaster);
        Digita("Siegfried veio de uma família de mercenários, passou a vida inteira lutando em guerras que não eram dele.\nCom o tempo adquiriu certa fama e se tornou um mercenário que fazia trabalhos recorrentes para o rei Alexander, recebendo vários elogios por seu código de conduta “nada parecido com o de outros mercenários”.\nVocê teve o prazer de lutar lado a lado com ele em algumas ocasiões. Mas o novo rei Atreios não gosta de ter mercenários em suas fileiras, para ele toda força militar do país deve estar subjugada ao rei, em seu reinado todos os mercenários foram dispensados.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("— Você sabe o porquê de estarmos aqui. - você diz\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("— Eu sei Asulf, mas eu não posso deixar que vocês entrem aqui e matem quem vocês quiserem. - debochando de você\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("—Nós não somos assim Siegfried! Você sabe o código de Volstalir, você lutou ao nosso lado! - você fala, ofendido por ele acreditar que seus soldados seriam capazes de massacrar civis.\n",TimeUnit.MICROSECONDS,temp_dialogFaster);       
        Digita("— Eu estou aqui para te fazer uma proposta Siegfried, chega de defender essa cidadezinha patética.\n— Venha comigo, o rei Atreios prometeu lhe dar um espaço entre os principais generais dele, você pode comandar exércitos! - você exclama, confiante que esta é irrecusável - você está recebendo uma honra que poucas pessoas tiveram.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("— Você não entende Asulf, seu rei traiu meus soldados - ele fala com raiva \n— Depois de anos protegendo seu país nós fomos enxotados de lá. Aqui nós pelo menos temos a lealdade do rei.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("— Siegfried você sabe que não foi.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("— Chega de conversa - ele te interrompe, ficando em posição de ataque - ambos sabemos que não vamos chegar em um acordo. Vamos acabar logo com isso!\n",TimeUnit.MICROSECONDS,temp_dialogFaster);
        Digita("—Tudo bem Siegfried, vamos acabar com isso.\n",TimeUnit.MICROSECONDS,temp_dialog);
        //Luta com boss final
        
        Digita("Ambos estão cansados, como sempre Siegfried demonstra ser um adversário formidável.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("Ele pula em sua direção mais alto do que qualquer homem comum conseguiria. Com as suas duas espadas ele se arremessa em sua direção. Você desvia do ataque e finca a sua espada na cintura da armadura de Siegfried, uma área que você sabe ser menos protegida.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("Este é o primeiro ataque que você percebe que causa uma verdadeira perfuração na armadura de dragão dele. Ele se vira girando as espadas em sua direção, mas Asulf abaixa e acerta outro golpe, desta vez em sua perna.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita(" Ele tenta mais uma vez lhe acertar com um golpe horizontal, mas desta vez você pula para trás. Assim que coloca os pés no chão, você pega impulso para avançar em direção ao seu rival.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("Você dispara em direção de seu amigo e com sua lamina, perfura o estômago de Siegfried. Fazendo-o largar as armas e cair no chão.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("— Merda Siegfried você deveria ter aceitado a maldita proposta! - você diz, segurando o seu companheiro.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("Siegfried ri, seu olhar parece estar longe, como se o que ele estivesse olhando para algo muito distante dali.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("— Tudo bem Asulf, nós dois tínhamos uma missão. Pelo menos eu morri lutando, e não envenenado ou esfaqueado pelas costas  - ele diz.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("— Fica calmo Siegfried eu vou chamar um curandeiro para você, eles vão te remendar!\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("— Está tudo bem Asulf - ele tenta te acalmar - por favor só me dá um tempo, só me dá\n",TimeUnit.MICROSECONDS,temp_dialog);
        
        
        Digita("Siegfried cospe sangue.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("— Merda! - você olha em direção de seu filho - Anton, busque um curandeiro, agora!\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("— Mas pai - seu filho fala com hesitação - ele já…\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("Você olha para Siegfried e percebe que não existe mais vida em seus olhos. Antes que Asulf pudesse falar algo, vocês escutam um estrondo vindo da direção do combate que Asulf deixou para trás.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("Seus soldados conseguiram derrubar uma parte do muro de proteção da cidade. A queda desta parte gerou um efeito em cascata, que destruiu boa parte do muro próximo, abrindo um buraco enorme. \nOs soldados avançam para dentro da cidade, preparados para tomá-la de volta.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("— Fique atrás de mim Anton.\n",TimeUnit.MICROSECONDS,temp_dialog);
        Digita("Pai você está bem?  — ele pergunta preocupado.\n",TimeUnit.MICROSECONDS,temp_dialogFaster);
        
        
        
        Digita("— Claro que estou - você fala, triste por ter que ter feito isso.\n",TimeUnit.MICROSECONDS,temp_dialogFaster);
        Digita("Você se vira em direção da batalha",TimeUnit.MICROSECONDS,temp_dialogFaster);
        Digita("— Vamos tomar essa cidade!\n",TimeUnit.MICROSECONDS,temp_dialogFaster);
     
    
    
    
    }    
}

