package id.co.mondo.sjam.ui.screen.settings

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import id.co.mondo.sjam.ui.component.AppTopBar
import id.co.mondo.sjam.ui.component.DatePickerDocked
import id.co.mondo.sjam.ui.component.ProfileImageEditable
import id.co.mondo.sjam.ui.component.TextFieldCustom
import id.co.mondo.sjam.ui.theme.SJAMTheme

@Composable
fun ProfileScreen(
    navController: NavController
) {

    var dob by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        AppTopBar(
            title = "Profile",
            onBackClick = {
                navController.popBackStack()
            }
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth(),
            contentPadding = PaddingValues(
                horizontal = 20.dp,
                vertical = 12.dp
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                ProfileImageEditable(
                    onEditClick = {

                    }
                )
            }
            item {
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
                        label = "Email",
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
                        label = "Alamat ",
                        onValueChange = {
                            it
                        }
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
                    TextFieldCustom(
                        modifier = Modifier.fillMaxWidth(),
                        values = "",
                        label = "NIM",
                        onValueChange = {
                            it
                        },
                        keyboardType = KeyboardType.Number
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
            }
            item{
                OutlinedButton(
                    onClick = {
                        navController.popBackStack()
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    shape = RoundedCornerShape(20.dp),
                    border = BorderStroke(
                        width = 1.dp,
                        color = Color.Red
                    ),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.Red
                    ),
                    contentPadding = PaddingValues(vertical = 14.dp)
                ) {
                    Text(
                        text = "Logout",
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.Red,
                    )
                }
            }

        }

    }

}


@Preview(showBackground = true)
@Composable
fun PreviewProfileScreen() {
    SJAMTheme {
        ProfileScreen(
            rememberNavController()
        )
    }
}