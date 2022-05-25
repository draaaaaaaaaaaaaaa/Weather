package com.daffa.weatherapp.Ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.daffa.weatherapp.data.ForcaseResponse
import com.daffa.weatherapp.data.response.WeatherResponse
import com.daffa.weatherapp.data.network.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainViewModel : ViewModel() {
    // keseluruhan data kita masukan ke weatherByCity
    private val weatherByCity = MutableLiveData<WeatherResponse>()
    private val forecastByCity = MutableLiveData<ForcaseResponse>()

    private val weatherByCurrentLocation = MutableLiveData<WeatherResponse>()
    private val forecastByCurrentLocation = MutableLiveData<ForcaseResponse>()

    // fungsi ini utk nge get data dari internet
    fun weatherByCity(city: String) {
        // di enqueue proses async berjalan
        ApiConfig().getApiService().weatherByCity(city).enqueue(object : Callback<WeatherResponse> {
            override fun onResponse(
                call: Call<WeatherResponse>,
                response: Response<WeatherResponse>
            ) {
                if (response.isSuccessful) weatherByCity.postValue(response.body())
            }

            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                Log.e("FailureCallApi", t.message.toString())
            }
        })
    }

    fun getWeatherByCity(): LiveData<WeatherResponse> = weatherByCity

    fun getForecastByCity(city: String) {
        ApiConfig().getApiService().forecastByCity(city)
            .enqueue(object : Callback<ForcaseResponse> {
                override fun onResponse(
                    call: Call<ForcaseResponse>,
                    response: Response<ForcaseResponse>
                ) {
                    if (response.isSuccessful) forecastByCity.postValue(response.body())
                }

                override fun onFailure(call: Call<ForcaseResponse>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })
    }

    fun getForecastByCity(): LiveData<ForcaseResponse> = forecastByCity

    fun weatherCurrentLocation(lat: Double, lon: Double){
        ApiConfig().getApiService().weatherByLocation(lat,lon).enqueue(object : Callback<WeatherResponse> {
            override fun onResponse(
                call: Call<WeatherResponse>,
                response: Response<WeatherResponse>
            ) {
                weatherByCurrentLocation.postValue(response.body())
            }

            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }

    fun getWeatherByCurrentLocation() : LiveData<WeatherResponse> = weatherByCurrentLocation


    fun forecastByCurrentLocation(lat: Double, lon: Double){
        ApiConfig().getApiService().forecastByLocation(lat, lon).enqueue(object : Callback<ForcaseResponse> {
            override fun onResponse(
                call: Call<ForcaseResponse>,
                response: Response<ForcaseResponse>
            ) {
                forecastByCurrentLocation.postValue(response.body())
            }

            override fun onFailure(call: Call<ForcaseResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
    fun getForecastByCurrentLocation() : LiveData<ForcaseResponse> = forecastByCurrentLocation
}

