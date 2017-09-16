package classededados;

public class CPF{
    //Atributo(s)
    private long numerocpf;
    
    public int calcularPrimeiroDigito(){
        long cpf = this.numerocpf / 100;
        int soma = 0;
        int digito;
        for (int i = 2 ; i <= 10; i++) {
            soma += (cpf % 10) * i;
            cpf /= 10;
        }
        
        digito = 11 - (soma% 11);
        if (digito > 9) return digito = 0;
        else return digito;
    }
    
    public int calcularSegundoDigito(int digitop){
        long cpf = this.numerocpf / 100;
        int soma = 0;
        int digito;
        for (int i = 3; i < 11; i++) {
            soma += (cpf % 10) * i;
            cpf /= 10;
        }
        soma += digitop * 2;
        
        digito = 11 - (soma % 11);
        if (digito > 9) return digito = 0;
        else return digito;
    }
    
    public boolean validarCPF(int digito1, int digito2){
        long d2 = this.numerocpf % 10;
        long d1 = (this.numerocpf / 10) % 10;
        return digito2 == d2 && digito1 == d1;
    }
    
    //Métodos Acessores e Modificadores

    public long getNumerocpf() {
        return numerocpf;
    }

    public void setNumerocpf(long numerocpf) throws Exception{
        this.numerocpf = numerocpf;
    }
    
}
