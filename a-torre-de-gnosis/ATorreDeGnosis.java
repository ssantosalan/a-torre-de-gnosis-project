import java.util.Scanner;

public class ATorreDeGnosis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcao;
		Boolean tacerto = false;

		do {
			
			System.out.println("1 - Instruções");
			System.out.println("2 - Jogar");
			System.out.println("3 - Créditos");
			System.out.println("4 - Capítulos");
			System.out.println("5 - Sair");
			opcao = sc.next();

			switch (opcao) {
			case "1":
				System.out.println(
						"Instruções: para realizar uma ação, escreva no console de texto. Por exemplo: andar para o sul.");
				break;
			case "2":
				tacerto = true;
				System.out.println("O jogo não pode ser executado no momento.");
				break;
			case "3":
				System.out.println("Roteiro por Alan Siva dos Santos");
				System.out.println("Motor gráfico por Alan Silva dos Santos");
				System.out.println("Revisão por Alan Silva dos Santos");
				System.out.println("Obrigado!");
				break;
				
			case "4": 
                System.out.println("1 - Capitulo 1");
				System.out.println("2 - Capitulo 2");
				System.out.println("3 - Capitulo 3");
				System.out.println("4 - Capitulo 4");
                 
                System.out.println("Digite o capitulo desejado");
                opcao = sc.next();
                 
                 switch(opcao){
                     case "1":
                         capitulo1();
                         break;
                     case "2":
                         capitulo2();
                         break;    
                     case "3":
                         capitulo3();
                         break;
                     case "4":
                         capitulo4();
                         break;    
                 }
				
			case "5":
					System.out.println("Jogo finalizado.");
					System.exit(0);
					break;
			default: 
				System.out.println("Entenda que tem que digitar 1 ou 2 ou 3 ou 4 ou 5.");
			}

		} while (!tacerto);
		
		System.out.println();
		System.out.println();
		
		
		sc.close();

	}
	
    public static void capitulo1(){
        
        System.out.println("Capitulo 1 inicia");
    }
    
    public static void capitulo2(){
    
        System.out.println("Capitulo 2 inicia");
    
    }
    
    public static void capitulo3(){
    
        System.out.println("Capitulo 3 inicia");
    
    }
    
    public static void capitulo4(){
    
        System.out.println("Capitulo 4 inicia");
    
    }
    
 }


