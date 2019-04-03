package org.game.demo;

/**
 * stage1
 */
public class FizzBuzzStage1 extends AbstractFizzBuzz {

    @Override
    public boolean isFizz(int num) {
        return divBy3(num);
    }
    @Override
    public boolean isBuzz(int num) {
        return divBy5(num);
    }
}
