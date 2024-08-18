package com.example.navigationapp.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.navigationapp.components.TitleBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView() {
    Scaffold(
        //1. Creando nuestro topBar
        topBar = {

            //2. Alineando el título de nuestro topBar al centro
            CenterAlignedTopAppBar(
                //9. Llamando a los atributos de TitleBar y asignándoselos a title
                title = { TitleBar(name = "Home View") }, //le pasamos el texto que aparecerá en pantalla

                //3. Añadiendo Color al fondo
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(

                    //4. Elegiendo el color de fondo
                    containerColor = Color.Red

                    //5. Ir a BarComponents.kt para crear nuestros componentes
                )
            )
        }

    ) {
        ContentHomeView()
    }
}

@Composable
fun ContentHomeView() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(text = "Home View")
    }
}