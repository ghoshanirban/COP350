package tester;

import sets.*;

import java.util.ArrayList;

public class TestTreeSetRBTree {
    public static boolean whatIsMyPurpose(ArrayList<Integer> A, ArrayList<Integer> B) {
        var H = new TreeSetRBTree<Integer>();

        for(var integer : A)
            H.add(integer);

        for(var integer : B)
            if(H.contains(integer))
                return false;

        return true;
    }
    public static void main(String[] args) {
        TreeSetRBTree<Integer> S = new TreeSetRBTree<>(), T = new TreeSetRBTree<>();
        //============================= set union ===============================//
        S.add(22); S.add(10); S.add(-5); S.add(99);
        T.add(99); T.add(22); T.add(-6); T.add(82); T.add(65);

        System.out.print("S: ");
        for(var item : S)
            System.out.print(item + " ");
        System.out.println();
        System.out.print("T: ");
        for(var item : T)
            System.out.print(item + " ");
        System.out.println();

        S.addAll(T);

        System.out.print("S union T: ");
        for(var item : S)
            System.out.print(item + " ");
        //======================================================================//

        S.clear(); T.clear();
        System.out.println("\n");
        //===================== set intersection ===============================//
        S.add(22); S.add(10); S.add(-5); S.add(99);
        T.add(99); T.add(22); T.add(-6); T.add(82); T.add(65);

        System.out.print("S: ");
        for(var item : S)
            System.out.print(item + " ");
        System.out.println();
        System.out.print("T: ");
        for(var item : T)
            System.out.print(item + " ");
        System.out.println();

        S.retainAll(T);

        System.out.print("S intersection T: ");
        for(var item : S)
            System.out.print(item + " ");
        //======================================================================//
        S.clear(); T.clear();
        System.out.println("\n");
        //===================== set difference ===============================//
        S.add(22); S.add(10); S.add(-5); S.add(99);
        T.add(99); T.add(22); T.add(-6); T.add(82); T.add(65);

        System.out.print("S: ");
        for(var item : S)
            System.out.print(item + " ");
        System.out.println();
        System.out.print("T: ");
        for(var item : T)
            System.out.print(item + " ");
        System.out.println();

        S.removeAll(T);

        System.out.print("S difference T: ");
        for(var item : S)
            System.out.print(item + " ");
        //======================================================================//
    }
}
