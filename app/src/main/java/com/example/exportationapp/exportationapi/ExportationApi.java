package com.example.exportationapp.exportationapi;

import com.example.exportationapp.models.Aguacate;
import com.example.exportationapp.models.Banano;
import com.example.exportationapp.models.Cafe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Url;

public interface ExportationApi {
    @GET
    Call<List<Aguacate>> getReportAguacate(@Url String year);

    @GET
    Call<List<Cafe>> getReportCafe(@Url String year);

    @GET
    Call<List<Banano>> getReportBanano(@Url String year);
}
