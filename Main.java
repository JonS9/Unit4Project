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

        String[] lines = fileData.split("\n");

        for (String line : lines) {
            String[] numbers = line.split("," );
            System.out.println(Arrays.toString(numbers));


            int[] x = HANDS.FindHands(numbers);


        }
            }
        }



//        if (i == 4) {
//handsType[1]++;
//        }
//        if (i == 3) {
//is3 = true;
//        }
//        if (i == 2) {
//is2 = true;
//        }
//        if (is3 && is2) {
//handsType[2]++;
//        } else if (is3) {
//handsType[3]++;
//        }
//        if (i == 2) {
//count++;
//        }
//        if (count == 2) {
//handsType[4]++;
//        } else if (count == 1) {
//handsType[5]++;
//        } else {
//handsType[6]++;
//        }