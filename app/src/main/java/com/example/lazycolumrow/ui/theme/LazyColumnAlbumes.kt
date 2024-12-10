package com.example.lazycolumrow.ui.theme

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.lazycolumrow.R


@Composable
fun LazyColumnAlbumes(modifier: Modifier) {
    val context= LocalContext.current

    LazyColumn(modifier = modifier.fillMaxSize(), verticalArrangement = spacedBy(16.dp))  {
        items(getAlbumes()) {
            ItemAlbum(albumes=it){
                Toast.makeText(context, it.titulo, Toast.LENGTH_SHORT).show()
            }

        }
}
}
@Composable
fun ItemAlbum(albumes: Albumes, onItemSelected: (Albumes) -> Unit) {
    Card(border = BorderStroke(2.dp, Color.Black), modifier = Modifier.width(200.dp).clickable { onItemSelected(albumes) }) {
        Column {
            Image(
                painter = painterResource(id = albumes.portada),
                contentDescription = albumes.titulo,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
Text(text = albumes.titulo)
            Text(text = albumes.artista)
        }
    }
}

fun getAlbumes(): List<Albumes> {
    return listOf(
        Albumes("La Leyenda del tiempo", "Camaron", R.drawable.camaron),
        Albumes("Master of puppets", "Metallica", R.drawable.metalicared),
        Albumes("Sin Remedio", "Damas Gratis", R.drawable.damasgratis),
        Albumes("2001 odisea en el lodo", "SFDK", R.drawable.sfdk),
        Albumes("Mi libertad", "Frankie Ruiz", R.drawable.frankie),
        Albumes("Potro de rabia y miel", "Camaron", R.drawable.camaron2),
        Albumes("Droptopwop", "Guccimane", R.drawable.droptopwop),
        Albumes("ADROMICFMS", "Yung Beef", R.drawable.yungbeef),
        Albumes("EL PLUG 2", "Yung Beef", R.drawable.elpluggdos),
        Albumes("Black album", "Metallica", R.drawable.metallica2),
        Albumes("LEGEND", "Bob Marley", R.drawable.marley)

    )
}