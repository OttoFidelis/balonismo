import javax.swing.JOptionPane;
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
        //Saída


        System.out.println("Credenciais do Gerialdo");
        System.out.println("Nome: "+p1.getNome());
        System.out.println("CPF: "+p1.getCpf());
        System.out.println("RG: "+p1.getRg());
        System.out.println("Telefone: "+p1.getTelefone());
        System.out.println("Telefone do familiar: "+p1.getTelefone_parente());
        System.out.println("Endereço: "+p1.getEndereco());

        System.out.println(" ");
        System.out.println("Credenciais da Childete");
        System.out.println("Nome: "+p2.getNome());
        System.out.println("CPF: "+p2.getCpf());
        System.out.println("RG: "+p2.getRg());
        System.out.println("Telefone: "+p2.getTelefone());
        System.out.println("Telefone do familiar: "+p2.getTelefone_parente());
        System.out.println("Endereço: "+p2.getEndereco());

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
