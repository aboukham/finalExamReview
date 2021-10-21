package FinalExam.finalExamReview;

import java.util.Scanner;

public class FinalExamPractice2 {
    //base = 4 n = 3 -->4*4
    //4 * pow(4, 3)
    // 4 * pow(4, 2)
    // 4 * pow (4,1)
    //
    //4 * pow(4, )
    public static int powerN(int base, int n){
        if (n == 1)
            return base;
        return base * powerN(base, n -1);
    }

    public static int countSmallX(String str){
        int count;
        if (str.isEmpty())
            return 0;
        count = (str.charAt(0) == 'x') ? 1 : 0;
        return count + countSmallX(str.substring(1));
    }

    public static int countZeros(){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println("Enter an integer:");
                arr[i][j] = input.nextInt();
                if (arr[i][j] == 0)
                    count++;
            }
        }
        return count;
    }

    public static void print() {
        Scanner input = new Scanner(System.in);
        int countPositives = 0;
        int countNegatives = 0;
        int countOdds = 0;
        int countEvens = 0;
        int[]   arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter an integer:");
                arr[i] = input.nextInt();
                if (arr[i] < 0)
                    countNegatives++;
                else {
                    countPositives++;
                    if (arr[i] % 2 == 0)
                        countEvens++;
                    else
                        countOdds++;
                }
        }
        System.out.println("Number of positive numbers in the array IS " + countPositives);
        System.out.println("Number of negative numbers in the array IS " + countNegatives);
        System.out.println("Number of odd numbers in the array IS " + countOdds);
        System.out.println("Number of even numbers in the array IS " + countEvens);
    }
    //23  45  6
    //23  6   7
    //37  12  3
    public static void main(String[] args) {
        //System.out.println(powerN(3, 2));
        //System.out.println(countSmallX("X123xxuiy"));
        //System.out.println(countZeros());
        print();
    }
}
