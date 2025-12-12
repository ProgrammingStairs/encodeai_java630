// Final keyword
// class Demo3{
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5};
//         System.out.println("Array elements are : ");
//         for(final int element : arr){
//             System.out.print(element+"\t");
//         }
//     }
// }


// class Demo3{
//     public static void main(String args[]){
//         final int arr[] = {1,2,3,4,5};
//         arr[2] = 300;
//         System.out.println("Array elements are : ");
//         for(int element : arr){
//             System.out.print(element+"\t");
//         }
//     }
// }


class Demo3{
    public static void main(String args[]){
        final int arr[] = {1,2,3,4,5};
        int arr1[] = {111,22,33,44,55};
        arr1 = arr;
        System.out.println("Array elements are : ");
        for(int element : arr1){
            System.out.print(element+"\t");
        }
    }
}