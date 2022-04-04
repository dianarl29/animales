package com.example.animales;

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView



class TipoAdapter(context: Context) :
    RecyclerView.Adapter<TipoAdapter.TipoViewHolder>(){

    val tipo = context.resources.getStringArray(R.array.Tipos).toList()

    class TipoViewHolder(val view:View) :RecyclerView.ViewHolder(view){
        val button=view.findViewById<Button>(R.id.button_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipoViewHolder {

        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent,false)

        layout.accessibilityDelegate = Accessibility

        return TipoViewHolder(layout)
    }

    override fun onBindViewHolder(holder: TipoAdapter, TipoViewHolder, position: Int) {
        val item = tipo.get(position)

        val context = holder.view.context

    }

    override fun getItemCount(): Int = tipo.size {

        companion object Accessibility : View.AccessibilityDelegate() {
            @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
            override fun onInitializeAccessibilityNodeInfo(
                host: View?,
                info: AccessibilityNodeInfo?
            ) {
                super.onInitializeAccessibilityNodeInfo(host, info)
                // With `null` as the second argument to [AccessibilityAction], the
                // accessibility service announces "double tap to activate".
                // If a custom string is provided,
                // it announces "double tap to <custom string>".
                val customString = host?.context?.getString(R.string.look_up_tipo)
                val customClick =
                    AccessibilityNodeInfo.AccessibilityAction(
                        AccessibilityNodeInfo.ACTION_CLICK,
                        customString
                    )
                info?.addAction(customClick)
            }

    }

}