package com.example.dell.retrofit_implementation_v1;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance
{

        private static Retrofit retrofit;
        private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

        public static Retrofit getRetrofitInstance()
        {
                retrofit = new retrofit2.Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

            return retrofit;
        }
}
