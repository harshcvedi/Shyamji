public class Pascal_Triangle_Pattern_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row <= n){
            int value = 1;
            int col = 1;
            while(col <= row){
                System.out.print(value + "  ");
                value = (value * (row - col)) / col;
                col ++;
            }
            System.out.println();
            row++;
        }
    }
