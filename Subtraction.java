
package nim;

import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        int numStick, 
                x = (int)(Math.random()*2),
                numToRemove;
        
        String turn = (x==0) ? "second": "first";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to my game of Nim.");
        System.out.println("This time you are going to go "+turn+".");
        
        if(turn.equals("second")){
            //Computer plays first
            System.out.print("Choose the total number of sticks between 21-29: ");
            numStick = keyboard.nextInt(); 
            while(numStick < 21 || 29 < numStick){
                System.out.print("Total number of sticks must be between 21-29: ");
                numStick = keyboard.nextInt(); 
            }
            System.out.println("Total number of sticks is "+ numStick +".");
            numToRemove = (int)(1 + Math.random()*3);
                System.out.println("My turn. There are "+numStick+" sticks left. I, the Computer, will remove "+numToRemove+" of them.");
                numStick -= numToRemove;
        } else {
            //Player plays first 
            numStick = (int)(21 + Math.random()*9);
            System.out.println("I choose the total number of sticks to be "+numStick+".");
        }
        
        while(5<=numStick){     
            System.out.print("Your Turn. There are "+numStick+" sticks left. How many sticks do you want to remove? ");
            numToRemove = keyboard.nextInt(); 
            while(numToRemove < 1 || 3 < numToRemove) {
                System.out.println("You can choose to remove 1, 2 or 3 sticks only");
                System.out.print("How many sticks do you want to remove? ");
                numToRemove = keyboard.nextInt(); 
            }
            numStick -= numToRemove;
            switch(numStick){
                case 7: 
                case 3: numToRemove = 3; break;
                case 6: 
                case 2: numToRemove = 2; break;
                case 5: 
                case 4:numToRemove = 1; break;
                default: numToRemove = (int)(1 + Math.random()*3);
            }
            System.out.println("My turn. There are "+numStick+" sticks left. I, the Computer, will remove "+numToRemove+" of them.");
            numStick -= numToRemove;
            if(numStick==0){
                System.out.println("There are "+numStick+" sticks left.");
                System.out.println("I win, you LOSE!");
            }         
        }
        
        if(numStick<=4){
            System.out.print("Your Turn. There are "+numStick+" sticks left. How many sticks do you want to remove? ");
            numToRemove = keyboard.nextInt(); 
            while(numToRemove < 1 || 3 < numToRemove) {
                System.out.println("You can choose to remove 1, 2 or 3 sticks only");
                System.out.print("How many sticks do you want to remove? ");
                numToRemove = keyboard.nextInt(); 
            }
            numStick -= numToRemove;         
            if(numStick==0){
                System.out.println("YOU WIN!");
            } else if(numStick <= 3){
                System.out.println("My turn. There are "+numStick+" sticks left. I, the Computer, will remove all of them.");
                System.out.println("I win, you LOSE!");
            }
        }
    }   
}
