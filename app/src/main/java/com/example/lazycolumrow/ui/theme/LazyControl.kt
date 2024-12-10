package com.example.lazycolumrow.ui.theme

import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun miLazyControl(modifier: Modifier){

    val rvState= rememberLazyListState()
    val coroutineScope= rememberCoroutineScope()

    Column(modifier = modifier.fillMaxSize())  {
        LazyColumn(state = rvState,
            verticalArrangement = spacedBy(16.dp),
            modifier=Modifier.weight(1f))
         {
            items(getAlbumes()){
                ItemAlbum(albumes=it){}
            }
         }
        val showButton by remember{
            derivedStateOf {  (rvState.firstVisibleItemIndex>0)}
        }
        if (showButton) {
            Button(
                onClick = { coroutineScope.launch { rvState.animateScrollToItem(0) } },
                modifier = Modifier.weight(0.05f)
                    .align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Scroll Up")

            }
        }
    }
}



