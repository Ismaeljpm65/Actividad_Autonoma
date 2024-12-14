package com.mycompany.parqueadero;

import java.util.Date;


public class Vehiculo {
    
private String matricula;

    private String tipo;

    private Date horaEntrada;


    public Vehiculo(String matricula, String tipo) {

        this.matricula = matricula;

        this.tipo = tipo;

        this.horaEntrada = new Date();

    }


    public String getMatricula() {

        return matricula;

    }


    public String getTipo() {

        return tipo;

    }


    public Date getHoraEntrada() {

        return horaEntrada;

    }


    public void registrarEntrada() {

        this.horaEntrada = new Date();

    }

}
