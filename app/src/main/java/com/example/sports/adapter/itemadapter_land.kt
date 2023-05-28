package com.example.sports.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.extremesports.model.sports
import com.example.sports.R
import com.example.sports.ui.land.land_viewmodel
import com.example.sports.ui.air.air_detail


class itemadapter_land (
    private val context: Context,
    private val dataset: List<sports>
): RecyclerView.Adapter<itemadapter_land.LandViewHolder>() {
    private val viewModel = land_viewmodel()

    class LandViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.item_image2)
        val nameText: TextView = view.findViewById(R.id.item_title2)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_item_land, parent,false)
        return LandViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: LandViewHolder, position: Int) {
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