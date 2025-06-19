import java.util.Scanner;

public class Arrayassignment1 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter values");
            arr[i]=sc.nextInt();
            sum+=arr[i];

        }
        double average= (double) sum/arr.length;
        System.out.println("Average is " + average);

    }
}
