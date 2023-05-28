package com.example.sports.ui.air

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.extremesports.model.sports
import com.example.sports.R

class air_viewmodel : AppCompatActivity() {
    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name


    fun loadData(): List<sports>{
        return listOf(
            sports(R.string.air_sports1, R.drawable.paragliding,R.string.air_sports_info1),
            sports(R.string.air_sports2, R.drawable.skydiving,R.string.air_sports_info1),
            sports(R.string.air_sports3, R.drawable.bungee_jumping,R.string.air_sports_info1),
            sports(R.string.air_sports4, R.drawable.slacklining,R.string.air_sports_info1),
            sports(R.string.air_sports5, R.drawable.wingsuit_flying,R.string.air_sports_info1),
        )
    }

    fun setData(data: sports, context: Context) {
        _name.value = context.getString(data.nameResourceId)
        _image.value = data.imageResourceId

    }
}