package com.sigarda.crudmhspostgre;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BaseApiService {

    @FormUrlEncoded
    @POST("/transaction")
    Call<ResponseBody> transaction(@Field("money") int money,
                                   @Field("product_id") int product_id
    );
    @GET("/api/students")
    Call<ResponseBody> getStudents();
}
