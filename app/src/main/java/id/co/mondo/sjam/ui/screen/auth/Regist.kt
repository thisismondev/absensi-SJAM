package id.co.mondo.sjam.ui.screen.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import id.co.mondo.sjam.ui.component.ButtonCustom
import id.co.mondo.sjam.ui.component.DatePickerDocked
import id.co.mondo.sjam.ui.component.TextFieldCustom
import id.co.mondo.sjam.ui.theme.SJAMTheme

@Composable
fun Regist(navController: NavController){

    var dob by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Buat Akun",
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
                label = "Nama Lengkap",
                onValueChange = {
                    it
                }
            )
            TextFieldCustom(
                modifier = Modifier.fillMaxWidth(),
                values = "",
                label = "Nomor Telepon",
                onValueChange = {
                    it
                },
                keyboardType = KeyboardType.Number
            )

            TextFieldCustom(
                modifier = Modifier.fillMaxWidth(),
                values = "",
                label = "Instansi",
                onValueChange = {
                    it
                }
            )
            TextFieldCustom(
                modifier = Modifier.fillMaxWidth(),
                values = "",
                label = "Fakultas",
                onValueChange = {
                    it
                }
            )
            TextFieldCustom(
                modifier = Modifier.fillMaxWidth(),
                values = "",
                label = "Jurusan",
                onValueChange = {
                    it
                }
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                DatePickerDocked(
                    label = "Mulai",
                    value = dob,
                    onValueChange = {
                        dob = it
                    },
                    modifier = Modifier.weight(1f)
                )
                DatePickerDocked(
                    label = "Selesai",
                    value = dob,
                    onValueChange = {
                        dob = it
                    },
                    modifier = Modifier.weight(1f)
                )
            }
            TextFieldCustom(
                modifier = Modifier.fillMaxWidth(),
                values = "",
                label = "Divisi",
                onValueChange = {
                    it
                }
            )
        }
        Spacer(Modifier.padding(18.dp))
        ButtonCustom(
            modifier = Modifier.fillMaxWidth(),
            label = "Selanjutnya",
            onCLick = {
                navController.navigate("register")
            }
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewRegist(){
    SJAMTheme {
        Regist(
            rememberNavController()
        )
    }
}