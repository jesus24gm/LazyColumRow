package com.example.lazycolumrow

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SimpleLazyColumn(modifier: Modifier){
    LazyColumn (modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
      item{ Text("Puñeta") }
        items(100){index ->
            Text(text="Puñeta $index")
        }
        item{ Text("Puñeta final") }
    }
}
@Composable
fun SimpleLazyRow(modifier: Modifier){
    LazyRow  (modifier = modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically){
        item{ Text("Puñeta") }
        items(100){index ->
            Text(text="Puñeta $index")
        }
        item{ Text("Puñeta final") }
    }
}