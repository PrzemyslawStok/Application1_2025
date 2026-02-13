package com.example.application1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.unit.sp

class StartActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val game1Activity = Intent(this, Game1::class.java)
        val game2Activity = Intent(this, Game2::class.java)
        val game3Activity = Intent(this, Game3::class.java)
        val game4Activity = Intent(this, Game4::class.java)
        val game5Activity = Intent(this, Game5::class.java)


        setContent {
            Column {
                Text("Ekran startowy", fontSize = 35.sp)
                Button(onClick = {
                    startActivity(game1Activity)
                }) {
                    Text("Gra 1")
                }
                Button(onClick = {
                    startActivity(game2Activity)
                }) {
                    Text("Gra 2")
                }
                Button(onClick = {
                    startActivity(game3Activity)
                }) {
                    Text("Gra 3")
                }
                Button(onClick = {
                    startActivity(game4Activity)
                }) {
                    Text("Gra 4")
                }
                Button(onClick = {
                    startActivity(game5Activity)
                }) {
                    Text("Gra 5")
                }
            }

        }
    }
}