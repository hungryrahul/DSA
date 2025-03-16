public class InfiniteArrayBSA {
int[] arr ;

InfiniteArrayBSA(int[] arr){
    this.arr=arr;
}

int findTheElement(int target){
    BinarySearch search = new BinarySearch(arr);

    int start =0;
    int end=1;

    while(end<arr.length){
        int size = end- start +1;

         start = end+1;
        end= 2*size+end;



    }

    System.out.println(end);
    return search.binarySearch(target,start,end);
}

}
