 package com.zeus.mvvm.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.zeus.mvvm.ui.viewmodel.QuoteViewModel
import com.zeus.mvvmabeluc.databinding.ActivityMainBinding


 class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel:QuoteViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        quoteViewModel.onCreate()
        quoteViewModel.onCreate()

        quoteViewModel.quoteModel.observe(this, Observer {currentQuote->
            binding.tvQuote.text='"' + currentQuote.quote + '"'
            binding.tvAuthor.text=currentQuote.author
        })
        quoteViewModel.isLoading.observe(this, Observer{
            binding.progress.isVisible=it
        })
        binding.viewContainer.setOnClickListener{quoteViewModel.randomQuote()}
    }
}