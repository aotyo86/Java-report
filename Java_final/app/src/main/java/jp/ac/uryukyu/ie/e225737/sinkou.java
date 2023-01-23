package jp.ac.uryukyu.ie.e225737;

/**
 * しんこうクラス
 * レベルによって表示する速度、乱数の範囲がことなるため、
 * 抽象クラスとしてスリープタイムと乱数範囲という概念のみの実装
 *
 */
public abstract class sinkou {
    int sleepTime;
    int bound_num;
    
    /**
     * 進行メソッド
     * こちらも概念のみの実装
     * 本当はメモで書いてあるように記述し、小クラスに継承したかったのだが、exceptionをはいてしまうので取り合えず諦めた。
     */
    public abstract void Sinkou();/*{
        //System.out.println("レベル1開始,動作確認");
        try{
            System.out.println(val1);
            System.out.println("\n\n\n");
            Thread.sleep(sleepTime);
            System.out.println(val2);
            System.out.println("\n\n\n");
            Thread.sleep(sleepTime);
            System.out.println(val3);
            System.out.println("\n\n\n");
            Thread.sleep(sleepTime);
            System.out.println(val4);
            System.out.println("\n\n\n");
            Thread.sleep(sleepTime);
            System.out.println(val5);
            Thread.sleep(sleepTime);
            System.out.println("答えはいくつ？");
        }catch (InterruptedException e) {
		}catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentExceptionが発生");
        }
    }    */
}
