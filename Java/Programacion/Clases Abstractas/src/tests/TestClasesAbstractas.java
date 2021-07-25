package tests;

import domain.*;

public class TestClasesAbstractas {
    
    public static void main(String[] args) {
        //FiguraGeometrica f = new FiguraGeometrica("asdf");
        //No se puede hacer un objeto de una clase abstracta
        
        FiguraGeometrica figura = new Rectangulo("Rectángulo");
        figura.dibujar();
    }
}
