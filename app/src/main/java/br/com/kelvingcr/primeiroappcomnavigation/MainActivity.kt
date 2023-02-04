package br.com.kelvingcr.primeiroappcomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import br.com.kelvingcr.primeiroappcomnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            findNavController(binding.fragmentContainerView.id).navigate(R.id.action_homeFragment_to_loginFragment)
        }

        binding.btnPanel.setOnClickListener {
            findNavController(binding.fragmentContainerView.id).navigate(R.id.action_global_panelFragment)
        }
    }
}