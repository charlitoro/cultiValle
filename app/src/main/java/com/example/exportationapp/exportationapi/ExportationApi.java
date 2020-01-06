package com.example.exportationapp.exportationapi;

import com.example.exportationapp.models.Frutal;
import com.example.exportationapp.models.Permanente;
import com.example.exportationapp.models.Transitorio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ExportationApi {
    @GET
    Call<List<Frutal>> getReportFrutales(@Url String year);

    @GET
    Call<List<Transitorio>> getReporTransitorios(@Url String year);

    @GET
    Call<List<Permanente>> getReportPermanentes(@Url String year);
}
