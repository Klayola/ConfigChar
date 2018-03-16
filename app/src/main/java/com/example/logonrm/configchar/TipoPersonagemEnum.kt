package com.example.logonrm.configchar

/**
 * Created by logonrm on 16/03/2018.
 */

enum class TipoPersonagemEnum constructor(val id: Int){
    ANAO(0),
    ARQUEIRO(2),
    ELFO(3),
    GUERREIRO(4),
    BARDO(5),
    MAGO(6);

    companion object {
        fun from(findValue: Int): TipoPersonagemEnum = TipoPersonagemEnum.values().first(){it.id == findValue}
    }
}