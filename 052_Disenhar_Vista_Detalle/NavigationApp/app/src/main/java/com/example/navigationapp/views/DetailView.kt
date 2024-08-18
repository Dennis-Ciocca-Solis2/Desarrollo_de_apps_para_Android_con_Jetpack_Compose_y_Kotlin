package com.example.navigationapp.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.navigationapp.components.MainButton
import com.example.navigationapp.components.Space
import com.example.navigationapp.components.TitleBar
import com.example.navigationapp.components.TitleView

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailView() {
    //1. Diseñando nuestro DetailView TopBar
    Scaffold(
        topBar = {
            //
            TopAppBar(
                title = { TitleBar(name = "Detail View") }, //le pasamos el texto que aparecerá en pantalla
                colors = TopAppBarDefaults.mediumTopAppBarColors( //Elegiendo el color de fondo
                    containerColor = Color.Blue //
                )
            )
        }
    ) {
        ContentDetailView()
    }
}

//2. Disñando el contenido de nuestro DetailView
@Composable
fun ContentDetailView() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        //Ir a BodyComponents.kt a crear nuestro componente

        //Aquí reemplazamos o escribimos nuestro TitleView & run
        TitleView(name = "Detail View")
        Space()

        //Ir a BodyComponents.kt a crear otro componente

        //Implementando nuestro botón genérico & run
        MainButton(name = "Return home", backColor = Color.Blue, color = Color.White) {
            println("Soy botón generico")
        }
        //*Nota: Ir al MainActivity.kt y cambiarle de HomeView a DetailView para probar
    }
}