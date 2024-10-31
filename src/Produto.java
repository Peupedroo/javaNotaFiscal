public class Produto {
    String produto;
    String categoria;
    int quantidade;
    double precoDeVenda;
    double preco;
 ;
    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setPreco ( double preco ){
        this.preco = preco;
    }
    public void setPrecoDeVenda(double precoDeVenda){
        this.precoDeVenda = precoDeVenda;
    }


    public String getProduto() {
        return produto;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco(){
        return preco;
    }
    public double getPrecoDeVenda(){
        return  preco;
    }



    public double calcularImposto (){
        if (categoria.equalsIgnoreCase("Eletronicos")){
            return getPreco()*0.10;
        } else if (categoria.equalsIgnoreCase("vestuario")) {
            return getPreco()*0.05;
        }
        return 0;
    }

    public double calcularJuros(){
        return  preco * 0.1;


    }
    public double calcularLucro(){
        return preco- precoDeVenda;
    }

    public double desconto (){
        return getPreco()*0.1;
    }
    public double taxaDeManuseio(){
        return 10;
    }

    public double calcularPrecoFinal(){
        return calcularImposto()+calcularJuros()-desconto()+preco;
    }
    public double calcularTotal(){
        return preco;
    }

    @Override
    public String toString() {
        return "Poduto{" +
                "produto='" + produto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", quantidade=" + quantidade +
                ", precoDeVenda=" + precoDeVenda +
                ", preco=" + preco +
                '}';
    }


}