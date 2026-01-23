package com.example.application1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StartActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val game1Activity = Intent(this, Game1::class.java)
        val game2Activity = Intent(this, MainActivity::class.java)
        val game3Activity = Intent(this, Game2::class.java)

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
            }

        }
    }
}