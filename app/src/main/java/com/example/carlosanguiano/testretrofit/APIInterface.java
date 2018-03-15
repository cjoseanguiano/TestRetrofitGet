package com.example.carlosanguiano.testretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Carlos Anguiano on 14/03/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public interface APIInterface {
    @GET("/api/users?")
    Call<UserList> doGetUserList(@Query("page") String page);

}
