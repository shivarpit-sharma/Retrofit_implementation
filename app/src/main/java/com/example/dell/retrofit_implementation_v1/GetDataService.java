package com.example.dell.retrofit_implementation_v1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
        @GET("/photos")
        Call<List<Retro>> getAllPhotos();
    }
