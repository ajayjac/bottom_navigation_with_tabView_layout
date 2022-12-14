package com.example.oct26test1_lap

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(ItemsViewModel.image)

        // sets the text to the textview from our itemHolder class
        holder.textView.text = ItemsViewModel.text

        holder.person.text = ItemsViewModel.person_name

        holder.address.text = ItemsViewModel.address

        holder.amount.text = ItemsViewModel.amount.toString()

        holder.location.text = ItemsViewModel.location

        holder.state.text = ItemsViewModel.state

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)
        val person: TextView = itemView.findViewById(R.id.textView_person_name)
        val address: TextView = itemView.findViewById(R.id.textView_address)
        val amount: TextView = itemView.findViewById(R.id.textView_amount)
        val location: TextView = itemView.findViewById(R.id.textView_location)
        val state: TextView = itemView.findViewById(R.id.textView_pending)
    }
}
