import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Teste {
	static int temp_dialog = 50, temp_questions = 15, temp_dialogSlow = 200, temp_dialogFast = 80, temp_dialogFaster = 30, ultra_Speed = 10,  temp_dotsSlow = 400, temp_dots = 200;
	//As variáveis em cima são para a velocidadae que você quer da letra. Quanto menor o número, mais rápida. Quanto maior, mais lenta. 
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner (System.in);
		
	    Digita("Animar as letras é fácil... Viu?",TimeUnit.MILLISECONDS, temp_dialog);
	    System.out.println();
	    Digita("Teste", TimeUnit.MILLISECONDS, temp_dialogSlow);
	    
	}
	
	
	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
        }

    }
	
}
