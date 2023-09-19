package Chat_client;

import java.util.Scanner;

public class Chat {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ola! Quem Gostaria de ajuda: ");
		String Nome = scanner.nextLine();
		
		System.out.println("Ola, " + Nome + " Em qual assunto posso te ajudar? ");
		System.out.println("Escolha uma das opções: ");
		
		System.out.println("1- Sistema");
		System.out.println("2- Codigos");
		System.out.println("3- Leis");
		System.out.println("4- Regras");
		
		int Escolha = scanner.nextInt();
		
		switch (Escolha) {
		case 1:
			System.out.println("O sistema trbalha da seguinte forma bla bla bla....");
			break;
		case 2:
			System.out.println("O Codigos trbalha da seguinte forma bla bla bla....");
			break;
		case 3:
			System.out.println("As Leis trbalha da seguinte forma bla bla bla....");
			break;
		case 4:
			System.out.println("As Regras trbalha da seguinte forma bla bla bla....");
			break;
			default:
				System.out.println("Nice try...");
		}
		
		System.out.println("Agora vamos para a Formação de personagem. Escolha o seu genero: ");
		
		System.out.println("1- Homem");
		System.out.println("2- Mulher");
		System.out.println("3- Hemafrodita");
		System.out.println("4- Deus");
		
		int Escolha_2 = scanner.nextInt();
		
		switch (Escolha_2) {
		case 1:
			System.out.println("A classe \"Homem\" em um RPG desempenha um papel diversificado,\n "
					+ "com habilidades e características variadas, muitas vezes refletindo uma \n"
					+ "representação realista de um ser humano.");
			break;
		case 2:
			System.out.println("A classe Mulher em um RPG descreve uma personagem jogável com \n"
					+ "habilidades e características únicas, oferecendo diversidade e escolha aos jogadores.\n");
			break;
		case 3:
			System.out.println("A classe \"hermafrodita\" em um RPG desempenha o papel de uma entidade que possui \n"
					+ "características e habilidades tanto masculinas quanto femininas, oferecendo versatilidade \n"
					+ "e flexibilidade em suas escolhas e ações no jogo.");
			break;
		case 4:
			System.out.println("A classe \"Deus\" em um RPG desempenha o papel de uma entidade \n"
					+ "supremamente poderosa, controlando o mundo e influenciando o destino dos personagens e \n"
					+ "do universo do jogo.");
			break;
			default:
				System.out.println("Nice try");
		}
		
		System.out.println("\n");
		System.out.println("\"Parabéns pela sua escolha de raça! Ao optar por esta \n"
				+ "linhagem única, você está prestes a embarcar em uma jornada repleta \n"
				+ " de desafios e recompensas exclusivas. A riqueza cultural e os dons \n"
				+ " especiais de sua raça irão moldar sua aventura de maneira única,\n"
				+ " permitindo que você descubra os segredos do mundo e deixe sua marca \n"
				+ " na história. Este é o primeiro passo em direção a uma incrível jornada\n"
				+ " de autodescoberta e heroísmo. Que sua jornada seja épica e suas escolhas,\n"
				+ " sábias.\"");
		
		
		scanner.close();
	}
}
