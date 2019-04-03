package org.game.demo;

public class FizzBuzzFactory {

    public AbstractFizzBuzz getFizzBuzz(int stage){
        if( 1 == stage ){
            return new FizzBuzzStage1();
        }else if( 2 == stage ){
            return new FizzBuzzStage2();
        } else{
            throw new IllegalArgumentException("stage type is wrong");
        }
    }

}
