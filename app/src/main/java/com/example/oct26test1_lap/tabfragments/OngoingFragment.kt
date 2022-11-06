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





        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "Pradeep","House No.2",500,"kottayam","Ongoing"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "Arun","House No.1",700,"alapuzha","Ongoing"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "meenu","Flat No.177",1000,"kannur","Ongoing"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "swathi","Flat No.571",300,"wayanad","Ongoing"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "jacob","Flat No.114",1000,"wayanad","Ongoing"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "soorya","Flat No.178",3050,"palakad","Ongoing"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "james","Flat No.163",1000,"kannur","Ongoing"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "jackson","Flat No.141",400,"thrissur","Ongoing"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "titus","Flat No.13",1000,"kannur","Ongoing"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "rintu","Flat No.114",4000,"thrissur","Ongoing"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "anju","Flat No.11",8000,"kollam","Ongoing"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "joshna","Flat No.13",2400,"idukki","Ongoing"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "ambili","Flat No.187",600,"idukki","Ongoing"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "remya","Flat No.177",2900,"idukki","Ongoing"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "vishnu","Flat No.122",700,"kollam","Ongoing"))








        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerView2.adapter = adapter

         /*textp = view.findViewById(R.id.textView_pending)

        textp.text = "Ongoing"*/




    }
}