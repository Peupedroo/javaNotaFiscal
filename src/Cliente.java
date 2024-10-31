public class Cliente {
    String cliente, CPF;


    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cliente='" + cliente + '\'' +
                '}';
    }
}
