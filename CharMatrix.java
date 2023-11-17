

public class CharMatrix
{
    // instance variables--------------------------------
    private char[][] grid;
    //constructor -----------------------------------
    public CharMatrix(int rows, int cols){
        grid = new char[rows][cols];
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                grid[row][col] = ' ';
            }
        }
    }
    
    public CharMatrix(int rows, int cols, char fill){
        grid = new char[rows][cols];
         for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                grid[row][col] = fill;
            }
        }
        
    }
    
    public void display(){
         for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
               System.out.print("[" + grid[row][col] + "]");
            }
            System.out.println();
        }
    }
    
    public int numRows(){
        int rows = grid.length;
        return rows;
    }
    
    public int numCols(){
        int cols = grid[0].length;
        return cols;
    }
    
    public char charAt(int row, int col){
        char location = grid[row][col];
        return location;
    }
    
    public void setCharAt(int row, int col, char ch){
        grid[row][col] = ch;
    }
    
    public boolean isEmpty(int row, int col){
        if(grid[row][col] == ' ') return true;
        return false;
    }
    
    public void fillRect(int row0, int col0, int row1, int col1, char fill){
        for(int r = row0; r <=row1; r++){
            for(int c = col0; c <= col1; c++){
                grid[r][c] = fill;
            }
        }
    }
    
    public void clearRect(int row0, int col0, int row1, int col1){
        for(int r = row0; r <=row1; r++){
            for(int c = col0; c <= col1; c++){
                grid[r][c] = ' ';
            }
        }
    }
    
    public int countInRow(int row){
        int count = 0;
        for(int c = 0; c < grid[0].length; c++){
            if(grid[row][c] == ' ') count++;
        }
        return count;
    }
    
    public int countInCol(int col){
           int count = 0;
        for(int r = 0; r < grid[0].length; r++){
            if(grid[r][col] == ' ') count++;
        }
        return count;
    }
}
