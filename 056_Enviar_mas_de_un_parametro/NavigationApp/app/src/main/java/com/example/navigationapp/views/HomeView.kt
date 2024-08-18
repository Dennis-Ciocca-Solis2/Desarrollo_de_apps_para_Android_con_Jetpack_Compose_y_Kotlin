package com.example.navigationapp.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.navigationapp.components.ActionButton
import com.example.navigationapp.components.MainButton
import com.example.navigationapp.components.Space
import com.example.navigationapp.components.TitleBar
import com.example.navigationapp.components.TitleView

//==========ENVIAR MÁS DE UN PARÁMETRO==========

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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContentHomeView(navController: NavController) {//14. pasando el parámetro para poder realizar la navegación
    //-------------------------------------------
    //41. Pasando el parámetro para poder realizar la navegación
    val id = 123

    //42. Agregarlo en la ruta de HomeView (línea 91)
    //------------------------------------------------------------------

    //57. Creando nuestra variable que recibirá nuestro dato a ingresar
    var opcional by remember{ mutableStateOf("") }

    //58. Ir a abajo (línea 94)
    //------------------------------------------------------------------

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

        //-------------------------------------------------------------------
        //59. Creando nuestro TextField donde ingresaremos el dato "opcional"
        TextField(
            value = opcional,
            onValueChange = { opcional = it},
            label={ Text(text = "Opcional")} //60. Agregando otro valor-parámetro al TextField (label)
        )

        //probando en tiempo real lo que escribimos en el TextField and run
        //Text(text = opcional)

        //61. Continúa línea 116

        //--------------------------------------------------------------------
        //Ir a BodyComponents.kt a crear otro componente

        //Implementando nuestro botón genérico & run
        MainButton(name = "Detail view", backColor = Color.Red, color = Color.White) {
            //16. llamando al método navigate del navController y envíandole el nombre de la ruta
            navController.navigate("Detail/${id}/?${opcional}") //43. Agregando el parámetro & run
            //62. Enviando el segundo parámetro ? opcional
            //probando que nos permita navegar de HomeView a DetailView sin requerir el parámetro

            //63. Ir a DetailView.kt para configurar para poder ver el segundo parámetro enviado
        }

        //44. Para enviar más de un parametro ir a NavManager.kt

        //18. Hacer lo mismo de ponerle los parámetros al DetailView y seguir los pasos
        //ir a DetailView.kt
    }
}