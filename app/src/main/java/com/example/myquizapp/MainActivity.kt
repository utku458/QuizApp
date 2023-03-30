package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myquizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   // lateinit var userlistmain:ArrayList<User>
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  this.userlistmain = ArrayList()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)





            var intent = intent
      // userlistmain= intent.getSerializableExtra("liste") as ArrayList<User>





        binding.girisbtn.setOnClickListener {

            if (binding.edttxt.text!!.isEmpty()){
                Toast.makeText(this, "Lutfen bir isim giriniz", Toast.LENGTH_LONG).show()
            }

            else{
                var isim = binding.edttxt.text.toString()
                var intent = Intent(this@MainActivity,QuizScreen::class.java)
              //  intent.putExtra("liste",userlistmain)
                intent.putExtra("name",isim)

                startActivity(intent)
            }



        }


    }
}