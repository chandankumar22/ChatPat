package com.ck.dev.chatpat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.ck.dev.chatpat.ui.LoginScreen
import com.ck.dev.chatpat.ui.theme.ChatPatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatPatTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { inneqwerrPadding ->
                    LoginScreen()
                }
            }
        }
    }
}
