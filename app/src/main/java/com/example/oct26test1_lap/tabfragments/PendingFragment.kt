package com.example.oct26test1_lap.tabfragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.oct26test1_lap.CustomAdapter
import com.example.oct26test1_lap.ItemsViewModel
import com.example.oct26test1_lap.R
import com.google.android.material.tabs.TabLayout

class PendingFragment : Fragment() {

     lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pending, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // getting the recyclerview by its id
        recyclerView = view.findViewById(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerView.layoutManager = LinearLayoutManager(context)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        /*for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item " + i))
        }*/

        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "Arun","Flat No.1",1000,"kannur", "Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "Anjana","Flat No.2",2000,"kollam","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "Seena","Flat No.3",2000,"kannur","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "Midhun","Flat No.22",1000,"alapuzha","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "Alen","Flat No.11",500,"kollam","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "Pradeep","House No.2",500,"kottayam","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "Arun","House No.1",700,"alapuzha","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "meenu","Flat No.177",1000,"kannur","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "swathi","Flat No.571",300,"wayanad","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "jacob","Flat No.114",1000,"wayanad","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "soorya","Flat No.178",3050,"wayanad","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "james","Flat No.163",1000,"kannur","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "jackson","Flat No.141",400,"thrissur","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "titus","Flat No.13",1000,"kannur","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "rintu","Flat No.114",4000,"thrissur","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "anju","Flat No.11",8000,"kollam","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "joshna","Flat No.13",2400,"idukki","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "ambili","Flat No.187",600,"idukki","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "remya","Flat No.177",2900,"idukki","Pending"))
        data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "vishnu","Flat No.122",700,"kollam","Pending"))








        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter


    }
}