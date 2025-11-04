public class TesteCadeia {

    public static void main(String[] args) {
        absHandler cadeiaDeAprovacao = GerenciadorDeCompras.criarCadeia();

        System.out.println("--- Testando compra de R$ 500 ---");
        cadeiaDeAprovacao.handleRequest(500);

        System.out.println("\n--- Testando compra de R$ 5.000 ---");
        cadeiaDeAprovacao.handleRequest(5000);

        System.out.println("\n--- Testando compra de R$ 100.000 ---");
        cadeiaDeAprovacao.handleRequest(100000);
    }
}