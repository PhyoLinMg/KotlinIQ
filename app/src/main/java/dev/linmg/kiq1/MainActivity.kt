package dev.linmg.kiq1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.linmg.kiq1.ui.theme.Kotliniq1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kotliniq1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    val textFieldValue = remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        OutlinedTextField(
            textFieldValue.value,
            modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 20.dp),
            onValueChange = {
                textFieldValue.value = it
            }
        )
        Button(
            onClick = {
            },
            modifier = Modifier.fillMaxWidth().padding(20.dp)
        ) {
            Text("VISIT")
        }
        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 18.dp)) {
            Button(
                modifier = Modifier.weight(1f).padding(horizontal = 5.dp),
                onClick = {
                },
                content = {
                    Text("Forward")
                }
            )
            Button(
                onClick = {
                },
                modifier = Modifier.weight(1f).padding(horizontal = 5.dp)
            ) {
                Text("Back")
            }
        }
        Text(
            "Visited URL: https:www.google.com",
            modifier = Modifier.weight(1f).align(Alignment.CenterHorizontally).wrapContentHeight()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Kotliniq1Theme {
        Greeting()
    }
}
