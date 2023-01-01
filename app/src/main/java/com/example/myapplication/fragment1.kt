package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class fragment1 : Fragment() {

    var data=ArrayList<dataModel1>();


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_layout, container, false)
    }


    //creating desired logic:
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        try {
            var rv=view?.findViewById<RecyclerView>(R.id.recyclerview1)
            //setting layout manger for the View:
            rv?.layoutManager=LinearLayoutManager(view.context,LinearLayoutManager.VERTICAL,false)
            //creating recyclerView data:
            data=ArrayList<dataModel1>()
            data.add(dataModel1("Roma",true))
            data.add(dataModel1("Indian",false))
            data.add(dataModel1("Paris",false))
            //setting adapter data source:
            val adapter1=customAdapter1(data)
            //setting recyclerView adapter:
            rv?.adapter=adapter1
        }catch (er:Exception){
            Toast.makeText(view.context,"Error:${er}",Toast.LENGTH_SHORT).show()
        }


    }


    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)


        try {

            var sharedPreferences=context?.getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)

            var selectedPosition:Int?=sharedPreferences?.getInt("position",-1)


            if(selectedPosition==0){
                Toast.makeText(context,"shrd pref position=${selectedPosition}",Toast.LENGTH_LONG).show()
                //creating or inflating recyclerView in kotlin:
                var rv=view?.findViewById<RecyclerView>(R.id.recyclerview1)

                //setting layout manger for the View:
                rv?.layoutManager=LinearLayoutManager(view?.context)


                //creating recyclerView data:
                data=ArrayList<dataModel1>()
                data.add(dataModel1("Roma",true))
                data.add(dataModel1("Indian",false))
                data.add(dataModel1("Paris",false))


                //setting adapter data source:
                val adapter1=customAdapter1(data)

                //setting recyclerView adapter:
                rv?.adapter=adapter1
            }
            if(selectedPosition==1){
                Toast.makeText(context,"shrd pref position=${selectedPosition}",Toast.LENGTH_LONG).show()
                //creating or inflating recyclerView in kotlin:
                var rv=view?.findViewById<RecyclerView>(R.id.recyclerview1)

                //setting layout manger for the View:
                rv?.layoutManager=LinearLayoutManager(view?.context)


                //creating recyclerView data:
                data=ArrayList<dataModel1>()
                data.add(dataModel1("Roma",false))
                data.add(dataModel1("Indian",true))
                data.add(dataModel1("Paris",false))


                //setting adapter data source:
                val adapter1=customAdapter1(data)

                //setting recyclerView adapter:
                rv?.adapter=adapter1

            }
            if(selectedPosition==2){
                Toast.makeText(context,"shrd pref position=${selectedPosition}",Toast.LENGTH_LONG).show()
                //creating or inflating recyclerView in kotlin:
                var rv=view?.findViewById<RecyclerView>(R.id.recyclerview1)

                //setting layout manger for the View:
                rv?.layoutManager=LinearLayoutManager(view?.context)


                //creating recyclerView data:
                data=ArrayList<dataModel1>()
                data.add(dataModel1("Roma",false))
                data.add(dataModel1("Indian",false))
                data.add(dataModel1("Paris",true))


                //setting adapter data source:
                val adapter1=customAdapter1(data)

                //setting recyclerView adapter:
                rv?.adapter=adapter1
            }


        }catch (er:Exception){
            Toast.makeText(view?.context,"Error:${er}",Toast.LENGTH_SHORT).show()
        }







    }





}