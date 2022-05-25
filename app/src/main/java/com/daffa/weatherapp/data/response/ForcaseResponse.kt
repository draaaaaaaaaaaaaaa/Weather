package com.daffa.weatherapp.data

import com.daffa.weatherapp.data.response.WeatherItem
import com.google.gson.annotations.SerializedName

data class ForcaseResponse(

	@field:SerializedName("list")
	val list: List<ListItem>? = null
)


data class Main(

	@field:SerializedName("temp")
	val temp :Double? = null,

	@field:SerializedName("temp_min")
	val tempMin: Double? = null,

	@field:SerializedName("temp_max")
	val tempMax: Double? = null
)

data class ListItem(

	@field:SerializedName("dt_txt")
	val dtTxt: String? = null,

	@field:SerializedName("weather")
	val weather: List<WeatherItem?>? = null,

	@field:SerializedName("main")
	val main: Main? = null,
)
