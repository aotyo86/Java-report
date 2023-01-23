import java.util.InputMismatchException;
import java.util.Scanner;

import jp.ac.uryukyu.ie.e225737.Level1;
import jp.ac.uryukyu.ie.e225737.level2;

public class Main {

    public static void main(String[] args){
        boolean roop = true;
    
        System.out.println("フラッシュ暗算、やってみよう！");

        //1か2と入力するまでループする
        while(roop){
            System.out.println("レベルどうする？");

            //レベル選択
            try{
                Scanner scanner =  new Scanner(System.in);
                int mySelect = scanner.nextInt();
                System.out.println("\n\n");

                //1と選択された時
            
                if(mySelect == 1){

                    System.out.println("スタート！");
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

                    //2を選択された時

                    System.out.println("スタート！");
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

                    //0はブレーク
                }else if(mySelect == 0){
                    System.out.println("システムを中断します。");
                    scanner.close();
                    break;
                    
                    //ここに入るとループする
                }else{
                    System.out.println("そんなlevはないぞー");
                    
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
    }
}
