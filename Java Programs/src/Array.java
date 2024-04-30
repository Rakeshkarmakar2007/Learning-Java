//import java.util.*;
//public class Array {
//    public static void main(String[] args) {
//        String[] Array1 = new String[]{"WORLD", "TREE", "BIRD", "ELEPHANT", "NATURE", "CLOUD", "SKY", "PYTHON", "CLEAR", "FIGHT", "WATCH", "APPLE", "GAME", "HEIGHT", "SUN", "RIVER", "LIGHT"};
//        Random rand = new Random();
//        Scanner sc = new Scanner(System.in);
//        boolean[] Same = new boolean[Array1.length-1];
//        Arrays.fill(Same, true);
//
//        int point1 = 0;
//        int point2 = 0;
//
//        System.out.print("\nEnter the name of player1   :   ");
//        String player1 = sc.next();
//        System.out.print("\nEnter the name of player2   :   ");
//        String player2 = sc.next();
//
//        System.out.print("\nEnter number of rounds you want to play:");
//        int round = sc.nextInt();
//        for(int i = 0; i < round; i++){
//            if(Same[i]) {
//                System.out.println("\n\t\t\t\t--:: " + player1 + " ::--");
//                int index = rand.nextInt(0, Array1.length);
//                jumbleWord(Array1[index]);
//                System.out.print("    =     ");
//                if (sc.next().equalsIgnoreCase(Array1[index])) {
//                    point1++;
//                    System.out.println("correct!");
//                }
//            }
//
//            if(Same){
//            System.out.println("\n\t\t\t\t--::  "+player2+"  ::--");
//            index = rand.nextInt(0, Array1.length);
//            jumbleWord(Array1[index]);
//            System.out.print("    =     ");
//            if(sc.next().equalsIgnoreCase(Array1[index])){
//                point2++;
//                System.out.println("correct!");
//            }
//
//        }
//
//        System.out.println(player1+"  :  "+point1+"\n"+player2+"  :  "+point2);
//    }
//    static void jumbleWord(String str){
//        Random random = new Random();
//        boolean[] isSame = new boolean[str.length()];
//        Arrays.fill(isSame, true);
//        for (int i = 0; i < str.length(); ) {
//            int index = random.nextInt(0, str.length());
//            if (isSame[index]) {
//                isSame[index] = false;
//                i++;
//                System.out.print(str.charAt(index));
//            }
//        }
//    }
//}