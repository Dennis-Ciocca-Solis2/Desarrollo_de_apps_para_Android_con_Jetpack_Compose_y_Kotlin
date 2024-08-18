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
import androidx.navigation.NavController
import com.example.navigationapp.components.ActionButton
import com.example.navigationapp.components.MainButton
import com.example.navigationapp.components.Space
import com.example.navigationapp.components.TitleBar
import com.example.navigationapp.components.TitleView

//==========BOTÓN PARA REGRESAR EN TOPBAR==========

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController) {//9. Pasándole el parámetro navController
                                            //luego vamos al DetailView a hacer lo mismo
    Scaffold(
        //Creando nuestro topBar
        topBar = {

            //Alineando el título de nuestro topBar al centro
            CenterAlignedTopAppBar(
                //Llamando a los atributos de TitleBar y asignándoselos a title
                title = { TitleBar(name = "Home View") }, //le pasamos el texto que aparecerá en pantalla

                //Añadiendo Color al fondo
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(

                    //Elegiendo el color de fondo
                    containerColor = Color.Red

                    //Ir a BarComponents.kt para crear nuestros componentes
                )
            )
        },

        //aquí continúa para poder implementar el Floating topBar
        floatingActionButton = {
            //Ir a BarComponents.kt a crear nuestro componente

            //Llamando a los atributos de ActionButton
            ActionButton()

        }//fin floatingActionButton

    ) {
        ContentHomeView(navController) //15. Aquí tambien pasamos el parámetro
    }//Fin Scaffold
}

@Composable
fun ContentHomeView(navController: NavController) {//14. pasando el parámetro para poder realizar la navegación
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        //Ir a BodyComponents.kt a crear nuestro componente

        //Aquí reemplazamos o escribimos nuestro TitleView & run
        TitleView(name = "Home View")
        Space()

        //Ir a BodyComponents.kt a crear otro componente

        //Implementando nuestro botón genérico & run
        MainButton(name = "Detail view", backColor = Color.Red, color = Color.White) {
            //16. llamando al método navigate del navController y envíandole el nombre de la ruta
            navController.navigate("Detail")
        }

        //18. Hacer lo mismo de ponerle los parámetros al DetailView y seguir los pasos
        //ir a DetailView.kt
    }
}