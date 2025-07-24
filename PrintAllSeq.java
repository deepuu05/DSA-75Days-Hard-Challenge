// print all the sequence of string
import java.util.ArrayList;
import java.util.Arrays;

public class PrintAllSeq{

    public static void printSequence(int[] arr,int index, ArrayList<Integer> temp_arr){
     if(index == arr.length){
        if(temp_arr.size()>0){
        System.out.println(temp_arr);
        } 
     return;
    }
    printSequence(arr, index +1, temp_arr);
    temp_arr.add(arr[index]);
     printSequence(arr, index +1, temp_arr);
     temp_arr.remove(temp_arr.size()-1);
    }

    public static void main(String [] ag){

        int arr [] ={1,2,3};
        System.out.println("For the Array:"+Arrays.toString(arr));
        printSequence(arr, 0, new ArrayList<>());

    }
}