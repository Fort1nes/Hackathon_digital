package universe.student.hackathondigital

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import universe.student.hackathondigital.databinding.FragmentExpertAnswersBinding
import universe.student.hackathondigital.databinding.FragmentExpertOrdersBinding

class ExpertAnswersFragment : Fragment(R.layout.fragment_expert_answers) {

    private lateinit var binding: FragmentExpertAnswersBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var ordersList: ArrayList<Orders>
    private lateinit var ordersAdapter: OrdersAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}