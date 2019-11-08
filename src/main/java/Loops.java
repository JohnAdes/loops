import java.util.Scanner;

public class Loops {

    public static int sum, num;

    public static void main(String[] args) {

        Scanner loop = new Scanner(System.in);
//
//            num = -1;
//            sum = 0;
//
//        while (num != 0)
//        {
//            System.out.println("Enter a number: ");
//            num = loop.nextInt();
//            sum  +=num;
//            System.out.println(sum);
//        }
//        System.out.println(sum);


        for(int i = 1; i <= 12;i++)
        {
            System.out.println();
            System.out.println("Table of " + i);

            for(int j = 1; j <= 12;j++)
            {
                System.out.println(i +" x "+j+ " = " + i*j);
            }

        }

    }
}