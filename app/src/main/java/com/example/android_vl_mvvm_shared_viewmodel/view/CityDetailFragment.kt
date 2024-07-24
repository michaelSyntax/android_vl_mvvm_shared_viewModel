package com.example.android_vl_mvvm_shared_viewmodel.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_vl_mvvm_shared_viewmodel.R
import com.example.android_vl_mvvm_shared_viewmodel.databinding.FragmentCityDetailBinding

class CityDetailFragment : Fragment() {

    private lateinit var binding: FragmentCityDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCityDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}