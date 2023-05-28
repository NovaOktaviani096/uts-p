package com.example.sports.ui.water

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sports.databinding.DetailWaterBinding

class water_detail : AppCompatActivity() {
    private var _binding: DetailWaterBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_IMAGE = "image"
        const val EXTRA_NAME = "name"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = DetailWaterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.itemImagedetail3
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        val name = binding.itemTitledetail3
        name.text = intent.getStringExtra(EXTRA_NAME)


    }
}