/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.jswing.sprint2.log;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author NauanaCoelhodosSanto
 */
public class LogInformacoes {
    private String dataAtual;
    private String horaAtual; 

    public LogInformacoes() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        dataAtual = dateTime.format(formatter);
        
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HHmmss");
        horaAtual = time.format(formatterTime);
    }
    
    

    public void getDataHora(){
        
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        dataAtual = dateTime.format(formatter);
        
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        horaAtual = time.format(formatterTime);
        
    }

    public String getDataAtual() {
        return dataAtual;
    }

    public String getHoraAtual() {
        return horaAtual;
    }
    
    

    @Override
    public String toString() {
        return String.format("-------------------------------------------------------------------------------\n" +
        ">Log Session: %s %s\n"
       +">System Info:\n"
       +"  Projec version:             = Airplane-Solutions-1.0.0\n"
       +"  Java version:               = Java 17.0.0\n"
       +"  Operating System:           = \n"
       +"  Processor:                  = \n"
       +"  CPU:                        = \n"
       +"  Memory:                     = \n"
       +"  Disk:                       = \n"
       +"  Warning:                    = ", dataAtual, horaAtual);
    }
    
}
