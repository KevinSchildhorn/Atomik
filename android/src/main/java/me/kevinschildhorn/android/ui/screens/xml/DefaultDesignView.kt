package me.kevinschildhorn.android.ui.screens.xml

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.view.setPadding
import me.kevinschildhorn.android.databinding.SampleViewBinding
import me.kevinschildhorn.atomik.DesignSystem
import me.kevinschildhorn.atomik.atomic.atoms.xml.applyColorAtom
import me.kevinschildhorn.atomik.atomic.atoms.xml.applyTextAtom
import me.kevinschildhorn.common.design.theme.kevinrestart.errorViewAtom

internal class DefaultDesignView @JvmOverloads constructor(
    context: Context,
    designSystem: DesignSystem? = null,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr) {

    private val binding: SampleViewBinding

    init {
        binding = SampleViewBinding.inflate(LayoutInflater.from(context), this, true)
        initErrorView()
        //initCard()
        //initImage()
    }

    private fun initErrorView() = with(binding.errorView) {
        val textViewAtom = errorViewAtom
        applyColorAtom(textViewAtom)

        applyTextAtom(textViewAtom.subAtom())
        this.text = "Hello World"
/*
        setTextSize(TypedValue.COMPLEX_UNIT_SP, 14F)
        setTextColor(android.graphics.Color.BLACK)
        setBackgroundColor(android.graphics.Color.RED)

        setPadding((context.resources.displayMetrics.density * 8).toInt())

 */
    }

    private fun initCard() = with(binding.cardView) {
        cardElevation = 10F
        setPadding((context.resources.displayMetrics.density * 15).toInt())

        binding.cardLayout.setPadding((context.resources.displayMetrics.density * 15).toInt())
    }

    private fun initImage() = with(binding.imageView) {
        val dimensionInDp = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            200F,
            resources.displayMetrics
        ).toInt()
        layoutParams = LinearLayoutCompat.LayoutParams(
            dimensionInDp,
            LinearLayoutCompat.LayoutParams.WRAP_CONTENT
        )
        adjustViewBounds = true
        scaleType = ImageView.ScaleType.CENTER_CROP
    }
}
