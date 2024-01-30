package br.senai.sp.jandira.myage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.myage.ui.theme.MyAgeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAgeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column {
                        MinhaTela()
                        MinhaTela()
                        MinhaTela()


                    }


                }
            }
        }
    }
}


@Composable
fun MinhaTela() {
    Column {

        Text(
            text = "Olá Mundo",
            fontSize = 32.sp,
            color = Color.Green
        )

        Text(
            text = "Palmeiras",
            fontSize = 22.sp,
            color = Color.Cyan,
            fontWeight = FontWeight.ExtraBold
        )

        Row {
            Button(onClick = { /*TODO*/ }) {
                Column {
                    Text(
                        text = "Vai Palmeiras"
                    )

                    Text(
                        text = "Vai Palmeiras"
                    )
                }

            }
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0x77DB9316),
                    contentColor = Color(0xFF881133)
                )

            )
            {
                Column {
                    Text(
                        text = "Vai Palmeiras"
                    )

                    Text(
                        text = "Vai Palmeiras"
                    )
                }

            }
        }

    }

}

