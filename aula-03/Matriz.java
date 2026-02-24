public class Matriz {
    public static void main(String[] args){

        int[][] matriz = new int[3][3];
        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = num++;
                if (i == j) {
                    System.out.print(matriz[i][j]);
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
        int p = 40;

        int k = Math.abs()
    }
}