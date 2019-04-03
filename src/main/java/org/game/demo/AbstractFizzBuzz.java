package org.game.demo;


public abstract class  AbstractFizzBuzz {

    public static final String FIZZ = "FIZZ";
    public static final String BUZZ = "BUZZ";
    public static final String FIZZBUZZ = "FizzBuzz";

    public static final int THREE = 3;
    public static final int FIVE = 5;

    public static final int START = 1;
    public static final int END = 100;

    public abstract boolean isFizz(int num);
    public abstract boolean isBuzz(int num);


    /**
     * 是否被三整除
     * @param num
     * @return
     */
    public boolean divBy3(int num){
        return ( num %  THREE == 0) ? true: false;
    }
    /**
     * 是否被5整除
     * @param num
     * @return
     */
    public boolean divBy5(int num){
        return ( num %  FIVE == 0) ? true: false;
    }
    /**
     * 获取结果
     * @param num
     * @return
     */
    public String getResult(int num){
        boolean isFizz = isFizz(num);
        boolean isBuzz = isBuzz(num);
        if( isFizz && isBuzz ){
            return FIZZBUZZ;
        }else if( isFizz ){
            return FIZZ;
        }else if(isBuzz ){
            return BUZZ;
        }else{
            return Integer.toString(num);
        }
    }
    /**
     *  开始游戏
     * @return
     */
    public void startGame(){
        for( int i=START;i<=END;i++ ){
            System.out.println(getResult(i));
        }
    }

}
