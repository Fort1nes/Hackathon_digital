package universe.student.hackathondigital

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExpertsAdapter(private val ExpertsList: ArrayList<Experts>) : RecyclerView.Adapter<ExpertsAdapter.ExpertsViewHolder>() {
    class ExpertsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewName: TextView = itemView.findViewById(R.id.txt_name)
        val textViewEmail: TextView = itemView.findViewById(R.id.txt_email)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpertsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_expert, parent, false)
        return ExpertsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExpertsViewHolder, position: Int) {
        val expert = ExpertsList[position]
        holder.textViewName.text = expert.name
        holder.textViewEmail.text = expert.email
    }

    override fun getItemCount(): Int {
        return ExpertsList.size
    }
}