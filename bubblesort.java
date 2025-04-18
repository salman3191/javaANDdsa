package javaDsa;
import java.util.*;// or import java.util.Arrays;
// import java.util.collection;
public class bubblesort {
    public static void BubbleSort(int arr[]){
        int n=arr.length;
        for(int turn=0;turn<n-1;turn++){
            for(int j=0;j<n-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
        
                }
            }
        }

      
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){ //for descending order use <
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            // swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }

    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            // finding correct pos to insert
            while(prev >=0   &&   arr[prev] > curr){
            arr[prev+1]=arr[prev];
            prev--;
            }
            // insertion
            arr[prev+1]=curr;
        }
        
    }
    public static void countingsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            // count[arr[i]]++;
            System.out.println( count[arr[i]]++);
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        // insertionSort(arr);
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,4);
        // Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr,0,4,Collections.reverseOrder());
    countingsort(arr);
        printArr(arr);
    }
}
