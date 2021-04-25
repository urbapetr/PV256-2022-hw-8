package cz.muni.fi.pv256.hw8.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import cz.muni.fi.pv256.hw8.R
import cz.muni.fi.pv256.hw8.data.Character
import cz.muni.fi.pv256.hw8.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object {
        const val ITEM = "item"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent.extras?.apply {
            getParcelable<Character>(ITEM)?.apply {
                binding.img.load(image)
                binding.title.text = name
                binding.status.text = String.format(getString(R.string.status), status)
                binding.gender.text = String.format(getString(R.string.gender), gender)
                binding.species.text = String.format(getString(R.string.species), species)
                binding.location.text = String.format(getString(R.string.location), location.name)

                supportActionBar?.apply {
                    setDisplayShowTitleEnabled(true)
                    title = name
                }
            }
        }
    }
}
