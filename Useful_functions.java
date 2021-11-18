package Useful_functions;

public class Useful_functions {
    public static int arraySum(int arr[]) {
        int count = 0;
        for (int i = 0; arr.length > i; i++) {
            count = count + arr[i];
        }
        return count;
    }

    public static double averageArray(double arr[]) {
        double count = 0;
        for (int i = 0; arr.length > i; i++) {
            count = count + arr[i];
        }
        double average = (count / arr.length);
        return average;
    }

    public static double iDontKnowWhatThisShitDo(double arr[]) {
        double shit = 0;
        for (int i = 1; arr.length > i; i++) {
            arr[i] = i;
            double sum = ((arr[i] - averageArray(arr)));
            double stdev = Math.pow(sum, 2);
            shit = shit + stdev;
        }
        shit = shit * ((double) 1 / arr.length);
        return shit;
    }

    public static boolean checkSymmetricalArray(int[] arr) {
        boolean b = true;
        for (int k = 0; arr.length > k; k++) {
            if (arr[k] != arr[arr.length - 1 - k]) {
                b = false;
                break;
            }
        }
        if (b) {
            System.out.print("the array is symmetrical   --->   ");
        }
        if (!b) {
            System.out.print("the array is not symmetrical   ---->   ");
        }
        return b;
    }

