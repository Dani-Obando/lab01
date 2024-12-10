package com.example.lab01

import android.content.res.Configuration
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Detecta la orientación del dispositivo
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.layout_land) // Diseño para horizontal
        } else {
            setContentView(R.layout.activity_main) // Diseño para vertical
        }

        // Referencia a la imagen principal
        val mainImage = findViewById<ImageView>(R.id.mainImage)

        // Referencia a las imágenes secundarias
        val img1 = findViewById<ImageView>(R.id.img1)
        val img2 = findViewById<ImageView>(R.id.img2)
        val img3 = findViewById<ImageView>(R.id.img3)
        val img4 = findViewById<ImageView>(R.id.img4)
        val img5 = findViewById<ImageView>(R.id.img5)
        val img6 = findViewById<ImageView>(R.id.img6)

        // Lista de imágenes secundarias
        val secondaryImages = listOf(img1, img2, img3, img4, img5, img6)

        // Configurar clic en cada imagen secundaria para intercambiarla con la principal
        for (image in secondaryImages) {
            image.setOnClickListener {
                val tempDrawable = mainImage.drawable
                mainImage.setImageDrawable(image.drawable)
                image.setImageDrawable(tempDrawable)
            }
        }
    }
}
