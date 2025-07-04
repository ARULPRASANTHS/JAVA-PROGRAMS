public class MDArray {
    public static void main(String[] args) {
        
        int[][] MDarray = new int[3][3];
        MDarray[0][0] = 1;
        MDarray[0][1] = 2;
        MDarray[0][2] = 3;
        MDarray[1][0] = 4;
        MDarray[1][1] = 5;
        MDarray[1][2] = 6;
        MDarray[2][0] = 7;
        MDarray[2][1] = 8;
        MDarray[2][2] = 9;

        System.out.println("2D arrray elements");
        for(int i=0;i<MDarray.length;i++){
            for(int j=0;j < MDarray[i].length;j++){
    
        System.out.print(MDarray[i][j] + " ");
    }
         System.out.println();
    }
  int sum = 0;
  for(int[] row : MDarray){
    for(int element : row){
         sum += element;
    }
}
  System.out.println("Sum of all elements:" + sum);

  }
}


