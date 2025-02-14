package com.example.quiz

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quiz.databinding.ActivityLoginBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

//import com.google.firebase.auth.auth

//import com.google.firebase.auth.auth

class LoginActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityLoginBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        supportActionBar?.hide()
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        auth=FirebaseAuth.getInstance()
        val auth=Firebase.auth
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.button.setOnClickListener{
            Firebase.auth.createUserWithEmailAndPassword(binding.etEmail.text.toString(),binding.etPass.text.toString())
                .addOnCompleteListener {

                    if (it.isSuccessful) {
                        Toast.makeText(this,"User Create Successful !!", Toast.LENGTH_LONG).show()
                        val intent= Intent(this,DatabaseQuiz::class.java)
                        startActivity(intent)
                    }
                    else{
                        Toast.makeText(this,"user not Created !!", Toast.LENGTH_LONG).show()
                    }
                }
        }
    }
}