package com.example.postapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    @GET("posts")
    fun getPosts():Call<List<Post>>

    @GET("posts/{Id")
    fun getPostById(@Path("id")postId:Int):Call<Post>
}