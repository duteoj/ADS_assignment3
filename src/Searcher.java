public class Searcher {
    public int search(int[] arr, int target){
        int low = 0;
        int n = arr.length;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
        }
        return -1;
    }
}
