package com.daffa.weatherapp.data.network
import com.daffa.weatherapp.BuildConfig
import com.daffa.weatherapp.data.ForcaseResponse
import com.daffa.weatherapp.data.response.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("weather")
    fun weatherByCity(
        @Query("q") city: String,
        @Query("appid") apiKey: String? = BuildConfig.API_KEY
    ): Call<WeatherResponse>

    @GET("forecast")
    fun forecastByCity(
        @Query("q") city: String,
        @Query("appid") apiKey: String? = BuildConfig.API_KEY
    ): Call<ForcaseResponse>

    @GET("weather")
    fun weatherByLocation(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") apiKey: String? = BuildConfig.API_KEY,
    ): Call<WeatherResponse>

    @GET("forecast")
    fun forecastByLocation(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") apiKey: String? = BuildConfig.API_KEY,
    ): Call<ForcaseResponse>
}





