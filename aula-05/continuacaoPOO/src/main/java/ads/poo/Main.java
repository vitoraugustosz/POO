package ads.poo;
public class Main {
    static void main() {

        Contador meuSomador = new Contador();
        Contador meuDiminuidor = new Contador();

        meuSomador.setValorAtual(10);
        meuSomador.clicar();
        System.out.println(meuSomador.getValorAtual());

        meuDiminuidor.setValorAtual(10);
        meuDiminuidor.setDiminuir(true);
        meuDiminuidor.clicar();
        meuDiminuidor.clicar();
        System.out.println(meuDiminuidor.getValorAtual());
    }
}
