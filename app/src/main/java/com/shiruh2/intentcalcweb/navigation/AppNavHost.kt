package com.shiruh2.intentcalcweb.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.shiruh2.intentcalcweb.ui.theme.screens.calc.Calc_screen
import com.shiruh2.intentcalcweb.ui.theme.screens.home.Home_screen
import com.shiruh2.intentcalcweb.ui.theme.screens.intent.Intent_Screen
import com.shiruh2.intentcalcweb.ui.theme.screens.web.Web_Screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination:String= ROUTE_HOME) {
    NavHost(navController=navController, modifier = modifier,
        startDestination = startDestination){
        composable(ROUTE_HOME) {
            Home_screen(navController)

        }
        composable (ROUTE_CALC){
            Calc_screen(navController)
        }
        composable(ROUTE_WEB) {
            Web_Screen(navController)
        }
        composable (ROUTE_INTENT){
            Intent_Screen(navController)
        }
    }
}

