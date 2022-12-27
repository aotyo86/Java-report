package jp.ac.uryukyu.ie.e225737;
import java.util.Random;
import java.util.Scanner;

public class Level1 extends sinkou{
    int sleepTime = 2500;
    int bound_num = 99;
    Random rand = new Random();
    int val1 = rand.nextInt(bound_num);
    int val2 = rand.nextInt(bound_num);
    int val3 = rand.nextInt(bound_num);
    int val4 = rand.nextInt(bound_num);
    int val5 = rand.nextInt(bound_num);
    int answer = val1 + val2 + val3 + val4 + val5;

    
    @Override
    public void Sinkou(){
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
            Scanner scanner = new Scanner(System.in);
            int myAnswer = scanner.nextInt();
            scanner.close();

            if (myAnswer == answer){
                System.out.println("あたり");
            } else{
                System.out.println("答えは"+answer+"でした");
            }
            
        }catch (InterruptedException e){
        }
    }
}
