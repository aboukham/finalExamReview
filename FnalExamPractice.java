package FinalExam;

import lab5.Student;

public class FnalExamPractice {

    public static int aMethod(int a) {
        if (a < 0)
            return 0;
        if (a == 0 || a == 1)
            return a;
        return a + aMethod(a - 2);
        // a = 5
        //aMethod(5)--> 5 + aMethod(5 - 2)--> 5 + 3 + 1-->9
        //aMethod(3)--> 3 + aMethod(3 - 2)--> 3 + 1
        //aMethod(1)--> 1
        //a = 8
        //aMethod(8)--> 8+ aMethod(8 - 2)--> 8 + 6 + 4 + 2 + 0
        //aMethod(6)--> 6 + amethod(6 - 2)-->6 + 4 + 2 + 0
        //aMethod(4)-->4 + aMethod(4 - 2)--> 4 + 2 + 0
        //aMethod(2)--> 2 + aMethod(2 - 2)--> 2 + 0
        //aMethod(0)--> 0
    }

    public static int sumOfEvensAndOdds(int a){
        int sum = 0;
        if (a % 2 == 0) {
            for (int num = 0; num <= a; num++) {
                if (num % 2 == 0)
                    sum += num;
            }
        }else {
            for (int num = 0; num <= a; num++) {
                if (num % 2 != 0)
                    sum += num;
            }
        }
        return sum;
    }
   /* public static void printLongStrings(String[][] strs){
        for (int i = 0; i < strs.length; i++){
            for (int j = 0; j < strs[i].length; j++)
                if (strs[i][j].length() > 20)
                    System.out.println(strs[i][j]);
        }
    }*/

    public static void printLongStrings(String[][] strs){
        for (int i = 0; i <strs.length; i++){
            String[] subArr = strs[i];
            for (int j = 0; j < subArr.length; j++){
                String str = subArr[j];
                if (str.length() > 20)
                    System.out.print(str);
            }
            System.out.println();
        }
    }

    public static void printLongStrings2(String[][] strs){
        for (int i = 0; i <strs.length; i++){
            for (int j = 0; j < strs[i].length; j++){
                if (strs[i][j].length() > 20)
                    System.out.print(strs[i][j] + " ");
            }
            System.out.println();
        }
    }
    //strs = {{str1, str2, str3}, {str4,str5}, {str6, str7, str8}}
    //subArr = {atr1, str2, str3}
    //str = str1
    public static double computeAverageGPA(Student[]  array){
        double sum = 0;
        for (Student st : array){
            sum += st.getGpa();
        }
        return sum / array.length;
    }

    public static int countDigit(String str){
        if (str.isEmpty())
            return 0;
        int count = (Character.isDigit(str.charAt(0)))? 1 : 0;
        return count + countDigit(str.substring(1));
    }

    public static void main(String[] args){
       // System.out.println(countDigit("abh2vb4bb7hkk8"));
        String[][] strs = {
                {"abdelazizAboukhame121", "abdel"},
                {"RahelRahelRahelRahelRahel", "111223ert"},
                {"student in Msd program"}
        };
        printLongStrings(strs);
        printLongStrings2(strs);
        //System.out.println(aMethod(5));
        //System.out.println(sumOfEvensAndOdds(5));

    }
}
