package encryptdecrypt;

public class FBIcryptoFactory extends GryptographicFactory {
    @Override
    Algorithm createAlgo(String mode, String codeType) {
        Algorithm res;
        switch (codeType){
            case "shift" : if (mode.equals("enc")){
                                res = new ShiftEncryptor();break;
                            }else {
                                res = new ShiftDecriptor();break;
                            }
            case "unicode" : if (mode.equals("enc")){
                                res = new UnicodeEncriptor();break;
                            }else {
                                res = new UnicodeDecriptor();break;
                            }
             default: res = null;
        }
        return res;
    }
}
