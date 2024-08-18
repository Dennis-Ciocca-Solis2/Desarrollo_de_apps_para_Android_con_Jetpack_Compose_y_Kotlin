package com.example.holamundo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }
}

//==========USO DEL ESTADO DE LAS VARIABLES==========//

//Creando una lista de colores
val Colores = listOf(
    Color.Red,
    Color.Yellow,
    Color.Black,
    Color.Cyan,
    Color.DarkGray,
    Color.Magenta,
    Color.Green
)

//2. Creando una constante
val nombre = "Me Gusta"
//var likes = 0

@Preview(showBackground = true)
@Composable
fun Content() {

    //9. Creando una variable mutable con remember
    var likes by remember { mutableStateOf(0) }

    //Modificando la columna
    Column(
        modifier = Modifier
            .fillMaxSize() //hace a la columna utilizar thodo el espacio disponible de la pantalla
            .wrapContentSize(Alignment.Center) //centrar el contenido de la columna
            .padding(horizontal = 5.dp) //le da padding a la columna completa

    ) {//1. Creando una columna con 3 elementos
        Texto(texto = "Bienvenido")
        //Añadiendo un espacio entre elementos directamente
        //Spacer(modifier = Modifier.height(5.dp))

        //Otra forma
        //Añadiendo un espacio entre elementos a través de una función
        Space()

        Texto(texto = "Jetpack")
        Space()
        Texto(texto = "Compose")

        Space()
        //Llamando a la función Circulo y asignándole un color

        //Escribir LazyRow
        LazyRow(
            modifier = Modifier //agregando un modificador a la fila
                .fillMaxWidth(), //hace que utilice thodo el ancho disponible de la fila
            horizontalArrangement = Arrangement.SpaceEvenly //separa los elementos de la fila de forma pareja
        ) {
            /*Circulo(color = Color.Red) //enviándole el color a la función
            Circulo(color = Color.Blue) //enviándole el color a la función
            Circulo(color = Color.Yellow) //enviándole el color a la función
            Circulo(color = Color.Green) //enviándole el color a la función*/

            //El LazyRow solo acepta items
            items(Colores) { it ->
                Circulo(color = it)
                Spacer(modifier = Modifier.width(10.dp))
            }
        }

        //3. Agregando otra fila
        Space()        
        Row(//7. Agregando un modifier al Row para que los elementos estén alineados al centro
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            //4. Creando un botón
            Button(onClick = {//8. Programando el botón para que cuenta los 'likes'
                likes++ //para ver el aumento crear una variable con remember dentro de un composable
            }) {
                //5. agregando un texto al botón
                Text(text = nombre)
            }

            //6. Llamando a nuesta función Resultado
            Spacer(modifier = Modifier.width(10.dp))
            Resultado(likes = likes) //crearle una variable arriba llamada 'likes'

        }

    }

}

//1. Creando el texto de nuestro contador de likes; nombrando a la función Resultado()
@Composable
fun Resultado(likes: Int) {
    Text(text = likes.toString(), fontWeight = FontWeight.Bold, fontSize = 50.sp)
}

@Composable
fun Texto(texto: String) {
    Text(
        text = texto, //este es el parámetro
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(Color.Black)
            //.padding(30.dp)
            //.padding(vertical = 30.dp)
            .padding(horizontal = 30.dp)
            .fillMaxWidth() //hace que utilice thodo el ancho disponible del componente
            .clickable {
                println("Hola Jetpack")
            }
    )
}

//Creando un contenedor en forma de círculo con un parámetro de color
@Composable
fun Circulo(color: Color) {
    Box(
        modifier = Modifier
            .size(70.dp)
            .background(color, CircleShape)
    )
}

@Composable
fun Space() {
    Spacer(modifier = Modifier.height(5.dp))
}