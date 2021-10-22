package com.example.demo;

import java.util.Objects;

public class NumComplejo {
    private int _parteReal;
    private int _parteImaginaria;

    public NumComplejo(int _parteReal, int _parteImaginaria) {
        this._parteReal = _parteReal;
        this._parteImaginaria = _parteImaginaria;
    }

    public int getParteReal() {
        return _parteReal;
    }

    public int getParteImaginaria() {
        return _parteImaginaria;
    }
    public NumComplejo sumar(NumComplejo c){
        return new NumComplejo(this.getParteReal()+c.getParteReal(),this.getParteImaginaria()+c.getParteImaginaria());

    }
    public NumComplejo restar(NumComplejo c){
        return new NumComplejo(this.getParteReal()-c.getParteReal(),this.getParteImaginaria()-c.getParteImaginaria());
    }

    @Override
    public String toString() {
        return "NumComplejo{" +
                "_parteReal=" + _parteReal +
                ", _parteImaginaria=" + _parteImaginaria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumComplejo that = (NumComplejo) o;
        return _parteReal == that._parteReal && _parteImaginaria == that._parteImaginaria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(_parteReal, _parteImaginaria);
    }
}
