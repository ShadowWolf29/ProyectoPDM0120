package com.example.myplace

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.myplace.databinding.FragmentInicioBinding
import kotlinx.android.synthetic.main.fragment_inicio.*

/**
 * A simple [Fragment] subclass.
 */
class Inicio : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this.activity?.title = "My place"
        val binding = DataBindingUtil.inflate<FragmentInicioBinding>(inflater, R.layout.fragment_inicio,container, false)
        binding.btnRegis.setOnClickListener{view:View->
            view.findNavController().navigate(R.id.action_inicio_to_fragment_registrate)
        }
        binding.btnIngresar.setOnClickListener{view:View->
            view.findNavController().navigate(R.id.action_inicio_to_buscador)
        }

        return binding.root
    }
    override fun onResume() {
        super.onResume()
        lblOlvido.setOnClickListener { view: View ->
            val builder =
                androidx.appcompat.app.AlertDialog.Builder(activity!!)

            val inflater = activity!!.layoutInflater
            val view = inflater.inflate(R.layout.dialog_olvido, null)

            builder.setView(view).setTitle("Olvido la contraseña")
                .setPositiveButton(
                    "Enviar"
                ) { dialogInterface, i -> }
            builder.show()
        }
    }

}
