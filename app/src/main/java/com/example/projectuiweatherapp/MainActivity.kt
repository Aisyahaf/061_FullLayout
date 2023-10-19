package com.example.projectuiweatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectuiweatherapp.ui.theme.ProjectUIWeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectUIWeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Homescreen()
                }
            }
        }
    }
}

@Composable
fun Homescreen( modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)

    ){
        Text(
            text = "Aisah A Fitriani",
            fontSize = 30.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 20.dp)
        )
        Text(
            text = "20210140061",
            fontSize = 30.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
        
        Spacer(modifier = Modifier.padding(13.dp))

        Kotak()

        Spacer(modifier = Modifier.padding(13.dp))

        Suhu()

        Spacer(modifier = Modifier.padding(13.dp))

        Kotak_1()

        Spacer(modifier = Modifier.padding(13.dp))
    }
}
@Composable
fun Kotak (modifier: Modifier = Modifier){
    Box (
        Modifier
            .clip(RoundedCornerShape(20.dp))
            .fillMaxWidth()
            .background(color = Color.LightGray)
    ){
        Column (
            horizontalAlignment =  Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            var img = painterResource(id = R.drawable.background)

            Image(
                painter = img,
                contentDescription ="wheater",
                modifier = Modifier,
            )
            Text(
                text = "Rain",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                )
        }
    }
}

@Composable
fun Suhu (modifier: Modifier = Modifier){
    Column (
        horizontalAlignment =  Alignment.CenterHorizontally,
        modifier = modifier
    ){
        Text(
            fontSize = 30.sp,
            text = " 21°C",
            textAlign = TextAlign.Center,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.padding(10.dp))

        Row (verticalAlignment = Alignment.CenterVertically){
            Image(
                painter = painterResource(id = R.drawable.baseline_location_on_24),
                contentDescription = "Location"
            )
            Spacer(modifier = Modifier.padding(3.dp))
            Text(
                text = "Yogyakarta",
                fontSize = 25.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.padding(3.dp))
        Text(
             text = "Kasihan, Kabupaten Bantul," +
                     "Daerah Istimewa Yogyakarta",
             textAlign = TextAlign.Center,
             color = Color.Gray,
             fontSize = 20.sp)
    }
}

@Composable
fun Kotak_1(modifier: Modifier = Modifier){
    Box (
        Modifier
            .clip(RoundedCornerShape(20.dp))
            .fillMaxSize()
            .background(color = Color.LightGray)
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically

        )
        {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Humidity",
                    fontSize = 20.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(5.dp)
                )
                Text(
                    text = "98%",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.padding(10.dp))

                Text(
                    text = "Sunrise",
                    fontSize = 20.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(5.dp)
                )
                Text(
                    text = "05.00 AM",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "UV Index",
                    fontSize = 20.sp,
                    color = Color.Black, modifier = Modifier.padding(5.dp)
                )
                Text(
                    text = "9/10",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.padding(10.dp))

                Text(
                    text = "Sunset",
                    fontSize = 20.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(5.dp)
                )
                Text(
                    text = "05.45 PM",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}