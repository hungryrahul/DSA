public class FloorCeil {
    int[] arr ={};
    FloorCeil(int[] arr){
        this.arr=arr;
    }
    int ceil(int target){
        return ceilORFloorNumber(target,true);
    }
    int floor(int target){
        return ceilORFloorNumber(target,false);
    }

  private int ceilORFloorNumber(int target,boolean isCeil){
      int start =0;
      int end =arr.length-1;
       for (int i = start; i <= end; i++) {
            int mid =(start+end)/2;
            if(arr[mid]==target){
                return target;
            } else if (target>arr[mid]) {
                start=mid+1;
            } else{
                end=mid-1;
            }
       }
       return isCeil?(start>=arr.length?Integer.MAX_VALUE:arr[start]):(end<0?Integer.MIN_VALUE:arr[end]);
    }


}
