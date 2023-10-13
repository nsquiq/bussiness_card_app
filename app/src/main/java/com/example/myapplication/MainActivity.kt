package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BussinessCard()
                }
            }
        }
    }
}

@Composable
fun BussinessCard() {
    val image = painterResource(R.drawable.androiddev)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Center,
         horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .size(height = 110.dp , width = 120.dp)
         )
        Text(
            text = "Nurai Abugalieva",
            color = Color.Yellow,
            fontSize = 18.sp
        )
        Text(
            text = "Android Developer",
            color = Color.White,
            fontSize = 14.sp
        )}
    Information(
        title = "87786104803",
        color = Color.Gray,
        email = "210103331",
        social = "abglvnr",
        )
}
 @Composable
 fun Information(title:String,color:Color,email:String,social:String,modifier:Modifier = Modifier ) {
        val image = painterResource(R.drawable.baseline_settings_phone_white_24dp);
        val imageemail = painterResource(R.drawable.baseline_email_white_24dp);
        val socialmedia = painterResource(R.drawable.baseline_people_white_24dp)
        Box(
            modifier = modifier.then(
                Modifier.fillMaxSize()
            )
        ) {
            Column(
                modifier = Modifier
                    .then(modifier)
                    .align(Alignment.BottomCenter)
            ) {
                Row(
                ) {
                    Image(
                        painter = image,
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .size(height = 25.dp, width = 25.dp)
                            .padding(end = 10.dp)
 )
                    Text(
                        text = title,
                        color = color
                    )
                }
                Row(
                ) {
                    Image(
                        painter = imageemail,
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .size(height = 25.dp, width = 25.dp)
                            .padding(end = 10.dp)

                    )
                    Text(
                        text = email,
                        color = color
                    )
                }
                Row(
                ) {
                    Image(
                        painter = socialmedia,
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .size(height = 25.dp, width = 25.dp)
                            .padding(end = 10.dp)

                    )
                    Text(
                        text = social,
                        color = color
                    )
                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        BussinessCard()
    }
}