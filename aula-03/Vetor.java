public class Vetor {
    public static void main(String[] args){
        int[] meuVetor = new int[100];
        meuVetor[0] = 3;
        for (int i = 1; i < meuVetor.length; i++) {
          meuVetor[i] = meuVetor[i-1]+2;
            System.out.println(meuVetor[i]);
        }

    }
}
