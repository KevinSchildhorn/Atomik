package com.kevinschildhorn.android.ui.screens.xml

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.kevinschildhorn.android.databinding.ColorSampleViewBinding
import com.kevinschildhorn.atomik.DesignSystem
import com.kevinschildhorn.atomik.ExperimentalAtomik
import com.kevinschildhorn.atomik.atomic.atoms.xml.applyColorAtom
import com.kevinschildhorn.atomik.atomic.atoms.xml.applyTextAtom
import com.kevinschildhorn.common.design.theme.kevinrestart.ScaffoldingAtoms
import com.kevinschildhorn.common.design.theme.kevinrestart.atoms.ColorSampleAtoms

/*
 * View to show samples of ColorAtoms being added to Views
 */
@OptIn(ExperimentalAtomik::class)
internal class ColorSampleView
@JvmOverloads constructor(
    context: Context,
    designSystem: DesignSystem? = null,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val binding: ColorSampleViewBinding

    init {
        binding = ColorSampleViewBinding.inflate(LayoutInflater.from(context), this, true)
        initHeaders()
        binding.simpleImage.applyColorAtom(ColorSampleAtoms.simpleSquareAtom)
        binding.textView.applyColorAtom(ColorSampleAtoms.simpleSquareAtom)
    }

    private fun initHeaders() {
        binding.titleView.applyTextAtom(ScaffoldingAtoms.headerTitle)
        val subtitleAtom = ScaffoldingAtoms.headerSubtitle
        binding.simpleTitle.applyTextAtom(subtitleAtom)
        binding.textViewTitle.applyTextAtom(subtitleAtom)
        binding.buttonTitle.applyTextAtom(subtitleAtom)
    }
}