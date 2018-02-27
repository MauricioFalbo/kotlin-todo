package com.falbo.todolist.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.falbo.todolist.R
import com.falbo.todolist.extension.formatoBrasileiro
import com.falbo.todolist.model.TodoModel
import kotlinx.android.synthetic.main.transacao_item.view.*
import java.text.SimpleDateFormat

/**
 * Created by Mauricio on 25/02/2018.
 */
class ListaTodoAdapter(ListaTodo: List<TodoModel>,
                       context: Context) : BaseAdapter() {

    private val ListaTodo = ListaTodo
    private val context = context

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val viewCriada = LayoutInflater.from(context).inflate(R.layout.transacao_item, p2, false)

        viewCriada.todo_descricao.setText(getItem(p0).descricao)
        viewCriada.todo_data.setText(getItem(p0).data.formatoBrasileiro())

        return viewCriada
    }

    override fun getItem(p0: Int): TodoModel {
        return ListaTodo[p0];
    }

    override fun getItemId(p0: Int): Long {
        return 0;
    }

    override fun getCount(): Int {
        return ListaTodo.size;
    }
}