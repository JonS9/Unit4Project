import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileData = "";
        try {
            File f = new File("src/data");
            Scanner s = new Scanner(f);

            while (s.hasNextLine()) {
                String line = s.nextLine();
                fileData += line + "\n";
            }
        } catch (FileNotFoundException Melvin) {
            System.out.println("HE-HEY, BUCKO! THAT'S NOT A VALID DATA FILE!");
        }


        int[] y = {0,0,0,0,0,0,0};

        String[] lines = fileData.split("\n");
        int[] x = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (String line : lines) {

            String w = line.substring(0, line.indexOf("|"));
            String[] numbers = w.split("," );

            x = HANDS.FindHands(numbers);

            HANDS.Five(x, y);
            HANDS.Four(x, y);
            HANDS.Full(x, y);
            HANDS.Three(x, y);
            HANDS.Two(x, y);
            HANDS.One(x, y);
            HANDS.High(x, y);
        }
        System.out.println("Number of five of a kind hands: " + y[0]);
        System.out.println("Number of four of a kind hands: " + y[1]);
        System.out.println("Number of full house hands:  " + y[2]);
        System.out.println("Number of three of a kind hands: " + y[3]);
        System.out.println("Number of two pair hands: " + y[4]);
        System.out.println("Number of one pair hands: " + y[5]);
        System.out.println("Number of high card hands: " + y[6]);

    }
}

