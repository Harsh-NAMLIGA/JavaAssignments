package PATTERNS;

class pattern15 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <=5; i++) {

            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }



    }
}
