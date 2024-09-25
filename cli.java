import java.util.Scanner;

public class cli {
     public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("B = Binary -> English. E = English -> Binary: ");
        String BE = sc.nextLine();
        
        String toBeConverted;
        
        if(BE.toUpperCase().charAt(0) == 'B') {
            toBeConverted = sc.nextLine();
            sc.close();

            String toBeConvertedSplit[] = toBeConverted.split("\s");
            for(int i = 0; i < toBeConvertedSplit.length; i++) {
                switch(toBeConvertedSplit[i]) {
                    case "00001":
                        System.out.print('a');
                    break;
                    case "00010":
                        System.out.print('b');
                    break;
                    case "00011":
                        System.out.print('c');
                    break;
                    case "00100":
                        System.out.print('d');
                    break;
                    case "00101":
                        System.out.print('e');
                    break;
                    case "00110":
                        System.out.print('f');
                    break;
                    case "00111":
                        System.out.print('g');
                    break;
                    case "01000":
                        System.out.print('h');
                    break;
                    case "01001":
                        System.out.print('i');
                    break;
                    case "01010":
                        System.out.print('j');
                    break;
                    case "01011":
                        System.out.print('k');
                    break;
                    case "01100":
                        System.out.print('l');
                    break;
                    case "01101":
                        System.out.print('m');
                    break;
                    case "01110":
                        System.out.print('n');
                    break;
                    case "01111":
                        System.out.print('o');
                    break;
                    case "10000":
                        System.out.print('p');
                    break;
                    case "10001":
                        System.out.print('q');
                    break;
                    case "10010":
                        System.out.print('r');
                    break;
                    case "10011":
                        System.out.print('s');
                    break;
                    case "10100":
                        System.out.print('t');
                    break;
                    case "10101":
                        System.out.print('u');
                    break;
                    case "10110":
                        System.out.print('v');
                    break;
                    case "10111":
                        System.out.print('w');
                    break;
                    case "11000":
                        System.out.print('x');
                    break;
                    case "11001":
                        System.out.print('y');
                    break;
                    case "11010":
                        System.out.print('z');
                    break;
                    case "11011":
                        System.out.print(' ');
                    break;
                    default:
                    System.out.print("Not supported");
                    break;
                }
            }
            System.out.print("\n");
        }

                
            
        else if(BE.toUpperCase().charAt(0) == 'E') {
            toBeConverted = sc.nextLine();

            for(int i = 0; i < toBeConverted.length(); i++) {
                switch(toBeConverted.charAt(i)) {
                    case 'a':
                        System.out.print("00001 ");
                    break;
                    case 'b':
                        System.out.print("00010 ");
                    break;
                    case 'c': 
                        System.out.print("00011 ");
                    break;
                    case 'd':
                        System.out.print("00100 ");
                    break;
                    case 'e':
                        System.out.print("00101 ");
                    break;
                    case 'f':
                        System.out.print("00110 ");
                    break;
                    case 'g':
                        System.out.print("00111 ");
                    break;
                    case 'h':
                        System.out.print("01000 ");
                    break;
                    case 'i':
                        System.out.print("01001 ");
                    break;
                    case 'j':
                        System.out.print("01010 ");
                    break;
                    case 'k':
                        System.out.print("01011 ");
                    break;
                    case 'l':
                        System.out.print("01100 ");
                    break;
                    case 'm': 
                        System.out.print("01101 ");
                    break;
                    case 'n':
                        System.out.print("01110 ");
                    break;
                    case 'o':
                        System.out.print("01111 ");
                    break;
                    case 'p':
                        System.out.print("10000 ");
                    break;
                    case 'q':
                        System.out.print("10001 ");
                    break;
                    case 'r':
                        System.out.print("10010 ");
                    break;
                    case 's':
                        System.out.print("10011 ");
                    break;
                    case 't':
                        System.out.print("10100 ");
                    break;
                    case 'u':
                        System.out.print("10101 ");
                    break;
                    case 'v':
                        System.out.print("10110 ");
                    break;
                    case 'w':
                        System.out.print("10111 ");
                    break;
                    case 'x':
                        System.out.print("11000 ");
                    break;
                    case 'y':
                        System.out.print("11001 ");
                    break;
                    case 'z':
                        System.out.print("11010 ");
                    break;
                    case ' ':
                        System.out.print("11011 ");
                    break;
                    default:
                        System.out.print("Not supported.");
                    break;
                }
            }   
        }
            
        
        
    }
}