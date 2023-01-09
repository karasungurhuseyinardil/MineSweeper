package  minesweeper;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
        public static void main(String[] args){
        
            Scanner input=new Scanner(System.in);
            try{
            
        
        System.out.println("Welcome!!!");
            
        System.out.println("Please enter the dimensions!!!");
        System.out.println("Number of Rows::");
        int row=input.nextInt();
        System.out.println("Number of Columns::");
         int column=input.nextInt();
    
    MineSweeper mine=new MineSweeper (row,column);
    mine.run();}catch(NegativeArraySizeException e){
            System.out.println("Negative Value");
    input.nextInt();}
        catch(InputMismatchException e)
    {System.out.println("Wrong index type");
    input.nextInt();}finally {System.out.println("Finished");
        }
  
Question myquestion=new Question();
myquestion.setQuestion("DO YOU LIKE MY GAME?");
            System.out.println(myquestion.getQuestion());
           
    }
        }
 