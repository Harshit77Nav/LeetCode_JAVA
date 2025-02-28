import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //variables................................................
        //    String name = "John";
        //    String surname = new String("deo");
        //    int ageee  = 30;

       //data types..................................................
       //primitive types......................
       /*
        * byte = 1 byte memory [-128 to 127]
        * short = 2 bytes memory [-32,768 to 32,767]
        * int = 4 bytes memory [-2,147,483,648 to 2,147,483,647]
        * long = 8 bytes memory [-9,223,372,036,854,775,808, to 9,223,372,036,854,775,807]
        * float = 4 bytes memory [1.4E-45 to 3.4E+, 38]
        * double = 8 bytes memory [4.9E-324 to 1.8, E+308]
        * boolean = 1 bit memory [true or false]
        * char = 2 bytes memory [single character]
        */
        // byte b = 10;
        // int phone  = 1234567890;
        // long l = 1234567890123456789L;
        // float f = 10.5F;

        //non -primitive types......................

        // System.out.println(name.length());
        //String..........................................................
        // charAt(0), replace("a", "b"), subString(firstIndex, tillIndex(excludingIndex)),

        //Array...............................................................
        // int[] marks = new int[5];
        // marks[0] = 90;
        // marks[1] = 80;
        // marks[2] = 70;
        // marks[3] = 60;
        // marks[4] = 50;
        // System.out.println(Arrays.toString(marks));

        // Arrays.sort(marks);
        // System.out.println(Arrays.toString(marks));

        // int[][] finalMarks = {{32,56,78},{56,78,48}};
        // System.out.println(finalMarks[1][2]);

        //casting ..............................................
        // double d = 10.5;
        // int i = (int)d;

        //constant ..........................................
        // final int MAX = 100;

        //operators....................................
        // +-*/%
        
        //Unary operator......................................
        // -- ++

        //maths..............................................
        //max min random 
        //Math.max(10, 20);
        //Math.min(10, 20);
        //Math.random();

        //Taking input..................................................
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age :");
        // int age  = sc.nextInt();
        // sc.nextLine();
        // System.out.println("Enter your name :");
        // String Yourname = sc.nextLine();
        // Print without formatting
        // System.out.println("Name: " + name + ", Age: " + age);

        // // Print with formatting
        // System.out.printf("Name: %s, Age: %d\n", Yourname, age);

        //comparision..................................................
        // >, <, >=, <=, ==, !=
        //Logical operators
        // &&, ||, !
        //Ternary operator
        // int x = 10;
        // int y = (x > 10) ? 20 : 30;

        //conditional statement ............................................
        // if(age > 20){
        //     System.out.println();
        // } else {
        //     System.out.println("You are less than 20");
        // }

        // int x = 2;
        // switch (x) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2: System.out.println("tuesday");
        //         break;
        //     default:
        //         break;
        // }

        //loops...........................................................
        // for(int k=0; k<=5; k++){
        //     System.out.println(k);
        // }

        // int h = 0;
        // while (h <= 5) {
        //     if(h == 2){
        //         h++;
        //         continue;
        //     }
        //     System.out.println(h);
        //     h++;
        //     if(h == 3){
        //         break;
        //     }
        // }

        // Scanner sc = new Scanner(System.in);
        // int number=0;
        // do{
        //     System.out.println("Enter a number");
        //     number = sc.nextInt();
        // } while(number>=0);

        //tryCatch.........................................................
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[2]);
                printJava();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
    }
    public static void printJava(){
        System.out.println("Java is a programming language");
    }
}