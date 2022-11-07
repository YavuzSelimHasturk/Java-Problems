package problems;

import java.util.Random;
import java.util.Scanner;

public class tas_Makas_Kagit_Oyunu {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        Random random = new Random();

        int userChoice = 0;
        int compChoice =0;
        int userP =0;
        int compP= 0;

        do {
            System.out.println("*******************************************************\n" +
                    "Please make your choice : \n\t 1 for Rock\n\t 2 for Paper \n\t 3 for Scissors");
            userChoice = scan.nextInt();

            compChoice = random.nextInt(3) + 1; //0,1,2 olacak, sıfır olmasın diye +1 diyoruz

            if (userChoice == 1 && compChoice == 2) {
                System.out.println("Your choice : " + userChoice + " | Computers choice : " + compChoice +
                        "\nPaper wraps Rock ===> Computer +1 ");
                compP++;
                System.out.println("User : " + userP + " | Computer : " + compP);
            } else if (userChoice == 1 && compChoice == 3) {
                System.out.println("Your choice : " + userChoice + " | Computers choice : " + compChoice +
                        "\nRock smash Scissors ===> User +1 ");
                userP++;
                System.out.println("User : " + userP + " | Computer : " + compP);
            } else if (userChoice == 2 && compChoice == 1) {
                System.out.println("Your choice : " + userChoice + " | Computers choice : " + compChoice +
                        "\nPaper wraps Rock ===> User +1 ");
                userP++;
                System.out.println("User : " + userP + " | Computer : " + compP);
            } else if (userChoice == 2 && compChoice == 3) {
                System.out.println("Your choice : " + userChoice + " | Computers choice : " + compChoice +
                        "\nScissors cuts Paper ===> Computer +1 ");
                compP++;
                System.out.println("User : " + userP + " | Computer : " + compP);
            } else if (userChoice == 3 && compChoice == 2) {
                System.out.println("Your choice : " + userChoice + " | Computers choice : " + compChoice  +
                        "\nScissors cuts Paper ===> User +1 ");
                userP++;
                System.out.println("User : " + userP + " | Computer : " + compP);
            } else if (userChoice == 3 && compChoice == 1) {
                System.out.println("Your choice : " + userChoice + " | Computers choice : " + compChoice +
                        "\nRocks smash Scissors ===> Computer +1 ");
                compP++;
                System.out.println("User : " + userP + " | Computer : " + compP);
            } else{
                System.out.println("Your choice : " + userChoice + " | Computers choice : " + compChoice +
                        "\nIt's a tie");
                System.out.println("User : " + userP + " | Computer : " + compP);
            }

        }while (userP !=5 && compP!=5) ;{

            if (userP>compP) System.out.println("You are the Winner!!!!!"+
                    "\nUser : " + userP + " | Computer : " + compP);
            else System.out.println("Sorryyy, you are Loser :( "+
                    "\nUser : " + userP + " | Computer : " + compP);


        }

    }


}
