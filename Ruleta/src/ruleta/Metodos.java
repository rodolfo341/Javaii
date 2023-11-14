package ruleta;

public class Metodos {
    public static int aleatorio(int min, int max){
        int num=(int)Math.floor(Math.random()*(min-(max+1))+(max+1));
        return num;
    }
}
