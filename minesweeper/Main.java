package minesweeper;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    boolean isTrue = true;
    Scanner input = new Scanner(System.in);
    
    do {
      try {

        System.out.println("Welcome!!!");

        System.out.println("Please enter the dimensions!!!");
        System.out.println("Number of Rows::");
        int row = input.nextInt();
        
        System.out.println("Number of Columns::");
        int column = input.nextInt();
 if(row==0&&column==0){
                System.out.println("Use bigger row and column values !!!");
            continue;}
            if(row==0){
            System.out.println("Use bigger row value!!");
            continue;}
            if(column==0){
            System.out.println("Use bigger column value!!");
            continue;}
        
        MineSweeper mine = new MineSweeper(row, column);
        mine.run();
        isTrue = true;
      } catch (NegativeArraySizeException e) {
        System.out.println("Negative Value");
               
        input.next();
      } catch (InputMismatchException e) {
        System.out.println("Wrong index type");
        input.next();
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array out of bound");
        input.next();
       
      }
      
    } while (isTrue);
   Question myquestion = new Question();
    myquestion.setQuestion("DO YOU LIKE MY GAME?");
    System.out.println(myquestion.getQuestion());
  }
}
