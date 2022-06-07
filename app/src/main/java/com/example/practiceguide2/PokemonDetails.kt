package com.example.practiceguide2

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class PokemonDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)

        if(intent != null){
            var pokemonName = intent.getStringExtra("picName")

            var image: Int = resources.getIdentifier(pokemonName, "drawable", packageName)
            var textID: Int = resources.getIdentifier(pokemonName, "raw", packageName)
            var pokemonDetails: String = Scanner(resources.openRawResource(textID)).nextLine()

            var name = findViewById<TextView>(R.id.pokemon_name)
            var details = findViewById<TextView>(R.id.pokemon_details)
            var imageView = findViewById<ImageView>(R.id.pokemon_img)

            name.text = pokemonName
            details.text = pokemonDetails
            imageView.setImageResource(image)

        }

    }

}