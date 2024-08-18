package com.example.navigationapp.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

//6. Creando nuestros componentes
@Composable
fun TitleBar(name: String) {//le pasamos una variable

    //7. Añadiendo atributos al TitleBar
    Text(text = name, fontSize = 25.sp, color = Color.White)

    //8. Ir a HomeView a implementarlo (línea 27)
}