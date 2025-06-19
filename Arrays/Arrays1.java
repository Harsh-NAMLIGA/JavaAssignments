import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Reading array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter values");
             arr[i]=sc.nextInt();
        }

    System.out.println("Displaying values of your array");
        for(int K:arr)
        {
            if(K %2==0)
            {
                System.out.println(K + "is Even");
            }
            else{

                        System.out.println(K + "is odd");

            }
        }

        for(int j:arr)
        {
            System.out.println(j);
        }






    }
}
