import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Mecanica_de_luta {

	static int temp_dialog = 50, temp_questions = 15, temp_dialogSlow = 200, temp_dialogFast = 80,
			temp_dialogFaster = 30, ultra_Speed = 10, temp_dotsSlow = 400, temp_dots = 200;

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		
		int chamasNegras = 5; //quantidade do especial
		boolean vitoria = false; 		//Utilizado quando o Usuário vence do 'Computador' e sai do loop.
		int hpUsuario = 100;          
		int hpMonstro = 500;
		String alternativa;
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
		System.out.println("VOCẼ VENCEU!"); //coloquei aqui para mostrar a vocês que finalizou o loop após vencer.
	}

	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}

	}

}