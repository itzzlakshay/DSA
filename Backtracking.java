// permutation
package back_tracking;

public class permutation {

    public static void printP(String str, String t){
        if(str.equals("")){
            System.out.println(t);
            return;
        }

        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String rem = left+right;
            printP(rem,t+ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printP(str, "");
    }
}


// rat trap 
package back_tracking;

public class rat_trap {

    static int maze ( int sr, int sc, int er, int ec){

        if(sr>er||sc>ec) return 0;
        if(sr==er && sc==ec) return 1;

        int downWays = maze(sr+1, sc,er,ec);
        int rightWays = maze(sr,sc+1,er,ec);

        int totalWays = downWays + rightWays ;
        return totalWays;
    }

    static void printPath (int sc, int sr, int ec, int er , String s){
        if(sc>ec || sr>er) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
//        path to go down
        printPath(sc+1, sr, ec, er, s+"D");
//        path to go right
        printPath(sc, sr+1, ec, er, s+"R");

    }

    static void fourDirectionMaze(int sc, int sr, int ec, int er, String s, boolean[][] isVisited){
    if(sr<0 || sc<0) return ;
    if(sr>er || sc>ec) return;
    if(isVisited[sr][sc]==true) return;
    if(sr==er && sc==ec){
        System.out.println(s);
        return;
    }
    isVisited[sr][sc]=true;
//        path to go down
        fourDirectionMaze(sc+1, sr, ec, er, s+"D",isVisited);
//        path to go right
        fourDirectionMaze(sc, sr+1, ec, er, s+"R", isVisited);
//        path to go left
        fourDirectionMaze(sc-1, sr, ec, er, s+"D", isVisited);
//        path to go up
        fourDirectionMaze(sc, sr-1, ec, er, s+"D", isVisited);
    isVisited[sc][sr] =false;

    }

    public static void main(String[] args) {

     int row = 3;
     int col = 3;
     int count = maze(1,1,row,col);
//        System.out.println(count);

//        printPath(1,1,row,col,"");

        boolean [][] isVisited = new boolean[row][col];
        fourDirectionMaze(0,0,col-1,row-1,"",isVisited);



    }
}


// Max knights 
package back_tracking;

public class maxKnight {
    static int max = -1;
    public static boolean isSafe(char[][] board , int row, int col){
        int n = board.length;
        int i,j;
//         2 up 1 right
         i = row-2;
         j = col+1;
         if(i>=0 && j<n && board[i][j] == 'k') return false;

         // 2 up 1 left
         i = row-2;
         j = col-1;
         if(i>=0 && j>=0 && board[i][j] == 'k') return false;

         // 2 down 1 right
         i = row+2;
         j = col+1;
         if(i<n && j<n && board[i][j] == 'k') return false;

         // 2 down 1 left
         i = row+2;
         j = col-1;
         if(i<n && j>=0 && board[i][j] == 'k') return false;

         // 2 right 1 up
         i = row-1;
         j = col+2;
         if(i>=0 && j<n && board[i][j] == 'k') return false;

         // 2 right 1 down
         i = row+1;
         j = col+2;
         if(i<n && j<n && board[i][j] == 'k') return false;

         // 2 left 1 up
         i = row-1;
         j = col-2;
         if(i>=0 && j>=0 && board[i][j] == 'k') return false;

         // 2 left 1 down
         i = row+1;
         j = col-2;
         if(i<n && j>=0 && board[i][j] == 'k') return false;

         return true;
    }

    public static void kNight(char[][] board , int row, int col, int num){
        int n = board.length;
        if(row==n){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        else if (isSafe(board, row , col)){
            board[row][col] = 'k';
            if(col!=n-1) kNight(board, row, col+1,num+1);
            else kNight(board, row+1, 0,num+1);
            board[row][col] = 'x';
        }
        if(col!=n-1) kNight(board, row, col+1,num);
        else{

             kNight(board, row+1, 0,num);
        }
    }



    public static void main(String[] args) {
        int n = 4;
        char [][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]= 'x';
            }
        }
        kNight(board, 0,0,0);
        System.out.println(max);


    }
}


// Dead maze 
package back_tracking;

public class deadMaze {

    static void print (int sr, int sc, int er, int ec, String s, int maze[][]){
//        if(sr==0 || sc==0) return;
        if(sc>ec || sr>er) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc] ==0) return;
//        go right
        print(sr,sc+1,er,ec,s+"R",maze);
//        go down
        print(sr+1,sc,er,ec,s+"D",maze);

    }

    public static void main(String[] args) {
        int row = 4;
        int col = 6;
        int [][] maze = {{1,0,1,1,1,1},
                         {1,1,1,1,0,1},
                         {0,1,1,1,1,1},
                         {0,0,1,0,1,1}};

        print(0,0,row-1,col-1,"",maze);


    }
}
