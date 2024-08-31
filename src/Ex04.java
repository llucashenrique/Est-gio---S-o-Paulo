public class Ex04 {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 292298.88;
        double es = 27165.48;
        double outros = 19849.53;

        double soma = sp + rj + mg + es + outros;

        double perSP = (sp / soma) * 100;
        double perMG = (mg / soma) * 100;
        double perES = (es / soma) * 100;
        double perRJ = (rj / soma) * 100;
        double perOutros = (outros / soma) * 100;

        System.out.println("Percentual de representacao por estado: ");
        System.out.printf("%.2f%%%n", perSP);
        System.out.printf("%.2f%%%n", perRJ);
        System.out.printf("%.2f%%%n", perMG);
        System.out.printf("%.2f%%%n", perES);
        System.out.printf("%.2f%%%n", perOutros);
    }
}
