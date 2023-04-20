import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class BlocoAnotacoes {

    private ArrayList<Anotacao> anotacao = new ArrayList<>();

    public BlocoAnotacoes() {
    }

    public BlocoAnotacoes(ArrayList<Anotacao> anotacao) {
        this.anotacao = anotacao;
    }

    public void inserir(Anotacao anotacao){
        this.anotacao.add(anotacao);
    }

    public Anotacao buscarTitulo(String titutlo){

        Anotacao nota= null;
        for(Anotacao anotacoes : anotacao){
            if(titutlo.compareTo(anotacoes.getTitulo())==0)
                nota = anotacoes;
        }

        if(nota!=null)
            return nota;
        else
            return null;
    }

    public boolean criarDiretorio(String nome){

        File diretorio =  new File("C:\\Users\\thale\\Desktop",nome);
        if(!diretorio.exists())
        {
            diretorio.mkdir();
            return true;
        }
        else
            return false;

    }

    public boolean deletar(Anotacao nota){

        int pos = anotacao.indexOf(nota);

        if(pos!=-1)
        {
            anotacao.remove(pos);
            return true;
        }
        else
            return false;

    }
    public void armazenar(String nome){
        try {
            File arquivo = new File("C:\\Users\\thale\\Desktop\\Bloco",nome+".txt");
            FileWriter f = new FileWriter(arquivo);


            for(Anotacao at : anotacao){
                f.append(at.getTitulo());
                f.append("\n");
                f.append("\n");
                f.append(at.getTexto());
                f.append("\n");
                f.append("\n");
                f.append(at.getData().toString());
                f.append("\n");
                f.append("\n");
            }

            f.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
    @Override
    public String toString() {
        return anotacao+"\n";
    }
}


