package com.example.menu

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ListViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    fun populaetmodel(user: User,size:Int,position:Int,activity: MainActivity){
        itemView.userName.text = user.Name
        itemView.userLastName.text = user.LastName
    }
}