import java.io.Serializable;

public class Spaceship implements Serializable {
    private String nome;
    private String modelo;
    private String aparicao;

    public String getNome(){ return this.nome; }
    public void setNome(String arg){ this.nome = arg; }

    public String getModelo(){ return this.modelo; }
    public void setModelo(String arg){ this.modelo = arg; }

    public String getAparicao(){ return this.aparicao; }
    public void setAparicao(String arg){ this.aparicao = arg; }

}