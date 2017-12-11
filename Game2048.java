//Clase que me da todos los posibles movimientos.
package tp.pr1;

import java.util.Random;
import java.util.Scanner;

public class Game2048 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);//Creamos un objeto de la clase Scanner
		int dim = Integer.parseInt(args[0]);//Almacenamos la dimensión del tablero 
		int celdasIniciales = Integer.parseInt(args[1]);//Almacenamos las baldosas iniciales
		long seed = Long.parseLong(args[2]);//Almacenamos la semilla
		Random rand = new Random(seed);//Metemos la semilla para que nos produzca una misma secuencia
		Game game = new Game(dim, celdasIniciales, rand);//Creamos una partida
		Controller controllador = new Controller(game, in);//Controla la ejecución de la partida creada
		controllador.run();//Realiza la simulación del juego
		in.close();//Cerramos el Scanner
	}
}
