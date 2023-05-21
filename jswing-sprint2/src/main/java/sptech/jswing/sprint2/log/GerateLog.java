/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.jswing.sprint2.log;

import java.io.IOException;

/**
 *
 * @author NauanaCoelhodosSanto
 */
public class GerateLog {
    public static void main(String[] args) throws IOException {
        LogInformacoes log = new LogInformacoes();
        log.getDataHora();
        
        GerationLog.gerarLog(log.toString());

    } 
}
