package org.game.demo;


import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void isDivBy3() {
        int[] numbers = { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69,
                72, 75, 78, 81, 84, 87, 90, 93, 96, 99 };
        AbstractFizzBuzz fizzBuzzStage1 = new FizzBuzzStage1();
        for (int num : numbers) {
            boolean res = fizzBuzzStage1.divBy3(num);
            Assert.assertTrue(res);
        }
    }

    @Test
    public void isNotDivBy3() {
        int[] numbers = { 1, 2, 4, 5, 7, 8, 10, 11, 13, 14, 16, 17, 19, 20, 22, 23, 25, 26, 28, 29, 31, 32, 34,
                35, 37, 38, 40, 41, 43, 44, 46, 47, 49, 50, 52, 53, 55, 56, 58, 59, 61, 62, 64, 65, 67, 68, 70, 71, 73,
                74, 76, 77, 79, 80, 82, 83, 85, 86, 88, 89, 91, 92, 94, 95, 97, 98, 100 };
        AbstractFizzBuzz fizzBuzzStage1 = new FizzBuzzStage1();
        for (int num : numbers) {
            boolean res = fizzBuzzStage1.divBy3(num);
            Assert.assertFalse(res);
        }
    }

    @Test
    public void isDivBy5() {
        int[] numbers = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100 };
        AbstractFizzBuzz fizzBuzzStage1 = new FizzBuzzStage1();
        for (int num : numbers) {
            boolean res = fizzBuzzStage1.divBy5(num);
            Assert.assertTrue(res);
        }
    }

    @Test
    public void isNotDivBy5() {
        int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18, 19, 21, 22, 23, 24, 26, 27, 28,
                29, 31, 32, 33, 34, 36, 37, 38, 39, 41, 42, 43, 44, 46, 47, 48, 49, 51, 52, 53, 54, 56, 57, 58, 59, 61,
                62, 63, 64, 66, 67, 68, 69, 71, 72, 73, 74, 76, 77, 78, 79, 81, 82, 83, 84, 86, 87, 88, 89, 91, 92, 93,
                94, 96, 97, 98, 99 };
        AbstractFizzBuzz fizzBuzzStage1 = new FizzBuzzStage1();
        for (int num : numbers) {
            boolean res = fizzBuzzStage1.divBy5(num);
            Assert.assertFalse(res);
        }
    }


    @Test
    public void isFizzInStage1() {
        int[] numbers = { 3, 6, 9, 12 ,18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81, 84, 87, 93, 96, 99 };
        AbstractFizzBuzz stage1 = new FizzBuzzStage1();
        for (int num : numbers) {
            String res = stage1.getResult(num);
            Assert.assertEquals(AbstractFizzBuzz.FIZZ, res);
        }
    }

    @Test
    public void isNotFizzInStage1() {
        int[] numbers = { 5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100 };
        AbstractFizzBuzz stage1 = new FizzBuzzStage1();
        for (int num : numbers) {
            String actualRes = stage1.getResult(num);
            Assert.assertNotEquals(AbstractFizzBuzz.FIZZ, actualRes);
        }
    }

    @Test
    public void isBuzzInStage1() {
        int[] numbers = { 5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100 };
        AbstractFizzBuzz stage1 = new FizzBuzzStage1();
        for (int num : numbers) {
            String actualRes = stage1.getResult(num);
            Assert.assertEquals(AbstractFizzBuzz.BUZZ, actualRes);
        }
    }

    @Test
    public void isNotBuzzInStage1() {
        int[] numbers = { 3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81,
                84, 87, 93, 96, 99 };
        AbstractFizzBuzz stage1 = new FizzBuzzStage1();
        for (int num : numbers) {
            String actualRes = stage1.getResult(num);
            Assert.assertNotEquals(AbstractFizzBuzz.BUZZ, actualRes);
        }
    }

    @Test
    public void isFizzBuzzInStage1() {
        int[] numbers = { 15, 30, 45, 60, 75, 90 };
        AbstractFizzBuzz stage1 = new FizzBuzzStage1();
        for (int num : numbers) {
            String actualRes = stage1.getResult(num);
            Assert.assertEquals(AbstractFizzBuzz.FIZZBUZZ, actualRes);
        }
    }

    @Test
    public void isNotFizzBuzzInStage1() {
        int[] numbers = { 3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78,
                81, 84, 87, 93, 96, 99 };
        AbstractFizzBuzz stage1 = new FizzBuzzStage1();
        for (int num : numbers) {
            String actualRes = stage1.getResult(num);
            Assert.assertNotEquals(AbstractFizzBuzz.FIZZBUZZ, actualRes);
        }
    }

    @Test
    public void isNumInStage1() {
        int[] numbers = { 1, 2, 4, 7, 8, 11, 13, 14, 16, 17, 19, 22, 23, 26, 28, 29, 31, 32, 34, 37, 38, 41, 43, 44, 46,
                47, 49, 52, 53, 56, 58, 59, 61, 62, 64, 67, 68, 71, 73, 74, 76, 77, 79, 82, 83, 86, 88, 89, 91, 92, 94,
                97, 98 };
        AbstractFizzBuzz stage1 = new FizzBuzzStage1();
        for (int num : numbers) {
            String actualRes = stage1.getResult(num);
            Assert.assertEquals(num, Integer.parseInt(actualRes));
        }
    }

    @Test
    public void isFizzInStage2() {
        int[] numbers = { 3, 6, 9, 12, 13, 18, 21, 23, 24, 27, 31, 32, 33, 34, 36, 37, 38, 39, 42, 43, 48, 63, 66,
                69, 72, 73, 78, 81, 83, 84, 87, 93, 96, 99 };
        AbstractFizzBuzz stage2 = new FizzBuzzStage2();
        for (int num : numbers) {
            String actualRes = stage2.getResult(num);
            Assert.assertEquals(AbstractFizzBuzz.FIZZ, actualRes);
        }
    }

    @Test
    public void isNotFizzInStage2() {
        int[] numbers = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 65, 70,
                75, 80, 85, 90, 95, 100 };
        AbstractFizzBuzz stage2 = new FizzBuzzStage2();
        for (int num : numbers) {
            String actualRes = stage2.getResult(num);
            Assert.assertNotEquals(AbstractFizzBuzz.FIZZ, actualRes);
        }
    }

    @Test
    public void isBuzzInStage2() {
        int[] numbers = { 5, 10, 20, 25, 40, 50, 52, 55, 56, 58, 59, 65, 70, 80, 85, 95, 100 };
        AbstractFizzBuzz stage2 = new FizzBuzzStage2();
        for (int num : numbers) {
            String actualRes = stage2.getResult(num);
            Assert.assertEquals(AbstractFizzBuzz.BUZZ, actualRes);
        }
    }

    @Test
    public void isNotBuzzInStage2() {
        int[] numbers = { 3, 6, 9, 12, 13, 15, 18, 21, 23, 24, 27, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 42,
                43, 45, 48, 51, 53, 54, 57, 60, 63, 66, 69, 72, 73, 75, 78, 81, 83, 84, 87, 90, 93, 96, 99 };
        AbstractFizzBuzz stage2 = new FizzBuzzStage2();
        for (int num : numbers) {
            String actualRes = stage2.getResult(num);
            Assert.assertNotEquals(AbstractFizzBuzz.BUZZ, actualRes);
        }
    }

    @Test
    public void isFizzBuzzInStage2() {
        int[] numbers = { 15, 30, 45, 60, 75, 90 };
        for (int num : numbers) {
            AbstractFizzBuzz stage2 = new FizzBuzzStage2();
            String actualRes = stage2.getResult(num);
            Assert.assertEquals(AbstractFizzBuzz.FIZZBUZZ, actualRes);
        }
    }

    @Test
    public void isNotFizzBuzzInStage2() {
        int[] numbers = { 1, 2, 4, 7, 8, 11, 13, 14, 16, 17, 19, 22, 23 };
        AbstractFizzBuzz stage2 = new FizzBuzzStage2();
        for (int num : numbers) {
            String actualRes = stage2.getResult(num);
            Assert.assertNotEquals(AbstractFizzBuzz.FIZZBUZZ, actualRes);
        }
    }

    @Test
    public void isNumInStage2() {
        int[] numbers = { 1, 2, 4, 7, 8, 11, 14, 16, 17, 19, 22, 26, 28, 29, 41, 44, 46, 47, 49, 61, 62, 64, 67, 68, 71,
                74, 76, 77, 79, 82, 86, 88, 89, 91, 92, 94, 97, 98 };
        AbstractFizzBuzz stage2 = new FizzBuzzStage2();
        for (int num : numbers) {
            String actualRes = stage2.getResult(num);
            Assert.assertEquals(num, Integer.parseInt(actualRes));
        }
    }



}

