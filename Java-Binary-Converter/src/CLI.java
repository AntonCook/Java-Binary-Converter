import java.util.Scanner;
import java.util.*;
import com.google.common.base.Splitter;


public class CLI {
    public static String BinaryToEnglish(String convert) {
        StringBuilder output = new StringBuilder();
        Iterable<String> split = Splitter.fixedLength(5).split(convert);
        for (String s : split) {
            switch (s) {
                case "00001":
                    output.append("a");
                    break;
                case "00010":
                    output.append("b");
                    break;
                case "00011":
                    output.append("c");
                    break;
                case "00100":
                    output.append("d");
                    break;
                case "00101":
                    output.append("e");
                    break;
                case "00110":
                    output.append("f");
                    break;
                case "00111":
                    output.append("g");
                    break;
                case "01000":
                    output.append("h");
                    break;
                case "01001":
                    output.append("i");
                    break;
                case "01010":
                    output.append("j");
                    break;
                case "01011":
                    output.append("k");
                    break;
                case "01100":
                    output.append("l");
                    break;
                case "01101":
                    output.append("m");
                    break;
                case "01110":
                    output.append("n");
                    break;
                case "01111":
                    output.append("o");
                    break;
                case "10000":
                    output.append("p");
                    break;
                case "10001":
                    output.append("q");
                    break;
                case "10010":
                    output.append("r");
                    break;
                case "10011":
                    output.append("s");
                    break;
                case "10100":
                    output.append("t");
                    break;
                case "10101":
                    output.append("u");
                    break;
                case "10110":
                    output.append("v");
                    break;
                case "10111":
                    output.append("w");
                    break;
                case "11000":
                    output.append("x");
                    break;
                case "11001":
                    output.append("y");
                    break;
                case "11010":
                    output.append("z");
                    break;
                case "11011":
                    output.append(" ");
                    break;

            }
        }
        return output.toString();
    }

    public static String EnglishToBinary(String convert) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < convert.length(); i++) {
            switch (convert.charAt(i)) {
                case 'a':
                    output.append("00001");
                    break;
                case 'b':
                    output.append("00010");
                    break;
                case 'c':
                    output.append("00011");
                    break;
                case 'd':
                    output.append("00100");
                    break;
                case 'e':
                    output.append("00101");
                    break;
                case 'f':
                    output.append("00110");
                    break;
                case 'g':
                    output.append("00111");
                    break;
                case 'h':
                    output.append("01000");
                    break;
                case 'i':
                    output.append("01001");
                    break;
                case 'j':
                    output.append("01010");
                    break;
                case 'k':
                    output.append("01011");
                    break;
                case 'l':
                    output.append("01100");
                    break;
                case 'm':
                    output.append("01101");
                    break;
                case 'n':
                    output.append("01110");
                    break;
                case 'o':
                    output.append("01111");
                    break;
                case 'p':
                    output.append("10000");
                    break;
                case 'q':
                    output.append("10001");
                    break;
                case 'r':
                    output.append("10010");
                    break;
                case 's':
                    output.append("10011");
                    break;
                case 't':
                    output.append("10100");
                    break;
                case 'u':
                    output.append("10101");
                    break;
                case 'v':
                    output.append("10110");
                    break;
                case 'w':
                    output.append("10111");
                    break;
                case 'x':
                    output.append("11000");
                    break;
                case 'y':
                    output.append("11001");
                    break;
                case 'z':
                    output.append("11010");
                    break;
                default:
                    output.append("11011");
                    break;

            }
        }
        return output.toString();
    }

    private static void DetermineType(Scanner scanner) {
        System.out.println("Binary To English(b) or English to Binary(e)");
        String input = scanner.nextLine();
        if (input.equals("b")) {
            System.out.println("Enter Binary to Be converted");
            String Binary = scanner.nextLine();
            String end = BinaryToEnglish(Binary);
            System.out.println(end);

        } else if (input.equals("e")) {
            System.out.println("Enter English to Be converted");
            String English = scanner.nextLine();
            String end = EnglishToBinary(English);
            System.out.println(end);
        } else {
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DetermineType(scanner);
        scanner.close();

    }


}
