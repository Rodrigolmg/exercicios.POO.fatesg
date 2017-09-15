package classededados;


public class NComplexo {
    //Atributos
    private int parteReal = 0;
    private int parteImaginaria = 0;
    
    //Construtores
    public NComplexo() {}
    
    public NComplexo(int pr, int pi){
        this.parteReal = pr;
        this.parteImaginaria = pi;
    }
    
    public NComplexo(NComplexo obj){
        this.parteReal = obj.parteReal;
        this.parteImaginaria = obj.parteImaginaria;
    }
    
    //Método Acessor
    public String get(){
        return parteReal + " + " + parteImaginaria + "i";
    }
    
    //Método Modificador
    public void set(int pr, int pi){
        this.parteReal = pr;
        this.parteImaginaria = pi;
    }
    
    //Métodos de cálculos
    /**
     * (a+c)+(b+d)i
     * @param obj
     * @return 
     */
    public NComplexo adicionar (NComplexo obj){
        int real = this.parteReal + obj.parteReal;
        int imaginario = this.parteImaginaria + obj.parteImaginaria;
        NComplexo aux = new NComplexo(real, imaginario);
        return aux;
    }
    
    /**
     * (a−c)+(b−d)i
     * @param obj
     * @return 
     */
    public NComplexo subtrair (NComplexo obj){
        int real = this.parteReal - obj.parteReal;
        int imaginario = this.parteImaginaria - obj.parteImaginaria;
        NComplexo aux = new NComplexo(real, imaginario);
        return aux;
    }
    
    /**
     * a = this.parteReal
     * b = this.parteImaginaria
     * 
     * c = obj.parteReal
     * d = obj.parteImaginaria
     * (ac−bd)+(ad+bc)i
     * @param obj
     * @return 
     */
    public NComplexo multiplicar (NComplexo obj){
        int real = (this.parteReal * obj.parteReal) - (this.parteImaginaria * obj.parteImaginaria);
        int imaginario = (this.parteReal * obj.parteImaginaria) + (this.parteImaginaria * obj.parteReal);
        NComplexo aux = new NComplexo(real, imaginario);
        return aux;
    }
    
    /**
     * a = this.parteReal
     * b = this.parteImaginaria
     * 
     * c = obj.parteReal
     * d = obj.parteImaginaria
     * (ac+bd)/(c2+d2) + ((bc-ad)/(c2+d2))i
     * @param obj
     * @return 
     */
    public NComplexo dividir (NComplexo obj){
        int real = (int)(((this.parteReal * obj.parteReal) + (this.parteImaginaria * obj.parteImaginaria))/(Math.pow(obj.parteReal, 2) + Math.pow(obj.parteImaginaria, 2)));
        int imaginario = (int)(((this.parteImaginaria * obj.parteReal) - (this.parteReal * obj.parteImaginaria))/(Math.pow(obj.parteReal, 2) + Math.pow(obj.parteImaginaria, 2)));
        NComplexo aux = new NComplexo(real, imaginario);
        return aux;
    }
    
    public boolean eIgual(NComplexo obj){
        return this.parteReal == obj.parteReal && this.parteImaginaria == obj.parteImaginaria;
    }
}
