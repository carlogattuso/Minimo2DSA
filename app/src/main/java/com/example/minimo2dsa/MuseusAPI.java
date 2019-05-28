package com.example.minimo2dsa;

import com.example.minimo2dsa.models.Museums;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MuseusAPI {
    @GET("pag-ini/{pag-ini}/pag-fi/{pag-fi}")
    Call<Museums> getMuseums(@Path("pag-ini") int pagIni, @Path("pag-fi") int pagFi);
}
