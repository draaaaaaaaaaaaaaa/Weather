package com.daffa.weatherapp.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/daffa/weatherapp/data/network/ApiService;", "", "forecastByCity", "Lretrofit2/Call;", "Lcom/daffa/weatherapp/data/ForcaseResponse;", "city", "", "apiKey", "forecastByLocation", "lat", "", "lon", "weatherByCity", "Lcom/daffa/weatherapp/data/response/WeatherResponse;", "weatherByLocation", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "weather")
    public abstract retrofit2.Call<com.daffa.weatherapp.data.response.WeatherResponse> weatherByCity(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "appid")
    java.lang.String apiKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "forecast")
    public abstract retrofit2.Call<com.daffa.weatherapp.data.ForcaseResponse> forecastByCity(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "appid")
    java.lang.String apiKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "weather")
    public abstract retrofit2.Call<com.daffa.weatherapp.data.response.WeatherResponse> weatherByLocation(@retrofit2.http.Query(value = "lat")
    double lat, @retrofit2.http.Query(value = "lon")
    double lon, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "appid")
    java.lang.String apiKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "forecast")
    public abstract retrofit2.Call<com.daffa.weatherapp.data.ForcaseResponse> forecastByLocation(@retrofit2.http.Query(value = "lat")
    double lat, @retrofit2.http.Query(value = "lon")
    double lon, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "appid")
    java.lang.String apiKey);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}