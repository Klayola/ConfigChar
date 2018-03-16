package com.example.logonrm.configchar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.AdapterView
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_personagem.*

class PersonagemActivity : AppCompatActivity() {

    fun trocaImagem(idImagem:Int){
        ivClasse.setImageDrawable(ContextCompat.getDrawable(this, idImagem))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personagem)

        sbForca.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tvForca.text = progress.toString()
            }
        })

        spClasse.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

            }
        })

        spClasse.setOnItemClickListener { parent, view, position, id ->
            val tipoPersonagem = TipoPersonagemEnum.from(position)
            when(tipoPersonagem){
                TipoPersonagemEnum.ANAO  -> trocaImagem(R.drawable.anao)
                TipoPersonagemEnum.ARQUEIRO  -> trocaImagem(R.drawable.arquero)
                TipoPersonagemEnum.ELFO  -> trocaImagem(R.drawable.elfo)
                TipoPersonagemEnum.GUERREIRO  -> trocaImagem(R.drawable.guerreiro)
                TipoPersonagemEnum.MAGO  -> trocaImagem(R.drawable.mago)
                TipoPersonagemEnum.BARDO  -> trocaImagem(R.drawable.bardo)
            }

        }

        btCriar.setOnClickListener{
            Toast.makeText(this, "Usuário Criado", Toast.LENGTH_SHORT).show()
        }
    }
}
