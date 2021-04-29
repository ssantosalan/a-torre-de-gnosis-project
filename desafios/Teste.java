import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Teste {
	static int temp_dialog =30, temp_narrativa = 30, temp_transicao = 30;
	public static void main(String[] args) throws Exception{
		Scanner entrada = new Scanner (System.in);
	    Digita("\nMestre: Está pronto para vivenciar o verdadeiro desespero... hã, digo, aventura?",TimeUnit.MILLISECONDS, temp_dialog);
	    System.out.println();
	    Digita("Teste", TimeUnit.MILLISECONDS, 500);
	    
	}
	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
        }

    }
	
}
