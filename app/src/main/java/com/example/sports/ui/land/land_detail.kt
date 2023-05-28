package com.example.sports.ui.land

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sports.databinding.DetailLandBinding

class land_detail : AppCompatActivity() {
    private var _binding: DetailLandBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_IMAGE = "image"
        const val EXTRA_NAME = "name"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = DetailLandBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.itemImagedetail2
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        val name = binding.itemTitledetail2
        name.text = intent.getStringExtra(EXTRA_NAME)


    }
}