package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		List<String> wishList = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int choise = 0;
		
		while (choise != 2) {
			
			System.out.println("Cosa vuoi fare?");
			System.out.println("1 - Inserisci un desiderio");
			System.out.println("2 - Termina");
			
			choise = in.nextInt();
			
			if (choise !=1 ) continue;
			
			
			
			in.nextLine();
			
			System.out.println("Inserisci un desiderio..");
			String wish = in.nextLine();
			
			wishList.add(wish);
			
			
			System.out.println("La lista contiene attualmente: " + wishList.size() + " desideri.");
			
			
			
		}
		
		in.close();
		System.out.println("Ecco la lista dei desideri");
		System.out.println(wishList);
	}
}
