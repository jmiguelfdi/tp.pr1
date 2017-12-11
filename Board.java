//Almacena el estado del tablero y proporciona métodos necesarios para la gestión de dicho estado.
package tp.pr1;

public class Board {
	//Atributos
	private Cell[][] board;
	private int boardSize;
	
	//Contructora con un único argumento
	public Board(int dimension){
		this.boardSize = dimension;
		this.board = new Cell[boardSize][boardSize];//Instanciamos el atributo board
		//Inicializamos el tablero con posiciones vacias
		for(int i=0 ; i <this.boardSize ; i++){
			for(int j=0 ; j <this.boardSize ;j++){
				this.board[i][j] = new Cell();
			}
		}
	}
	
	//Métodos
	/**
	 * Método usado para modificar el valor de la balosa de la posición pos con el valor value
	 * @param pos
	 * @param value
	 */
	public void setCell(Position pos, int value){
			
	}
	
	/**
	 * Médoto que ejecuta las dos primeras acciones de un movimiento (desplazar y fusionar) en la 
	 * dirección dir del tablero.Devuelve un objeto con los resultados del movimiento
	 * @param dir
	 * @return
	 */
	public MoveResults executeMove(Direction dir){
		return null;		
	}
	
	
	/*Metodo que imprime el estado del tablero*/
	public String toString(){ 
		StringBuilder sb = new StringBuilder();
        for (int i=0; i<this.boardSize; i++) {
            for (int j=0; j<this.boardSize; j++) {
                sb.append(this.board[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();				
	}	
}
