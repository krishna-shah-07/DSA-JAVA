import java.io.*;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0 ; i < l ; i++){
            arr[i] = sc.nextInt();
        }
        
        int s = sc.nextInt();
        int compare = 0, i = 0;
        for(i = 0 ; i < l ; i++){
            compare++;
            if(s == arr[i]){
                System.out.println(i);
                break;
            }
        }
        
        if(i == l){
            System.out.println("Element " + s +  " is not present in the array");
        }
        
        System.out.println(compare);
    }
}