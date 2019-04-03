package org.game.demo;


import java.util.Scanner;

public class FizzBuzzMain {
    public static void main(String[] args){
        System.out.print("\n Input the Stage (1/2) or 'quit' to Exit : ");
        FizzBuzzFactory fizzBuzzFactory = new FizzBuzzFactory();
        Scanner readValue = new Scanner(System.in);

        while (readValue.hasNext()) {
            String input = readValue.next();
            if( "Quit".equalsIgnoreCase(input) ){
                break;
            }else {
                if ( "1".equals(input.trim()) || "2".equals(input.trim()) ) {
                    int stage = Integer.parseInt(input.trim());
                    AbstractFizzBuzz fizzBuzz = fizzBuzzFactory.getFizzBuzz(stage);
                    fizzBuzz.startGame();
                }
            }
            System.out.print("\n Input the Stage (1/2) or 'quit' to Exit : ");
        }
        readValue.close();
        System.exit(0);
    }
}
