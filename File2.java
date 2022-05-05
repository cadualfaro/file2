/*
Atividade 2

Vamos praticar!!
▪ Faça uma função que recebe um path de um arquivo de texto e conta quantas linhas tem
no arquivo
▪ Se o arquivo não existe, isso deve ser informado na tela
 */
package file2;

import java.io.*;
import java.util.Scanner;

public class File2 {

    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\Public\\Documents\\file2.txt");
            Scanner my_scan = new Scanner (System.in);
            
        int i,j = 1;
        
        System.out.println("Digite a quantidade de caracteres a ser inserida no documento: ");
            int carac = my_scan.nextInt();
                System.out.println("");
        
            try {
            
                FileWriter wf = new FileWriter (arquivo);
                    PrintWriter wp = new PrintWriter (wf);
            
            while(j >= 1 && j <= carac){
                wp.printf("%d\n",j);
                    j++;
        }
            wf.close();
            
            FileReader lerarquivo = new FileReader(arquivo);
                BufferedReader ler = new BufferedReader(lerarquivo);
                    String linha = ler.readLine();
            
            for(i = 0; linha != null; i++){
                System.out.println("Linha "+linha);
                    linha = ler.readLine();
        }
            System.out.println("\nA quantidade de linhas e: "+i);
                lerarquivo.close();

        } 
            catch (IOException ex) {
                System.out.println("Arquivo Inexistente");
        }
        
    }
    
}
