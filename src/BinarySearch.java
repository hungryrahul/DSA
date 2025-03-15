public class BinarySearch {
    int[] arr ;

    BinarySearch(int[] arr){
        this.arr=arr;
    }

  int  binarySearch(int value,int start, int end){

      boolean isAscending= arr[start]<arr[end-1];
      while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<value){
              if(isAscending)  start=mid+1;
              else end=mid-1;
            }else if(arr[mid]>value){
              if(isAscending)  end=mid-1;
              else start=mid+1;
            }else{
                return mid;
            }

        }
      return -1;
    }
}
