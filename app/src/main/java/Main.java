import java.util.InputMismatchException;
import java.util.Scanner;

import jp.ac.uryukyu.ie.e225737.Level1;
import jp.ac.uryukyu.ie.e225737.level2;

public class Main {

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
            try{
                Scanner scanner =  new Scanner(System.in);
                int mySelect = scanner.nextInt();
                System.out.println("\n\n");
            
                if(mySelect == 1){

                    //System.out.println("lev1開始");
                    try{
                        Level1 lev1 = new Level1();
                        lev1.Sinkou();
                        roop = false;
                    }catch (IllegalArgumentException e){
                        System.out.println("IllegalArgumentExceptionが発生");
                    }catch(InputMismatchException e){
                        System.out.println("半角数字で答えなさい");
                        try{
                            Thread.sleep(1000);

                        }catch(InterruptedException ex){
                        }
                    }
                } else if(mySelect == 2){
                    try{
                        level2 lev2 = new level2();
                        lev2.Sinkou();
                        roop = false;
                    }catch(IllegalArgumentException e){
                        System.out.println("IllegalArgumentExceptionが発生");
                    }catch(InputMismatchException e){
                        System.out.println("半角数字で答えなさい！");
                        try{
                            Thread.sleep(1000);

                        }catch(InterruptedException ex){
                        }
                    }
                }else if(mySelect == 0){
                    System.out.println("システムを中断します。");
                    scanner.close();
                    break;
                    
                }else{
                    System.out.println("そんなlevはないぞー");
                    //Thread.sleep(1000);
                }

                scanner.close();
            }catch(InputMismatchException e){
                System.out.println("半角数字で答えて");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ex){
                }
        
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
