public class Aula03 {
    public static void main(String[] args) {
        Caneta3 c3 = new Caneta3();
        c3.modelo = "Bic cristal";
        c3.cor = "Preta";
        //c3.ponta = 0.5f;
        c3.carga = 80;
        //c3.tampada = false;
        c3.rabiscar();
        c3.status();
        c3.destampar();

    }
}
