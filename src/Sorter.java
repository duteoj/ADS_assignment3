import java.util.Random;
public class Sorter {
    public void basicSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void mergeSort(int[] arr, int l, int m, int r){
        int n1 =  m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++){
            L[i] = arr[l+i];
        }
        for(int j=0; j<n2; j++){
            R[j] = arr[m+1+j];
        }

        int k = l;
        int i = 0;
        int j = 0;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void advancedSord(int[] arr, int l, int r){
        if(l<r){
            int m = (l+r)/2;

            advancedSord(arr, l, m);
            advancedSord(arr, m+1, r);
            mergeSort(arr, l, m, r);
        }
    }

    public void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int[] generateRandomArray(int n){
        int[] arr = new int[n];
        Random rand =  new Random();
        for(int i = 0; i < n; i++){
            arr[i] = rand.nextInt(1000);
        }
        return arr;
    }
}
