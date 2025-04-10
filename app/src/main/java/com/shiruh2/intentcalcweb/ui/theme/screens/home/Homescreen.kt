package com.shiruh2.intentcalcweb.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.shiruh2.intentcalcweb.navigation.ROUTE_CALC
import com.shiruh2.intentcalcweb.navigation.ROUTE_INTENT
import com.shiruh2.intentcalcweb.navigation.ROUTE_WEB

@Composable
fun Home_screen(navController: NavHostController) {
    Column (verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp).background(Color.White)){
        Text(text = "Home Screen",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = _root_ide_package_.androidx.compose.ui.graphics.Color.Black)
        Button(onClick = { navController.navigate(ROUTE_CALC)}, modifier = Modifier.width(300.dp)) {
            Text(text = "Calculator",
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace,
                color = Color.Black)
        }
        Button(onClick = {navController.navigate(ROUTE_WEB)}, modifier = Modifier.width(300.dp)) {
            Text(text = "Web",
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace,
                color = Color.Black)

    }
        Button(onClick = {navController.navigate(ROUTE_INTENT)}, modifier = Modifier.width(300.dp)) {
            Text(text = "Intent",
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace,
                color = Color.Black,
                )


}
        }}

@Preview
@Composable
private fun Homeprev() {
    Home_screen(rememberNavController())
}



