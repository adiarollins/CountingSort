import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.Scanner;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int countingSort(int[] arr) {
    // Write your code here
        int freqArr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            freqArr[arr[i]]++;
        }
        for (int i = 0; i < freqArr.length; i++) {
            System.out.print (freqArr[i] + " ");
        }
        return 0;
    }

}