package encryptdecrypt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numLine = scanner.nextLine().split("\\s+");
        List<Integer> listNum = new ArrayList<>();
        for (String next:numLine){
            listNum.add(Integer.parseInt(next));
        }
        int center = scanner.nextInt();
        findMinDistance(listNum,0,center);
        for(int next:listNum){
            System.out.print(next+" ");
        }
    }

    public static void findMinDistance(List list, int dist, int center){
        if(list.contains(center+dist)||list.contains(center-dist)){
            list.removeIf(x -> !(x.equals(center-dist)||x.equals(center+dist)));
        }else findMinDistance(list,dist+1,center);
    }
}
