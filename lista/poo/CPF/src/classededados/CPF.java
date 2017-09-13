package classededados;

public class CPF{
    //Atributos
    private String nome;
    private int numerocpf;
    private int dia;
    private int mes;
    private int ano;
    
    public int calcularPrimeiroDigito(){
        /**
         * p10, p9, p8, p7, p6, p5, p3, p2
         * Variáveis para armazenamento de valores resultantes
         * da multiplicação dos números do CPF por seus pesos (de 10 a 2)
         */
        int p10, p9, p8, p7, p6, p5, p4, p3, p2;;
        int soma; // Variável que recebe o somatório de p10, p9, p8, p7, p6, p5, p3, p2
        int digito; // Variável que recebe o digito verificador
        
        p10 = (this.numerocpf / 100000000) * 10;
        p9 = ((this.numerocpf / 10000000) % 10) * 9;
        p8 = ((this.numerocpf / 1000000) % 10) * 8;
        p7 = ((this.numerocpf / 100000) % 10) * 7;
        p6 = ((this.numerocpf / 10000) % 10) * 6;
        p5 = ((this.numerocpf / 1000) % 10) * 5;
        p4 = ((this.numerocpf / 100) % 10) * 4;
        p3 = ((this.numerocpf / 10) % 10) * 3;
        p2 = ((this.numerocpf / 1) % 10) * 2;
        
        soma = p10 + p9 + p8 + p7 + p6 + p5 + p4 + p3 + p2;
        
        digito = 11 - (soma % 11);
        if (digito > 9){
            digito = 0;
            return digito;
        } else{
            return digito;
        }
    }
    
    public int calcularSegundoDigito(int digitop){
        /**
         * p11, p10, p9, p8, p7, p6, p5, p3, p2
         * Variáveis para armazenamento de valores resultantes
         * da multiplicação dos números do CPF por seus pesos (de 10 a 2)
         */
        int p11, p10, p9, p8, p7, p6, p5, p4, p3, p2;
        int soma; // Variável que recebe o somatório de p11, p10, p9, p8, p7, p6, p5, p3, p2
        int digito; // Variável que recebe o digito verificador
        
        
        p11 = (this.numerocpf / 100000000) * 11;
        p10 = ((this.numerocpf / 10000000) % 10) * 10;
        p9 = ((this.numerocpf / 1000000) % 10) * 9;
        p8 = ((this.numerocpf / 100000) % 10) * 8;
        p7 = ((this.numerocpf / 10000) % 10) * 7;
        p6 = ((this.numerocpf / 1000) % 10) * 6;
        p5 = ((this.numerocpf / 100) % 10) * 5;
        p4 = ((this.numerocpf / 10) % 10) * 4;
        p3 = ((this.numerocpf / 1) % 10) * 3;
        p2 = digitop * 2;
        
        soma = p11 + p10 + p9 + p8 + p7 + p6 + p5 + p4 + p3 + p2;
        
        digito = 11 - (soma % 11);
        
        if (digito > 9){
            digito = 0;
            return digito;
        } else{
            return digito;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception{
        char[] n = nome.toCharArray();
        for (int i = 0; i < n.length; i++) {
            if (Character.isDigit(n[i]))
                throw new Exception("Nome inválido! Digite novamente");
            else if (Character.getType(n[i]) == 24)
                throw new Exception("Nome inválido! Digite novamente");
            else if (nome.trim().isEmpty())
                throw new Exception("Nome inválido! Digite novamente");
        }
        this.nome = nome;
    }

    public int getNumeroCpf() {
        return numerocpf;
    }

    public void setNumeroCpf(int numerocpf) throws Exception{
        if (numerocpf < 1000000) throw new Exception ("Número inválido! Digite novamente!");
        this.numerocpf = numerocpf;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) throws Exception{
        if (dia <= 0) throw new Exception ("Dia inválido! Digite novamente!");
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws Exception{
        if (mes <=0 || mes > 12) throw new Exception ("Mês inválido! Digite novamente!");
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) throws Exception{
        if (ano < 1900 || ano > 2017) throw new Exception ("Ano inválido! Digite novamente!");
        this.ano = ano;
    }
    
    
}
