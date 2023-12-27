package TP4.ex3;

public class Main {
    public static void main(String[] args) throws Exception {


        SystemMultiTache systemMultiTache = new SystemMultiTache();

        for (int i = 0; i < 10; i++) {
            int priority = (int) (Math.random() * 3 + 1);
            String description = "task " + i;
            Tache tache = new Tache(priority, description);

            systemMultiTache.addTache(tache);

        }

        systemMultiTache.execute();

    }


}
