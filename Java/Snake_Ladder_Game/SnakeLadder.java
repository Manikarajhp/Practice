import java.util.Random;
import java.util.Scanner;

public class SnakeLadder {
        static int snake_head[] = {16,59,67,63,87,93,95,98};
        static int snake_tail[] = {7,17,30,19,24,69,75,77};
        static int ladder_down[] = {9,18,25,28,56,68,76,79};
        static int ladder_top[] = {27,37,54,51,64,88,97,99};
        static int player1 = 1;
        static int player2 = 1;
        static int dice = 0;
    
        public static int index(int val, int a[]){
            for(int i = 0;i < a.length; i++){
                if(a[i] == val)
                    return i;
            }
            return 0;
        }

        public static boolean in(int tar,int a[]){
            for(int i:a){
                if (i == tar)
                    return true;
                }
            return false;
        }
        
        public static void linePrinter(int s){
            System.out.println();
            for(int i = s; i >s-10; i--){
                if(i == player1){
                    System.out.print("X ");
                }
                else if(i == player2){
                    System.out.print("O ");
                }
                else if(in(i,snake_head)){
                    System.out.print("@ ");
                }
                else if(in(i,snake_tail)){
                    System.out.print("/ ");
                }
                else if(in(i,ladder_down) || in(i,ladder_top)){
                    System.out.print("| ");
                }
                else{
                    System.out.print("_ ");
                }
        }
        System.out.println();
            for(int i = s-19; i <=s-10; i++){
                if(i == player1){
                    System.out.print("X ");
                }
                else if(i == player2){
                    System.out.print("O ");
                }
                else if(in(i,snake_head)){
                    System.out.print("@ ");
                }
                else if(in(i,snake_tail)){
                    System.out.print("/ ");
                }
                else if(in(i,ladder_down) || in(i,ladder_top)){
                    System.out.print("| ");
                }
                else{
                    System.out.print("_ ");
                }
            }
        }

        public static void printBoard(){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            linePrinter(100);
            linePrinter(80);
            linePrinter(60);
            linePrinter(40);
            linePrinter(20);
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        }

        public static int rollDice(){
            Random rand = new Random();
            return rand.nextInt(6)+1;
        }

        public static void checkPlayer(int pos, int who){
            if(in(pos,snake_head)){
                if(who == 1){
                    player1 = snake_tail[index(pos, snake_head)];
                }
                else{
                    player2 = snake_tail[index(pos, snake_head)];
                }
            }
            else if(in(pos,ladder_down)){
                if(who == 1){
                    player1 = ladder_top[index(pos, ladder_down)];
                }
                else{
                    player2 = ladder_top[index(pos, ladder_down)];
                }
            }
            else{
                ;
            }
        }

        public static void movePlayer(int d,int who){
            if(who == 1){
                if((player1+d) <= 100){
                    player1 += d;
                    checkPlayer(player1,1);
                }
                else{
                    ;
                }
            }
            else{
                if((player2+d) <= 100){
                    player2 += d;
                    checkPlayer(player2,2);
                }
                else{
                    ;
                }
            }
        }

        public static void compPlay(){
            while((player1 < 100) && (player2 < 100)){
                Scanner inp = new Scanner(System.in);
                System.out.print("Enter to roll dice : ");
                inp.nextLine();
                dice = rollDice();
                System.out.println("Player 1 : "+ dice);
                movePlayer(dice, 1);
                printBoard();
                dice = rollDice();
                System.out.println("Player 2 : "+ dice);
                movePlayer(dice, 2);
                printBoard();
            }
            if(player1 == 100)
                System.out.println("Player 1 won the game.");
            else
                System.out.println("Player 2 won the game.");
        }

        public static void twoPlay(){
            while((player1 < 100) && (player2 < 100)){
                Scanner inp = new Scanner(System.in);
                System.out.print("Enter to roll dice : ");
                inp.nextLine();
                dice = rollDice();
                System.out.println("Player 1 : "+ dice);
                movePlayer(dice, 1);
                printBoard();
                
                System.out.print("Enter to roll dice : ");
                inp.nextLine();
                dice = rollDice();
                System.out.println("Player 2 : "+ dice);
                movePlayer(dice, 2);
                printBoard();
            }
            if(player1 == 100)
                System.out.println("Player 1 won the game.");
            else
                System.out.println("Player 2 won the game.");
        }
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("\n-----Snake & Ladder-----\n\n\tMenu\n\t~~~~\n1.Single Player\n2.Two Player\n\nEnter your mode : ");
            int mode = inp.nextInt();
            if(mode == 1){
                compPlay();
            }
            else{
                twoPlay();
            }
            
    }
}