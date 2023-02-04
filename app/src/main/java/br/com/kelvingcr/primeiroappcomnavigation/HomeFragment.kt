package br.com.kelvingcr.primeiroappcomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import br.com.kelvingcr.primeiroappcomnavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Usando um facilitador
        //Commit
        //Branch
        binding.btnSignIn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_loginFragment)
        )

        binding.btnSignWithoutUser.setOnClickListener {
            signWithoutUser()
        }
    }

    private fun signWithoutUser() {
        findNavController().navigate(R.id.action_global_panelFragment)
    }


   /* private fun signIn() {
        findNavController().navigate(R.id.action_homeFragment_to_navigation_graph_auth2)
        //Acessa sem ação
       // findNavController().navigate(R.id.navigation_graph_auth)
    } */
}