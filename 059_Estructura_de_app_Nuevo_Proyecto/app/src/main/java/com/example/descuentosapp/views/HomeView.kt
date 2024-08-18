package com.example.descuentosapp.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

//3. Creando nuestra función principal
//4. Ir a theme.Color
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView() {
    //10. Creando nuestro Scaffold
    Scaffold(topBar = { //16. Creando el topBar
        CenterAlignedTopAppBar(
            title = {
                Text(text = "App Descuentos", color = Color.White)
            },

            //17. Agregando nuestro color al topBar & run
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.primary
                //Fin 059
            )
        )
    }) {
        //11. Llamando al ContentHomeView
        ContentHomeView(it)
    }

}

//9. Creando nuestro composable de contenido
@Composable
fun ContentHomeView(paddingValues: PaddingValues) {//12. Agregando padding values
    //13. Creando una columna
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .padding(10.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //14. Agregando un Text
        Text(text = "Hola")

        //15. Ir a crear el topBar en el Scaffold
    }
}