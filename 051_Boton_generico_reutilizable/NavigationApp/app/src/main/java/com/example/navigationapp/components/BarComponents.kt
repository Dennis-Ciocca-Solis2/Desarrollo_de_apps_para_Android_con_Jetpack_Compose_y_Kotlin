package com.example.navigationapp.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

//6. Creando nuestros componente TitleBar
@Composable
fun TitleBar(name: String) {//le pasamos una variable

    //7. Añadiendo atributos al TitleBar
    Text(text = name, fontSize = 25.sp, color = Color.White)

    //8. Ir a HomeView a implementarlo (línea 27)
}

//12. Creando componente FloatingActionButton
@Composable
fun ActionButton() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        containerColor = Color.Red, //añadiendo color al botón
        contentColor = Color.White //añadiendo color al texto
    ) {
        //13. Añadiendo un ícono al botón
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = "Agregar"
        )
        //14. Regresar a HomeView a implementarlo
    }
}