package com.daffa.weatherapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0012\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J!\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002\u00a2\u0006\u0002\u0010!J\u001c\u0010\"\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\'"}, d2 = {"Lcom/daffa/weatherapp/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_binding", "Lcom/daffa/weatherapp/databinding/ActivityMainBinding;", "_viewModel", "Lcom/daffa/weatherapp/Ui/MainViewModel;", "binding", "getBinding", "()Lcom/daffa/weatherapp/databinding/ActivityMainBinding;", "mAdapter", "Lcom/daffa/weatherapp/Ui/WeatherAdapter;", "getMAdapter", "()Lcom/daffa/weatherapp/Ui/WeatherAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "viewModel", "getViewModel", "()Lcom/daffa/weatherapp/Ui/MainViewModel;", "getWeatherByCity", "", "getWeatherCurrentLocation", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "searchCity", "setImageBackground", "image", "", "setUpBackgroundWeather", "idWeather", "icon", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "setupView", "weather", "Lcom/daffa/weatherapp/data/response/WeatherResponse;", "forecast", "Lcom/daffa/weatherapp/data/ForcaseResponse;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.daffa.weatherapp.databinding.ActivityMainBinding _binding;
    private com.daffa.weatherapp.Ui.MainViewModel _viewModel;
    private final kotlin.Lazy mAdapter$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final com.daffa.weatherapp.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    private final com.daffa.weatherapp.Ui.MainViewModel getViewModel() {
        return null;
    }
    
    private final com.daffa.weatherapp.Ui.WeatherAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getWeatherByCity() {
    }
    
    private final void getWeatherCurrentLocation() {
    }
    
    private final void setupView(com.daffa.weatherapp.data.response.WeatherResponse weather, com.daffa.weatherapp.data.ForcaseResponse forecast) {
    }
    
    private final void setUpBackgroundWeather(java.lang.Integer idWeather, java.lang.String icon) {
    }
    
    private final void setImageBackground(int image) {
    }
    
    private final void searchCity() {
    }
}