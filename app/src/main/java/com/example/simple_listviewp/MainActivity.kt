package com.example.simple_listviewp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mylistview=findViewById<ListView>(R.id.ListView)
        val mynames= arrayOf("Kenya","USA","Uganda","Tanzania","Ethiopia","Germany","Burundi","Zambia","Zimbabwe","England")
        val myarrayadater:ArrayAdapter<String> =ArrayAdapter(this,android.R.layout.simple_list_item_1,mynames)
        mylistview.adapter=myarrayadater

        mylistview.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this,"You have clicked on "+ mynames[position],Toast.LENGTH_LONG).show()
        }

    }
}