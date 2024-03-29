package com.androiddevs.mvvmnewsapp.model.remote

import com.androiddevs.mvvmnewsapp.model.dataClass.NewsResponse
import com.androiddevs.mvvmnewsapp.model.dataClass.source.SourceResponce
import com.androiddevs.mvvmnewsapp.util.Constant.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode:String?,
       @Query("pageSize")
       pageSize:Int,
        @Query("page")
        pageNumber:Int=1,
        @Query("apiKey")
        apiKey:String=API_KEY
    ):Response<NewsResponse>

    @GET("v2/top-headlines")
    suspend fun getNews(
        @Query("country")
        countryCode:String?,
        @Query("category")
        category:String?,
        @Query("page")
        pageNumber:Int=1,
      /*  @Query("pageSize")
        pageSize:Int,*/
        @Query("apiKey")
        apiKey:String=API_KEY
    ):Response<NewsResponse>


    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery:String,
        /*@Query("page")
        pageNumber:Int=1,*/
        @Query("apiKey")
        apiKey:String=API_KEY
    ):Response<NewsResponse>

//TOdo pagination fix
}