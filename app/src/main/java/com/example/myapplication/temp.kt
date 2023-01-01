package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener

class temp :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.temp)


        var price=findViewById<EditText>(R.id.price_txt);
        var class_=findViewById<EditText>(R.id.class_txt);
        var person=findViewById<EditText>(R.id.person_txt);
        var day=findViewById<EditText>(R.id.day_txt);
        var btn=findViewById<Button>(R.id.submit_btn);



        price.addTextChangedListener{
            try {
                if(price.text.toString().toInt()>=6001 || price.text.toString().toInt()<=599){
                    price.error = "Must Be In Range 600-6000"
                }else{}
            }catch (er:Exception){

            }

        }

        class_.addTextChangedListener {

            try {
                if(class_.text.toString().toInt()<=2 || class_.text.toString().toInt()>=6){
                    class_.error = "Must Be In Range 3-5"
                }else{}
            }catch (er:Exception){

            }

        }

        person.addTextChangedListener {
            try {
                if(person.text.toString().toInt()<=1 || person.text.toString().toInt()>=5){
                    person.error="Must Be In Range 2-4"
                }else{}
            }catch (er:Exception){

            }

        }

        day.addTextChangedListener {
            try {
                if(day.text.toString().toInt()<=1 || day.text.toString().toInt()>=15){
                    day.error="Must Be In Range 2-14"
                }else{}
            }catch (er:Exception){

            }

        }



        btn.setOnClickListener{


            //creating shrdPref file to save data in:
            var sharedPref= getSharedPreferences("saveSearch",Context.MODE_PRIVATE)
            var edite=sharedPref.edit()
            edite.putInt("price",price.text.toString().toInt())
            edite.putInt("class",class_.text.toString().toInt())
            edite.putInt("person",person.text.toString().toInt())
            edite.putInt("day",day.text.toString().toInt())
            edite.commit()

            var i=Intent(this,resActivity::class.java);
            startActivity(i)
        }

    }






    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.homePage -> {
                var i= Intent(this,MainActivity::class.java)
                startActivity(i)
                finishAffinity()
            }
            R.id.entryPage -> {

            }
            R.id.exitOption -> {
                finishAffinity()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}


