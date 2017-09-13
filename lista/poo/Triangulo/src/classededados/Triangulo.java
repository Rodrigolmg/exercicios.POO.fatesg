package classededados;

public class Triangulo {
    //Atributos
    private Float ladoa;
    private Float ladob;
    private Float ladoc;
    
    /**
     * @return - retorna o valor da área do triângulo
     */
    public Float calcularArea(){
        float t;
        t = (this.ladoa + this.ladob + this.ladoc)/2;
        return (float)Math.sqrt(t * (t - this.ladoa) * (t - this.ladob) * (t - this.ladoc));
    } 
    
    /**
     * @return - retorna o tipo do triângulo em relação aos lados
     */
    public String tipoDeLado(){
        if (this.ladoa.equals(this.ladob) && this.ladob.equals(this.ladoc))
            return "Triângulo Equilátero";
        else if (this.ladoa.equals(this.ladob) || this.ladoa.equals(this.ladoc) || this.ladob.equals(this.ladoc))
            return "Triângulo Isósceles";
        else
            return "Triângulo Escaleno";
    }
    
    /**
     * @return - retorn o tipo de ângulo
     */
    public String tipoDeAngulo(){
        float lqum;
        float lqdois;
        float lqtres;
        lqum = (float) Math.pow(this.ladoa, 2);
        lqdois = (float) Math.pow(this.ladob, 2);
        lqtres = (float) Math.pow(this.ladoc, 2);
        if (lqum < lqdois + lqtres)
            return "Ângulo Acutângulo";
        else if (lqum > lqdois + lqtres)
            return "Ângulo Obtusângulo";
        else
            return "Ângulo Retângulo";
    }
    
    public void condicao(float ladoa, float ladob, float ladoc) throws Exception{
        float a;
        float b;
        float c;
        a = Math.abs(ladob - ladoc);
        b = Math.abs(ladoa - ladoc);
        c = Math.abs(ladoa - ladob);
        if (!(a < ladoa && ladoa < ladob + ladoc))
            throw new Exception ("Não forma um Triângulo!");
        if (!(b < ladob && ladob < ladoa + ladoc))
            throw new Exception ("Não forma um Triângulo!");
        if (!(c < ladoc && ladoc < ladoa + ladob))
            throw new Exception ("Não forma um Triângulo!");
    }
    
    /**
     * 
     * Um único set para todos os lados, para não ocorrer erros de cálculos
     * @param ladoa - lado do triângulo
     * @param ladob - lado do triângulo
     * @param ladoc - lado do triângulo
     */
    public void setLados(float ladoa, float ladob, float ladoc) throws Exception{
        if (ladoa <= 0 || ladob <= 0 || ladoc <= 0) 
            throw new Exception ("Valor inválido! Digite novamente");
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
    }

    public float getLadoA() {
        return ladoa;
    }

    public float getLadoB() {
        return ladob;
    }

    public float getLadoC() {
        return ladoc;
    }
    
    
}
