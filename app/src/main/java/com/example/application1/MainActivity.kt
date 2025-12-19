package com.example.application1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.application1.ui.theme.Application1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonInfo(
                name = "Przemysław", surname = "Stokłosa"
            )

        }
    }
}

const val TAG = "Aplikacja"

@Composable
fun PersonInfo(name: String, surname: String) {
    Log.v(TAG, "Application info")

    Text(
        text = "$name $surname"
    )
    Text(text="Bielsko-Biała")

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        PersonInfo("Przemysław", "Stokłosa")
}