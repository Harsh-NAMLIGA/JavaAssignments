package PATTERNS;

public class pattern5 {
    public static void main(String[] args)
    {
        for(int i=0; i<=5;i++) {
            for (int j=0; j<=i;j++) {
                System.out.print((char)('A'+i) + " ");
            }


            System.out.println();
        }
    }
}

