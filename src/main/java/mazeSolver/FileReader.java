package mazeSolver;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Getter @Setter
public class FileReader {

    private String fileName;
    private int numberRow;
    private int numberColumn;
    private int[][] map;
    private int startRow;
    private int startColumn;
    private int numberEntrance;

    /**
     * Basic constructor
     * @param fileName
     * @param numberRow
     * @param numberColumn
     */
    public FileReader(String fileName, int numberRow, int numberColumn) {
        this.fileName = fileName;
        this.numberRow = numberRow;
        this.numberColumn = numberColumn;
        this.map = new int[numberColumn][numberColumn];
        this.numberEntrance = 0;
    }

    /**
     * Method to read the file and add necessary element in the class
     */
    public void parseFile() {

        try {
            Scanner scanner = new Scanner(new File(this.fileName));

            for(int i = 0; i < this.numberRow; i++) {
                for(int j = 0; j < this.numberColumn; j++) {

                    this.map[i][j] = scanner.nextInt();
                    if (this.map[i][j] == 2) {  // found the entrance of the maze
                        this.startRow = i;
                        this.startColumn = j;
                        this.numberEntrance ++;
                        System.out.println("Found the entrance in position: (" + i + ", " + j + ")");
                    }
                }
                System.out.println("Read " + i + " th line sucessfully");
            }

            scanner.close();
            if (this.numberEntrance != 1) {
                throw new Exception();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("the map should have only one entrance");
        }

    }

}
