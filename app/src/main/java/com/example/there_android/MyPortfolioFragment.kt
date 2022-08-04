package com.example.there_android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.there_android.databinding.FragmentMyportfolioBinding
import com.google.gson.Gson

class MyPortfolioFragment : Fragment() {
    private lateinit var binding: FragmentMyportfolioBinding
    val gson = Gson()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyportfolioBinding.inflate(inflater, container, false)
        val portfolioJson = arguments?.getString("portfolio")
        val portfolio = gson.fromJson(portfolioJson, MyPageData::class.java)
        setViews(portfolio)

        return binding.root
    }
    //뷰 바인딩
    private fun setViews(portfolio: MyPageData) {
        binding.myportfolioTitelTv.text = portfolio.portfolioTitle.toString()
    }
}