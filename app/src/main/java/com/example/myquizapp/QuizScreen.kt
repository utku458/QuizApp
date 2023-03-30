package com.example.myquizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.myquizapp.databinding.ActivityMainBinding
import com.example.myquizapp.databinding.ActivityQuizScreenBinding

class QuizScreen : AppCompatActivity() , OnClickListener {
    private lateinit var questionList:ArrayList<Question>
    private var currentpos: Int = 0
    private var selectedOptionPos:Int? = null
    private var dogruSayisi:Int = 0
     lateinit var name: String
     lateinit var user: User
//     lateinit var userList:ArrayList<User>
    private lateinit var binding: ActivityQuizScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //this.userList = ArrayList()
        questionList = Questions.getQuestions()


        binding.opt1tv.setOnClickListener(this)
        binding.opt2tv.setOnClickListener(this)
        binding.opt3tv.setOnClickListener(this)
        binding.opt4tv.setOnClickListener(this)
        binding.submitbtn.setOnClickListener(this)
       currentpos= 1
        selectedOptionPos=0
        dogruSayisi=0

        var intent = intent

       // userList = intent.getSerializableExtra("list") as ArrayList<User>

         name = intent.getStringExtra("name").toString()


        hepsiniYaz(questionList)
        binding.progressBar.max=questionList.size
        binding.progressBar.progress=currentpos

//#DFDCDC butona tiklandiktan sonraki renk kodu
    }

    override fun onClick(v: View?) {

        if (v!!.id ==R.id.opt1tv){
          selectedOption(binding.opt1tv,1)
        }
        else if (v!!.id == R.id.opt2tv){
            selectedOption(binding.opt2tv,2)
        }
        else if (v!!.id == R.id.opt3tv){
            selectedOption(binding.opt3tv,3)
        }
        else if (v!!.id == R.id.opt4tv){
            selectedOption(binding.opt4tv,4)
        }

        if (v!!.id==R.id.submitbtn){






                val question = questionList?.get(currentpos-1)
                binding.questiontv.text= question!!.soru
                if (question!!.answerid==selectedOptionPos){
                    dogruSayisi++
                }

                if (currentpos==questionList!!.size){
                    val intent = Intent(this@QuizScreen,ResultActivity::class.java)
                    intent.putExtra("dogru",dogruSayisi)
                    intent.putExtra("namefromquiz",name)

                    user = User(name,dogruSayisi)
                   // userList.add(user)
                    intent.putExtra("user",user)
                 //   intent.putExtra("liste",userList)
                    startActivity(intent)
                }
            currentpos++
            hepsiniYaz(questionList)
            binding.progressBar.progress=currentpos




        }
    }




    fun hepsiniYaz(questionList: ArrayList<Question>){
        val question = questionList.get(currentpos -1)
       defaultOptions()
        binding.questiontv.setText(question.soru)
        binding.opt1tv.setText(question.option1)
        binding.opt2tv.setText(question.option2)
        binding.opt3tv.setText(question.option3)
        binding.opt4tv.setText(question.option4)

    }

    fun defaultOptions(){
        val options=ArrayList<Button>()

        options.add(binding.opt1tv)

        options.add(binding.opt2tv)

        options.add(binding.opt3tv)

        options.add(binding.opt4tv)



        for (option in options){

            option.setTextColor((Color.parseColor("#7A8089")))
            option.typeface= Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,R.drawable.custombtn)
        }






    }

    fun selectedOption(btn:Button, selectedNum:Int){
        defaultOptions()
        selectedOptionPos = selectedNum
        btn.setTextColor((Color.parseColor("#363A43")))
        btn.typeface= Typeface.DEFAULT_BOLD
        btn.background = ContextCompat.getDrawable(this,R.drawable.optionbtn)

    }
}