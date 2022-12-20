import java.util.Random;
import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args){
        int sleepTime = 2500;
        
        Random rand = new Random();
        int val1 = rand.nextInt(99);
        int val2 = rand.nextInt(99);
        int val3 = rand.nextInt(99);
        int val4 = rand.nextInt(99);
        int val5 = rand.nextInt(99);
        int answer = val1 + val2 + val3+ val4+ val5;

        try{
            System.out.println("フラッシュ暗算、やってみよう！");
            Thread.sleep(1000);
            System.out.println("準備OK？");

            Thread.sleep(3000);
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
		}

    }
}