    public static void reverseNumbersArray(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swapSpecificNumbers(int a, int b, int arr[]) {
        for (int i = 0; arr.length > i; i++) {
            if (i == b) {
                System.out.print(arr[a] + " ");
                continue;
            }
            if (i == a) {
                System.out.print(arr[b] + " ");
                continue;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void even_TO_odd(int arr[]) {
        for (int i = 0; arr.length > i; i++) {
            if (arr[i] % 2 != 0) {
                continue;
            }
            System.out.print(arr[i] + "  ");
        }
        for (int i = 0; arr.length > i; i++) {
            if (arr[i] % 2 == 0) {
                continue;
            }
            System.out.print(arr[i] + "  ");
        }
    }


    //matrix!
    public static void printMatrix(int[][] arr2) {
        for (int i = 0; arr2.length > i; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print("[" + arr2[i][j] + "]");
            }
            System.out.println();
        }
    }

    public static int sumMatrix(int matrix[][]) {
        int sum = 0;
        for (int i = 0; matrix.length > i; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }

    public static int sumTrace(int a1[][]) {
        int sum = 0;
        int a = 0;
        for (int i = 0; a1.length > i; i++) {
            for (int j = 0; j < a1[i].length; j++) {
            }
            sum = a1[a][a] + sum;
            a++;
        }
        System.out.println(sum);
        return sum;
    }

    public static int sumTraceRevers(int[][] a2) {
        int sum = 0;
        int a = a2[a2.length - 1].length - 1;
        for (int i = 0; a2.length > i; i++) {
            sum = a2[i][a] + sum;
            a--;
        }
        System.out.println(sum);
        return sum;
    }

    public static boolean checkSymmetryMatrix(int a2[][]) {
        boolean b = true;
        for (int k = 0; a2.length > k; k++) {
            if (a2[k][k] != a2[a2.length - 1 - k][a2.length - 1 - k]) {
                b = false;
                break;
            }
        }
        if (b) {
            System.out.print("The matrix is symmetrical   --->   ");
        }
        if (!b) {
            System.out.print("The matrix is not symmetrical   ---->   ");
        }
        return b;
    }

    public static int[][] transposeMatrix(int a2[][]) {
        {
            for (int k = 0; a2.length > k; k++) {
                for (int i = a2.length - 1; i >= 0; i--) {
                    int temp = a2[k][i];
                    a2[k][i] = a2[i][k];
                    a2[i][k] = temp;
                    if (i > 1) {
                        System.out.print("[" + a2[i][k] + "]");
                    } else {
                        System.out.print("[" + a2[k][i] + "]");
                    }
                }
                System.out.println();
            }
        }
        return a2;
    }

    public static int numZerosMatrix(int a2[][]) {
        int counter = 0;
        for (int i = 0; a2.length > i; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                if (a2[i][j] > 0) {
                    while (a2[i][j] > 0) {
                        if (a2[i][j] % 10 == 0)
                            counter++;
                        a2[i][j] = a2[i][j] / 10;
                    }
                } else counter++;

            }

        }
        System.out.println("There is " + counter + " zeros in the matrix");
        return counter;


    }

//string!

    public static boolean equal(String st1, String st2) {
        if (st1.length() != st2.length()) {
            return false;
        }
        for (int i = 0; i < st1.length(); i++) {
            if (st1.charAt(i) != st2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean symetrialString(String st1) {
        for (int i = 0; i < st1.length(); i++) {
            if (st1.charAt(i) != st1.charAt(st1.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String swaping(String st1) {
        String st2 = "";
        for (int i = st1.length() - 1; i >= 0; i--) {
            st2 = st2 + st1.charAt(i);
        }
        return st2;
    }

    public static int count(String st1) {
        int count = 0;
        for (int i = 0; st1.length() > i; i++) {
            if (st1.charAt(0) == st1.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static int countWords(String st1){
        int count = 0;
        for (int i = 0; st1.length() > i; i++){
            if(st1.charAt(i)==' ')
                count++;
        }

        return count+1;}

    public static String fixFirst(String st1){
        String st2= "";
        if (st1.charAt(0)<st1.charAt(1) && st1.charAt(0)<st1.charAt(2) ){
            st2= st2+ st1.charAt(0);}
        if (st1.charAt(1)<st1.charAt(2) && st1.charAt(1)<st1.charAt(0) ){
            st2= st2+ st1.charAt(1);}
        if (st1.charAt(2)<st1.charAt(1) && st1.charAt(2)<st1.charAt(0) ){
            st2= st2+ st1.charAt(2);}
        return st2;}

    public static String fixSecond(String st1) {
        String st2="";
        if (st1.charAt(0)<st1.charAt(1) && st1.charAt(0)>st1.charAt(2) || st1.charAt(0)>st1.charAt(1) && st1.charAt(0)<st1.charAt(2) ){
            st2= st2+ st1.charAt(0);}
        if (st1.charAt(1)<st1.charAt(0) && st1.charAt(1)>st1.charAt(2) || st1.charAt(1)>st1.charAt(0) && st1.charAt(1)<st1.charAt(2) ){
            st2= st2+ st1.charAt(1);}
        if (st1.charAt(2)<st1.charAt(0) && st1.charAt(2)>st1.charAt(1) || st1.charAt(2)>st1.charAt(0) && st1.charAt(2)<st1.charAt(1) ){
            st2= st2+ st1.charAt(2);}
        return st2;}

    public static String fixThird(String st1){
        String st2="";
        if (st1.charAt(0)>st1.charAt(1) && st1.charAt(0)>st1.charAt(2) ){
            st2= st2+ st1.charAt(0);}
        if (st1.charAt(1)>st1.charAt(0) && st1.charAt(1)>st1.charAt(2) ){
            st2= st2+ st1.charAt(1);}
        if (st1.charAt(2)>st1.charAt(0) && st1.charAt(2)>st1.charAt(1) ){
            st2= st2+ st1.charAt(2);}
        return st2;}

    public static String fix(String st1){
        String st2=fixFirst(st1)+fixSecond(st1)+fixThird(st1);
        return st2;}

    public static String capitalLetter(String st1){
        char tav = st1.charAt(0);
        tav = (char)(tav-32);
        String st2= "";
        st2= st2+tav;
        for (int i = 1; st1.length() > i; i++){
            st2+=st1.charAt(i);}
        return st2;}

    public static char biggestNumber(String st1) {
        char tav = 0;
        for (int i = 0; st1.length()-1 > i; i++){
            if (st1.charAt(i)>st1.charAt(i+1)){
                tav = st1.charAt(i);}
            else tav = st1.charAt(i+1);
        }
        return tav; }
}
