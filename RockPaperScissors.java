import java.util.*;

//program that has user play rock paper scissors by using random number generator 
public class RockPaperScissors {
    public static void main(String[] args) {
        String roundWinner = "", endingString="";
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean cont = true;
        
        while(cont) {
            int rounds=0, ties=0, userWins=0, compWins=0, userChoice, compChoice, playAgain;
            //check for number between 1-10
            do {
                try {
                    System.out.print("Enter the number of rounds you would like to play (1-10): ");
                    rounds = sc.nextInt();
                } catch(NumberFormatException ex) {
                    System.out.println(ex + " is not a number between 1 and 10. ");
                }
            } while(rounds < 1 || rounds > 10);

            //the actual game starts:
            for(int i = 0; i < rounds; i++) {
                //game menu. user selects an option, which is saved into a variable
                do {
                    System.out.println("Please select one of the following: ");
                    System.out.println("1. Rock");
                    System.out.println("2. Paper");
                    System.out.println("3. Scissors");

                    //user selects 1, 2 or 3 for their choice
                    userChoice = sc.nextInt();
                } while(userChoice < 1 || userChoice > 3);
                
                //computer randomly gets a 1, 2 or 3 as well
                compChoice = rand.nextInt(3) + 1;

                //using my game method that returns a string with the winner for that particular game
                roundWinner = game(userChoice, compChoice);
                //switch statement for the winner, adds to win total
                switch(roundWinner) {
                    //increment the wins for each particular player/ties
                    case "tie": 
                        ties++;
                        break;
                    case "user":
                        userWins++;
                        break;
                    case "computer":
                        compWins++;
                        break;
                    default:
                        System.out.println("Incorrect input. Try again");
                        break;
                }
                //prints round winner to console
                System.out.println("Winner: " + roundWinner);

            }
            //outside the for loop now, we print out the total wins for each player including ties.
            System.out.println("User wins: " + userWins);
            System.out.println("Computer wins: " + compWins);
            System.out.println("Ties: " + ties);
            System.out.println("Overall game winner: ");

            //calculating over all game winner and printing the result in the main
            System.out.println(winner(userWins, compWins, ties));

            System.out.println("Would you like to play again?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            playAgain = sc.nextInt();

            if(playAgain == 2) {
                cont = false;
            }
        }
        sc.close();
    }

    
    public static String game(int userChoice, int compChoice) {
        String winner = "";
        //have all possible outcomes and their winner
        if(userChoice == compChoice) {
            winner = "tie";
        }
        else if (userChoice == 1 && compChoice == 2) { //paper beats rock
            winner = "computer";
        }
        else if(userChoice == 1 && compChoice == 3) { //rock beats scissors
            winner = "user";
        }
        else if(userChoice == 2 && compChoice == 1) { //paper beats rock
            winner = "user";
        }
        else if(userChoice == 2 && compChoice == 3) { //scissors beats paper
            winner = "computer";
        }
        else if(userChoice == 3 && compChoice == 1) { //rock beats scissors
            winner = "computer";
        }
        else if(userChoice == 3 && compChoice == 2) { //scissors beat paper
            winner = "user";
        }
        return winner;
    } 

    public static String winner(int userWins, int compWins, int ties) {
            if(userWins > compWins) {
                return "You!";
            }
            else if(compWins > userWins) { 
                return "The Computer wins";
            }
            return "Tie";
    }
}