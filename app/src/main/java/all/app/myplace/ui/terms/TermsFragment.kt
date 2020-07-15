package all.app.myplace.ui.terms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.myplace.R

class TermsFragment : Fragment() {

    private lateinit var termsViewModel: TermsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        termsViewModel =
            ViewModelProviders.of(this).get(TermsViewModel::class.java)
        val root = inflater.inflate(R.layout.freagment_terminos, container, false)
        termsViewModel.text.observe(viewLifecycleOwner, Observer {
        })
        return root
    }
}