package org.generation.italy.utils;

public class CalcoliTest {

	public static void main(String[] args) {
		
		CalcoliHelper.setA(150);
		CalcoliHelper.setB(76);
		CalcoliHelper.setX(15.9);
		CalcoliHelper.setY(14.3);
		
		System.out.println("La somma intera è: " + CalcoliHelper.sommaInt() + " La somma double è: "  + CalcoliHelper.sommaDb());
		System.out.println("La differenza intera è: " + CalcoliHelper.diffInt() + " La differenza double è: " + CalcoliHelper.diffDb());
		System.out.println("La moltiplicazione intera è: " + CalcoliHelper.moltInt() + " La moltiplicazione double è: " + CalcoliHelper.moltDb());
		System.out.println("Valore assoluto intero è: " + CalcoliHelper.absoluteInt() + " Valore assoluto double è: " + CalcoliHelper.absoluteDb());
		System.out.println("Minimo tra interi è: " + CalcoliHelper.minoreInt() + " Maggiore tra interi è: " + CalcoliHelper.maggioreInt());
		System.out.println("Minimo tra double è: " + CalcoliHelper.minoreDb() + " Maggiore tra double è: " + CalcoliHelper.maggioreDb());
		

		
		int base = 15;
        int esponente = 4;
        double risultato = Math.pow(base, esponente);
        System.out.println( base +" elevato a " + esponente + " = " + risultato);
		
	}

}
