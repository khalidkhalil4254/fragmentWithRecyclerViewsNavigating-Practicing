package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.core.app.ActivityCompat.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView

class customAdapter1(private val mList: ArrayList<dataModel1>) : RecyclerView.Adapter<customAdapter1.ViewHolder>() {
    var mSelectedItem = -1
    var reqId=2;

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item1_layout, parent, false)
        return ViewHolder(view)
    }
    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]
        // sets the image to the imageview from our itemHolder class
        holder.radioButton.isChecked=ItemsViewModel.isChecked
        holder.radioButton.text=ItemsViewModel.text
        try {
            val sharedPreference =  holder.itemView.context.getSharedPreferences("PREFERENCE_NAME",0)
            mSelectedItem=sharedPreference.getInt("position",0);


            if ((mSelectedItem == -1 && position == 0)){

            }
            else{
                holder.radioButton.isChecked = (mSelectedItem == position)
            }
            holder.radioButton.setOnClickListener {
                when(position){
                    0->{


                        try {



                            //setting mode to private=0 \ setting to append=32768
                            val sharedPreference =  holder.itemView.context.getSharedPreferences("PREFERENCE_NAME",0)
                            var editor = sharedPreference.edit()
                            editor.putInt("img1",R.drawable.r1)
                            editor.putInt("img2",R.drawable.r2)
                            editor.putInt("img3",R.drawable.r3)
                            editor.putInt("position",position)
                            editor.commit()



                            //creating fragment objects:
                            var f1=fragment1()
                            var f2=fragment2()
                            var manager=(holder.itemView.context as MainActivity).supportFragmentManager

                            manager.beginTransaction().
                            replace(R.id.layout1,f1).
                            commit()

                            manager.beginTransaction().
                            replace(R.id.layout2,f2).
                            commit()





                        }catch (er:Exception){
                            var t= Toast.makeText(holder.itemView.context,er.toString(),Toast.LENGTH_SHORT)
                            t.setMargin(20F,50F)
                            t.show()
                        }


//
//                        var i=Intent(holder.itemView.context,MainActivity::class.java)
//                        (holder.itemView.context as Activity).startActivity(i)
//                        (holder.itemView.context as Activity).finish()


                    }
                    1->{



                        try {



                            //setting mode to private=0 \ setting to append=32768
                            val sharedPreference =  holder.itemView.context.getSharedPreferences("PREFERENCE_NAME",0)
                            var editor = sharedPreference.edit()
                            editor.putInt("img1",R.drawable.i1)
                            editor.putInt("img2",R.drawable.i2)
                            editor.putInt("img3",R.drawable.i3)
                            editor.putInt("position",position)
                            editor.commit()



                            //creating fragment objects:
                            var f1=fragment1()
                            var f2=fragment2()
                            var manager=(holder.itemView.context as MainActivity).supportFragmentManager

                            manager.beginTransaction().
                            replace(R.id.layout1,f1).
                            commit()

                            manager.beginTransaction().
                            replace(R.id.layout2,f2).
                            commit()


                        }catch (er:Exception){
                            var t= Toast.makeText(holder.itemView.context,er.toString(),Toast.LENGTH_SHORT)
                            t.setMargin(20F,50F)
                            t.show()
                        }




//
//
//                        var i=Intent(holder.itemView.context,MainActivity::class.java)
//                        (holder.itemView.context as Activity).startActivity(i)
//                        (holder.itemView.context as Activity).finish()



                    }
                    2->{


                        try {


                            //setting mode to private=0 \ setting to append=32768
                            val sharedPreference =  holder.itemView.context.getSharedPreferences("PREFERENCE_NAME",0)
                            var editor = sharedPreference.edit()
                            editor.putInt("img1",R.drawable.p1)
                            editor.putInt("img2",R.drawable.p2)
                            editor.putInt("img3",R.drawable.p3)
                            editor.putInt("position",position)
                            editor.commit()


                            //creating fragment objects:
                            var f1=fragment1()
                            var f2=fragment2()
                            var manager=(holder.itemView.context as MainActivity).supportFragmentManager

                            manager.beginTransaction().
                            replace(R.id.layout1,f1).
                            commit()

                            manager.beginTransaction().
                            replace(R.id.layout2,f2).
                            commit()



                        }catch (er:Exception){
                            var t= Toast.makeText(holder.itemView.context,er.toString(),Toast.LENGTH_SHORT)
                            t.setMargin(20F,50F)
                            t.show()
                        }


//
//                        var i=Intent(holder.itemView.context,MainActivity::class.java)
//                        (holder.itemView.context as Activity).startActivity(i)
//                        (holder.itemView.context as Activity).finish()




                    }

                }

                //to disable remaining radio buttons:
                mSelectedItem=position
                notifyDataSetChanged()
            }

        }catch (er:Exception){
            Toast.makeText(holder.itemView.context,"Error:${er}",Toast.LENGTH_SHORT).show()
        }

    }

    // return the number of the items in the list
    override fun getItemCount(): Int { return mList.size }

    // Holds the views for adding it to radio buttons:
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val radioButton: RadioButton = itemView.findViewById(R.id.radio_btn)
    }
}