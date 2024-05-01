package com.example.kmmfirstapp.android

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import com.example.kmmfirstapp.Greeting
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                    border = BorderStroke(1.dp, MaterialTheme.colors.primary)
                ) {
                    Toast
                        .makeText(this@MainActivity, "Hello", Toast.LENGTH_SHORT).show()

//                    call greet() in a couroutine scope
                    val scope = rememberCoroutineScope()
                    var text by remember { mutableStateOf("Loading") }
                    LaunchedEffect(true) {
                        scope.launch {
                            text = try {
                                Greeting().greet()
                            } catch (e: Exception) {
                                e.localizedMessage ?: "Error something went wrong"
                            }
                        }
                    }
                    GreetingView(text)
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
    Text("Hello, Android!")
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }


}
