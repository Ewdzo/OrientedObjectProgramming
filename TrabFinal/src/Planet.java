import java.io.Serializable;
import java.util.ArrayList;


public class Planet implements Serializable {
    private String nome;
    private String descricao;
    private String aparicao;
    private ArrayList<String> originarios = new ArrayList<String>();
    private int populacao;

    public String getNome(){ return this.nome; }
    public void setNome(String arg){ this.nome = arg; }

    public String getDescricao(){ return this.descricao; } 
    public void setDescricao(String arg){ this.descricao = arg; }

    public String getAparicao(){ return this.aparicao; }
    public void setAparicao(String arg){ this.aparicao = arg; }

    public ArrayList<String> getOriginarios(){ return this.originarios; }
    public void addOriginarios(String arg){ this.originarios.add(arg); }
    public void removeOriginarios(int index){ this.originarios.remove(index); }

    public int getPopulacao(){ return this.populacao; }
    public void setPopulacao(int arg){ this.populacao = arg; }
}