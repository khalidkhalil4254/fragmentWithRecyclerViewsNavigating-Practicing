package com.example.myapplication

import android.content.Context
import android.content.Context.MODE_APPEND
import android.content.Intent
import android.os.Bundle
import android.view.ContentInfo
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class fragment2 : Fragment() {

    var reqId=2;
    var adapter2: customAdapter2? =null;


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment2_layout, container, false)
    }


    //creating desired logic:
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        try{

            //getting recyclerView in kotlin to manipulate
            var recyclerView2=view.findViewById<RecyclerView>(R.id.recyclerview2)

            //setting layout manger of the recyclerView:
            recyclerView2.layoutManager=LinearLayoutManager(view.context,LinearLayoutManager.HORIZONTAL,false)

            //creating and adding recyclerView data:

            var data=ArrayList<dataModel2>()
            data.add(dataModel2(R.drawable.i1))
            data.add(dataModel2(R.drawable.i2))
            data.add(dataModel2(R.drawable.i3))

            //creating and setting recyclerView adapter:
            var adapter2=customAdapter2(data)
            recyclerView2.adapter=adapter2


        }catch (er:Exception){
            Toast.makeText(view.context,"Error:${er}",Toast.LENGTH_SHORT).show()
        }




    }


    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        try {
            //getting recyclerView in kotlin to manipulate
            var recyclerView2=view?.findViewById<RecyclerView>(R.id.recyclerview2)

            //setting layout manger of the recyclerView:
            recyclerView2?.layoutManager=LinearLayoutManager(view?.context,LinearLayoutManager.HORIZONTAL,false)

            //creating and adding recyclerView data:
            var sharedPreferences=context?.getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
            var pos=sharedPreferences?.getInt("position",0);


            if(pos==0){
                var img1:Int?=sharedPreferences?.getInt("img1",R.drawable.r1)
                var img2:Int?=sharedPreferences?.getInt("img2",R.drawable.r2)
                var img3:Int?=sharedPreferences?.getInt("img3",R.drawable.r3)

                var data=ArrayList<dataModel2>()
                data.add(dataModel2(img1))
                data.add(dataModel2(img2))
                data.add(dataModel2(img3))

                //creating and setting recyclerView adapter:
                var adapter2=customAdapter2(data)
                recyclerView2?.adapter=adapter2

                adapter2?.notifyDataSetChanged()


            }
            if(pos==1){
                var img1:Int?=sharedPreferences?.getInt("img1",R.drawable.i1)
                var img2:Int?=sharedPreferences?.getInt("img2",R.drawable.i2)
                var img3:Int?=sharedPreferences?.getInt("img3",R.drawable.i3)

                var data=ArrayList<dataModel2>()
                data.add(dataModel2(img1))
                data.add(dataModel2(img2))
                data.add(dataModel2(img3))

                //creating and setting recyclerView adapter:
                var adapter2=customAdapter2(data)
                recyclerView2?.adapter=adapter2

                adapter2?.notifyDataSetChanged()
            }
            if(pos==2){
                var img1:Int?=sharedPreferences?.getInt("img1",R.drawable.p1)
                var img2:Int?=sharedPreferences?.getInt("img2",R.drawable.p2)
                var img3:Int?=sharedPreferences?.getInt("img3",R.drawable.p3)

                var data=ArrayList<dataModel2>()
                data.add(dataModel2(img1))
                data.add(dataModel2(img2))
                data.add(dataModel2(img3))

                //creating and setting recyclerView adapter:
                var adapter2=customAdapter2(data)
                recyclerView2?.adapter=adapter2

                adapter2?.notifyDataSetChanged()
            }

        }catch (er:Exception){
            Toast.makeText(view?.context,"Error:${er}",Toast.LENGTH_SHORT).show()
        }




    }







    }




