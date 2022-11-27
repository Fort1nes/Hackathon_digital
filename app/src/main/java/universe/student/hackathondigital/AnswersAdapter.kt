package universe.student.hackathondigital

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnswersAdapter(private val AnswersList: ArrayList<Answers>) : RecyclerView.Adapter<AnswersAdapter.AnswersViewHolder>() {
    class AnswersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewName: TextView = itemView.findViewById(R.id.txt_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnswersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_answer, parent, false)
        return AnswersViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnswersViewHolder, position: Int) {
        val answer = AnswersList[position]
        holder.textViewName.text = answer.name
    }

    override fun getItemCount(): Int {
        return AnswersList.size
    }
}