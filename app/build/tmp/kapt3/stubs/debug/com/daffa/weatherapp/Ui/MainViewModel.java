package com.daffa.weatherapp.Ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000fJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000fJ\u000e\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/daffa/weatherapp/Ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "forecastByCity", "Landroidx/lifecycle/MutableLiveData;", "Lcom/daffa/weatherapp/data/ForcaseResponse;", "forecastByCurrentLocation", "weatherByCity", "Lcom/daffa/weatherapp/data/response/WeatherResponse;", "weatherByCurrentLocation", "", "lat", "", "lon", "getForecastByCity", "Landroidx/lifecycle/LiveData;", "city", "", "getForecastByCurrentLocation", "getWeatherByCity", "getWeatherByCurrentLocation", "weatherCurrentLocation", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.daffa.weatherapp.data.response.WeatherResponse> weatherByCity = null;
    private final androidx.lifecycle.MutableLiveData<com.daffa.weatherapp.data.ForcaseResponse> forecastByCity = null;
    private final androidx.lifecycle.MutableLiveData<com.daffa.weatherapp.data.response.WeatherResponse> weatherByCurrentLocation = null;
    private final androidx.lifecycle.MutableLiveData<com.daffa.weatherapp.data.ForcaseResponse> forecastByCurrentLocation = null;
    
    public MainViewModel() {
        super();
    }
    
    public final void weatherByCity(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.daffa.weatherapp.data.response.WeatherResponse> getWeatherByCity() {
        return null;
    }
    
    public final void getForecastByCity(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.daffa.weatherapp.data.ForcaseResponse> getForecastByCity() {
        return null;
    }
    
    public final void weatherCurrentLocation(double lat, double lon) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.daffa.weatherapp.data.response.WeatherResponse> getWeatherByCurrentLocation() {
        return null;
    }
    
    public final void forecastByCurrentLocation(double lat, double lon) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.daffa.weatherapp.data.ForcaseResponse> getForecastByCurrentLocation() {
        return null;
    }
}