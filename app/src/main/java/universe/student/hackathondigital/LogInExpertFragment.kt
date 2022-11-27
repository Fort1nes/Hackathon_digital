package universe.student.hackathondigital

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import universe.student.hackathondigital.databinding.FragmentLogInAdminBinding
import universe.student.hackathondigital.databinding.FragmentLogInExpertBinding


class LogInExpertFragment : Fragment(R.layout.fragment_log_in_expert) {

    private lateinit var binding: FragmentLogInExpertBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentLogInExpertBinding.bind(view)

        binding.btnExpertMain.setOnClickListener {
            findNavController().navigate(R.id.action_logInExpertFragment_to_expertOrdersFragment)
        }
    }
}