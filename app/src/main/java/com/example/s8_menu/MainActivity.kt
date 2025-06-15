package com.example.s8_menu

import android.os.Bundle
import android.view.MenuInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.Menu
import android.view.MenuItem
import com.example.s8_menu.databinding.ActivityMainBinding
import android.webkit.WebViewClient

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.topAppBar)
        binding.webview.settings.javaScriptEnabled = true
        binding.webview.webViewClient = WebViewClient()
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.mymenu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.op_deck -> {
                val urlPagina = "https://www.duellinksmeta.com/top-decks"
                binding.webview.loadUrl(urlPagina)
                true
            }
            R.id.op_tier -> {
                val urlPagina = "https://www.duellinksmeta.com/tier-list"
                binding.webview.loadUrl(urlPagina)
                true
            }
            R.id.op_leak -> {
                val urlPagina = "https://www.duellinksmeta.com/leaks-and-updates"
                binding.webview.loadUrl(urlPagina)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}