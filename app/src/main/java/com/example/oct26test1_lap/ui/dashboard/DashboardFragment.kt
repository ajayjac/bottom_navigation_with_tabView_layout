package com.example.oct26test1_lap.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.oct26test1_lap.CustomAdapter
import com.example.oct26test1_lap.ItemsViewModel
import com.example.oct26test1_lap.R
import com.example.oct26test1_lap.ReportAdapter
import com.example.oct26test1_lap.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    lateinit var recyclerView3: RecyclerView

    private var _binding: FragmentDashboardBinding? = null

    private lateinit var OnItemSelectedListener: AdapterView.OnItemSelectedListener
    lateinit var adapter: ArrayAdapter<String>

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.txtView
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // access the items of the list
        val location = resources.getStringArray(R.array.Locations)


        // access the spinner
        val spinner = view.findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = getActivity()?.let {
                ArrayAdapter(
                    it.getBaseContext(),
                    android.R.layout.simple_spinner_item, location)
            }
            spinner.adapter = adapter

            // getting the recyclerview by its id
            recyclerView3 = view.findViewById(R.id.recyclerview3)

            // this creates a vertical layout Manager
            recyclerView3.layoutManager = LinearLayoutManager(context)

            // ArrayList of class ItemsViewModel
            val data = ArrayList<ItemsViewModel>()

            // This loop will create 20 Views containing
            // the image with the count of view
            /*for (i in 1..20) {
                data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "Item " + i))
            }*/




            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View?, position: Int, id: Long) {
                    Toast.makeText(activity,
                        getString(R.string.selected_item) + " " +
                                "" + location[position], Toast.LENGTH_SHORT).show()


                    when(location[position]){
                        "Kollam" ->{
                            data.clear()
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "anju","Flat No.11",8000,"kollam",""))
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "vishnu","Flat No.122",700,"kollam",""))
                            // This will pass the ArrayList to our Adapter
                            val adapter2 = ReportAdapter(data)

                            // Setting the Adapter with the recyclerview
                            recyclerView3.adapter = adapter2 }
                        "Idukki" ->{
                            data.clear()
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "joshna","Flat No.13",2400,"idukki",""))
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "ambili","Flat No.187",600,"idukki",""))
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "remya","Flat No.177",2900,"idukki",""))
                            // This will pass the ArrayList to our Adapter
                            val adapter2 = ReportAdapter(data)

                            // Setting the Adapter with the recyclerview
                            recyclerView3.adapter = adapter2 }

                        "Kottayam" ->{
                            data.clear()
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "Pradeep","House No.2",500,"kottayam",""))
                            // This will pass the ArrayList to our Adapter
                            val adapter2 = ReportAdapter(data)

                            // Setting the Adapter with the recyclerview
                            recyclerView3.adapter = adapter2 }

                        "Alapuzha" ->{
                            data.clear()
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "Midhun","Flat No.22",1000,"alapuzha",""))
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "Arun","House No.1",700,"alapuzha",""))
                            // This will pass the ArrayList to our Adapter
                            val adapter2 = ReportAdapter(data)

                            // Setting the Adapter with the recyclerview
                            recyclerView3.adapter = adapter2 }

                        "Thrissur" ->{
                            data.clear()
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "rintu","Flat No.114",4000,"thrissur",""))

                            // This will pass the ArrayList to our Adapter
                            val adapter2 = ReportAdapter(data)

                            // Setting the Adapter with the recyclerview
                            recyclerView3.adapter = adapter2 }

                        "Kannur" ->{
                            data.clear()
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "titus","Flat No.13",1000,"kannur",""))
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "Seena","Flat No.3",2000,"kannur",""))
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "Arun","Flat No.1",1000,"kannur", ""))
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "meenu","Flat No.177",1000,"kannur",""))
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "james","Flat No.163",1000,"kannur",""))

                            // This will pass the ArrayList to our Adapter
                            val adapter2 = ReportAdapter(data)

                            // Setting the Adapter with the recyclerview
                            recyclerView3.adapter = adapter2 }
                        "Wayanad" ->{
                            data.clear()
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "swathi","Flat No.571",300,"wayanad",""))
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "jacob","Flat No.114",1000,"wayanad",""))
                            data.add(ItemsViewModel(R.drawable.ic_home_black_24dp, "", "soorya","Flat No.178",3050,"wayanad",""))

                            // This will pass the ArrayList to our Adapter
                            val adapter2 = ReportAdapter(data)

                            // Setting the Adapter with the recyclerview
                            recyclerView3.adapter = adapter2 }


                    }



                }

                override fun onNothingSelected(parent: AdapterView<*>) {

                }


            }
        }

    }
}