package encryptdecrypt;

import java.util.concurrent.Future;

public class FuncInterfaceStudy {
    @FunctionalInterface
    interface Func<T,R>{
        R apply (T value);
        static void doSmth(){

        }
        default void doSmthDefault(){

        }
    }

    public static void main(String[] args) {
        //IMplementing, using anonymous class
        Func<Long,Long> func = new Func<Long, Long>() {
            @Override
            public Long apply(Long value) {
                return value*value;
            }
        };
        long value = func.apply(15L);
        System.out.println(value);

        //implementing, using lambda interface
        Func<Integer,Integer> square = x -> x*x;
        System.out.println(square.apply(50));
        Future<Integer> future;
    }

    //
}
