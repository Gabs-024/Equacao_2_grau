package Exercicio_Equacao;

public class Delta extends Equacao {
    private double delta;

    // #region Encapsulamento
    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    //#endregion
    
    public void calculaDelta() {
        delta = (super.getB()*super.getB())-(4*super.getA()*getC());
    }
}
