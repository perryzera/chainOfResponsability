public class GerenciadorDeCompras {

    public static absHandler criarCadeia() {

        absHandler comprador = new compradorHandler();
        absHandler gerente = new gerenteHandler();
        absHandler diretor = new diretorHandler();

        comprador.setNextHandle(gerente);
        gerente.setNextHandle(diretor);

        return comprador;
    }
}