import java.io.Serializable;
import java.util.ArrayList;


public class Planet implements Serializable {
    private String nome;
    private String descricao;
    private String aparicao;
    private ArrayList<String> nativos = new ArrayList<String>();
    private int populacao;

    public String getNome(){ return this.nome; }
    public void setNome(String arg){ this.nome = arg; }

    public String getDescricao(){ return this.descricao; } 
    public void setDescricao(String arg){ this.descricao = arg; }

    public String getAparicao(){ return this.aparicao; }
    public void setAparicao(String arg){ this.aparicao = arg; }

    public ArrayList<String> getNativos(){ return this.nativos; }
    public void addNativos(String arg){ this.nativos.add(arg); }
    public void removeNativos(int index){ this.nativos.remove(index); }

    public int getPopulacao(){ return this.populacao; }
    public void setPopulacao(int arg){ this.populacao = arg; }
}