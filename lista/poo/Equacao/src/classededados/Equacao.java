package classededados;

public class Equacao {
    private double a;
    private double b;
    private double c;
    
    /**
     * 
     * @param a - coeficiente a;
     * @param b - coeficiente b;
     * @param c - coeficiente c;
     * @return - retorna o valor de Delta
     */
    public double calcularDelta(double a, double b, double c){
        return Math.pow(b, 2) - 4 * a * c;
    }
    
    /**
     * 
     * @param delta - valor do delta
     * @param a - coeficiente a;
     * @param b - coeficiente b;
     * @param c - coeficiente c;
     * @return - retorna um vetor de valores , no caso, as duas raízes, x1 e x2
     * @throws Exception 
     */
    public double[] raizesX(double delta, double a, double b, double c) throws Exception{
        if (delta < 0) throw new Exception("Não possui raízes reais");
        double x1 = (-(b) + Math.sqrt(delta))/(2 * a); // x linha
        double x2 = (-(b) - Math.sqrt(delta))/(2 * a); // x duas linhas
        double[] x = {x1, x2};
        return x;
    }
    
    /**
     * 
     * @param x1 - Raiz x1
     * @param x2 - Raiz x2
     * @return - retorna de acordo com a condição:
     * Se a equação ter como resultado o valor zero, retornará a raiz cuja
     * substituição chegou a tal resultado
     */
    public double[] equacao(double x1, double x2){
        double eq1 = a * Math.pow(x1, 2) + b * x1 + c; // Equação ax1^2 + bx1 + c ; Usado x linha
        double eq2 = a * Math.pow(x2, 2) + b * x2 + c; // Equação ax2^2 + bx2 + c ; Usado x duas linhas
        double[] xlinha = {x1};
        double[] x2linha = {x2};
        double[] x = {x1, x2};
        if (eq1 == 0 && eq2 != 0)
            return xlinha;
        else if (eq2 == 0 && eq1 != 0)
            return x2linha;
        else
            return x;
    }
    
    public double getA() {
        return a;
    }
    
    public void setA(double a) throws Exception{
        if (a == 0) throw new Exception("O coeficiente a não pode ser igual a 0");
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
}
