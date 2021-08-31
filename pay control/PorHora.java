public final class PorHora extends Empregado 
{
    private double valor; // salario por hora
    private double horas; // horas trabalhadas (300 no maximo)
    
    public PorHora(String n, String f, double v, double h)
    {
        super(n,f);
        setValor(v);
        setHoras(h);
    }

    public void setValor(double v) { valor = (v > 0 ? v : 0.0); }
    public void setHoras(double h) { horas = (h >= 0 && h <= 300 ? h : 0.0); }
    
    // IMplementação do método abstrato de super classe

    public double ganha() {
        return valor*horas;
    }

    public String toString() {
        return "Por hora: " + super.toString();
    }
}
