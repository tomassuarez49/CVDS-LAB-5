package com.CVDS.LAB5;
import java.util.Random;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session")
public class Game {
	private int number;
	private int prize = 100000;
	private int attempts = 0;
	
	  public Game() {
	        // Generar un número aleatorio entre 1 y 10
	        Random random = new Random();
	        number = random.nextInt(10) + 1;
	  }
	
	  public int verificarNumero(int numeroUsuario) {
	        attempts++;
	        
	        if (numeroUsuario == number) {
	            // El usuario adivinó el número
	        	prize += 10000;
	            return prize;
	        } else {
	            // El usuario no adivinó, reducir el premio en $10,000
	            prize -= 10000;
	            return -1; // Indicar que el número es incorrecto
	        }
	    }
	    
	    public void reiniciarJuego() {
	        prize = 100000;
	        attempts = 0;
	        Random random = new Random();
	        number = random.nextInt(10) + 1;
	    }
	    
	    public int getIntentos() {
	        return attempts;
	    }
	    
	    public int getPremio() {
	    	return prize;
	    }
}
