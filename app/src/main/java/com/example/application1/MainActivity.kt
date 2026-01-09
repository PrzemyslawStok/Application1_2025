package com.example.application1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.application1.ui.theme.Application1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            PersonInfo(
//                name = "Przemysław", surname = "Stokłosa"
//            )
            MyView()

        }
    }
}

const val TAG = "Aplikacja"

@Composable
fun PersonInfo(name: String, surname: String) {
    Log.v(TAG, "Application info")

    Column {
        Row {
            Text(
                text = name, Modifier.padding(5.dp)
            )
            Text(
                text = surname, Modifier.padding(5.dp)
            )
        }

        Text(text = "Bielsko-Biała", Modifier.padding(5.dp))
    }
}

@Composable
fun Matrix(rows: Int = 5, cols: Int = 5) {
    var no = 1
    Column {
        for (j in 1..rows) {
            Row {
                for (i in 1..cols)
                    Text(
                        text = "${no++}", Modifier
                            .padding(2.dp)
                            .width(20.dp)
                    )
            }
        }
    }
}

@Composable
fun Progress(maxNo: Int = 10) {

}

@Composable
fun MyView(rows: Int = 5, cols: Int = 5) {
    //var number = 0
    var number by remember { mutableIntStateOf(0) }
    var noImages by remember { mutableIntStateOf(1) }

    Column {
        Text(text = "Macierz: ${rows}x${cols}:")
        Spacer(Modifier.height(5.dp))
        Row {
            Matrix(rows, cols)
            Spacer(Modifier.width(5.dp))
            Column {
                for (i in 1..noImages) {
                    Image(
                        painter = painterResource(R.drawable.outline_battery_6_bar_24),
                        contentDescription = null
                    )
                    Spacer(Modifier.width(5.dp))
                }
            }
        }
        Row {
            Button(onClick = {
                number = number + 1
            }) {
                Text("Dodaj")
            }
            Spacer(Modifier.width(5.dp))
            Text("Aktualna liczba: $number")
        }
        Button(onClick = {
            noImages = noImages + 1
        }) {
            Text("Dodaj obrazek")

        }
        Progress(maxNo = 7)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyView()
}