package Program;

import java.util.Scanner;

import Entites.Champion;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
	    int life;
		int attack;
		int armor;
		
		Champion first, second;
		
		System.out.println("Digite os dados do primeiro campeao:");
		System.out.print("Nome: ");
		name=sc.next();
		System.out.print("Vida inicial: ");
		life=sc.nextInt();
		System.out.print("Ataque: ");
		attack=sc.nextInt();
		System.out.print("Armadura: ");
		armor=sc.nextInt();
		
		first=new Champion(name,life,attack,armor);
		
		System.out.println("Digite os dados do segundo campeao:");
		System.out.print("Nome: ");
		name=sc.next();
		System.out.print("Vida inicial: ");
		life=sc.nextInt();
		System.out.print("Ataque: ");
		attack=sc.nextInt();
		System.out.print("Armadura: ");
		armor=sc.nextInt();
		
		second=new Champion(name,life,attack,armor);
		
		System.out.println("Quantos turnos voce deseja executar ?");
		int turnos=sc.nextInt();
		
		// começando os turnos
		int rodada=1;
		while((rodada<=turnos)&&(first.status().equals("Vivo"))&&(second.status().equals("Vivo"))) {
			first.takeDamager(second);
			second.takeDamager(first);
			System.out.println("Resultado do turno "+rodada+":");
			System.out.print(first.getName()+": "+first.getLife()+" de vida");
			if(first.getLife()==0)
				System.out.print(" (morreu)");
			
			System.out.print("\n"+second.getName()+": "+second.getLife()+" de vida");
			if(second.getLife()==0)
				System.out.println(" (morreu)");
			rodada++;
			System.out.println();
		}
		
		System.out.println("FIM DO COMBATE");
		
		
		sc.close();

	}

}
