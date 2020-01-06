package com.example.exportationapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.concurrent.atomic.DoubleAccumulator;

import javax.xml.transform.Source;

public class Transitorio {

    @SerializedName("municipios")
    @Expose
    private String municipios;
    @SerializedName("a_o")
    @Expose
    private String aO;
    @SerializedName("algod_n_a")
    @Expose
    private String algodNA;
    @SerializedName("arroz_a")
    @Expose
    private String arrozA;
    @SerializedName("arroz")
    @Expose
    private String arroz;
    @SerializedName("frijol_a")
    @Expose
    private String frijolA;
    @SerializedName("frijol_b")
    @Expose
    private String frijolB;
    @SerializedName("ma_z_tecnificado_a")
    @Expose
    private String maZTecnificadoA;
    @SerializedName("ma_z_tecnificado_b")
    @Expose
    private String maZTecnificadoB;
    @SerializedName("ma_z_tradicional_a")
    @Expose
    private String maZTradicionalA;
    @SerializedName("ma_z_tradicional_b")
    @Expose
    private String maZTradicionalB;
    @SerializedName("sorgo_a")
    @Expose
    private String sorgoA;
    @SerializedName("sorgo_b")
    @Expose
    private String sorgoB;
    @SerializedName("soya_a")
    @Expose
    private String soyaA;
    @SerializedName("soya_b")
    @Expose
    private String soyaB;
    @SerializedName("tabaco_a")
    @Expose
    private String tabacoA;
    @SerializedName("tabaco_b")
    @Expose
    private String tabacoB;

    public String getMunicipios() {
        return municipios;
    }

    public void setMunicipios(String municipios) {
        this.municipios = municipios;
    }

    public Integer getAO() {
        return Integer.parseInt(aO);
    }

    public void setAO(Integer aO) {
        this.aO = aO.toString();
    }

    public Double getAlgodNA() {
        return Double.parseDouble(algodNA);
    }

    public void setAlgodNA(Double algodNA) {
        this.algodNA = algodNA.toString();
    }

    public Double getArrozA() {
        return Double.parseDouble(arrozA);
    }

    public void setArrozA(Double arrozA) {
        this.arrozA = arrozA.toString();
    }

    public Double getArroz() {
        return Double.parseDouble(arroz);
    }

    public void setArroz(Double arroz) {
        this.arroz = arroz.toString();
    }

    public Double getFrijolA() {
        return Double.parseDouble(frijolA);
    }

    public void setFrijolA(Double frijolA) {
        this.frijolA = frijolA.toString();
    }

    public Double getFrijolB() {
        return Double.parseDouble(frijolB);
    }

    public void setFrijolB(Double frijolB) {
        this.frijolB = frijolB.toString();
    }

    public Double getMaZTecnificadoA() {
        return Double.parseDouble(maZTecnificadoA);
    }

    public void setMaZTecnificadoA(Double maZTecnificadoA) {
        this.maZTecnificadoA = maZTecnificadoA.toString();
    }

    public Double getMaZTecnificadoB() {
        return Double.parseDouble(maZTecnificadoB);
    }

    public void setMaZTecnificadoB(Double maZTecnificadoB) {
        this.maZTecnificadoB = maZTecnificadoB.toString();
    }

    public Double getMaZTradicionalA() {
        return Double.parseDouble(maZTradicionalA);
    }

    public void setMaZTradicionalA(Double maZTradicionalA) {
        this.maZTradicionalA = maZTradicionalA.toString();
    }

    public Double getMaZTradicionalB() {
        return Double.parseDouble(maZTradicionalB);
    }

    public void setMaZTradicionalB(Double maZTradicionalB) {
        this.maZTradicionalB = maZTradicionalB.toString();
    }

    public Double getSorgoA() {
        return Double.parseDouble(sorgoA);
    }

    public void setSorgoA(Double sorgoA) {
        this.sorgoA = sorgoA.toString();
    }

    public Double getSorgoB() {
        return Double.parseDouble(sorgoB);
    }

    public void setSorgoB(Double sorgoB) {
        this.sorgoB = sorgoB.toString();
    }

    public Double getSoyaA() {
        return Double.parseDouble(soyaA);
    }

    public void setSoyaA(Double soyaA) {
        this.soyaA = soyaA.toString();
    }

    public Double getSoyaB() {
        return Double.parseDouble(soyaB);
    }

    public void setSoyaB(Double soyaB) {
        this.soyaB = soyaB.toString();
    }

    public Double getTabacoA() {
        return Double.parseDouble(tabacoA);
    }

    public void setTabacoA(Double tabacoA) {
        this.tabacoA = tabacoA.toString();
    }

    public Double getTabacoB() {
        return Double.parseDouble(tabacoB);
    }

    public void setTabacoB(Double tabacoB) {
        this.tabacoB = tabacoB.toString();
    }

}
