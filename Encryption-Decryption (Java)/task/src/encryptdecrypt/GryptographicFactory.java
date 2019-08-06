package encryptdecrypt;

import java.io.File;
import java.util.Scanner;

abstract class GryptographicFactory {
    String mode;
    String codeType;
    String message;
    int key;
    String pathOutFile;

    abstract Algorithm createAlgo(String mode,String codeType);

    Algorithm prepareOfAlgo(String[]args){
        getParams(args);
        Algorithm algo = createAlgo(mode,codeType);
        return algo;
    }

    private void getParams(String[]args){
        String pathInFile = "";
        for (int i=0; i<args.length;i+=2){
            switch (args[i]){
                case "-mode": mode=args[i+1];break;
                case "-key" : key = Integer.parseInt(args[i+1]);break;
                case "-data": message = args[i+1];break;
                case "-in" : pathInFile = args[i+1];break;
                case "-out" : pathOutFile = args[i+1];break;
                case "-alg" : codeType = args[i+1];break;
                default:
                    System.out.println("chto za huyna suda popala? " +
                            "Dalshe vsyo poletit po pizde");
            }
        }
        //ensure that we have message text
        if (message==null){
            if (pathInFile!=null){
                message = readFrom(pathInFile);
            }else {
                message = readFromCMD();
            }
        }

    }

    private String readFrom(String path){
        StringBuilder sb = new StringBuilder();
        try(Scanner sc = new Scanner(new File(path))){
            while (sc.hasNextLine()){
                sb.append(sc.nextLine());
            }
        }catch (Exception ex){
            ex.printStackTrace();
            return readFromCMD();
        }
        if (sb.length()==0){
            System.out.println("File is empty!\n " +
                    "please, enter text manually");
            return readFromCMD();
        };
        return sb.toString();
    }

    private String readFromCMD(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
