import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        int c;
        String sergio,base;

        /*
        Leitura do arquivo recebendo todos os bytes dele e passando para
        uma string

        -----------------------------------------------------------------------
        Path path = Paths.get("D:/LearningDev/JavaOO/gravarq/src/arq/arm.txt");
        byte[] bytes = Files.readAllBytes(path);
        String content = new String(bytes);
        System.out.println(content);
        -----------------------------------------------------------------------
         */


        /*


        Código mais moderno e simplificado, utilizando o método readString()
        da Classe Files

        -----------------------------------------------------------------------
        Path path = Path.of("D:/LearningDev/JavaOO/gravarq/src/arq/arm.txt");
        String content = Files.readString(path);
        System.out.println(content);
        -----------------------------------------------------------------------
         */


         
        //Intanciando o escritor
        PrintWriter w = new PrintWriter("D:/LearningDev/JavaOO/gravarq/src/arq/arm.txt");
        
        do{
            
            sergio = JOptionPane.showInputDialog(null, "dasd");
            w.println(sergio);
            
            c = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        }while(c==0);
        w.close();

        

    }
}
