package com.stuffshuf.query

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var task=ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //   var double= etMain.text.toString()


         // tvView.text=double


        btnClick.setOnClickListener {


            val data = etMain.text.toString()
            task.add(data)

            Log.d("HH", "$task")


            val cadapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, task)
            Log.d("HH", "$cadapter")
            lView.adapter = cadapter
            //  cadapter.notifyDataSetChanged()



        lView.setOnItemClickListener { parent, view, position, id ->

            task.removeAt(position)
           cadapter.notifyDataSetChanged()

        }
        }
    }


}





