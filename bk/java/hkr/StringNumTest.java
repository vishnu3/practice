package hkr;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StringNumTest {



    public static int myXOR(int x, int y)
    {
        return (x | y) &
                (~x | ~y);
    }

    public static void main(String[] args) {

        System.out.println(myXOR(3,4));

        List<String> al = Arrays.asList(
          new String("1"),
                new String("8"),
                new String("6"),
                new String("20"),
                new String("4"),
                new String("5"),
                new String("1"),
                new String("9"),
                new String("10")
        );

        int n = al.size();
        TreeMap<Integer,List<Integer>> diffMap = new TreeMap<>();

        for(int i=0,j=1;i<n-1&&j<n;i++,j++){
            int ele1 = Integer.parseInt(al.get(i));
            int ele2 = Integer.parseInt(al.get(j));

            int diff = ele1-ele2;
            if(diff<0){
                diff = diff*-1;
            }

            diffMap.put(diff,Arrays.asList(ele1,ele2));

        }

        Map.Entry<Integer,List<Integer>> result = diffMap.lastEntry();

        System.out.println(
                "max difference -> "+result.getKey()+
                        " values -> "+result.getValue()
        );








    }
}
