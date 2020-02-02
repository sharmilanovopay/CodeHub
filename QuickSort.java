package CompetitiveCoding;

public class QuickSort {

    public static void main(String[] args) {
        int arr[]= new int[]{4,6,8,1,3,7};
        QuickSort sort = new QuickSort();
        sort.quickSort(arr, 0,arr.length-1);
        sort.printArr(arr);
    }

    public void quickSort(int[] arr, int start, int end){
        if(start<end){
            int pivot = partition(arr,start,end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }

    int partition(int[] arr,int start,int end){
        int i=start-1;
        int pivot = end;
        for (int j=start;j<=end;j++){
            if(arr[j]<=arr[pivot]){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        return i;
    }

    void printArr(int[] arr){
        for (int k=0;k<arr.length;k++){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
