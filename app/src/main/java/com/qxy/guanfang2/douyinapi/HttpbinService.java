package com.qxy.guanfang2.douyinapi;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HttpbinService {
    @GET("oauth/access_token")
    Call<ResponseBody> get( @Query("client_secret")String client_secret, @Query("code")String code,@Query("grant_type")String grant_type,@Query("client_key") String client_key );

}

