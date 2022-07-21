package Exercicio_Equacao;

import java.lang.Math;

public class EqXn extends Equacao{
    private double xn;
    private double xp;

    // #region Encapsulamento
    public double getXn() {
        return xn;
    }

    public void setXn(double xn) {
        this.xn = xn;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    //#endregion

    public double calculaXn(Delta q){
        xn = (-q.getB() + Math.sqrt(q.getDelta())) / (2 * q.getA());
        return xn;
    }

    public double calculaXp(Delta q){
        xp = (-q.getB() - Math.sqrt(q.getDelta())) / (2 * q.getA());
        return xp;
    }
}
