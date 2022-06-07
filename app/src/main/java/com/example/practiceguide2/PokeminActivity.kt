package com.example.practiceguide2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class PokeminActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)
    }
    fun clickPokemon(view: View){

        var imageButton = findViewById<ImageButton>(view.id)
        var picName = imageButton.tag.toString()

        var intent = Intent(this, PokemonDetails::class.java).apply {
            putExtra("picName", picName)
        }
        startActivity(intent)

    }
}