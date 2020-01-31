package CompetitiveCoding;

import java.util.ArrayList;
import java.util.Collections;

public class SortingAlgo {

    int[] arr;

    public static void main(String[] args) {
        SortingAlgo sort = new SortingAlgo(6);
        sort.bubblesortingFunction(sort.insertIntoArray(6));
        sort.selectionSort(sort.insertIntoArray(6));
        sort.insertionSort(sort.insertIntoArray(6));
        sort.bubblesortingFunction(new int[]{7, 6, 4, 9, 1});
        sort.selectionSort(new int[] {7,6,4,9,1});
        sort.insertionSort(new int[] {7,6,4,9,1});
        sort.bucketSort(new int[] {7,6,4,9,10,11,1,3,5,8,2},3);
    }

    public void ceil(){
        for (int i=1;i<=10;i++){
        }
    }

    public SortingAlgo(int size){
        arr=new int[size];
    }

    public int[] insertIntoArray(int size){
        for (int i=0;i<size;i++){
            arr[i]=(10-i);
        }
        return arr;
    }

    public void insertionSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            //incrementing j because in the last step it would have got decremented
            arr[j+1]=temp;

        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void selectionSort(int[] arr){
        int k=0;
        while(k<arr.length) {
            int min=Integer.MAX_VALUE;
            for (int i = k; i <= arr.length-1; i++) {
                if (arr[i] < min) {
                    int temp=min;
                    min = arr[i];
                    arr[i]=temp;
                }
            }
            System.out.print(min+" ");
            k++;
        }
        System.out.println();
    }

    public void bubblesortingFunction(int[] arr){
        for(int j=arr.length-1;j>0;j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void bucketSort(int[] arr, int numberOfBuckets){
        ArrayList<Integer>[] bucket = new ArrayList[numberOfBuckets];
        int i;
        int max=Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for(int num: arr){
            if( num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        //creating buckets
        for(i=0;i<numberOfBuckets;i++){
            bucket[i]=new ArrayList<Integer>();
        }

        //assigning values to buckets
        for(int j=0;j<arr.length;j++){
            i=(int) Math.ceil(arr[j]*(numberOfBuckets-1)/(max-min));
            bucket[i].add(arr[j]);
        }

        System.out.println("the buckets before sorting are ");
        for (int k=0;k<numberOfBuckets;k++){
            System.out.print(bucket[k]+" ");
        }

        for (ArrayList<Integer> buckets:bucket){
            Collections.sort(buckets);
        }

        System.out.println();
        System.out.println("the buckets after sorting are ");
        for (int k=0;k<numberOfBuckets;k++){
            System.out.print(bucket[k]+" ");
        }

        System.out.println();
        System.out.println("concatenating all the buckets ");
        int index=0;
        for (ArrayList<Integer> buckets:bucket){
            for(int value:buckets){
                arr[i]=value;
                System.out.print(arr[i++]+" ");
            }
        }

    }

}
