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
        enableEdgeToEdge()
        setContent {
            Application1Theme {

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

const val TAG = "Aplikacja"

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Log.v(TAG, "Application info")
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    Log.i(TAG, "numbers: $numbers")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Application1Theme {
        Greeting("Android")
    }
}