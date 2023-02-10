package net.belen.javadoc.estadistica;

import net.belen.javadoc.avanzada.CalculadoraAvanzada;

public class CalculadoraEstadisticaImpl extends CalculadoraAvanzada implements CalculadoraEstadistica {

    @Override
    public double media(double... argumentos) {
        double resultado = 0;

        for(int i = 0; i < argumentos.length; i++) {
            resultado += argumentos[i];
        }

        resultado = resultado / argumentos.length;

        return resultado;
    }

    @Override
    public double max(double... argumentos) {
        double result = Double.MIN_VALUE;

        for(double arg : argumentos) {
            result = (arg > result) ? arg : result;
        }

        return result;
    }


    @Override
    public double min(double... argumentos) {
        double result = Double.MAX_VALUE;

        for (double arg : argumentos) {
            result = (arg < result) ? arg : result;
        }

        return result;

    }

    /**
     * 
     */
    public double minValue(double a, double ...argumentos) {
        double result = a;

        for (double arg : argumentos) {
            result = (arg < result) ? arg : result;
        }

        return result;

    }
}
