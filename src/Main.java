
import java.security.MessageDigest;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //variáveis e construtores
        Pessoa p1 = new Pessoa("Gerialdo", "889.456.345-23", "945563254", 954466576L, 989399409L, "rua geriátrica, 64, Telescópolis");
        Pessoa p2 = new Pessoa("Childete", "386.586.490-27", "939857486", 954466576L, 989399409L, "rua geriátrica, 64, Telescópolis");
        Piloto pilot = new Piloto("398.889.289-98", 298L);
        Balao balao = new Balao(12, 321);
        //Scanner
        Scanner tcd = new Scanner(System.in);
        System.out.println("Digite se o cliente Gerialdo assinou o termo ( 1 para sim e 0 para não ): ");
        int tcd1 = tcd.nextInt();
        System.out.println("Digite se a cliente Childete assinou o termo ( 1 para sim e 0 para não ): ");
        int tcd2 = tcd.nextInt();
        //Saída
            System.out.println("Credenciais do Gerialdo");
            System.out.println("Nome: " + p1.getNome());
            System.out.println("CPF: " + p1.getCpf());
            System.out.println("RG: " + p1.getRg());
            System.out.println("Telefone: " + p1.getTelefone());
            System.out.println("Telefone do familiar: " + p1.getTelefone_parente());
            System.out.println("Endereço: " + p1.getEndereco());

        if (tcd1 == 1){
            System.out.println("Termo assinado");
        }
        else  if (tcd1 == 0){
            System.out.println("Termo não assinado");
        }
        else{
            System.out.println("Erro: input incorreto");
        }
            System.out.println(" ");


            System.out.println("Credenciais da Childete");
            System.out.println("Nome: " + p2.getNome());
            System.out.println("CPF: " + p2.getCpf());
            System.out.println("RG: " + p2.getRg());
            System.out.println("Telefone: " + p2.getTelefone());
            System.out.println("Telefone do familiar: " + p2.getTelefone_parente());
            System.out.println("Endereço: " + p2.getEndereco());

        if (tcd2 == 1){
            System.out.println("Termo assinado");
        }
        else  if (tcd2 == 0){
            System.out.println("Termo não assinado");
        }
        else{
            System.out.println("Erro: input incorreto");
        }

        System.out.println(" ");

        if (tcd1 ==1 && tcd2==1 ){
            System.out.println("Os dois clientes podem entrar no balão");
        }
        if (tcd1 == 1 && tcd2 !=1){
            System.out.println("Apenas Gerialdo pode entrar no balão");
        }
        if (tcd1 !=1 && tcd2==1){
            System.out.println("Apenas Childete pode entrar no balão");
        }
        if (tcd1 != 1 && tcd2 !=1 ){
            System.out.println("Nenhum dos dois clientes podem entrar no balão");
        }
        System.out.println(" ");
        System.out.println("Credenciais do piloto");
        System.out.println("CPF: "+pilot.getCpf());
        System.out.println("Número ANAC: "+pilot.getN_anac());
        System.out.println(" ");
        System.out.println("Credenciais do balão");
        System.out.println("Número de identificação: "+balao.getNumero_id());
        System.out.println("Registro de regularidade: "+balao.getRegis_regularidade());
    }
}
