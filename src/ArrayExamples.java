import java.util.Scanner;

public class ArrayExamples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int[] arr = {6,3,9,7,2,8,4};

       printArray(arr);
     System.out.println("Sum of array elements = "+getSum(arr));
       System.out.println("The largest element in Array ="+getMax(arr));
        checkEvenOrOdd(arr);
        System.out.print("reverse of the Array = ");
        reversedArray(arr);
        System.out.println("factorial of 5 is : "+factorial(5));
        System.out.println("factorial of 5 using recursion : "+fact(5));
        System.out.print("Enter your String to check palindrom or not :");
        String s1 = input.nextLine();
        System.out.println("your string is "+checkPalindromOfString(s1));
        System.out.print("Enter any integer to check prime or not:");
        int number1 = input.nextInt();
        System.out.println(number1+" is"+checkPrime(number1));
       System.out.print("How many elements you want to see in your fibonacci series :");
        int n = input.nextInt();
       System.out.print("Fibonacci series of first "+n+" elements :");
        fibonacciSeries(n);
        System.out.println();
        System.out.print("Fibonacci series of first "+n+" elements using recursion:");
        for (int i = 0;i<n;i++ ){
            System.out.print( fibonacciRecursion(i)+" ");
       }
        System.out.println();
        System.out.print("which element you want to search in array :");
        int key = input.nextInt();
        System.out.println("The element is in the array : "+linearSearch(arr,key));
        System.out.println("the key is in the index "+binarySearch(arr,key));

        System.out.println("the array has duplicate values :"+duplicateElements(arr));

        vowelsConsonents("encapsulation");
        table(11);

        int[][] mt1 = {
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5}
        };
        int[][] mt2 = {
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5}
        };

        int[][] sum=matrixAdd(mt1,mt2);
        System.out.println("sum = ");
        for (int i = 0;i< 5; i++){
            for (int j = 0;j< 5; j++) {
                System.out.print(sum[i][j]+" ");

            }
            System.out.println();

        }
        System.out.printf("Avarage of array: %.2f",avarage(arr));

        System.out.println();
        System.out.print("Enter any year to check leap year or not :");
        int year = input.nextInt();
        leapYear(year);

        System.out.print("enter any string to reverse :");
        String s2 = input.nextLine();
        System.out.println("after reverse :"+reverseString(s2));
        System.out.print("Enter a number to check Armstrong or not :");
        int number = input.nextInt();
        System.out.print(number+" is ");
        checkArmstrong(number);

        System.out.println("the maximum of the array is "+max(arr));
        System.out.println("the minimum of the array is "+min(arr));
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();
        pattern10();

        leftTrianglePattern();
        pyramidPattern();
        diamondPattern();

    }



    //Print my array
    public static void printArray(int[] array){
        System.out.print("My integer Array: ");
        for(int i = 0 ; i<array.length ; i++){

            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    //1. Sum of Array Elements: Write a program to find the sum of all elements in an array.
    public static int getSum(int[] array){
        int sum = 0 ;
        for(int i = 0 ; i<array.length ; i++){

            sum= sum + array[i];

        }
        return sum;
    }

    //2. Largest Element in Array: Find and print the largest element in an array.
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 0;i< array.length;i++){
            if (array[i]>max){
                max= array[i];
            }
        }
        return max ;
    }

    //3. Even or Odd Numbers: Check if a given number is even or odd using if-else. (also count in an x)
    public static void checkEvenOrOdd(int[] array){

        for (int i = 0;i< array.length;i++){

            if (array[i]%2 == 0){

                System.out.println(array[i]+" is Even");
            }
            else {

                System.out.println(array[i]+" is odd");
            }
        }
    }

    //4. Reverse an Array: Reverse the elements of an array.
    public static void reversedArray(int[] array){

        for (int i = array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    //5.1. Factorial Calculation: Write a program to calculate the factorial of a given number.*********
    public static int factorial(int num){
        int fact= 1;
        for (int i = 1; i<=num ; i++){
            fact = fact * i ;

        }
        return fact ;
    }

//    //5.2. Factorial Calculation: Write a program to calculate the factorial of a given number.( recursive solution)
   public static int fact(int num){


           if(num==1)
               return 1;
           else
               return num*fact(num-1);

   }

   //6. Palindrome Check: Check if a given string is a palindrome. (use char string)
    public static String checkPalindromOfString(String str){
        String reverseString = "";
        for (int i = str.length()-1; i>=0;i--){

            reverseString = reverseString+str.charAt(i);
        }
        if(reverseString.equals(str)){
            return "palindrom";
        }
        else{
            return "not palindrom";
        }
    }


    //7. Prime Number Check: Determine whether a given number is prime.
    public static String checkPrime(int num){

     if (num==0 || num==1){
         return " not a prime number";
        }
      else{
          int count = 0;
          for (int i = 2;i<num;i++)
          {
              if (num%i==0){
                  count++;
                  break;
              }

          }

         if (count == 0)
         {
           return " prime number";
        }
         else
         {
            return " not a prime number";
        }

        }
    }


    //8. Fibonacci Series: Generate and print the first N elements of the Fibonacci series.********
     public static void fibonacciSeries(int n){

        int first = 0;
        int second = 1;
        int fibo ;
         System.out.print(first+" "+second);
        for (int i= 3;i<=n;i++){
        fibo = first + second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
        }
     }

    //8. Fibonacci Series: Generate and print the first N elements of the Fibonacci series.********(recursive solution.)
    public static int fibonacciRecursion(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1 || num == 2){
            return 1;
        }
        return fibonacciRecursion(num-2) + fibonacciRecursion(num-1);
    }


    //9. Linear Search: Implement a linear search algorithm to find an element in an array. (true or false return type)

    public static boolean linearSearch(int[] array,int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==key)
                return true ;

        }
        return false;

    }

    //10. Binary Search: Implement binary search for a sorted array.
    public static int binarySearch(int array[], int key){
        int first = 0;
        int last = array.length-1;
        int mid = (first+last)/2;

        while(first <= last){
            if(array[mid]==key)
            {
                return mid;

            }
            if(array[mid]<key){
                first = mid+1;
            }
            else if(array[mid]>key)
            {
                last= mid-1;
            }
            mid = (first+last)/2;
        }
        return 0;
    }

    //11. Duplicate Elements: Find and print duplicate elements in an array. (true or false return type)
    public static boolean duplicateElements(int[] array){

        for (int i = 0; i <array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] == array[j])
                    return true;

              return false;
    }

   //12. Count Vowels and Consonants: Count the number of vowels and consonants in a given string. (a, e, i, o, u)
    public static void vowelsConsonents(String str){
        int vowelCount=0;
        int consonentCount=0;
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' )
                vowelCount++;
            else
                consonentCount++;
        }
        System.out.println("Vowels : "+vowelCount+" and "+consonentCount);
    }

    //13. Multiplication Table: Print the multiplication table for a given number. (2 x 1 = 1, 2 x 2 = 4)
    public static void table(int num){

        for (int i=1 ;i<=10; i++){

            System.out.println(num+"X"+i+"="+num*i);
        }
    }


    //14. Matrix Addition: Add two matrices and print the result. 5x5 5x5 (return 2d array)
    public static int[][] matrixAdd(int[][] m1,int[][] m2)
    {
        int[][] sum =new int[5][5];
        for (int i = 0;i< 5; i++){
            for (int j = 0;j< 5; j++) {
                       sum[i][j] = m1[i][j]+m2[i][j];

                    }

        }
        return sum;
    }


    //15. Calculate Average: Calculate the average of elements in an array.
    public static float avarage(int[] array){
        int sum=0 ;
       float avrg ;
        for (int i = 0;i < array.length;i++){
            sum= sum+array[i];
        }
        avrg = (float)sum/array.length  ;
        return avrg;
    }

    //16. Leap Year Check: Determine whether a given year is a leap year.
    public static void leapYear(int year){
        if(year%400==0){
             System.out.println("Leap Year");
         }
         else if(year%4==0 && year%100!=0){
             System.out.println("Leap Year");
         }
         else{

             System.out.println("not leap year");
         }
    }


    //17. Pattern Printing: Print a pattern (e.g., a pyramid) using loops. (google patterns of loop)


