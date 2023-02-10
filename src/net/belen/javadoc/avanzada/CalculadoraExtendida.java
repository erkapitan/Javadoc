package net.belen.javadoc.avanzada;

import net.belen.javadoc.basica.Calculadora;

/**
 * Extensión de la calculadora básica con otras operaciones
 * 
 */
public interface CalculadoraExtendida extends Calculadora {

    /**
     * División entera de dos números enteros
     * 
     */
    int divisionEntera(int dividendo, int divisor);

    /**
     * Resto de la división entera de dos números
     *
     */
    int resto(int dividendo, int divisor);

    /**
     * Resultado de realizar la operación base^exponente
     * 
     */
    double potencia(double base, double exponente);



}
