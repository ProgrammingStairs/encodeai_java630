// example showing the concept of 2d array

class Demo13{
    public static void main(String args[]){
        
        // two dimensional array

        // int arr[][] = new int[][]{
        //     {1,2,3},
        //     {3,4,5}
        // };

        // special type of 2d array - Jagged array
        int arr[][] = new int[][]{
            {1,2,3,5,2},
            {3,4,5},
            {4,5,6,7,8,9,9},
            {5,5,6,6,6,7,7,7,7,7,7}
        };
        
        System.out.println("Array elements are : ");
        for(int ar[] : arr){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();
        }
    }   
}

