import java.io.*;
import java.util.*;

public class Solution {
    
    public static List<Integer> quickSort(List<Integer> arr){
        if(arr.size() <= 1){
            return arr;
        }
        
        int pivot = arr.get(0);
        
        List<Integer> left = new ArrayList<>();
        List<Integer> same = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        
        for(int num : arr){
            if(num < pivot){
                left.add(num);
            }
            else if(num == pivot){
                same.add(num);
            }
            else{
                right.add(num);
            }
        }
        
        left = quickSort(left);
        right = quickSort(right);
        
        List<Integer> result = new ArrayList<>();
        
        result.addAll(left);
        result.addAll(same);
        result.addAll(right);
        
        for(int num : result){
            System.out.print(num + " ");
        }
        System.out.println();
        
        return result;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        quickSort(arr);
        sc.close();
    }
}