package com.falbo.todolist.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.falbo.todolist.R
import com.falbo.todolist.model.TodoModel
import com.falbo.todolist.ui.adapter.ListaTodoAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.util.*

/**
 * Created by Mauricio on 25/02/2018.
 */
class ListaToDoActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_lista_transacoes)

        val todo: List<TodoModel> = listOf(
                TodoModel("Teste asbdjbas ashndjasndas", Calendar.getInstance()),
                TodoModel("Teste123", Calendar.getInstance()),
                TodoModel("Teste456", Calendar.getInstance()),
                TodoModel("Teste9087", Calendar.getInstance()),
                TodoModel("Teste", Calendar.getInstance()),
                TodoModel("Teste123", Calendar.getInstance()),
                TodoModel("Teste456", Calendar.getInstance()),
                TodoModel("Teste9087", Calendar.getInstance())
        )



        lista_transacoes_listview.setAdapter(ListaTodoAdapter(todo,this))

        lista_transacoes_adiciona_menu.setOnClickListener { Toast.makeText(this,"TESTE123",Toast.LENGTH_SHORT).show() }


    }
}