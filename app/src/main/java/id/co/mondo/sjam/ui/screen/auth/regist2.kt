package id.co.mondo.sjam.ui.screen.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.co.mondo.sjam.ui.component.ButtonCustom
import id.co.mondo.sjam.ui.component.TextFieldCustom
import id.co.mondo.sjam.ui.theme.SJAMTheme

@Composable
fun Regist2() {

    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }



    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text(
            text = "Selangkah lagi",
            style = MaterialTheme.typography.titleLarge.copy(
                fontSize = 32.sp, fontWeight = FontWeight.ExtraBold
            ),
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "Untuk membuat akun Anda,\nsilahkan lanjutkan dengan proses daftar",
            style = MaterialTheme.typography.bodySmall.copy(
                fontSize = 16.sp, fontWeight = FontWeight.Light,
            ),
        )
        Spacer(Modifier.padding(24.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            TextFieldCustom(
                modifier = Modifier.fillMaxWidth(),
                values = "",
                label = "Email",
                onValueChange = {
                    it
                }
            )
            TextFieldCustom(
                modifier = Modifier.fillMaxWidth(),
                values = password,
                label = "Password",
                onValueChange = {
                    password = it
                },
                keyboardType = KeyboardType.Password,
                isPasswordField = true
            )
            TextFieldCustom(
                modifier = Modifier.fillMaxWidth(),
                values = confirmPassword,
                label = "Confirm Password",
                onValueChange = {
                    confirmPassword = it
                },
                keyboardType = KeyboardType.Password,
                isPasswordField = true
            )
        }
        Spacer(Modifier.padding(18.dp))
        ButtonCustom(
            modifier = Modifier.fillMaxWidth(),
            label = "Register",
            onCLick = {

            }
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewRegist2() {
    SJAMTheme {
        Regist2()
    }
}