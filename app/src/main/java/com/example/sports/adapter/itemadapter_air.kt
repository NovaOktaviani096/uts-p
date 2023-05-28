package com.example.sports.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sports.R
import com.example.extremesports.model.sports
import com.example.sports.ui.air.air_detail
import com.example.sports.ui.air.air_viewmodel

class itemadapter_air (
    private val context: Context,
    private val dataset: List<sports>
): RecyclerView.Adapter<itemadapter_air.HomeViewHolder>() {
    private val viewModel = air_viewmodel()

    class HomeViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.item_image1)
        val nameText: TextView = view.findViewById(R.id.item_title1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_item_air, parent,false)
        return HomeViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = dataset[position]
        holder.nameText.text = context.resources.getString(item.nameResourceId)
        holder.imageView.setImageResource(item.imageResourceId)

        holder.view.setOnClickListener{
            viewModel.setData(item, context)
            val intent = Intent(context, air_detail::class.java).apply {
                putExtra("image", viewModel.image.value)
                putExtra("name", viewModel.name.value)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size

}
