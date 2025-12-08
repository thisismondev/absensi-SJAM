package id.co.mondo.sjam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import id.co.mondo.sjam.ui.sjamApp
import id.co.mondo.sjam.ui.theme.SJAMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SJAMTheme {
                sjamApp()
            }
        }
    }
}