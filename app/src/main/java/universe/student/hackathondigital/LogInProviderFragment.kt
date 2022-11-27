package universe.student.hackathondigital

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import universe.student.hackathondigital.databinding.FragmentLogInProviderBinding
import universe.student.hackathondigital.databinding.FragmentStartBinding


class LogInProviderFragment : Fragment(R.layout.fragment_log_in_provider) {

    private lateinit var binding: FragmentLogInProviderBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentLogInProviderBinding.bind(view)

        binding.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.action_logInProviderFragment_to_registrationFragment)
        }

        binding.btnLoginProvider.setOnClickListener {
            findNavController().navigate((R.id.action_logInProviderFragment_to_providerMainFragment))
        }
    }
}