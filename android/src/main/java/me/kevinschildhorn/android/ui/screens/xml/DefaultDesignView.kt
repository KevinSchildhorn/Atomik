package me.kevinschildhorn.android.ui.screens.xml

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.TextView
import me.kevinschildhorn.android.databinding.SampleViewBinding


internal class DefaultDesignView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr) {

    private val binding: SampleViewBinding
    private val sampleText: TextView

    init {
        binding = SampleViewBinding.inflate(LayoutInflater.from(context), this, true)
        sampleText = binding.sampleText
    }
}
