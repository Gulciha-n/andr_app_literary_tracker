package com.gulcihan.recyclerviewcardview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import android.view.MenuItem

class RVAdapter (private val mContext: Context , private val incomingBookAuthorList : List<Books>)
    : RecyclerView.Adapter<RVAdapter.CardViewObjectsHolder>() {

    inner class CardViewObjectsHolder(view : View) : RecyclerView.ViewHolder(view){
        //Card tasarım uzerindeki gorunumler
        //tasarım uzerindeki gorunumlerin id'lerini ve turlerini tanımlayalım
        var lineCardView : CardView
        var lineTextName : TextView
        var imageViewDot : ImageView
        var textViewAuthor : TextView
        var textViewGenre : TextView

        init {
            lineCardView = view.findViewById(R.id.lineCardView)
            lineTextName = view.findViewById(R.id.TextViewName)
            imageViewDot = view.findViewById(R.id.imageViewDot)
            textViewAuthor = view.findViewById(R.id.textViewAuthor)
            textViewGenre = view.findViewById(R.id.textViewGenre)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewObjectsHolder {
        val design = LayoutInflater.from(mContext).inflate(R.layout.card_design,parent,false)
        return CardViewObjectsHolder(design)
    }

    override fun getItemCount(): Int {
        return incomingBookAuthorList.size
    }

    override fun onBindViewHolder(holder: CardViewObjectsHolder, position: Int) {
        val book = incomingBookAuthorList[position]

        holder.lineTextName.text = "Book Name :  ${ book.bookName }"
        holder.textViewAuthor.text = "Author :  ${ book.author }"
        holder.textViewGenre.text = "Genre :  ${ book.genre }"

        holder.lineCardView.setOnClickListener {
            Toast.makeText(mContext,"Selected Book : ${book.bookName}" , Toast.LENGTH_SHORT).show()

        }

       holder.imageViewDot.setOnClickListener {
           val popup = PopupMenu(mContext, holder.imageViewDot)
           popup.menuInflater.inflate(R.menu.popup_menu , popup.menu)
           popup.show()

           popup.setOnMenuItemClickListener { item ->
               when(item.itemId){
                   R.id.action_delete -> {
                       notifyItemRemoved(position)
                       true

                   }
                   R.id.action_update -> {
                       Toast.makeText(mContext," ${book.bookName} selected to update ", Toast.LENGTH_SHORT).show()
                       true
                   }
                   else-> false
               }
           }
       }
     }
    }




