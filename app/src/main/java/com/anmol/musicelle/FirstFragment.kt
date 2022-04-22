package com.anmol.musicelle

import android.app.Activity.RESULT_OK
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.anmol.musicelle.databinding.FragmentFirstBinding
import com.microsoft.projectoxford.face.FaceServiceRestClient
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream


class FirstFragment : Fragment(), View.OnClickListener {
    lateinit var autodetect: ImageButton
    lateinit var manualselect: ImageButton
    private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!
    var navc: NavController ?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navc = Navigation.findNavController(view)
//        manualselect.setOnClickListener{
//            requireActivity().run{
//                startActivity(this@FirstFragment.context, manual_select::class.java)
//                finish()
//            }
//        }
        view.findViewById<ImageButton>(R.id.manualselect).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.autodetect).setOnClickListener(this)

    }
    override fun onClick(v: View?) {
                val intent = Intent(this@FirstFragment.context, Auto_detect::class.java)
                startActivity(intent)
            }

}