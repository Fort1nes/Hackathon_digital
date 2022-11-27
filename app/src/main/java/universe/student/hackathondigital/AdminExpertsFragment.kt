package universe.student.hackathondigital

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import universe.student.hackathondigital.databinding.FragmentAdminExpertsBinding
import universe.student.hackathondigital.databinding.FragmentExpertAnswersBinding


class AdminExpertsFragment : Fragment(R.layout.fragment_admin_experts) {

    private lateinit var binding: FragmentAdminExpertsBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var expertsList: ArrayList<Experts>
    private lateinit var expertsAdapter: ExpertsAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentAdminExpertsBinding.bind(view)

        binding.btnOrders.setOnClickListener {
            findNavController().navigate(R.id.action_adminExpertsFragment_to_adminOrdersFragment)
        }

        binding = FragmentAdminExpertsBinding.bind(view)

        recyclerView = binding.recyclerExperts
        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = LinearLayoutManager(activity)
        expertsList = ArrayList()

        expertsList.add(Experts("Иванов Иван Иванович", "rabotnik@mail.ru"))
        expertsList.add(Experts("Сергеев Сергей Сергеевич", "rabotnik_second@mail.ru"))
        expertsList.add(Experts("Sample Sample Sample", "rabotnik_sample@mail.ru"))
        expertsList.add(Experts("Sample Sample Sample", "rabotnik_sample@mail.ru"))
        expertsList.add(Experts("Sample Sample Sample", "rabotnik_sample@mail.ru"))
        expertsList.add(Experts("Sample Sample Sample", "rabotnik_sample@mail.ru"))

        expertsAdapter = ExpertsAdapter(expertsList)
        recyclerView.adapter = expertsAdapter
    }
}