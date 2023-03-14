package minesweeper;

import java.util.Random;
import java.util.Scanner;
    public class MineSweeper  extends Question{
   
    int rowNumber,columnNumber,size;
    final int[][] map;
    final int[][] field;
    boolean game=true;
    Random random =new Random();
    Scanner input=new Scanner(System.in);
 
        public  MineSweeper(int rowNumber, int columnNumber) {
       
        this.rowNumber=rowNumber;
        this.columnNumber=columnNumber;
        this.map=new int[rowNumber][columnNumber];
        this.field=new int [rowNumber][columnNumber];
        this.size=rowNumber*columnNumber;
        }
            public void run(){
            int row,column,success=0;
            prepare();
            print(map);
            System.out.println("Game Started!!!");
            while(game){
            print(field);
            System.out.println("Row::");
            row=input.nextInt();
            System.out.println("Column::");
            column=input.nextInt();
            if(row==rowNumber&&column==columnNumber){
                System.out.println("Use smaller row and column values!!!");
            continue;}
            if(row==rowNumber){
            System.out.println("Use smaller row value!!");
            continue;}
            if(column==columnNumber){
            System.out.println("Use smaller column value!!");
            continue;}
    
    
    
            if(map[row][column]!=-1){
            check(row,column);
            success++;
            if(success==(size-(size/4))){
            System.out.println("CONGRATULATIONS YOU WIN!!!");
            break;}}
            else{game=false;
            System.out.println("GAME OVER!! YOU HIT THE BOMB");
        }
}
}
                public void prepare(){
                int randomRow, randomColumn, count=0;
                while(count !=(size/4)){
                randomRow=random.nextInt(rowNumber);
                 randomColumn=random.nextInt(columnNumber);
                if(map[randomRow][randomColumn]!=-1)
                {map[randomRow][randomColumn]=-1;
                        count++;}}
}
                public void print(int[][] array){
                for(int i=0;i<array.length;i++){
                for(int j=0;j<array[0].length;j++){
                if(array[i][j] >=0){
                System.out.print(" ");
        }        
                System.out.print(array[i][j]+ "  ");}
                System.out.println();
    }
    
}               public void check(int r,int c){
                if(field[r][c]==0){
                if((c<(columnNumber-1)&& (map[r][c+1]==-1))){field[r][c]++;}
                if((r<(rowNumber-1)&&(map[r+1][c]==-1))){field[r][c]++;}
                if((r>0)&&map[r-1][c]==-1){field[r][c]++;}
                if((c>0)&&map[r][c-1]==-1){field[r][c]++;}
                if((r>0)&&(c<(columnNumber-1)&&map[r][c+1]==-1)){field[r][c]++;}
                if((r<(rowNumber-1)&&(c<(columnNumber-1)&& (map[r+1][c+1]==-1)))){field[r][c]++;}
                if((r<(rowNumber-1)&&(c>0)&&(map[r+1][c-1]==-1))){field[r][c]++;}
                if((r>0)&&(c>0)&&map[r-1][c-1]==-1){field[r][c]++;}
               
        }
}
          

    }
