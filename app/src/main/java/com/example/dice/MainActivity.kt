package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var diceOneImage : ImageView
    lateinit var diceTwoImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.btn_roll_dice)

        diceOneImage = findViewById(R.id.dice_one)
        diceTwoImage = findViewById(R.id.dice_two)

        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {

        val randomNumber = (1..6).random()
        val randomNumber2 = (1..6).random()

        val image = when(randomNumber) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice_empty
        }
        val image2 = when(randomNumber2) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice_empty
        }
        diceOneImage.setImageResource(image)
        diceTwoImage.setImageResource(image2)


    }

}