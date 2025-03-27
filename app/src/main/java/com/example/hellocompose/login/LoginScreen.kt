package com.example.hellocompose.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface (color = Color.Magenta) {
        Text(
            text = "Hi, my name is $name!",
            modifier = Modifier.padding(24.dp)
        )
    }
}

@Preview(
    // widthDp = 100,
    heightDp = 50,
    showSystemUi = true,
    device = Devices.PIXEL_4_XL
)
@Composable
fun ExamplePreview(){
    Example("Engineer")
}

@Composable
fun Example(job: String) {
    Text(
        text = "Gabriel es un $job",
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .background(Color.Red)
            .padding(all = 10.dp)
    )
}