package com.example.sports.ui.water

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.extremesports.model.sports
import com.example.sports.R

class water_viewmodel : AppCompatActivity() {
    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name


    fun loadData(): List<sports>{
        return listOf(
            sports(R.string.water_sports1, R.drawable.surfing,R.string.water_sports_info1),
            sports(R.string.water_sports2, R.drawable.scubadiving,R.string.water_sports_info1),
            sports(R.string.water_sports3, R.drawable.kayaking,R.string.water_sports_info1),
            sports(R.string.water_sports4, R.drawable.snorkelling,R.string.water_sports_info1),
            sports(R.string.water_sports5, R.drawable.parasailing,R.string.water_sports_info1),
        )
    }

    fun setData(data: sports, context: Context) {
        _name.value = context.getString(data.nameResourceId)
        _image.value = data.imageResourceId

    }
}