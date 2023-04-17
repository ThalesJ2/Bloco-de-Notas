import javafx.util.converter.LocalDateTimeStringConverter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BlocoApp {

    public static void main(String[] args) throws IOException, InterruptedException {
        BlocoAnotacoes b1 = new BlocoAnotacoes();
        ArrayList<Anotacao> a1 = new ArrayList<>();
        Scanner scanf = new Scanner(System.in);
        String titulo,texto,nome,file;
        int cont =0 ;
        System.out.println("Titulo:   ");
        titulo =  scanf.nextLine();

        while(titulo != ""){

            System.out.println("\nTexto:  ");
            texto = scanf.nextLine();

            a1.add(new Anotacao(titulo,texto));
            b1.inserir(a1.get(cont));
            System.out.println("Titulo:   ");
            titulo =  scanf.nextLine();
            cont++;
        }
        System.out.println("\nNome do diretorio");
        nome = scanf.nextLine();
        if(b1.criarDiretorio(nome))
            System.out.println("criado com sucesso");
        else
            System.out.println("O diretorio ja existe");

        System.out.println("\nNome do arquivo  ");
        file = scanf.nextLine();

        b1.armazenar(file);
    }

}
