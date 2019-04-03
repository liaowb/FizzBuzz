package org.game.demo;

/**
 * stage2
 */
public class FizzBuzzStage2 extends AbstractFizzBuzz {

    @Override
    public boolean isFizz(int num) {
        return divBy3(num) || Integer.toString(num).contains(Integer.toString(THREE));
    }
    @Override
    public boolean isBuzz(int num) {
        return divBy5(num) || Integer.toString(num).contains(Integer.toString(FIVE));
    }
}
