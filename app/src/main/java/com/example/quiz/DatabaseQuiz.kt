package com.example.quiz

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quiz.databinding.ActivityDatabaseQuizBinding
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

class DatabaseQuiz : AppCompatActivity() {
    private lateinit var binding: ActivityDatabaseQuizBinding
    private lateinit var list:ArrayList<QuizModel>
    private var count :Int=0
    private var score: Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding=ActivityDatabaseQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list= ArrayList<QuizModel>();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Firebase.firestore.collection("Quiz").get()
            .addOnSuccessListener { doct->
                list.clear()
                for(i in doct.documents){
                   var quizModel=i.toObject(QuizModel::class.java)
                    list.add(quizModel!!)
                }

                binding.tvQuestion.setText(list.get(0).qustion)
                binding.btnOp1.setText(list.get(0).option1)
                binding.btnOp2.setText(list.get(0).option2)
                binding.btnOp3.setText(list.get(0).option3)
                binding.btnOp4.setText(list.get(0).option4)

            }



        binding.btnOp1.setOnClickListener{
            nextData(binding.btnOp1.text.toString())
        }
        binding.btnOp2.setOnClickListener{
            nextData(binding.btnOp2.text.toString())
        }
        binding.btnOp3.setOnClickListener{
            nextData(binding.btnOp3.text.toString())
        }
        binding.btnOp4.setOnClickListener{
            nextData(binding.btnOp4.text.toString())
        }
    }

    private fun nextData(i: String) {
        if (count<list.size)
            if(i == list[count].ans.toString()){
                score++
            }

        count++
        if(count>=list.size){
            val intent= Intent(this,ScoreActivity::class.java)
            intent.putExtra("score",score.toString())
            startActivity(intent)
        }
        else{
            binding.tvQuestion.setText(list.get(count).qustion)
            binding.btnOp1.setText(list.get(count).option1)
            binding.btnOp2.setText(list.get(count).option2)
            binding.btnOp3.setText(list.get(count).option3)
            binding.btnOp4.setText(list.get(count).option4)
        }


    }
}