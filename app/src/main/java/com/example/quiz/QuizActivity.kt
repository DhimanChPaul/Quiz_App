package com.example.quiz

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quiz.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizBinding
    private lateinit var list:ArrayList<QuizModel>
    private var count :Int=0
    private var score: Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        /*
        list= ArrayList<QuizModel>();

//        list.add(QuizModel("1.what is my favorite language?","Java7","Go","JavaScript","Kotlin","Go"))
////        list.add(QuizModel("Favorite person name start with?","A","B","C","D","A"))
//        list.add(QuizModel("2.what is my favorite language?","Java8","Go","JavaScript","Kotlin","Go"))
////        list.add(QuizModel("Favorite person name start with?","A","B","C","D","A"))
//        list.add(QuizModel("3.what is my favorite language?","Java19","Go","JavaScript","Kotlin","Go"))
////        list.add(QuizModel("Favorite person name start with?","A","B","C","D","A"))
//        list.add(QuizModel("4.what is my favorite language?","Java17","Go","JavaScript","Kotlin","Go"))
////        list.add(QuizModel("Favorite person name start with?","A","B","C","D","A"))
//        list.add(QuizModel("5.what is my favorite language?","Java21","Go","JavaScript","Kotlin","Go"))
////        list.add(QuizModel("Favorite person name start with?","A","B","C","D","A"))
//        list.add(QuizModel("6.what is my favorite language?","Java 6","Go","JavaScript","Kotlin","Go"))

        binding.tvQuestion.setText(list.get(0).qustion)
        binding.btnOp1.setText(list.get(0).option1)
        binding.btnOp2.setText(list.get(0).option2)
        binding.btnOp3.setText(list.get(0).option3)
        binding.btnOp4.setText(list.get(0).option4)

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
            val intent=Intent(this,ScoreActivity::class.java)
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

*/
    }


}