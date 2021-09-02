//Ex

//Sem encapsulamento
class NaoEncapsulado { //implicitamentamente há modificador de acesso, mas não é o mais restritivo
int semProteção;
}
public class TesteNaoEncapsulado {
public static void main(String[] args) {
NãoEncapsulado ne = new NãoEncapsulado(); //ne é uma instância de NãoEncapsulado
ne.semProtecao = 10; //acesso direto ao atributo
System.out.println("Valor sem proteção: " + ne.semProteção); //acesso direto aos atributos
}
}
// Com encapsulamento
class Encapsulado { //private é um modificador de acesso de restrição máxima
private int comProteção;
public void setComProteção(int comProteção) {
this.comProteção= comProteção;
}
public int getComProteção () {
return this.comProteção;
}
}
public class TesteEncapsulado {
public static void main(String[] args) {
Encapsulado e = new Encapsulado(); // O Objeto "e" é uma instância de Encapsulado
e.comProteção = 10; //deve-se acessar o atributos de forma indireta, encapsulada
e.setComProteção (10);
System.out.println("Valor com proteção: " + e.getComProteção ());
}
}

// Metodos Get's e Set's
/* é preciso criar um mecanismo para acessar os campos private de uma classe. Para isso, é comum
fornecer métodos públicos para acessar as informações encapsuladas. Estes métodos são chamados de set e get.
O método set atribui valores ao atributo, enquanto que o método get obtém seus valores.
A composição do nome destes métodos é sempre com o nome set + <nome atributo> ou get + <nome atributo>. */


