package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;

abstract class Algorithm {


    abstract String process(String message,int key);

    void writeTo(String path, String message){
        if (path != null){

            try(FileWriter fw = new FileWriter(new File(path))){
                fw.write(message);
            }catch (Exception ex){
                ex.printStackTrace();
                System.out.println(message);
            }
        }else {
            System.out.println(message);
        }
    }


}
