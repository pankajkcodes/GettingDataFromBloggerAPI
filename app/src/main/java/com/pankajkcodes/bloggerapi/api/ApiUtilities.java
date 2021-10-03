package com.pankajkcodes.bloggerapi.api;

import com.pankajkcodes.bloggerapi.model.BlogDataModel;
import com.pankajkcodes.bloggerapi.model.ItemModel;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class ApiUtilities {
    public static final String BASE_URL = "";
    public static final String API_KEY = "";
    public static String BLOG_ID = "169329505997636763";



    public static ApiService apiService = null;

    public static ApiService getService() {
        if (apiService == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            apiService = retrofit.create(ApiService.class);
        }
        return apiService;


    }


    public interface ApiService {
        @GET("posts?key=" + API_KEY)
        Call<BlogDataModel> getPostList();


        @GET("pages?key=" + API_KEY)
        Call<BlogDataModel> getPagesList();


    }


}
