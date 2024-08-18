package com.example.navigationapp.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.sp

//Creando nuestros componente TitleBar
@Composable
fun TitleBar(name: String) {//le pasamos una variable

    //Añadiendo atributos al TitleBar
    Text(text = name, fontSize = 25.sp, color = Color.White)

    //Ir a HomeView a implementarlo (línea 27)
}

//Creando componente FloatingActionButton
@Composable
fun ActionButton() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        containerColor = Color.Red, //añadiendo color al botón
        contentColor = Color.White //añadiendo color al texto
    ) {
        //Añadiendo un ícono al botón
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = "Agregar"
        )
        //Regresar a HomeView a implementarlo
    }
}

//25. Creando nuestro botón para regresar en el TopBar
@Composable
fun MainIconButton(icon: ImageVector, onClick: () -> Unit) {//argumentos
    //26. Programanado nues IconButton
    IconButton(onClick = onClick) {
        Icon(
            imageVector = icon, //Icono
            contentDescription = null, //Contenido
            tint = Color.White //Color
        )

        //27. Luego ir a DetailView
    }
}