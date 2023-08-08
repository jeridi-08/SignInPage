package com.mintleaf.signin

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.mintleaf.signin.ui.theme.SignInPageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in)
        var google_icon = findViewById<ImageView>(R.id.imageView3)
        google_icon.bringToFront();
        var log_in_normal = findViewById<Button>(R.id.button)
        var log_in_google = findViewById<Button>(R.id.button)
        log_in_normal.setOnClickListener {
            setContentView(R.layout.sign_in)
            var email = findViewById<EditText>(R.id.editTextTextEmailAddress2)
            var password = findViewById<EditText>(R.id.editTextPassword)
            val toast = Toast.makeText(this, "Welcome!", Toast.LENGTH_LONG)
            toast.show()
            setContentView(R.layout.main_page)
        }
        log_in_google.setOnClickListener {
            setContentView(R.layout.sign_in)
            var email = findViewById<EditText>(R.id.editTextTextEmailAddress2)
            var password = findViewById<EditText>(R.id.editTextPassword)
            val toast = Toast.makeText(this, "Welcome!", Toast.LENGTH_LONG)
            toast.show()
            setContentView(R.layout.main_page)
        }
        }
    }
