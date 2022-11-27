package universe.student.hackathondigital

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OrdersAdapter(private val OrdersList: ArrayList<Orders>) : RecyclerView.Adapter<OrdersAdapter.OrdersViewHolder>() {

    var onItemClick : ((Orders) -> Unit)? = null

    class OrdersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewName: TextView = itemView.findViewById(R.id.txt_name)
        val textViewGoal: TextView = itemView.findViewById(R.id.txt_goal)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrdersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_order, parent, false)
        return OrdersViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrdersViewHolder, position: Int) {
        val person = OrdersList[position]
        holder.textViewName.text = person.name
        holder.textViewGoal.text = person.goal

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(person)
        }
    }

    override fun getItemCount(): Int {
        return OrdersList.size
    }
}