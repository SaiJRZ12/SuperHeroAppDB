package com.simon.superheroappdb

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface ApiService {
    @GET("/api/7279384178752151/search/sp")
    suspend fun getSuperheroes(): Response<SuperHeroDataResponse>

    @GET("/api/7279384178752151/search/sp")
    suspend fun getSuperheroDetail(): Response<SuperHeroDetailResponse>
}