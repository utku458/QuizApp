package com.example.myquizapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(var userList:ArrayList<User>): RecyclerView.Adapter<UserAdapter.UserHolder>() {

class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


    val textname = itemView.findViewById<TextView>(R.id.recyclerisimtxt)
  //  val textscore = itemView.findViewById<TextView>(R.id.recyclerpuantxt)
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        var view  = LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout,parent,false)
        return UserHolder(view)


    }

    override fun getItemCount(): Int {
       return userList.size
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {

        holder.textname.setText(userList.get(position).name +" "+ userList.get(position).dogrusayisi+"pts")
      //  holder.textscore.setText(userList.get(position).dogrusayisi)
    }
}
