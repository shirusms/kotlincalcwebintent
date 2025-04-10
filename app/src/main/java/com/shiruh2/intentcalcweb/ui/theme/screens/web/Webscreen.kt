package com.shiruh2.intentcalcweb.ui.theme.screens.web

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Web_Screen(navController: NavHostController) {
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)){
        Text(text = "Web Screen",
            color= Color.White,
            fontSize = 30.sp,
            fontFamily = FontFamily.Monospace)
        OutlinedButton(onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.width(300.dp)) { Text(text = "Google",
            fontSize = 35.sp,
            fontFamily = FontFamily.SansSerif)}
    }

}

@Preview
@Composable
private fun Web_prev() {
    Web_Screen(rememberNavController())

}