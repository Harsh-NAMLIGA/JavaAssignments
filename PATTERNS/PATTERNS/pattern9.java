package PATTERNS;

class pattern9 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (char ch = (char)('E' -i+1); ch<='E'; ch++)
            {
                System.out.print(ch+ " ");
            }

            System.out.println();
        }

    }
}
