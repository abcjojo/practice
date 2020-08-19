package ex1;

import java.util.*;

public class Testjj {
    public static void main(String[] args) {

        HashSet<Integer> redball = new HashSet<Integer>();
        for (int i=0; i<7; i++)
            redball.add((int)(Math.random()*33+1));
        int blueball = (int)(Math.random()*16+1);

        List<Integer> list = new ArrayList<Integer>();
        for(Integer value : redball) list.add(value);
        Collections.sort(list);

        System.out.println("¿∫«Ú£∫"+blueball);
        System.out.print("∫Ï«Ú£∫"+list);

    }
}
