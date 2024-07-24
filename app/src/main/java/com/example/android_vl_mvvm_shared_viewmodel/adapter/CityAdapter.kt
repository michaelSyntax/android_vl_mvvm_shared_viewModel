package com.example.android_vl_mvvm_shared_viewmodel.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_vl_mvvm_shared_viewmodel.databinding.ListItemBinding
import com.example.android_vl_mvvm_shared_viewmodel.model.City

class CityAdapter(
    private val cityList: List<City>,
): RecyclerView.Adapter<CityAdapter.CityItemViewHolder>() {

    inner class CityItemViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityItemViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CityItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return cityList.size
    }

    override fun onBindViewHolder(holder: CityItemViewHolder, position: Int) {
        val city = cityList[position]
        holder.binding.tvCity.text = city.name
        holder.binding.ivCitiy.setImageResource(city.imageRes)

    }
}