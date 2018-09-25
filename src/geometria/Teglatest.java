/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author t1
 */
public class Teglatest extends Hasab {
    private double a;
    private double b;

    public Teglatest(double magassag, double a, double b) {
        super(magassag);
        this.a = a;
        this.b = b;
    }

    @Override
    public double alapterulet() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Teglatest: m=" + getMagassag() + ", a=" + a + ", b=" + b;
    }
    
    
    
    
    
}
