package com.projeto.impacto.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDataHora {
    public static String FormatDateParaDataHora(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        return formatador.format(data);
    }
}
