package org.generation.italy.utils;

public class CalcoliTest {

	public static void main(String[] args) {
		
		CalcoliHelper.setA(150);
		CalcoliHelper.setB(76);
		CalcoliHelper.setX(15.9);
		CalcoliHelper.setY(14.3);
		
		System.out.println("La somma intera �: " + CalcoliHelper.sommaInt() + " La somma double �: "  + CalcoliHelper.sommaDb());
		System.out.println("La differenza intera �: " + CalcoliHelper.diffInt() + " La differenza double �: " + CalcoliHelper.diffDb());
		System.out.println("La moltiplicazione intera �: " + CalcoliHelper.moltInt() + " La moltiplicazione double �: " + CalcoliHelper.moltDb());
		System.out.println("Valore assoluto intero �: " + CalcoliHelper.absoluteInt() + " Valore assoluto double �: " + CalcoliHelper.absoluteDb());
		System.out.println("Minimo tra interi �: " + CalcoliHelper.minoreInt() + " Maggiore tra interi �: " + CalcoliHelper.maggioreInt());
		System.out.println("Minimo tra double �: " + CalcoliHelper.minoreDb() + " Maggiore tra double �: " + CalcoliHelper.maggioreDb());
		

		
		int base = 15;
        int esponente = 4;
        double risultato = Math.pow(base, esponente);
        System.out.println( base +" elevato a " + esponente + " = " + risultato);
		
	}

}
