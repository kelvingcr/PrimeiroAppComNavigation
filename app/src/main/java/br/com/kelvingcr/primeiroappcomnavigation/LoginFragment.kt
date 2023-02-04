package br.com.kelvingcr.primeiroappcomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import br.com.kelvingcr.primeiroappcomnavigation.databinding.FragmentLoginBinding
import br.com.kelvingcr.primeiroappcomnavigation.databinding.FragmentRegisterBinding


class LoginFragment : Fragment() {

    private val binding by lazy { FragmentLoginBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       /* binding.btnBack.setOnClickListener {
            goBack()
        }

        */

        binding.btnJoin.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loginFragment_to_panelFragment)
        )

        binding.btnRegister.setOnClickListener {
            register()
        }

        println(findNavController().currentDestination)
    }

    private fun register() {
      //  findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
    }

    private fun goBack() {
        findNavController().popBackStack()
    }
}