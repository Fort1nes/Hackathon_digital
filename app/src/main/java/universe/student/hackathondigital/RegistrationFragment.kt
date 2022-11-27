package universe.student.hackathondigital

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import universe.student.hackathondigital.databinding.FragmentRegistrationBinding
import universe.student.hackathondigital.databinding.FragmentStartBinding

class RegistrationFragment : Fragment(R.layout.fragment_registration) {

    private lateinit var binding: FragmentRegistrationBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentRegistrationBinding.bind(view)

        binding.btnRegister.setOnClickListener{
            findNavController().navigate(R.id.action_registrationFragment_to_logInProviderFragment)
        }
    }
}