package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


//This activity allows the user to roll a dice and view the result on the screen.
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }


    //Roll the dice and update the screen with the result.
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll1 = dice.roll1()
        val diceRoll2 = dice.roll2()

        // Update the screen with the dice roll
        val resultTextView1: TextView = findViewById(R.id.textView1)
        resultTextView1.text = diceRoll1.toString()

        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView2.text = diceRoll2.toString()
    }
}

class Dice(val numSides: Int) {

    fun roll1(): Int {
        return (1..numSides).random()
    }

    fun roll2(): Int {
        return (1..numSides).random()
    }
}

