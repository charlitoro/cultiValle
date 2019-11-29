package com.example.exportationapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Banano {

    @SerializedName("anio")
    @Expose
    private String anio;
    @SerializedName("mes")
    @Expose
    private String mes;
    @SerializedName("codigopais")
    @Expose
    private String codigopais;
    @SerializedName("paisdestino")
    @Expose
    private String paisdestino;
    @SerializedName("codigodepto")
    @Expose
    private String codigodepto;
    @SerializedName("departamentoorigen")
    @Expose
    private String departamentoorigen;
    @SerializedName("partida")
    @Expose
    private String partida;
    @SerializedName("cadena")
    @Expose
    private String cadena;
    @SerializedName("producto")
    @Expose
    private String producto;
    @SerializedName("codigounidad")
    @Expose
    private String codigounidad;
    @SerializedName("cantidadunidades")
    @Expose
    private String cantidadunidades;
    @SerializedName("valormilesfobdol")
    @Expose
    private String valormilesfobdol;
    @SerializedName("valormilespesos")
    @Expose
    private String valormilespesos;
    @SerializedName("volumentoneladas")
    @Expose
    private String volumentoneladas;

    /**
     * No args constructor for use in serialization
     *
     */
    public Banano() {
    }

    /**
     *
     * @param codigounidad
     * @param paisdestino
     * @param cadena
     * @param departamentoorigen
     * @param producto
     * @param cantidadunidades
     * @param codigodepto
     * @param partida
     * @param volumentoneladas
     * @param valormilesfobdol
     * @param mes
     * @param valormilespesos
     * @param anio
     * @param codigopais
     */
    public Banano(String anio, String mes, String codigopais, String paisdestino, String codigodepto, String departamentoorigen, String partida, String cadena, String producto, String codigounidad, String cantidadunidades, String valormilesfobdol, String valormilespesos, String volumentoneladas) {
        super();
        this.anio = anio;
        this.mes = mes;
        this.codigopais = codigopais;
        this.paisdestino = paisdestino;
        this.codigodepto = codigodepto;
        this.departamentoorigen = departamentoorigen;
        this.partida = partida;
        this.cadena = cadena;
        this.producto = producto;
        this.codigounidad = codigounidad;
        this.cantidadunidades = cantidadunidades;
        this.valormilesfobdol = valormilesfobdol;
        this.valormilespesos = valormilespesos;
        this.volumentoneladas = volumentoneladas;
    }

    public Integer getAnio() {
        return Integer.parseInt(anio);
    }

    public void setAnio(Integer anio) {
        this.anio = anio.toString();
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getCodigopais() {
        return codigopais;
    }

    public void setCodigopais(String codigopais) {
        this.codigopais = codigopais;
    }

    public String getPaisdestino() {
        return paisdestino;
    }

    public void setPaisdestino(String paisdestino) {
        this.paisdestino = paisdestino;
    }

    public String getCodigodepto() {
        return codigodepto;
    }

    public void setCodigodepto(String codigodepto) {
        this.codigodepto = codigodepto;
    }

    public String getDepartamentoorigen() {
        return departamentoorigen;
    }

    public void setDepartamentoorigen(String departamentoorigen) {
        this.departamentoorigen = departamentoorigen;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCodigounidad() {
        return codigounidad;
    }

    public void setCodigounidad(String codigounidad) {
        this.codigounidad = codigounidad;
    }

    public String getCantidadunidades() {
        return cantidadunidades;
    }

    public void setCantidadunidades(String cantidadunidades) {
        this.cantidadunidades = cantidadunidades;
    }

    public String getValormilesfobdol() {
        return valormilesfobdol;
    }

    public void setValormilesfobdol(String valormilesfobdol) {
        this.valormilesfobdol = valormilesfobdol;
    }

    public String getValormilespesos() {
        return valormilespesos;
    }

    public void setValormilespesos(String valormilespesos) {
        this.valormilespesos = valormilespesos;
    }

    public Double getVolumentoneladas() {
        return Double.parseDouble(volumentoneladas);
    }

    public void setVolumentoneladas(Double volumentoneladas) {
        this.volumentoneladas = volumentoneladas.toString();
    }

}
