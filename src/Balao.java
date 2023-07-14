public class Balao {
    private int numero_id;
    private int regis_regularidade;
    public int getNumero_id() {
        return numero_id;
    }

    public void setNumero_id(int numero_id) {
        this.numero_id = numero_id;
    }

    public int getRegis_regularidade() {
        return regis_regularidade;
    }

    public void setRegis_regularidade(int regis_regularidade) {
        this.regis_regularidade = regis_regularidade;
    }
    Balao( int numero_id, int regis_regularidade){
        this.numero_id = numero_id;
        this.regis_regularidade = regis_regularidade;
    }
}
