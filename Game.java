//Representa el estado de una partida.
package tp.pr1;

import java.util.Random;

public class Game {
	//Atributos
	private Board board;
	private int size;
	private int initCells;
	private Random myRandom;
	
	//Constructora con tres argumentos
	public Game(int dimension, int baldosasIniciales, Random rnd){
		this.size = dimension;
		this.initCells = baldosasIniciales;
		this.myRandom = rnd;
		this.board = new Board(this.size);
		
		
	}
	
	
	//Métodos
	/**
	 * Método que ejecuta un movimiento en la dirección dir sobre el tablero, actualizando
	 * el marcador de puntos Score y el valor más alto de las baldosas del tablero Heighest
	 * @param dir
	 */
	public void move(Direction dir){
				
	}
	
	/**
	 * Método responsable de inicializar la partida actual
	 */
	public void reset(){
		
	}
	
	
	
	
}
