package id.co.mondo.sjam.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import id.co.mondo.sjam.ui.screen.absen.HomeScreen
import id.co.mondo.sjam.ui.screen.absen.RecapScreen
import id.co.mondo.sjam.ui.screen.auth.Login
import id.co.mondo.sjam.ui.screen.auth.Regist
import id.co.mondo.sjam.ui.screen.auth.Regist2
import id.co.mondo.sjam.ui.screen.settings.SettingScreen

@Composable
fun sjamApp(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login"){
        composable("login"){
            Login(navController)
        }
        composable("regist"){
            Regist(navController)
        }
        composable("register"){
            Regist2(navController)
        }
        composable("home") {
            HomeScreen(navController)
        }
        composable("recap") {
            RecapScreen(navController)
        }
        composable("setting") {
            SettingScreen(navController)
        }
    }
}