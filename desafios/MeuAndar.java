import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MeuAndar {
	static int temp_dialog = 65, temp_questions = 15, temp_dialogSlow = 200, temp_dialogFast = 80,
			temp_dialogFaster = 30, ultra_Speed = 10, temp_dotsSlow = 400, temp_dots = 200;

	// As variáveis em cima são para a velocidadae que você quer da letra. Quanto
	// menor o número, mais rápida. Quanto maior, mais lenta.
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String resp1 = "2021", ex1;
		int cont = 0;
		boolean resp1v = false;

		Digita("Ao subir o 3° Andar da torre você se depara com uma Caverna!!", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		System.out
				.printf("        ____\r\n" + "       /    /\\____/ \\    /\\\r\n" + "      /\\   /   \\/    \\  / /\r\n"
						+ "     / /   \\   /  / \\ \\/  \\\r\n" + "    /  \\   /   / /   \\     \\\r\n"
						+ "    \\  /  /\\   \\/  \\  \\     \\\r\n" + "    /  \\/ \\ \\  / \\  \\/ \\    / \r\n"
						+ "    \\     /  \\/   \\/   /   / \r\n" + "    /    /            /    \\\r\n"
						+ "   /     /           /      \\\r\n" + "  /_____/____________\\_______\\");
		System.out.println();
		System.out.println();
		Digita("Então você resolve adentra-la.", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("Após alguns metros de caminhada você se vira para trás e para sua surpresa!!! não há mais a entrada que você passou, logo em seguida se depara com um beco sem saída. ",
				TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("Observando um pouco as paredes você percebe que ali há algumas pedras ametista, você decide analisar as pedras ametistas que estão próximas a você.",
				TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("Após analisa-las, percebe que há números e letras, ao você juntar as pedras elas começam a emitir um brilho roxo e sinalizando que acima de você há um painel.",
				TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("Nesse painel diz: Para continuar o caminho você terá que decifrar o código '7E5'16 para sua lingua e recitar a resposta!"
				+ "se você falhar 3 vezes essa caverna ira desmoronar.", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("Para descobrir a resposta você terá que fazer conversão de bases de hexadecimal para decimal!.",
				TimeUnit.MILLISECONDS, temp_questions);
		System.out.println();
		do {
			System.out.println("Digite o código para recita-lo: ");
			ex1 = sc.next();
			if (ex1.equals(resp1)) {
				resp1v = true;
				cont++;
			} else if (cont == 0) {
				Digita("Você sente um leve tremor e nada acontece.\n", TimeUnit.MICROSECONDS, temp_dialogSlow);
				cont++;
			} else if (cont == 1) {
				Digita("Você sente denovo o tremor mas está mais forte\n", TimeUnit.MICROSECONDS, temp_dialog);
				cont = cont + 1;
			} else if (cont == 2) {
				Digita("A caverna treme muito agora e está prestes a cair... Última tentativa\n", TimeUnit.MICROSECONDS,
						temp_dialogFast);
				cont = cont + 1;
			} else if (cont == 3) {

				System.err.println(
						"Tudo começa cair aos pedaços, você já não enxerga mais apenas sente a dor de pedras caindo em seu corpo é uma dor agoniante... ");
				System.err.println("VOCÊ MORREU");
				System.exit(0);

			}

		} while (!resp1v );
		System.out.println("Parabens você respondeu corretamente");
		Digita("Após recitar a reposta correta a caverna começa a se mover e um caminho se abre para você....", TimeUnit.MICROSECONDS, temp_dialog);
		
		
	}

	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}

	}

}