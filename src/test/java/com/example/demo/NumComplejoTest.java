package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class NumComplejoTest {
    NumComplejo numero01;
    NumComplejo numero02;
    NumComplejo resultado;

    @ParameterizedTest
    @CsvSource({
            "10, 10, 3, 4, 7, 6",
            "10, 10, 7, 3, 3, 7",
            "10, 10, 1, 2, 9, 8",
            "10, 10, 6, 8, 4, 2",
            "10, 10, 3, 6, 7, 4",

            "20, 20, 12, 10, 8, 10",
            "20, 20, 18, 15, 2, 5",
            "20, 20, 17, 14, 3, 6",
            "20, 20, 1, 20, 19, 0",
            "20, 20, 11, 16, 9, 4",
    })
    public void sumar(int resNum1, int resNum2, int real01, int imaginario01, int real02, int imaginario02) {
        resultado = new NumComplejo(resNum1, resNum2);
        numero01 = new NumComplejo(real01, imaginario01);
        numero02 = new NumComplejo(real02, imaginario02);

        assertEquals(resultado, numero01.sumar(numero02));
    }

    @ParameterizedTest
    @CsvSource({
            "10, 10, 10, 60, 0, 50",
            "10, 10, 20, 15, 10, 5",
            "10, 10, 30, 18, 20, 8",
            "10, 10, 12, 50, 2, 40",
            "10, 10, 30, 100, 20, 90",

            "20, 20, 30, 50, 10, 30",
            "20, 20, 70, 20, 50, 0",
            "20, 20, 80, 120, 60, 100",
            "20, 20, 40, 80, 20, 60",
            "20, 20, 60, 70, 40, 50",
    })
    void restar(int resNum1, int resNum2, int real01, int imaginario01, int real02, int imaginario02) {
        resultado = new NumComplejo(resNum1, resNum2);
        numero01 = new NumComplejo(real01, imaginario01);
        numero02 = new NumComplejo(real02, imaginario02);

        assertEquals(resultado, numero01.restar(numero02));
    }
}