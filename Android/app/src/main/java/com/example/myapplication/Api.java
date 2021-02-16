package com.example.myapplication;

import com.example.myapplication.LoginResponse.Example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface Api {

    @POST("users/save")
    Call<Register> userregister(@Body Register register);

    @POST("accounts/save")
    Call<AccountRegister> accountregister(@Header("Authorization") String authorization, @Body CreateAccount acc);

    @POST("auth/login")
    Call<Example> createPost(@Body UsernamePassReq user);

    @GET("users/all")
    Call<List<Register>> getUsers(@Header("Authorization") String authorization);

    @GET("accounts/all")
    Call<List<AccountRegister>> getAccountById(@Header("Authorization") String authorization);
}

