import java.util.EmptyStackException;
import java.util.Scanner;

public class ExException {

           /* 1.  Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
             two numbers , takes two numbers as input
             Input first number: 125
             Input second number: 24               */

         /*  public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          try {
          System.out.print("Enter the  number1 : ");
          int num1 = scanner.nextInt();
          System.out.print("Enter the number2 : ");
          int num2 = scanner.nextInt();
          int sum = num1 + num2;
          int multiply = num1 * num2;
          int subtract = num1 - num2;
          int divition = num1/num2;
          int remainder = num1%num2;
          System.out.println( num1+ " + "+num2 +" = " +  sum);
          System.out.println(num1 + " * " + num2 + "= " +  multiply);
          System.out.println( num1 + " - " + num2 + "=" + subtract);
          System.out.println(num1 + " / " + num2 + " =  " + divition);
          System.out.println(num1 + " % " + num2 + " = " + remainder); }

           catch (java.util.InputMismatchException e){
           System.out.println(" the input must be Integer");
       }    }  */




          /*  2.Write a Java program that takes a number as input and prints its multiplication table up to 10.
               Test Data: nput a number: 8
               Expected Output :
                8 x 1 = 8
               8 x 2 = 16
               8 x 3 = 24
               ...
               8 x 10 = 80  */

       /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          try{
              System.out.println( " please enter your number to do table of multiply up to 10 ");
              int number = scanner.nextInt();
              zero(number);
              int result =1;

             for ( int i=0 ; i <= 10; i++ ){
             result=  number * i ;
             System.out.println(number+"x"+i+"="+result); }
          }
             catch (java.util.InputMismatchException e){
              System.out.println(" rhe input must be Integer ");
          }
          catch (java.lang.Exception e) {
              System.out.println(e.getMessage());
          } }

        public static void zero( int n ) throws java.lang.Exception {
        if (n == 0 ){
        throw new RuntimeException(" enter grater or smaller then Zero ");
        }
    }  */








          /*
           3. Write a Java program to print the area and perimeter of a circle.
          Test Data:
          Raduis = 7.5
          Expected Output
          Perimeter is = 47.12388980384689
          Area is = 176.7145867644258    */


        /*  public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
          try {
           double pi = 3.14;
           System.out.println(" Write a Raduis  ");
           double radius= scanner.nextDouble();

          double perimeter = 2 * pi * radius;
          System.out.println("Perimeter is = " + perimeter);
          double area = pi * radius * radius;
          System.out.println("Area is = " + area);    }
          catch (java.util.InputMismatchException e){
              System.out.println(" enter a number !");
          } catch (java.lang.Exception e){
              System.out.println(" un Expected Error! ");
          }}    */







