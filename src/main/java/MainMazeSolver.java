import mazeSolver.FileReader;
import mazeSolver.MazeSolver;

public class MainMazeSolver {

    public static void main(String[] args){

        /**
         * Maze solving algorithm
         */

        String mazePath = "C:\\Users\\ewang\\Documents\\Java\\JavaAlgorithm\\maze\\maze2.txt";
        FileReader fileReader = new FileReader(mazePath, 10, 10);
        fileReader.parseFile();
        System.out.println("");
        System.out.println("----------- START SOLVING THE MAZE -----------");
        MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(), fileReader.getStartRow(), fileReader.getStartColumn());
        mazeSolver.findWayOut();

    }
}
