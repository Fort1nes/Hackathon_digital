package universe.student.hackathondigital

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import universe.student.hackathondigital.databinding.FragmentLogInAdminBinding

class LogInAdminFragment : Fragment(R.layout.fragment_log_in_admin) {

    private lateinit var binding: FragmentLogInAdminBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentLogInAdminBinding.bind(view)

        binding.btnAdminMain.setOnClickListener {
            findNavController().navigate(R.id.action_logInAdminFragment_to_adminExpertsFragment)
        }
    }
}