public class Bigi {
    public int addUp(int max){
        int sum = 0;
        for (int i = 1; i < max; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public int addMinimalUp(int max){
        return max * (max + 1) /2;
    }

}
