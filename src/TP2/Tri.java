package TP2;
import java.util.ArrayList;
public class Tri {

    public static boolean est_tri(ArrayList<Integer> liste) {
        for (int i = 0; i < liste.size() - 1; i++) {
            if (liste.get(i) > liste.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void echange(ArrayList<Integer> liste, int i, int j) {
        int temp = liste.get(i);
        liste.set(i, liste.get(j));
        liste.set(j, temp);
    }

    public static void append(ArrayList<Integer> liste, int i) {
        liste.add(i);
    }

    public static void fusion(ArrayList<Integer> liste1, ArrayList<Integer> liste2) {
       liste1.addAll(liste2);
    }

    public static int position_min(ArrayList<Integer> liste, int i) {
        int min = liste.get(i);
        int pos = i;
        for (int j = i + 1; j < liste.size(); j++) {
            if (liste.get(j) < min) {
                min = liste.get(j);
                pos = j;
            }
        }
        return pos;
    }


    public static void tri_bulle(ArrayList<Integer> liste) {
        boolean permut = true;
        while (permut) {
            permut = false;
            for (int i = 0; i < liste.size() - 1; i++) {
                if (liste.get(i) > liste.get(i + 1)) {
                    echange(liste, i, i + 1);
                    permut = true;
                }
            }
        }
    }

    public static void tri_selection(ArrayList<Integer> liste) {
        for (int i = 0; i < liste.size() - 1; i++) {
            int pos = position_min(liste, i);
            echange(liste, i, pos);
        }
    }

    public static void tri_insertion(ArrayList<Integer> liste) {
        for (int i = 1; i < liste.size(); i++) {
            int j = i;
            while (j > 0 && liste.get(j - 1) > liste.get(j)) {
                echange(liste, j - 1, j);
                j--;
            }
        }
    }

    public static void tri_rapide(ArrayList<Integer> liste) {
        if (liste.size() > 1) {
            ArrayList<Integer> liste1 = new ArrayList<Integer>();
            ArrayList<Integer> liste2 = new ArrayList<Integer>();
            int pivot = liste.get(0);
            for (int i = 1; i < liste.size(); i++) {
                if (liste.get(i) < pivot) {
                    append(liste1, liste.get(i));
                } else {
                    append(liste2, liste.get(i));
                }
            }
            tri_rapide(liste1);
            tri_rapide(liste2);
            liste.clear();
            fusion(liste, liste1);
            append(liste, pivot);
            fusion(liste, liste2);
        }
    }


    public static void tri_fusion(ArrayList<Integer> liste) {
        if (liste.size() > 1) {
            ArrayList<Integer> liste1 = new ArrayList<Integer>();
            ArrayList<Integer> liste2 = new ArrayList<Integer>();
            for (int i = 0; i < liste.size() / 2; i++) {
                append(liste1, liste.get(i));
            }
            for (int i = liste.size() / 2; i < liste.size(); i++) {
                append(liste2, liste.get(i));
            }
            tri_fusion(liste1);
            tri_fusion(liste2);
            liste.clear();
            int i = 0;
            int j = 0;
            while (i < liste1.size() && j < liste2.size()) {
                if (liste1.get(i) < liste2.get(j)) {
                    append(liste, liste1.get(i));
                    i++;
                } else {
                    append(liste, liste2.get(j));
                    j++;
                }
            }
            while (i < liste1.size()) {
                append(liste, liste1.get(i));
                i++;
            }
            while (j < liste2.size()) {
                append(liste, liste2.get(j));
                j++;
            }
        }
    }

    public static void tri_du_singe(ArrayList<Integer> liste) {
        while (!est_tri(liste)) {
            for (int i = 0; i < liste.size(); i++) {
                int j = (int) (Math.random() * liste.size());
                echange(liste, i, j);
            }
        }
    }
}
