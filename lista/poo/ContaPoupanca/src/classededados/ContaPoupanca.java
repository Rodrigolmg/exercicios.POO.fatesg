package classededados;

public class ContaPoupanca {
    //Atributos
    private String nomeDoCliente;
    private int numeroDaConta;
    private int agencia;
    private float saldo;
    
    /**
     * 
     * @param valorD: valor do depósito
     * @throws java.lang.Exception
     */
    public float depositarDinheiro(float valorD) throws Exception{
        if (valorD < 0) throw new Exception ("Valor de depósito inválido! Digite novamente!");
        this.saldo += valorD;
        return saldo;
    }
    
    /**
     * 
     * @param valor: valor do saque a ser feito
     * @throws java.lang.Exception
     */
    public float sacarDinheiro(float valor) throws Exception{
        if (valor < 0 || valor > saldo) throw new Exception ("Valor de saque inválido! Digite novamente!");
        this.saldo -= valor;
        return saldo;
    }
    
    //Métodos Acessores

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) throws Exception{
        char[] c = nomeDoCliente.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i]))
                throw new Exception ("Por favor coloque um nome válido");
            else if (Character.getType(c[i]) == 24)
                throw new Exception ("Por favor coloque um nome válido");
            else if (nomeDoCliente.trim().isEmpty())
                throw new Exception ("Por favor coloque um nome válido");
        }
        this.nomeDoCliente = nomeDoCliente;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) throws Exception{
        if (numeroDaConta < 0) throw new Exception ("Por favor coloque um número de conta válido");
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) throws Exception{
        if (agencia < 0) throw new Exception ("Por favor coloque um número de agência válido");
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }
    
}
