package cp1;
public class Contador {

    private int contador;

    public Contador(int contador) {
        this.contador = contador;
        System.out.println("Novo contador criado: " + this.contador);
    }

    public void zerarContador() {
        this.contador = 0;
    }

    public void incrementarContador() {
        this.contador++;
    }

    public void decrementarContador() {
        this.contador--;
    }

    public void valorAtualContador() {
        System.out.println("Contador: " + this.contador);
    }


    public static void main(String[] args) {
        Contador contador1 = new Contador(1);
        contador1.zerarContador();
        contador1.valorAtualContador();
        contador1.incrementarContador();
        contador1.valorAtualContador();
        contador1.decrementarContador();
        contador1.valorAtualContador();
    }
}
