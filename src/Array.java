public class Array {


    public static int  maxNum (int[] arr,int index){

        if (index == arr.length-1){             // IF the loop run till the end it will return last index
            return  arr[index];
        }

        int max = maxNum(arr, index + 1);       // will increment the index after each recursion.

        if(arr[index] > max){
            return  arr[index];             // if the array index value is > than max value, it will return the index value.
        }
        else {
            return max;
        }
    }


    public static int MinNUm (int[] arr , int index){

        if(index == arr.length-1){				    // IF the loop run till the end it will return last index

            return arr[index];
        }

        int min = MinNUm(arr, index+1);		 // will increment the index after each recursion.

        if(arr[index] < min){

            return arr[index];			  // if the index value is < than max value, it will return the index value.

        }

        else {
            return min;
        }


    }


    public static int SumNUM(int[] arr, int index) {

        if (index == arr.length - 1) {
                                        // IF the loop run till the end it will return last index
            return arr[index];
        }


        int sum = SumNUM(arr, index + 1);			 // will increment the index after each recursion.

        sum = sum + arr[index];				// sum index values after recursion and will be save in sum.

        return sum;

    }


    public static int SumArr(int[] arr1 ,int[]arr2, int index) {

        if(index == arr1.length || index == arr2.length){				// if the index number reach at the end it will return 0

            return 0;

        }

        int arrsum = SumArr(arr1,arr2,index+1);		// the recursive statement will increment the index after each recursion


        arrsum = arr1[index] + arr2[index];		// the Addition performed will be save in arrsum variable


        System.out.println("The Sum of Array1 and Array2 at index " + index +" is:" + arrsum);

        return arrsum;

    }



    public static int ArrSubtraction(int[] arr1 ,int[]arr2, int index) {

        if(index==arr1.length||index==arr2.length){
            // if the index number reach at the end it will return 0
            return 0 ;
        }

        int sub = ArrSubtraction(arr1,arr2,index+1); 		  // the recursive statement will increment the index after each recursion


        sub = arr1[index] - arr2[index];           	 // the Subtraction performed will be save in Sub variable


        System.out.println("The Subtraction of Array 1 and Array 2 at index "+ index +" is:"+sub);

        return sub;

    }


    public static int ArrMultiplication(int[] arr1 ,int[]arr2, int index) {

        if(index==arr1.length||index==arr2.length){
                                                      // if the index number reach at the end it will return 0
            return 0 ;
        }

        int mul = ArrMultiplication(arr1,arr2,index+1);  	 // the recursive statement will increment the index after each recursion

        mul = arr1[index] * arr2[index];          		  // the Multiplication performed will be saved in mul variable

        System.out.println("The Multiplication of Array 1 and Array 2 at index "+ index +" is:"+mul);

        return mul;

    }

    
}

