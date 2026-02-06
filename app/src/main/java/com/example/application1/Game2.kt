package com.example.application1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.sp
import kotlin.random.Random

class Game2 : ComponentActivity() {

    var min : Int
    var max : Int
    var randomNumber : Int

    init{
        min = 0
        max = 100
        randomNumber = Random.nextInt(min, max)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StartGame()

        }

    }

    @Composable
    fun StartGame() {
        val activity = this
        var number_of_trials by remember {mutableIntStateOf(0)}

        Column {
            Text("Zgadnij liczbę z przedziału 0-100 ($randomNumber)", fontSize = 25.sp)
            Text("Liczba prób: $number_of_trials", fontSize = 20.sp)
            Text("Moja liczba: ${estimateNumber()}", fontSize = 30.sp)
            Row {
                Button(onClick = {
                    Toast.makeText(activity,"Coś jest nie tak...", Toast.LENGTH_LONG).show()
                    number_of_trials++
                }) {
                    Text("Za mała")
                }
                Button(onClick = {
                    Toast.makeText(activity,"Coś jest nie tak...", Toast.LENGTH_LONG).show()
                    number_of_trials++
                }) {
                    Text("Za duża")
                }
            }
        }

    }

    fun estimateNumber(): Int {

        return 5
    }
}