package org.generation.italy.utils;
import java.lang.Math;

public class CalcoliHelper {
	
	// Attributi
	
	private static int a, b;
	private static double x, y;

	// Costruttore
	
	private CalcoliHelper() {}
	
	// Getters e Setters
	
	public static void setA(int a) {
		CalcoliHelper.a = a;
	}

	public static void setB(int b) {
		CalcoliHelper.b = b;
	}

	public static void setX(double x) {
		CalcoliHelper.x = x;
	}

	public static void setY(double y) {
		CalcoliHelper.y = y;
	}

	
	// Metodi
	
	public static int sommaInt() {
		int sommaInteri = a + b;
		return sommaInteri;
	}
	
	public static double sommaDb() {
		double sommaDouble = x + y;
		return sommaDouble;
	}
	
	public static int diffInt() {
		int differenzaInteri = a - b;
		return differenzaInteri;
	}
	
	public static double diffDb() {
		double differenzaDouble = x - y;
		return differenzaDouble;
	}
	
	public static int moltInt() {
		int moltiplicazioneInteri = a * b;
		return moltiplicazioneInteri;
	}
	
	public static double moltDb() {
		double moltiplicazioneDouble = x * y;
		return moltiplicazioneDouble;
	}
	
	public static int absoluteInt() {
		int valoreAssolutoIntero = Math.abs(a);
		return valoreAssolutoIntero;
	}
	
	public static double absoluteDb() {
		double valoreAssolutoDouble = Math.abs(x);
		return valoreAssolutoDouble;
	}
	
	public static int minoreInt() {
		int valoreMinoreIntero;
		if(a > b) {
			valoreMinoreIntero = b;
		} else {
			valoreMinoreIntero = a;
		}
		return valoreMinoreIntero; 
	}
	
	public static int maggioreInt() {
		int valoreMaggioreIntero;
		if(a < b) {
			valoreMaggioreIntero = b;
		} else {
			valoreMaggioreIntero = a;
		}
		return valoreMaggioreIntero; 
	}
	
	public static double minoreDb() {
		double valoreMinoreDouble;
		if(x > y) {
			valoreMinoreDouble = y;
		} else {
			valoreMinoreDouble = x;
		}
		return valoreMinoreDouble; 
	}
	
	public static double maggioreDb() {
		double valoreMaggioreDouble;
		if(x < y) {
			valoreMaggioreDouble = y;
		} else {
			valoreMaggioreDouble = x;
		}
		return valoreMaggioreDouble; 
	}
}
