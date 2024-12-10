package com.example.lazycolumrow

import android.os.Bundle
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
import com.example.lazycolumrow.ui.theme.LazyColumRowTheme
import com.example.lazycolumrow.ui.theme.LazyColumnAlbumes
import com.example.lazycolumrow.ui.theme.miLazyControl
import com.example.lazycolumrow.ui.theme.LazyGrid
import com.example.lazycolumrow.ui.theme.miHeaderLazy
import com.example.lazycolumrow.ui.theme.miLazyControl

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LazyColumRowTheme {
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

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

  LazyGrid(modifier=modifier)

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LazyColumRowTheme {
        Greeting("Android")
    }
}