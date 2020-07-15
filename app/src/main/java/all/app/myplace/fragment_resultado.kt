package all.app.myplace

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.myplace.R
import com.example.myplace.databinding.FragmentResultadoBinding

class fragment_resultado : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {this.activity?.title = "Resultados"
            val binding = DataBindingUtil.inflate<FragmentResultadoBinding>(inflater,
            R.layout.fragment_inicio,container, false)



        return binding.root
    }

}