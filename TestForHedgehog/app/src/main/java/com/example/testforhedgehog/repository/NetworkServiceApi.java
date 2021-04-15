package com.example.testforhedgehog.repository;

import com.example.testforhedgehog.model.JokesNetworkModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NetworkServiceApi {
    @GET("random/{count}")
    Call<JokesNetworkModel> getJokes(@Path("count") int count);
}
