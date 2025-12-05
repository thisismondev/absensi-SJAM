package id.co.mondo.sjam.ui.component

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonCustom(
    label: String,
    modifier: Modifier,
    onCLick: () -> Unit
){

    Button(
        onClick = {
            onCLick
        },
        modifier = modifier,
        shape = RoundedCornerShape(12.dp),

    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.SemiBold
            ),
            color = Color.White,
            modifier = Modifier.padding(6.dp),
        )
    }

}



@Preview(showBackground = true)
@Composable
fun PreviewButtonCompose(){
    ButtonCustom(
        label = "Selanjutnya",
        modifier = Modifier,
        onCLick = {}
    )
}