package com.example.navigationapp.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.navigationapp.components.MainButton
import com.example.navigationapp.components.MainIconButton
import com.example.navigationapp.components.Space
import com.example.navigationapp.components.TitleBar
import com.example.navigationapp.components.TitleView

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
//35. Agregando otro parámetro al DetailView
fun DetailView(navController: NavController, id: Int, opcional: String?) {//10. Agregando el parámetro
    //49. Agregando el parámetro opcional
    //50. Agregar el parámetro opcional en el ContentoDetailView (línea 65)
    //-------------------------------------------------
    //36. Hacer lo mismo en la función ContentDetailView y en ContentDetailView del Scaffold
    //luego agregar otro TitleView
    //-------------------------------------------------

    //luego regresamos al NavManager
    //Diseñando nuestro DetailView TopBar
    Scaffold(
        topBar = {
            //
            TopAppBar(
                title = { TitleBar(name = "Detail View") }, //le pasamos el texto que aparecerá en pantalla
                colors = TopAppBarDefaults.mediumTopAppBarColors( //Elegiendo el color de fondo
                    containerColor = Color.Blue //
                ), //fin title

                //28. Agregando el botón para regresar en el TopBar de la vista & run
                navigationIcon = {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                    //29. Enviando parámetros
                    //ir al NavManager.kt

                }//fin navigationIcon
            )//fin de TopAppBar
        }//fin topBar
    ) {
        ContentDetailView(navController, id, opcional)//20. Aquí tambien pasamos el parámetro
        //53. Añadiendo el parámetro opcional
        //54. Regresar al NavManager a agregar el parámetro (línea 68)
    }
}

//Disñando el contenido de nuestro DetailView
@Composable
fun ContentDetailView(navController: NavController, id: Int, opcional: String?) {//19. Añadiendo el parámetro
    //51. Añadiendo el parámetro opcional
    //52. Añadirlo también en ContentDetailView del Scaffold

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

        //--------------------------------------------------
        //37. Agregando otro TitleView
        TitleView(name = id.toString())
        Space()

        //38. Ir a navManager.kt a agregar ese paramétro al DetailView del 'composable'
        //---------------------------------------------------

        //---------------------------------------------------
        //64. Creando la vista del parámetro opcional enviado & run
        //opcional?.let {TitleView(name = it)}

        //Nota: si no enviamos un paramétro opcional, igual aparecerá un feo espacio vacío
        //para solucionar eso debemos ir al NavManager.kt (línea 56) y ponerle esto ?:""
        //y luego volver

        //65. Creamos un 'if' a la vista
        //reemplazamos el paso 64 por el 65 & run
        if (opcional == "")
        {
            Spacer(modifier = Modifier.height(0.dp))
        }else{
            TitleView(name = opcional.orEmpty())
        }
        //FINISH***

        //---------------------------------------------------
        //Ir a BodyComponents.kt a crear otro componente
        //Implementando nuestro botón genérico & run
        MainButton(name = "Return home", backColor = Color.Blue, color = Color.White) {
            //println("Soy botón generico")

            //21. para regresar solo ponemos navController.popBackStack()
            navController.popBackStack()

            //22. Finalmente ir a MainActivity.kt y hacer correr el NavManager

        }
        //*Nota: Ir al MainActivity.kt y cambiarle de HomeView a DetailView para probar
    }
}