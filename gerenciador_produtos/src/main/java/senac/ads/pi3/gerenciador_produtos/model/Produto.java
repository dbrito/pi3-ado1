package senac.ads.pi3.gerenciador_produtos.model;

public class Produto {

    //Atributos    
    private Integer id;    
    private String nome;    
    private String descricao;
    private double precoCompra;
    private double precoVenda;
    private int quantidade;    
    

    
    //Métodos de acesso

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }               

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescrição(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double preco) {
        this.precoCompra = preco;
    }
    
    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double preco) {
        this.precoVenda = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }    
    
    public int getQuantidade() {
        return quantidade;
    }

    

   
}
