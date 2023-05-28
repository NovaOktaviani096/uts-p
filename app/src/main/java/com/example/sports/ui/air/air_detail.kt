package com.example.sports.ui.air

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sports.databinding.DetailAirBinding

class air_detail : AppCompatActivity() {
    private var _binding: DetailAirBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_IMAGE = "image"
        const val EXTRA_NAME = "name"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = DetailAirBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.itemImagedetail1
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        val name = binding.itemTitledetail1
        name.text = intent.getStringExtra(EXTRA_NAME)


    }
}