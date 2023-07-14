import org.w3c.dom.ls.LSOutput;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
       Pessoa p1 = new Pessoa ("Gerialdo", "889.456.345-23", "945563254", 954466576L, 989399409L, "rua geriátrica, 64, Telescópolis", "Termo assinado");
       Pessoa p2 = new Pessoa("Childete", "386.586.490-27", "939857486", 954466576L, 989399409L, "rua geriátrica, 64, Telescópolis", "Termo assinado");
       Piloto pilot = new Piloto("398.889.289-98", 298L);
       Balao balao = new Balao(12, 321);
    }

}
