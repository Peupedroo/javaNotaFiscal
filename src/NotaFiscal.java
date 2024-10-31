public class NotaFiscal {
    private Cliente cliente;
    private Produto produto1, produto2, produto3;

    public void adicionaCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void adicionaProduto1(Produto produto) {
        this.produto1 = produto;
    }

    public void exibir (){
        System.out.printf("-------NOTA FISCAL------- %n Cliente : %S %n CPF : ",cliente.getCliente(), cliente.getCliente());

        System.out.printf("Produto:%S | Categoria : %S | Preco: %f | quantidade %d ",produto1.produto, produto1.categoria, produto1.calcularPrecoFinal(),produto1.quantidade);
    }


}
