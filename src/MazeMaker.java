import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;


public class MazeMaker{
	
	private static int width;
	private static int height;
	
	private static Maze maze;
	
	private static Random randGen = new Random();
	private static Stack<Cell> uncheckedCells = new Stack<Cell>();
	
	
	public static Maze generateMaze(int w, int h){
		width = w;
		height = h;
		maze = new Maze(width, height);
		
		//select a random cell to start
		
		//call selectNextPath method with the randomly selected cell
		
		return maze;
	}

	private static void selectNextPath(Cell currentCell) {
		// mark current cell as visited

		// check for unvisited neighbors
		
		// if has unvisited neighbors,
			// select one at random.
			// push it to the stack
			// remove the wall between the two cells
			// make the new cell the current cell and mark it as visited
		
			//call the selectNextPath method with the current cell
			
		// if all neighbors are visited
			//if the stack is not empty
				// pop a cell from the stack
				// make that the current cell
		
				//call the selectNextPath method with the current cell
	}

	private static void removeWalls(Cell c1, Cell c2) {
		
	}

	private static ArrayList<Cell> getUnvisitedNeighbors(Cell c) {
		return null;
	}
}