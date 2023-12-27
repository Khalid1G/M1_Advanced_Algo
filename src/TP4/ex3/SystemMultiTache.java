package TP4.ex3;

public class SystemMultiTache {

    private Pile<Tache> pile;
    private File<Tache> file1;
    private File<Tache> file2;
    private File<Tache> file3;

    public SystemMultiTache() {
        pile = new Pile<>();
        file1 = new File<>(100);
        file2 = new File<>(100);
        file3 = new File<>(100);
    }

    public void addTache(Tache tache) throws Exception {
        pile.push(tache);
        switch (tache.getPriority()) {
            case 1:
                file1.enfiler(tache);
                break;
            case 2:
                file2.enfiler(tache);
                break;
            case 3:
                file3.enfiler(tache);
                break;
        }
    }

    public void execute() throws Exception {
        while (!pile.empty()) {
            Tache tache = pile.pop();
            switch (tache.getPriority()) {
                case 1:
                    System.out.println(file1.defiler());
                    break;
                case 2:
                    System.out.println(file2.defiler());
                    break;
                case 3:
                    System.out.println(file3.defiler());
                    break;
            }
        }
    }


}
