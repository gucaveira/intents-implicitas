package dominando.android.intentsimplicitas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dominando.android.intentsimplicitas.databinding.ActivityActionBinding


class ActionActivity : AppCompatActivity() {

    private var _binding: ActivityActionBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityActionBinding.inflate(layoutInflater)

        setContentView(binding.root)
        if (intent.action == Intent.ACTION_VIEW) {
            val uri = intent.data
            binding.txtAction.text = getString(R.string.custom_action2, uri.toString(), uri?.host, uri?.path)
        } else if (intent.action == "dominando.android.CUSTOM_ACTION") {
           binding.txtAction.text = getString(R.string.custom_action1)
        }
    }
}
