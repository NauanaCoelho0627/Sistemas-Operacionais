/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.jswing.sprint2.log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author NauanaCoelhodosSanto
 */
public class GerationLog {
          public static void gerarLog(String mensagem) throws IOException{
          LogInformacoes logInfo = new LogInformacoes();
        
        //criando a pasta
            Path direct = Paths.get("C:\\logs");
        
            if(!Files.exists(direct)){
                Files.createDirectories(direct);
            }
            
            String nome = "C:\\logs\\"+logInfo.getDataAtual()+logInfo.getHoraAtual()+"log.txt";
              System.out.println(nome);
            
            
            //criando o arquivo
            File log = new File(nome);
        
                if(!log.exists()){
                    log.createNewFile();
                }
                
            
            FileWriter fw = new FileWriter(log, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(mensagem);
            bw.newLine();
            bw.close();
            fw.close();
        
    }
}
