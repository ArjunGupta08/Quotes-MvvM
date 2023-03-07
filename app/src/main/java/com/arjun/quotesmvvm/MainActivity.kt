package com.arjun.quotesmvvm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.arjun.quotesmvvm.viewmodel.MainViewModel
import com.arjun.quotesmvvm.viewmodel.MainViewModelFactory
import com.arjun.quotesmvvm.viewmodel.QuoteDataItem

class MainActivity : AppCompatActivity() {

    private val text : TextView
    get() = findViewById(R.id.quoteText)

    private val countView : TextView
    get() = findViewById(R.id.countView)

    private val authorText : TextView
    get() = findViewById(R.id.quoteAuthor)

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize MainViewModel
        mainViewModel = ViewModelProvider(this,MainViewModelFactory(application)).get(MainViewModel::class.java)

        setQuotes(mainViewModel.getQuote())
    }

    private fun setQuotes(quote: QuoteDataItem) {
        text.text = quote.text
        authorText.text = quote.author
        countView.text = mainViewModel.index.toString()
    }

    fun onNext(view: View) {
        setQuotes(mainViewModel.nextQuote())
    }
    fun onPrevious(view: View) {
        setQuotes(mainViewModel.previousQuote())
    }
    fun onShare(view: View) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_TEXT,mainViewModel.getQuote().text)
        startActivity(intent)
    }


}