package com.example.navigationapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationapp.views.DetailView
import com.example.navigationapp.views.HomeView

//1. Programando el NavManager
@Composable
fun NavManager() {
    //2. Creando nuestra variable 'navController'
    val navController = rememberNavController()

    //3. Propiedad NavHost
    //asignamos nuestra variable navController como parámetro a navController
    NavHost(navController = navController, startDestination = "Home") {
                                         //startDestination es la ruta con la que inicia nuestra aplicación
        //4. Definir el nombre de una ruta con una vista
        composable("Home") {
            //5. Le decimos que la vista Home le pertenece a HomeView
            HomeView(navController) //11. Inyectando el parámetro navController

        }//fin composable1

        //6. Creamos otro composable para Detail
        composable("Detail") {
            //7. Le decimos que la vista Detail le pertenece a DetailView
            DetailView(navController) //12. También aquí el parámetro navController

            //13. Programar los botones
            //ir a HomeView.kt y pasarle el parámetro navController al ContentHomeView y
            //también en el HomeView del Scaffold

            //

        }//fin composable2

        //8. Ir a HomeView.kt y pasarle el parámetro navController a la funciónHomeView

    }//Fin NavHost

}

