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
import androidx.compose.ui.unit.sp
import kotlin.random.Random

class Game2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StartGame()

        }

    }

    @Composable
    fun StartGame() {
        var min = 0
        var max = 100
        val randomNumber = Random.nextInt(min, max)
        val activity = this
        Column {
            Text("Zgadnij liczbę z przedziału 0-100 ($randomNumber)", fontSize = 25.sp)
            Text("Moja liczba: ${estimateNumber(min, max)}", fontSize = 30.sp)
            Row {
                Button(onClick = {
                    Toast.makeText(activity,"Coś jest nie tak...", Toast.LENGTH_LONG).show()
                }) {
                    Text("Za mała")
                }
                Button(onClick = {
                    Toast.makeText(activity,"Coś jest nie tak...", Toast.LENGTH_LONG).show()
                }) {
                    Text("Za duża")
                }
            }
        }

    }

    fun estimateNumber(min: Int, max: Int): Int {
        return 5
    }
}