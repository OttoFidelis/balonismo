public class Main {
    public static void main(String[] args){
     Pessoa p1;
     Piloto piloto;
     Balao balao;

     p1 = new Pessoa("Gerialdo", "889.456.345-23",945563254,954466576,"rua geriátrica, 64, Telescópolis","Termo assinado");
     p1.getNome = "Gerivaldo";
     p1.getCpf = "889.456.345-23";
     p1.getTelefone = 945563254;
     p1.getTelefone_parente = 954466576;
     p1.getEndereco = "rua geriátrica, 64, Telescópolis";
     p1.getTermo="Termo assinado";
     p1.pagar();

     Pessoa p2 = new Pessoa("Childete","386.586.490-27",939857486,954466576,"rua geriátrica, 64, Telescópolis","Termo assinado");
     p2.getNome = "Childete";
     p2.getCpf = "386.586.490-27";
     p2.getTelefone = 939857486;
     p2.getTelefone_parente = 954466576;
     p2.getEndereco = "rua geriátrica, 64, Telescópolis";
     p2.getTermo="Termo assinado";
     p2.pagar();

     piloto = new Piloto(13224334231,23);
     piloto.getCpf = 13224334231;
     piloto.getN_anac = 23;

     balao = new Balao(132,534);
     balao.getNumero_id = 132;
     balao.getRegis_regularidade = 534;
    }
}