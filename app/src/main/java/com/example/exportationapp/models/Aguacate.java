package com.example.exportationapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Aguacate {

    @SerializedName("anio")
    @Expose
    private String anio;
    @SerializedName("mes")
    @Expose
    private String mes;
    @SerializedName("c_digopa_s")
    @Expose
    private String cDigopaS;
    @SerializedName("pa_sdestino")
    @Expose
    private String paSdestino;
    @SerializedName("c_digodepto")
    @Expose
    private String cDigodepto;
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
    @SerializedName("c_digounidad")
    @Expose
    private String cDigounidad;
    @SerializedName("cantidadunidades")
    @Expose
    private String cantidadunidades;
    @SerializedName("valormilesfobdol")
    @Expose
    private String valormilesfobdol;
    @SerializedName("valormilespesos")
    @Expose
    private String valormilespesos;
    @SerializedName("vol_mentoneladas")
    @Expose
    private String volMentoneladas;

    /**
     * No args constructor for use in serialization
     *
     */
    public Aguacate() {
    }

    /**
     *
     * @param paSdestino
     * @param cadena
     * @param departamentoorigen
     * @param producto
     * @param cantidadunidades
     * @param partida
     * @param cDigounidad
     * @param valormilesfobdol
     * @param cDigodepto
     * @param mes
     * @param cDigopaS
     * @param valormilespesos
     * @param volMentoneladas
     * @param anio
     */
    public Aguacate(String anio, String mes, String cDigopaS, String paSdestino, String cDigodepto, String departamentoorigen, String partida, String cadena, String producto, String cDigounidad, String cantidadunidades, String valormilesfobdol, String valormilespesos, String volMentoneladas) {
        super();
        this.anio = anio;
        this.mes = mes;
        this.cDigopaS = cDigopaS;
        this.paSdestino = paSdestino;
        this.cDigodepto = cDigodepto;
        this.departamentoorigen = departamentoorigen;
        this.partida = partida;
        this.cadena = cadena;
        this.producto = producto;
        this.cDigounidad = cDigounidad;
        this.cantidadunidades = cantidadunidades;
        this.valormilesfobdol = valormilesfobdol;
        this.valormilespesos = valormilespesos;
        this.volMentoneladas = volMentoneladas;
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

    public Integer getCDigopaS() {
        return Integer.parseInt(cDigopaS);
    }

    public void setCDigopaS(Integer cDigopaS) {
        this.cDigopaS = cDigopaS.toString();
    }

    public String getPaSdestino() {
        return paSdestino;
    }

    public void setPaSdestino(String paSdestino) {
        this.paSdestino = paSdestino;
    }

    public Integer getCDigodepto() {
        return Integer.parseInt(cDigodepto);
    }

    public void setCDigodepto(Integer cDigodepto) {
        this.cDigodepto = cDigodepto.toString();
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

    public String getCDigounidad() {
        return cDigounidad;
    }

    public void setCDigounidad(String cDigounidad) {
        this.cDigounidad = cDigounidad;
    }

    public Double getCantidadunidades() {
        return Double.parseDouble(cantidadunidades);
    }

    public void setCantidadunidades(Double cantidadunidades) {
        this.cantidadunidades = cantidadunidades.toString();
    }

    public Double getValormilesfobdol() {
        return Double.parseDouble(valormilesfobdol);
    }

    public void setValormilesfobdol(Double valormilesfobdol) {
        this.valormilesfobdol = valormilesfobdol.toString();
    }

    public Double getValormilespesos() {
        return Double.parseDouble(valormilespesos);
    }

    public void setValormilespesos(Double valormilespesos) {
        this.valormilespesos = valormilespesos.toString();
    }

    public Double getVolMentoneladas() {
        return Double.parseDouble(volMentoneladas);
    }

    public void setVolMentoneladas(Double volMentoneladas) {
        this.volMentoneladas = volMentoneladas.toString();
    }

}
