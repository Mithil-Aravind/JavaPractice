import java.util.Scanner;

public class ReverseArray {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 312};
//        int x = firstArray.length-1;
//
//        for (int i=0;i<(firstArray.length)/2;i++) {
//
//            int tmp = firstArray[x];
//            firstArray[x] = firstArray[i];
//            firstArray[i] = tmp;
//            x = x - 1;
//
//        }

        for(int i=0,j=firstArray.length-1;i<=j;i++,j--){
            int tmp = firstArray[j];
            firstArray[j]= firstArray[i];
            firstArray[i] = tmp;
        }
        for(int i=0;i<firstArray.length;i++)
            System.out.println(firstArray[i]);
    }
}