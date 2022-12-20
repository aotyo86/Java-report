//import java.util.Random;
import java.util.Scanner;

import jp.ac.uryukyu.ie.e225737.sinkou;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args){
        //int sleepTime = 2500;
        //int bound = 100;
        boolean roop = true;
        
        /*Random rand = new Random();
        int val1 = rand.nextInt(bound);
        int val2 = rand.nextInt(bound);
        int val3 = rand.nextInt(bound);
        int val4 = rand.nextInt(bound);
        int val5 = rand.nextInt(bound);
        int answer = val1 + val2 + val3+ val4+ val5;*/

        //try{
            System.out.println("フラッシュ暗算、やってみよう！");
            //Thread.sleep(1000);
            while(roop){
                System.out.println("レベルどうする？");
                int mySelect = new Scanner(System.in).nextInt();
                if(mySelect == 1){

                    //System.out.println("lev1開始");
                    sinkou lev1 = new sinkou();
                    lev1.Sinkou();
                    roop = false;
                } else if(mySelect == 2){
                    System.out.println("lev2開始");
                    roop = false;
                }else{
                    System.out.println("そんなlevはないぞー");
                    //Thread.sleep(1000);
                }
            }

            /*Thread.sleep(3000);
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

            int myAnswer = new Scanner(System.in).nextInt();

            if (myAnswer == answer){
                System.out.println("あたり");
            } else{
                System.out.println("答えは"+answer+"でした");
            }
        } catch (InterruptedException e) {
		}*/
    }
}