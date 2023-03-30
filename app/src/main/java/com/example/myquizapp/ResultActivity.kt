package com.example.myquizapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myquizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    lateinit var userList:ArrayList<User>
    lateinit var adapter: UserAdapter
    var dogrusayisi = 0
    var isim = " "
    lateinit var user:User

    lateinit var userRecyclerView:RecyclerView
    var sayac:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        sayac=0
        userList=ArrayList()


        var intent = intent
         dogrusayisi = intent.getIntExtra("dogru",0)
         isim = intent.getStringExtra("namefromquiz").toString()
         user  = User(isim,dogrusayisi)
        var user1 =User("eben",2)
        var user2 =User("eben2",3)
        userList.add(user)

        //intent.getSerializableExtra("user")

      //  userList = intent.getSerializableExtra("liste") as ArrayList<User>

         var userr = intent.getSerializableExtra("user") as User


        adapter= UserAdapter(userList)
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        binding.recyclerview.adapter=adapter
        adapter.notifyDataSetChanged()




        binding.isimtxt.setText(isim.toString())
        binding.sonuctxt.setText("10 adet soruda " + dogrusayisi.toString()+" adet dogru bildiniz")

        binding.listbutton.setOnClickListener {


            sayac++
            if (sayac==1){
                binding.listbutton.setText("Tekrar Dene")

            }
            if (sayac>=2){
                var intent = Intent(this@ResultActivity,MainActivity::class.java)
                intent.putExtra("liste",userList)
                startActivity(intent)
            }




        }
    }





}