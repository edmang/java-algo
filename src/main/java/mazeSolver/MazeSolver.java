package mazeSolver;

public class MazeSolver {

    private int[][] map;
    private boolean[][] visited;
    private int startRow;
    private int startColumn;


    public MazeSolver(int[][] map, int startRow, int startColumn) {

        this.map = map;
        this.startRow = startRow;
        this.startColumn = startColumn;
        this.visited = new boolean[this.map.length][this.map[0].length];
    }

    public void findWayOut() {
        try {
            dfs(this.startRow, this.startColumn);
            System.out.println("No solution found in this maze...");
        } catch (FoundExitException fee) {
            System.out.println("Exit found !");
        }
    }

    private void dfs(int rowIndex, int colIndex) throws FoundExitException {

        System.out.println("Visiting the point: (" + rowIndex + ", " + colIndex + ")");
        if (this.map[rowIndex][colIndex] == 3) {  // found the exit
            throw new FoundExitException();
        }

        int endOfMap = this.map.length - 1;

        if (this.visited[rowIndex][colIndex]) {  // this point is already visited
            return;
        } else if (rowIndex < 0 || colIndex >= endOfMap) {  // out of map
            return;
        } else if (colIndex < 0 || rowIndex >= endOfMap) {  // out of map
            return;
        } else if (this.map[rowIndex][colIndex] == 1) {  // wall
            return;
        } else {
            this.visited[rowIndex][colIndex] = true;
            dfs(rowIndex + 1, colIndex);  // going down
            dfs(rowIndex, colIndex + 1);  // going right
            dfs(rowIndex, colIndex - 1);  // going left
            dfs(rowIndex - 1, colIndex);  // going up
        }

    }
}
