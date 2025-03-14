import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Binary search example
        linearSearch();

        // Binary search example
        binarySearch();


    }
    private static void binarySearch(){
        int[] arrAsc = new int[]{2,34,40,56,67,897,1233,1235,12144,34556};
        int[] arrDesc = new int[]{1423432,23124,1234,1112,999,555,222,99,89,76,67,32,10,1};
        BinarySearch searchAscending = new BinarySearch(arrAsc);
        BinarySearch searchDescending = new BinarySearch(arrDesc);
        int element = 10;
     int positionAsc =   searchAscending.binarySearch(element);
        int positionDesc = searchDescending.binarySearch(element);
        String messageAscArray = getMessage(positionAsc);
        String messageDescArray = getMessage(positionDesc);
        System.out.println("Ascending : "+messageAscArray);
        System.out.println("Descending : "+messageDescArray);
    }

    private static void linearSearch() {
        int[] arr1D = new int[]{1,23,24,15,16,98,64};
        int[][] arr2D = new int[][]{{1, 23, 24, 15}, {16, 98, 64}};
        LinearSearch linearSearch = new LinearSearch(arr1D);
        LinearSearch linearSearch2D = new LinearSearch(arr2D);

        int position = linearSearch.linearSearch1d(100);
        int rangedArrayPosition = linearSearch.rangedLinearSearch(1,0,5);

        int[] linearSearch2DPosition= linearSearch2D.linearSearch2D(15  );

        String message = getMessage(position);
        String messageRanged = getMessage(rangedArrayPosition);
        String message2DArray= get2DMessage(linearSearch2DPosition);
        System.out.println("2D Array Linear Search : "+message2DArray);
        System.out.println("Simple Linear Search : "+message);
        System.out.println("Ranged Linear Search : "+messageRanged);
    }

    static  String  getMessage(int position){
       if(position==-1){
          return "Value not found in the array";
       }
       else{
           return "Value is found in array at position "+position;
       }

   }

    static  String  get2DMessage(int[] position){
        if(position[0]== -1){
            return "Value not found in the array";
        }
        else{
            return "Value is found in array at position "+ Arrays.toString(position);
        }

    }
}