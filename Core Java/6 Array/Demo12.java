// example showing the concept of 2d array

class Demo12{
    public static void main(String args[]){
        int arr[][] = {
            {1,2,3},
            {3,4,5}
        };
        int i,j;
        System.out.println("Array elements are : ");
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        // for(i=0;i<arr.length;i++){
        //     for(j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+"\t");
        //     }
        //     System.out.println();
        // }
    }   
}

