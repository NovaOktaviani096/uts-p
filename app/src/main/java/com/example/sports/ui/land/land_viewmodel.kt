package com.example.sports.ui.land

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.extremesports.model.sports
import com.example.sports.R

class land_viewmodel : AppCompatActivity() {
    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name


    fun loadData(): List<sports>{
        return listOf(
            sports(R.string.land_sports1, R.drawable.skateboarding,R.string.land_sports_info1),
            sports(R.string.land_sports2, R.drawable.bmx,R.string.land_sports_info1),
            sports(R.string.land_sports3, R.drawable.parkour,R.string.land_sports_info1),
            sports(R.string.land_sports4, R.drawable.soccer,R.string.land_sports_info1),
            sports(R.string.land_sports5, R.drawable.tennis,R.string.land_sports_info1),
        )
    }

    fun setData(data: sports, context: Context) {
        _name.value = context.getString(data.nameResourceId)
        _image.value = data.imageResourceId

    }
}