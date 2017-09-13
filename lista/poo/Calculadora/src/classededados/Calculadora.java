package classededados;

public class Calculadora {
    //Atributos
    private double numero;
    private double numero2;
    
    /**
     * 
     * @return  - retorna o resultado da soma entre os números digitados
     */
    public double adicao(){
        return this.numero + this.numero2;
    }
    
    /**
     * 
     * @return - retorna o resultado da subtração entre os números digitados
     */
    public double subtracao(){
        return this.numero - this.numero2;
    }
    
    /**
     * 
     * @return - retorna o resultado da multiplicação entre os números digitados
     */
    public double multiplicacao(){
        return this.numero * this.numero2;
    }
    
    /**
     * 
     * @return - retorna o resultado da divisão entre os números digitados
     */
    public double divisao(){
        return this.numero / this.numero2;
    }
    
    /**
     * 
     * @return - retorna a raiz quadrada do número digitado
     */
    public double raizQuadrada(){
        return Math.sqrt(this.numero);
    }
    
    /**
     * 
     * @param indice - índice para tirar a raiz
     * @return - retorna a raiz do número digitado, de acordo com o índice
     */
    public double raiz(double indice){
        return Math.pow(this.numero, 1/(int)indice);
    }
    
    /**
     * 
     * @return - retorna a potencia do número digitado de acordo com o expoente digitado
     */
    public double potencia(){
        return Math.pow(this.numero, this.numero2);
    }
    
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    
}
