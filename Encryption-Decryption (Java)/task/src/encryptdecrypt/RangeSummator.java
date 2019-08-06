package encryptdecrypt;

public class RangeSummator extends Thread {
    private int from;
    private int to;
    private long result;

    public RangeSummator(int from, int to) {
        this.from = from;
        this.to = to;

    }

    public long getResult(){
        return result;
    }


    @Override
    public void run() {
        super.run();
        long sum = 0;
        for (int i = from;i<=to;i++){
            sum+=i;
        }
        result = sum;
    }
}
