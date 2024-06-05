public class BigO {
    public int max = 1000000;
    public static void  main(String[] args){
    Bigi bigi = new Bigi();

    int resA = bigi.addMinimalUp(2);
    int resB = bigi.addUp(3);

    System.out.println("For loop here:\t" + resB);
    System.out.println("Minified Version:\t" + resA);
    }
}
