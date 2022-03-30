import java.util.Scanner;

import javax.crypto.Mac;

public class HealthyHearts {
    public static void main(String[] args) {
        int age, maxHR;
        double targetMin, targetMax;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your age? ");
        age = sc.nextInt();
        //calculating the heart rates:
        maxHR = (220 - age);
        targetMax = .85 * maxHR;
        targetMin = .5 * maxHR;

        //using math.random will drop the decimals to make the heartrates easier to read. 
        System.out.println("Your max heart rate should be: " + maxHR);
        System.out.println("Your HR Zone range is " + Math.round(targetMin) + " - " + Math.round(targetMax) + " beats per minute");

        sc.close();
    }
}