// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        char[][] grid = {{'1','1','1','1','0'},
                         {'1','1','0','0','0'},
                         {'1','1','0','1','0'},
                         {'0','0','0','0','0'}};
        int n= numIsland(grid);
        System.out.printf(String.valueOf(n));
    }
    public static int numIsland(char [][] grid){
        if(grid== null|| grid.length==0)
        {
            return 0;
        }
        int numIsland=0;
        for (int i=0; i<grid.length; i++)
        {  for (int j=0; j< grid.length;j++)
        {
            if(grid[i][j]=='1')
            {
                numIsland +=dfs(grid,i,j);
            }
        }

        }
        return numIsland;
    }
    public static int dfs(char[][] grid, int i,int j){
        if(i<0|| i>=grid.length || j<0 || j>= grid.length ||grid[i][j]=='0'){
            return 0;
        }
        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);

           return 1;
    }


}