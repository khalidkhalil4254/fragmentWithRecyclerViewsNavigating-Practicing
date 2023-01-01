package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class resActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.res)


        //declaring ui objects:
        var price_txt=findViewById<TextView>(R.id.price_res_txt)
        var class_txt=findViewById<TextView>(R.id.class_res_txt)
        var person_txt=findViewById<TextView>(R.id.person_res_txt)
        var day_txt=findViewById<TextView>(R.id.day_res_txt)




        //creating shrdPref file to save data in:
        var sharedPref= getSharedPreferences("saveSearch", Context.MODE_PRIVATE)

        //getting and receiving variables from shared preference:
        var price:Int=sharedPref.getInt("price",0)
        var class_:Int=sharedPref.getInt("class",0)
        var person:Int= sharedPref.getInt("person",0)
        var day:Int= sharedPref.getInt("day",0)


        price_txt.text=price.toString()
        class_txt.text=class_.toString()
        person_txt.text=person.toString()
        day_txt.text=day.toString()


        //india
        if(price in 600..999){
        //getting recyclerView in kotlin to manipulate
            var recyclerView2=findViewById<RecyclerView>(R.id.rec3)

            //setting layout manger of the recyclerView:
            recyclerView2?.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
            var data=ArrayList<dataModel3>()
            data.add(dataModel3(R.drawable.r1,"The Colosseum (/ˌkɒləˈsiːəm/ KOL-ə-SEE-əm; Italian: Colosseo [kolosˈsɛːo]) is an oval amphitheatre in the centre of the city of Rome, Italy, just east of the Roman Forum. "))
            data.add(dataModel3(R.drawable.r2,"The Mausoleum of Hadrian, usually known as Castel Sant'Angelo (Italian pronunciation: [kaˈstɛl sanˈtandʒelo]; English: Castle of the Holy Angel), is a towering cylindrical building in Parco Adriano, Rome, Italy. It was initially commissioned by the Roman Emperor Hadrian as a mausoleum for himself and his family."))
            data.add(dataModel3(R.drawable.r3,"The Pantheon (UK: /ˈpænθiən/, US: /-ɒn/;[1] Latin: Pantheum,[nb 1] from Greek Πάνθειον Pantheion, \"[temple] of all the gods\") is a former Roman temple and, since 609 AD, a Catholic church (Basilica di Santa Maria ad Martyres or Basilica of St. Mary and the Martyrs) in Rome, Italy, on the site of an earlier temple commissioned by Marcus Agrippa during the reign of Augustus (27 BC – 14 AD). It was rebuilt by the emperor Hadrian and probably dedicated c. 126 AD. "))

            //creating and setting recyclerView adapter:
            var adapter2=customAdapter3(data)
            recyclerView2?.adapter=adapter2

        }

        //roma
        if(price in 1000..3000){
            var recyclerView2=findViewById<RecyclerView>(R.id.rec3)

            //setting layout manger of the recyclerView:
            recyclerView2?.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

            var data=ArrayList<dataModel3>()
            data.add(dataModel3(R.drawable.i1,"India, officially the Republic of India (Hindi: Bhārat Gaṇarājya),[25] is a country in South Asia. It is the seventh-largest country by area, the second-most populous country, and the most populous democracy in the world."))
            data.add(dataModel3(R.drawable.i2,"The Rāmāyana (/rɑːˈmɑːjənə/;[1][2] Sanskrit: रामायणम्,[3] IAST: Rāmāyaṇam) is a Sanskrit epic composed over a period of nearly a millennium, with scholars' estimates for the earliest stage of the text ranging from the 8th to 4th centuries BCE,[4] and later stages extending up to the 3rd century CE."))
            data.add(dataModel3(R.drawable.i3,"The Maratha Empire, also referred to as the Maratha Confederacy, was an early modern Indian confederation that came to dominate much of the Indian subcontinent in the 18th century."))

            //creating and setting recyclerView adapter:
            var adapter2=customAdapter3(data)
            recyclerView2?.adapter=adapter2
        }

        //paris
        if(price in 3001..6000){
            var recyclerView2=findViewById<RecyclerView>(R.id.rec3)

            //setting layout manger of the recyclerView:
            recyclerView2?.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
            var data=ArrayList<dataModel3>()
            data.add(dataModel3(R.drawable.p1,"The Eiffel Tower (/ˈaɪfəl/ EYE-fəl; French: tour Eiffel [tuʁ‿ɛfɛl] (listen)) is a wrought-iron lattice tower on the Champ de Mars in Paris, France. It is named after the engineer Gustave Eiffel, whose company designed and built the tower."))
            data.add(dataModel3(R.drawable.p2,"The Palais Garnier (French: [palɛ ɡaʁnje] (listen), Garnier Palace), also known as Opéra Garnier (French: [ɔpeʁa ɡaʁnje] (listen), Garnier Opera), is a 1,979-seat[3] opera house at the Place de l'Opéra in the 9th arrondissement of Paris, France."))
            data.add(dataModel3(R.drawable.p3,"The Arc de Triomphe de l'Étoile (UK: /ˌɑːrk də ˈtriːɒmf, - ˈtriːoʊmf/,[3][4] US: /- triːˈoʊmf/,[5] French: [aʁk də tʁijɔ̃f də letwal] (listen); lit. 'Triumphal Arch of the Star') is one of the most famous monuments in Paris, France, standing at the western end of the Champs-Élysées at the centre of Place Charles de Gaulle, formerly named Place de l'Étoile—the étoile or \"star\" of the juncture formed by its twelve radiating avenues."))

            //creating and setting recyclerView adapter:
            var adapter2=customAdapter3(data)
            recyclerView2?.adapter=adapter2

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
                var i= Intent(this,temp::class.java)
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