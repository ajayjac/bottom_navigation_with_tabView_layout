package com.example.oct26test1_lap.tabfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.oct26test1_lap.CustomAdapter
import com.example.oct26test1_lap.ItemsViewModel
import com.example.oct26test1_lap.R


class OngoingFragment : Fragment() {

    lateinit var recyclerView2: RecyclerView

    lateinit var textp: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ongoing, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // getting the recyclerview by its id
        recyclerView2 = view.findViewById(R.id.recyclerview2)

        // this creates a vertical layout Manager
        recyclerView2.layoutManager = LinearLayoutManager(context)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()




        // This loop will create 20 Views containing
        // the image with the count of view
        /*for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item " + i))
        }*/




     /*   data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item1 ", "Arun","Flat No.1",1000,"kannur"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item2 ", "Anjana","Flat No.2",2000,"kollam"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item3 ", "Seena","Flat No.3",2000,"kannur"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item4 ", "Midhun","Flat No.22",1000,"alapuzha"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item5 ", "Alen","Flat No.11",500,"kollam"))*/
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item6 ", "Pradeep","House No.2",500,"kottayam"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item7 ", "Arun","House No.1",700,"alapuzha"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item8 ", "meenu","Flat No.177",1000,"kannur"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item9 ", "swathi","Flat No.571",300,"wayanad"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item10 ", "jacob","Flat No.114",1000,"wayanad"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item11", "soorya","Flat No.178",3050,"palakad"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item12", "james","Flat No.163",1000,"kannur"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item13", "jackson","Flat No.141",400,"thrissur"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item14", "titus","Flat No.13",1000,"kannur"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item15", "rintu","Flat No.114",4000,"thrissur"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item16", "anju","Flat No.11",8000,"kollam"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item17", "joshna","Flat No.13",2400,"idukki"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item18", "ambili","Flat No.187",600,"idukki"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item19", "remya","Flat No.177",2900,"idukki"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item20", "vishnu","Flat No.122",700,"kollam"))








        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerView2.adapter = adapter

         /*textp = view.findViewById(R.id.textView_pending)

        textp.text = "Ongoing"*/




    }
}