//            1
//            1 2
//            1 2 3
    public static void pattern1(){
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }

//             1
//             2 2
//             3 3 3

    public static void pattern2(){
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(" "+row);
            }
            System.out.println();
        }
    }

//             1
//             1 0
//             1 0 1
//             1 0 1 0

    public static void pattern3(){
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(" "+col%2);
            }
            System.out.println();
        }
    }

//            1
//            0 0
//            1 1 1

       public static void pattern4(){
        int n = 5;
           for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(" "+row%2);
            }
            System.out.println();
        }
       }

//    A
//    A B
//    A B C
public static void pattern5() {
    int n = 5;
    for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.printf("%c ",col+64);
            }
            System.out.println();
        }
}

//    a
//    a b
//    a b c
//    a b c d
    public static void pattern6() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.printf("%c ",col+96);
            }
            System.out.println();
        }
    }

//    a
//    b b
//    c c c
public static void pattern7() {
    int n = 5;
    for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.printf("%c ",row+96);
            }
            System.out.println();
        }
    }

//             *
//             * *
//             * * *
public static void pattern8() {
    int n = 5;
    for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//          1 2 3
//          1 2
//          1
    public static void pattern9(){
        int n = 5;
        for (int row = n;row>=1;row--){
            for (int col = 1; col<=row;col++){
                System.out.print(" "+col);
            }
            System.out.println();
            }
    }

//          1
//          1 2
//          1 2 3
//          1 2
//          1
    public static void pattern10(){
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
          for (int row = n-1 ; row >=1; row--) {
            for (int col = 1; col <=row; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
//           *
//         * *
//       * * *
    public static void leftTrianglePattern(){
        int i, j, row = 5;
//Outer loop work for rows
        for (i=0; i<row; i++)
        {
//inner loop work for space
            for (j=2*(row-i); j>=0; j--)
            {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j=0; j<=i; j++ )
            {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }

//           *
//          * *
//         * * *
//        * * * *
    public static void pyramidPattern(){
        int i, j, row = 5;
//Outer loop work for rows
        for (i=0; i<row; i++)
        {
//inner loop work for space
            for (j=row-i; j>1; j--)
            {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j=0; j<=i; j++ )
            {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }

//         *
//        * *
//       * * *
//        * *
//         *
    public static void diamondPattern(){
        int row =5, i, j, space = 1;
        space = row - 1;
        for (j = 1; j<= row; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j<= row - 1; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (row - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }



    //18. String Reversal: Reverse a given string without using built-in functions.
    public static String reverseString(String str){
        String reverseString = "";
        for (int i = str.length()-1; i>=0;i--){

            reverseString = reverseString+str.charAt(i);
        }
        return reverseString;
    }


    //19. Armstrong Number: Check if a number is an Armstrong number.
    public static void checkArmstrong(int num){

        int temp = num;
        int remainder;
        int sum = 0;

        while(temp!=0)
        {
        remainder = temp%10;
        temp = temp /10;
        sum = sum+remainder*remainder*remainder;
        }
        if(num==sum){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }

    //20. Find Minimum and Maximum: Write a program to find the minimum and maximum values in an array.

    public static int max(int[] array){
        int max = array[0];
        for (int i = 0;i< array.length;i++){

            if (array[i]>max){

                max= array[i];

            }
        }
        return max ;
    }

    public static int min(int[] array){
        int min = array[0];
        for (int i = 0;i< array.length;i++){

            if (array[i]<min){

                min= array[i];

            }
        }
        return min ;
    }
}

