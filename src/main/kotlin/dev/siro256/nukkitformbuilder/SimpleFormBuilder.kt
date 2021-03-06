package dev.siro256.nukkitformbuilder

import cn.nukkit.form.element.ElementButton
import cn.nukkit.form.window.FormWindowSimple

@Suppress("unused")
class SimpleFormBuilder: FormBuilder() {
    private var displayMessage = ""
    private val buttons = mutableListOf<ElementButton>()

    override fun build(): FormWindowSimple {
        return FormWindowSimple(title, displayMessage, buttons)
    }

    fun addButton(button: ElementButton): SimpleFormBuilder {
        buttons.add(button)
        return this
    }

    fun setDisplayMessage(message: String): SimpleFormBuilder {
        displayMessage = message
        return this
    }
}
