package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        try {
            //creating fragment objects:
            val f1=fragment1()
            val f2=fragment2()

            val manager=supportFragmentManager

            manager.beginTransaction().
            replace(R.id.layout1,f1).
            commit()

            manager.beginTransaction().
            replace(R.id.layout2,f2).
            commit()
        }catch (er:Exception){
            Toast.makeText(applicationContext,"Error:${er}",Toast.LENGTH_SHORT).show()
        }





    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.homePage -> {

            }
            R.id.entryPage -> {
                var i=Intent(this,temp::class.java)
                startActivity(i)
                finishAffinity()
            }
            R.id.exitOption -> {
                finishAffinity()
            }
        }
        return super.onOptionsItemSelected(item)
    }



}