package net.belen.javadoc.estadistica;

import net.belen.javadoc.avanzada.CalculadoraExtendida;

public interface CalculadoraEstadistica extends CalculadoraExtendida {

    double media(double ...argumentos);

    double max(double ...argumentos);

    /**
     * 
     */
    double min(double ...argumentos);



}
