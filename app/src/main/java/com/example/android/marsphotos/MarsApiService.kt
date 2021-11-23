package com.example.android.marsphotos

import retrofit2.http.GET

interface MarsApiService {
    @GET("photos")
   suspend fun getPhoto(): List<MarsPhoto>
}

