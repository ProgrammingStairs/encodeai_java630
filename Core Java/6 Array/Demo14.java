// example showing the concept of 2d array

class Demo14{
    public static void main(String args[]){
        
        // two dimensional array
        // int arr[][] = new int[2][3];
        // arr[0] = new int[]{1,2,3};
        // arr[1] = new int[]{3,4,5};

        // special type of 2d array - Jagged array
        int arr[][] = new int[4][];
        arr[0] = new int[]{1,2,3,5,2};
        arr[1] = new int[]{3,4,5};
        arr[2] = new int[]{4,5,6,7,8,9,9};
        arr[3] = new int[]{5,5,6,6,6,7,7,7,7,7,7};
        
        
        System.out.println("Array elements are : ");
        for(int ar[] : arr){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();
        }
    }   
}

