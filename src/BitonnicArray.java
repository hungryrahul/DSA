public class BitonnicArray {
int[] arr;
    BitonnicArray(int[ ] arr){
        this.arr=arr;
    }


    int findPeak(){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid= (start+end)/2;
            if(start==end){
                return mid;
            }else if(arr[mid]>arr[mid+1]){
                    end=mid;
            }else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
        return -1;
    }

    int findElement(int target){
        int peakIndex = findPeak();

        if(peakIndex!=-1){
            if(arr[peakIndex]==target){
                return peakIndex;
            }
            BinarySearch search =new  BinarySearch(arr);

            int positionAscending = search.binarySearch(target,0,peakIndex);

            if(positionAscending==-1){
                int positionDescending = search.binarySearch(target,peakIndex+1,arr.length-1);
                if(positionDescending!=-1){
                    return positionDescending;
                }
            }else{
                return positionAscending;
            }

        }
        return -1;
    }
}
