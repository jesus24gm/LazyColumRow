package com.example.lazycolumrow.ui.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun miHeaderLazy(modifier:Modifier){

    val albs: Map<String,List<Albumes>> = getAlbumes().groupBy { it.artista }
    LazyColumn(modifier = modifier.fillMaxSize()){
        albs.forEach{(artista,albs)->
            stickyHeader {
                Text(artista, modifier = Modifier.fillMaxWidth().background(Color.Gray), fontSize = 30.sp)
            }
            items(albs){album ->
                ItemAlbum(albumes=album){}
    }
}
    }
}