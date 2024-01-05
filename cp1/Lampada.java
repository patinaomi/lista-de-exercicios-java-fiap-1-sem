package cp1;

public class Lampada {
    boolean status;

    public Lampada(boolean status) {
        this.status = status;
        statusLampada();
    }

    public void acenderLampada() {
        if (this.status) {
            System.out.println("A lâmpada já está acesa!");
        } else {
            System.out.println("Acendendo a lâmpada...");
            this.status = true;
        }
    }

    public void desligarLampada() {
        if (!this.status) {
            System.out.println("A lâmpada já está desligada!");
        } else {
            System.out.println("Desligando a lâmpada...");
            this.status = false;
        }
    }

    public void statusLampada() {
        String status = this.status ? "Acesa" : "Desligada";
        System.out.println("A lâmpada está " + status);
    }
    public static void main(String[] args) {
        Lampada lampada = new Lampada(true);
        lampada.acenderLampada();
        lampada.desligarLampada();
        lampada.statusLampada();

    }

}