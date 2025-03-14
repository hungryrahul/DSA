public class LinearSearch {


    int[] oneDArray;
    int[][] twoDArray;

    public LinearSearch(int[] oneDArray){

        this.oneDArray=oneDArray;
    }


  public  LinearSearch(int[][] twoDArray){

        this.twoDArray=twoDArray;
    }


   int linearSearch1d(int value){

            for (int i = 0; i < oneDArray.length; i++) {
                   if(value==oneDArray[i]){
                       return i;
                   }
            }


       return -1;
    }

    int rangedLinearSearch(int value , int start, int end){
        for (int i = start;i<end;i++){
            if(value==oneDArray[i]){
                return i;
            }
        }
        return -1;
    }
    int[] linearSearch2D(int value){
        int[] position = {-1,-1};
        for (int i=0;i<twoDArray.length;i++){
            for (int j=0;j<twoDArray[i].length;j++){
                if(twoDArray[i][j]==value){
                    position=new int[]{i,j};
                }
            }
        }
        return position;
    }


}
