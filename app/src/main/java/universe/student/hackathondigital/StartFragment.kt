package universe.student.hackathondigital

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import universe.student.hackathondigital.databinding.FragmentStartBinding

class StartFragment : Fragment(R.layout.fragment_start) {

    private lateinit var binding: FragmentStartBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentStartBinding.bind(view)

        binding.btnExpert.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_logInExpertFragment)
        }

        binding.btnProvider.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_logInProviderFragment)
        }

        binding.btnAdmin.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_logInAdminFragment)
        }
    }
}