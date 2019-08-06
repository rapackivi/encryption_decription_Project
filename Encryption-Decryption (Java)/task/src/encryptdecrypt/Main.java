package encryptdecrypt;

public class Main {
    public static void main(String[] args) {


        GryptographicFactory gf = new FBIcryptoFactory();

        Algorithm algo = gf.prepareOfAlgo(args);
        String res = algo.process(gf.message,gf.key);
        algo.writeTo(gf.pathOutFile,res);
        System.out.println(res);

    }

}
