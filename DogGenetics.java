import java.util.Random;
import java.util.Scanner;

public class DogGenetics { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dogName = "";
        int bulldog, husky, chihuahua, boxer, shihTzu;
        Random rand = new Random();
        System.out.println("What is your dogs name? ");
        dogName = sc.next();

        System.out.println("Well then, I have this highly reliable report on " + dogName + "\'s prestigious background right here.");
        //start with a random number from 1-100
        bulldog = rand.nextInt(100);
        
        //then subtract that from 100, and get the next dog's random percentage and so on...
        husky = rand.nextInt(100 - bulldog);
        chihuahua = rand.nextInt(100 - bulldog - husky);
        boxer = rand.nextInt(100- bulldog - husky - chihuahua);
        //give shihtzu the remaining percent
        shihTzu = 100 - bulldog - husky - chihuahua - boxer;

        System.out.println(bulldog + "% bulldog \n" + husky + "% husky\n" + chihuahua + "% chihuahua\n" + boxer + "% boxer\n" + shihTzu + "% Shih Tzu");
        System.out.println("Wow thats quite a dog there! ");

        sc.close();
    }
}