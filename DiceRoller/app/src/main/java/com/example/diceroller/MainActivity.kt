package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImageAno : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        diceImageAno = findViewById(R.id.dice_image_another)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }
    }

    private fun rollDice() {
        /*
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
         */
        val randomInt = Random.nextInt(6) + 1
        val randoIntAno = Random.nextInt(6) + 1

        fun getDrawableResource(index: Int): Int {
            val drawableResource = when (index) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            return drawableResource
        }

        diceImage.setImageResource(getDrawableResource(randomInt))
        diceImageAno.setImageResource(getDrawableResource(randoIntAno))
    }
}
