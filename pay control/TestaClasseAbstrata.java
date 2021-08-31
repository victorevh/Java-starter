import java.text.DecimalFormat;

public class TestaClasseAbstrata
{
    public static void main ( String args[] )
    {
        Empregado e;   // variavel de referencia da superclasse
        String sai = "";
        DecimalFormat df = new DecimalFormat("0.00");
        Chefe c = new Chefe ("Joao", "Silva", 3000.00);
        PorComissao pc = new PorComissao ("Maria", "Souza", 400.00, 3.00, 150);
        PorItem pi = new PorItem("Pedro", "Cabral", 2.50, 200);
        PorHora ph = new PorHora("Victor", "Oliveira", 30.2, 100);
        e = c; //recupera as caracteristicas de chefe
        sai += e.toString() + " ganha $" + df.format(e.ganha() ) + "\n";
        e = pc; // recupera as caracteristicas de PorComissao
        sai += e.toString() + " ganha $" + df.format(e.ganha() ) + "\n";
        e = pi; // recupera as caracteristicas de PorItem
        sai += e.toString() + " ganha $" + df.format(e.ganha() ) + "\n";
        e = ph; // recupera as características de PorHora
        sai += e.toString() + " ganha $" + df.format(e.ganha() ) + "\n";
        System.out.println(sai);
    }
}
