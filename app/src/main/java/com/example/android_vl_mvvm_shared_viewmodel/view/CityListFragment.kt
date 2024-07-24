package com.example.android_vl_mvvm_shared_viewmodel.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.android_vl_mvvm_shared_viewmodel.R
import com.example.android_vl_mvvm_shared_viewmodel.adapter.CityAdapter
import com.example.android_vl_mvvm_shared_viewmodel.databinding.FragmentCityListBinding

class CityListFragment : Fragment() {

    private lateinit var binding: FragmentCityListBinding
    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCityListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        binding.rvCities.adapter = CityAdapter(viewModel.loadCities(), viewModel, navController)
    }
}