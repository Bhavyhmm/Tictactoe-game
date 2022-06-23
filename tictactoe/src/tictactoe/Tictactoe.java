
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author bhavy
 */
public class Tictactoe {

    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        sub game=new sub();
        System.out.println("Welcome to tictactoe");
        game.display();
        
        
        int turn=1; //1=x and -1=o
        while(true){
            if(turn==1){
        System.out.println("player X");
            }
            else{
                System.out.println("Player O");
            }
        System.out.println("Enter row: ");
        int row =scanner.nextInt();
        System.out.println("Enter column:");
        int col=scanner.nextInt();
        if(row<0||row>2||col<0||col>2){
        System.out.println("invalid position. try again!");
        continue;
    }
        if(!game.isBlank(row, col)){
           System.out.println("Square is not empty");
            System.out.println("Try again");
            continue;
        }
        if(turn==1){
          game.playx(row, col);  
        }
        else{
           game.playo(row, col); 
        }
        game.display();
        if(game.isOver()){
            break;
        }
        if(game.isFull()){
            System.out.println("It's a tie");
            break;
        }
        turn=-turn;
        
      
        
    }
    
}
}
