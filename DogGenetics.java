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

        bulldog = rand.nextInt(100);
        husky = rand.nextInt(100 - bulldog);
        chihuahua = rand.nextInt(100 - (bulldog + husky));
        boxer = rand.nextInt(100-(bulldog + husky + chihuahua));
        shihTzu = rand.nextInt(100-(bulldog + husky + chihuahua + boxer));

        System.out.println(bulldog + "% bulldog \n" + husky + "% husky\n" + chihuahua + "% chihuahua\n" + boxer + "% boxer\n" + shihTzu + "% Shih Tzu");
        System.out.println("Wow thats quite a dog there! ");

        sc.close();
    }
}