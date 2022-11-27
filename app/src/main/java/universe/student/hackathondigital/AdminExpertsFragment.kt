package universe.student.hackathondigital

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import universe.student.hackathondigital.databinding.FragmentAdminExpertsBinding


class AdminExpertsFragment : Fragment(R.layout.fragment_admin_experts) {

    private lateinit var binding: FragmentAdminExpertsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentAdminExpertsBinding.bind(view)

        binding.btnOrders.setOnClickListener {
            findNavController().navigate(R.id.action_adminExpertsFragment_to_adminOrdersFragment)
        }
    }
}