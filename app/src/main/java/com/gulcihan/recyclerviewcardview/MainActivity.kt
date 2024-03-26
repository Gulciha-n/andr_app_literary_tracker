package com.gulcihan.recyclerviewcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.gulcihan.recyclerviewcardview.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    private lateinit var bookList : ArrayList<Books>
    private lateinit var adapter : RVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //recyclerView codes
        binding.recyclerView.setHasFixedSize(true) //tasarım uzerine guzelce oturmayı saglar
        binding.recyclerView.layoutManager = LinearLayoutManager(this , )  //liste gorunumu ile ilgili bir yapı


        val book1 = Books("The Great Gatsby", "F. Scott Fitzgerald", "Fiction")
        val book2 = Books("To Kill a Mockingbird", "Harper Lee", "Fiction")
        val book3 = Books("1984", "George Orwell", "Fiction")
        val book4 = Books("Pride and Prejudice", "Jane Austen", "Fiction")
        val book5 = Books("The Catcher in the Rye", "J.D. Salinger", "Fiction")
        val book6 = Books("The Hobbit", "J.R.R. Tolkien", "Fantasy")
        val book7 = Books("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy")
        val book8 = Books("The Da Vinci Code", "Dan Brown", "Mystery")
        val book9 = Books("Sherlock Holmes: The Complete Novels and Stories", "Arthur Conan Doyle", "Mystery")
        val book10 = Books("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy")
        val book11 = Books("The Chronicles of Narnia", "C.S. Lewis", "Fantasy")
        val book12 = Books("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "Science Fiction")
        val book13 = Books("Dune", "Frank Herbert", "Science Fiction")
        val book14 = Books("The Hunger Games", "Suzanne Collins", "Science Fiction")
        val book15 = Books("The Catcher in the Rye", "J.D. Salinger", "Fiction")
        val book16 = Books("The Great Gatsby", "F. Scott Fitzgerald", "Fiction")
        val book17 = Books("To Kill a Mockingbird", "Harper Lee", "Fiction")
        val book18 = Books("Pride and Prejudice", "Jane Austen", "Fiction")
        val book19 = Books("The Picture of Dorian Gray", "Oscar Wilde", "Fiction")
        val book20 = Books("Crime and Punishment", "Fyodor Dostoevsky", "Fiction")

        bookList = ArrayList<Books>()
        bookList.add(book1)
        bookList.add(book2)
        bookList.add(book3)
        bookList.add(book4)
        bookList.add(book5)
        bookList.add(book6)
        bookList.add(book7)
        bookList.add(book8)
        bookList.add(book9)
        bookList.add(book10)
        bookList.add(book11)
        bookList.add(book12)
        bookList.add(book13)
        bookList.add(book14)
        bookList.add(book15)
        bookList.add(book16)
        bookList.add(book17)
        bookList.add(book18)
        bookList.add(book19)
        bookList.add(book20)


        adapter = RVAdapter(this , bookList)

        //olusturdugumuz adapter'ı recyclerView uzerine aktarabilriz
        binding.recyclerView.adapter = adapter


    }
}