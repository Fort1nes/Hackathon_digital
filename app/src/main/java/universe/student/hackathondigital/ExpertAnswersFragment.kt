package universe.student.hackathondigital

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import universe.student.hackathondigital.databinding.FragmentExpertAnswersBinding
import universe.student.hackathondigital.databinding.FragmentExpertOrdersBinding
import universe.student.hackathondigital.databinding.FragmentProviderMainBinding

class ExpertAnswersFragment : Fragment(R.layout.fragment_expert_answers) {

    private lateinit var binding: FragmentExpertAnswersBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var answersList: ArrayList<Answers>
    private lateinit var answersAdapter: AnswersAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentExpertAnswersBinding.bind(view)

        recyclerView = binding.recyclerAnswers
        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = LinearLayoutManager(activity)
        answersList = ArrayList()

        answersList.add(Answers("Организация Хакатона"))

        answersAdapter = AnswersAdapter(answersList)
        recyclerView.adapter = answersAdapter
    }
}