public class Piloto {
    private String cpf;
    private long n_anac;

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getN_anac() {
        return this.n_anac;
    }

    public void setN_anac(long n_anac) {
        this.n_anac = n_anac;
    }

    Piloto(String cpf, long n_anac) {
        this.cpf = cpf;
        this.n_anac = n_anac;
    }
}

