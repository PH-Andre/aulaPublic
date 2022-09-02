package model;

public class Contato {
    private int id;
    private String nome;
    private String endereco;
    private String email;

    public Contato(){}

    public Contato(int id, String nome,  String email, String rua_p) {
        this.id = id;
        this.nome = nome;
        this.endereco = rua_p;
        this.email = email;
    }

    public Contato(String nome,  String email, String rua_p) {
        this.nome = nome;
        this.endereco = rua_p;
        this.email = email;
    }

    public void  setId(int id){
        this.id = id;
    }
    public void  setNome(String nome){
        this.nome = nome;
    }
    public void  setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void  setEmail(String email){
        this.email = email;
    }

    public int getId(){
        return this.id;
    }
     public String getNome(){
        return this.nome;
     }
     public String getEndereco(){
        return this.endereco;
     }
     public String getEmail(){
        return this.email;
     }

    @Override
    public String toString() {
        return
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
