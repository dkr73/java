import  java.util.*;
public class ArraysMethods {
    // Here we will be implementing the methods already available in the arrays class

    // Arrays library class method binary search
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int searchResult = Arrays.binarySearch(arr,30);
        System.out.println("Search result is  = "+searchResult);  // Result is 2, it returns the array index which is 2
    }

}