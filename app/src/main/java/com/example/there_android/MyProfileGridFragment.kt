package com.example.there_android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.there_android.databinding.FragmentMyprofilegridBinding


class MyProfileGridFragment : Fragment(){
    private lateinit var binding: FragmentMyprofilegridBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyprofilegridBinding.inflate(inflater, container, false)
        return binding.root
    }
}