public class Pessoa {

    private String nome;
    private String cpf;
    private String rg;
    private long telefone;
    private long telefone_parente;
    private String endereco;
    private String termo;

    private String pagar;

    public void setPagar(String pagar) {
        this.pagar = pagar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getTelefone_parente() {
        return telefone_parente;
    }

    public void setTelefone_parente(long telefone_parente) {
        this.telefone_parente = telefone_parente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTermo() {
        return termo;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }

    public String getPagar() { return pagar;}
    Pessoa(
            String nome,
            String cpf,
            String rg,
            long telefone,
            long telefone_parente,
            String endereco
    ){
        this.nome=nome;
        this.cpf=cpf;
        this.rg=rg;
        this.telefone=telefone;
        this.telefone_parente=telefone_parente;
        this.endereco=endereco;
    }
}
