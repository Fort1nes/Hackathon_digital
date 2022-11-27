package universe.student.hackathondigital

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdminOrdersAdapter(private val AdminOrdersList: ArrayList<AdminOrders>) : RecyclerView.Adapter<AdminOrdersAdapter.AdminOrdersViewHolder>() {
    class AdminOrdersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewName: TextView = itemView.findViewById(R.id.txt_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdminOrdersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_admin_order, parent, false)
        return AdminOrdersViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdminOrdersViewHolder, position: Int) {
        val adminOrder = AdminOrdersList[position]
        holder.textViewName.text = adminOrder.name
    }

    override fun getItemCount(): Int {
        return AdminOrdersList.size
    }
}