/* 4. Java program to find out the average of a set of integer
         Enter the count of numbers: 5
         Enter an integer:3
         Enter an integer: 8
         Enter an integer:6
         Enter an integer:7
         Enter an integer: 2
         The average is: 5.7      */

  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double averag;
        int sumnumbers = 0;

        try {
            System.out.print(" write the count !: ");
            int count = scanner.nextInt();

            for (int i = 0; i < count; i++) {
                System.out.print(" write number! : ");
                int number = scanner.nextInt();
                sumnumbers += number;
            }
            notZero(count);
            averag = (double) sumnumbers / count;
            System.out.println(" average : " + averag);

          }
          catch (java.util.InputMismatchException e1){
            System.out.println(" invalid input ");
        }catch (ArithmeticException e2){
            System.out.println(e2.getMessage());
        }
    }
    public static void notZero(int count)throws ArithmeticException{
        if (count == 0 ){
        throw new ArithmeticException(" unvalid Zero count ");  }
        else if ( count < 0) {
            throw new ArithmeticException(" Enter posistive number!  ");
        }
    }  */




    /* 5. Write a Java program that accepts three integers as input, adds the first two integers
    together, and then determines whether the sum is equal to the third integer.
    Input the first number : 5
    Input the second number: 10
    Input the third number : 15
    The result is: true
            --------
    Input the first number : 10
    Input the second number: 20
    Input the third number : 25
    The result is: false       */


     /*   public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
       try{
            System.out.println(" enter frist number ");
            int num1 = scanner.nextInt();
            System.out.println(" enter second number ");
            int num2 = scanner.nextInt();
            System.out.println(" enter third number ");
            int num3 = scanner.nextInt();

            int sumofadd = num1 + num2;

            if (sumofadd == num3) {
                System.out.println(" the result is " + true);
            } else {
                System.out.println(" the result is " + false);
            }
             }
           catch (java.util.InputMismatchException e){
           System.out.println(" the input not Integer ");
          } catch (java.lang.Exception e){
             System.out.println(" UnExpected Error ");
          }
        }   */




 /*    6.Write a Java program to reverse a wor
                     Sample Output:
                     Input a word: dsaf
                     Reverse word: fasd       */


   /* public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
         System.out.println(" enter your input to envers  ");
        String word=scanner.nextLine();
        String revers= "" ;

        for ( int i=word.length() -1 ; i>=0 ; i-- ){
            revers += word.charAt(i);
        }System.out.println(" the word is: " + word + " the revers is : " + revers );
        }
        catch (Error e){
            System.out.println(" Error please try again ! ");
        }
    }  */






     /* 7. - Java program to check whether the given number is even or odd
           Enter a number: 33  The number is Odd
           Enter a number: 24 The number is Even      */

         /* public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
          try{
           System.out.println(" please Ernter anumber to check if 'even' OR  'odd '  ");
           int num =scanner.nextInt();
           checknum(num);

              if ( num % 2 ==0 ){
                  System.out.println(" the number " + num +" is even ");
              }
              else {  System.out.println(" the number "+ num + " is odd");  }
          }
              catch (java.util.InputMismatchException e){
              System.out.println(" try again enter an Integer number  !!  ");
          }catch (RuntimeException e){
              System.out.println(e.getMessage());
          }catch (java.lang.Exception e){
              System.out.println(" UnExpected Error! ");
          }
          }   public  static void checknum( int n){
              if ( n < 0 ){
                  throw new RuntimeException("  Nagative!! ,,please try Positive number  ");
              }
    }  */




        /* 8 - Java program to convert the temperature in Centigrade to Fahrenheit
             Enter temperature in Centigrade:  43
             Temperature in Fahrenheit is: 109.4   */


       /* public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
          try{
          System.out.println(" write temperature in centigrade to convert it to Fahrenheit");
          double temp =scanner.nextInt();
          double fahrenheit=(temp * 9/5)+ 32 ;
          System.out.println(" the tempreture in fehrinhite is : " + fahrenheit );   }
         catch (java.util.InputMismatchException e){
             System.out.println(" the input not Number ,, try Again ");
         }
        }  */



    /* 9. Write a Java program that takes a string and a number from the user,then prints the character in the given index
               Test Data:
               Input a string: Java Bootcamp
               Input a number: 1
               Expected Output: a        */

          /*   public static void main(String[] args) {
             Scanner scanner=new Scanner(System.in);
           try{
              System.out.println("write a string ");
              String string= scanner.nextLine();

              System.out.println(" write a number index  ");
              int number =scanner.nextInt();
              index(number , string);
           }
             catch (java.util.InputMismatchException e){
             System.out.println("invalid input! please enter index number ! ");
           } 
           catch (StringIndexOutOfBoundsException e){
               System.out.println(e.getMessage());
           }
           catch (java.lang.Exception e){
               System.out.println(" UnExpected Error ! ");
           }
             }
              public  static  void index(int n , String str) throws StringIndexOutOfBoundsException  {
                  if ( n < 0 || n > str.length() ){
              throw new StringIndexOutOfBoundsException("invalid !! the index must be betewwn Zero and lenght of String ");
              }
} */






       /* 10. Write a Java program to print the area and perimeter of a rectangle
          Test Data:
          Width = 5.5 Height = 8.5
          Expected Output
          Area is 5.6 * 8.5 = 47.60
         Perimeter is 2 * (5.6 + 8.5) = 28.2       */

     /*  public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           try{
           System.out.println(" write Width rectangle ");
           float width = scanner.nextFloat();
           System.out.println(" write  Height rectangle ");
           float height = scanner.nextFloat();

           float area = width * height;
           float perimeter = 2 * (width + height);
           System.out.println(" the Area is : " + width + " * " + height + " = " + area);
           System.out.println(" the Perimeter is :" + 2 + "* (" + width + " * " + height + ") = " + perimeter);  }
           catch (java.util.InputMismatchException e){
               System.out.println(" invalid input ");
           }catch (java.lang.Exception x){
               System.out.println(" Error out of Program.. ");
           }
       } */


}
