
public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual ?" + smartTv.canal);
        System.out.println("Volume Atual ?" + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.mudarCanal(13);

        System.out.println("Tv Ligada ?" + " " + smartTv.ligada);
        System.out.println("Canal Atual ?" + " " + smartTv.canal);
        System.out.println("Volume Atual ?" + " " + smartTv.volume);

    }
}
