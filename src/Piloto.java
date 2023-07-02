public class Piloto {
    private long cpf;
    private long n_anac;
    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getN_anac() {
        return n_anac;
    }

    public void setN_anac(long n_anac) {
        this.n_anac = n_anac;
    }

    long n_anac;
}
Piloto(
        long cpf,
        long n_anac
){
    this.cpf=cpf;
    this.n_anac=n_anac;
}