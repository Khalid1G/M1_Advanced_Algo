package TP3.ex2;

public class Classe {
    private Etudiant first;
   private Etudiant last;
   private int size;

    public Classe() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public Etudiant add(Etudiant e) {
       e.setNext(this.first);
       if(this.first != null){
           this.first.setPrev(e);
       }
        this.first = e;
       this.size++;
       return this.first;
    }

    public Etudiant add_sorted(Etudiant e) {
        if(this.first == null){
            this.first = e;
            this.last = e;
        }else{
            Etudiant temp = this.first;
            while(temp != null && temp.getNumero() < e.getNumero()){
                temp = temp.getNext();
            }
            if(temp == null){
                e.setPrev(this.last);
                this.last.setNext(e);
                this.last = e;
            }else{
                e.setNext(temp);
                e.setPrev(temp.getPrev());
                temp.setPrev(e);
                if(e.getPrev() != null){
                    e.getPrev().setNext(e);
                }else{
                    this.first = e;
                }
            }
        }
        this.size++;
        return this.first;
    }

    public Etudiant getFirst() {
        return first;
    }


    public Etudiant add_last(Etudiant e) {
        if(this.first == null){
            this.first = e;
            this.last = e;
        }else{
            e.setPrev(this.last);
            this.last.setNext(e);
            this.last = e;
        }
        this.size++;
        return this.first;
    }

    public void setFirst(Etudiant first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Etudiant getLast() {
        return last;
    }

    public void setLast(Etudiant last) {
        this.last = last;
    }

    public void sort_insertion(){
      for (Etudiant e = this.first; e != null; e = e.getNext()){
         Etudiant temp = e;
         Etudiant prev = e.getPrev();
            while (prev != null && prev.getNumero() > temp.getNumero()){
                prev.setNext(temp.getNext());
                temp.setPrev(prev.getPrev());
                prev.setPrev(temp);
                temp.setNext(prev);
                if(prev.getNext() != null){
                prev.getNext().setPrev(prev);
                }
                if(temp.getPrev() != null){
                temp.getPrev().setNext(temp);
                }
                if(prev == this.first){
                this.first = temp;
                }
                prev = temp.getPrev();
            }
      }

    }

    public Etudiant find(int num){
        for (Etudiant e = this.first; e != null; e = e.getNext()){
            if(num == e.getNumero()) return e;
        }
        return null;
    }

    public boolean remove(int num){
        Etudiant e = this.find(num);
        if(e == null) return false;
        if(e == this.first){
            this.first = e.getNext();
        }else{
            Etudiant prev = this.first;
            while(prev.getNext() != e){
                prev = prev.getNext();
            }
            prev.setNext(e.getNext());
        }
        this.size--;
        return true;
    }

    public static Classe merge(Classe a, Classe b){
        Classe classC = new Classe();

        for (Etudiant e = a.getFirst(); e != null; e = e.getNext()) {
            classC.add_last(e);
        }

        for (Etudiant e = b.getFirst(); e != null; e = e.getNext()) {
            classC.add_last(e);
        }

        classC.sort_insertion();
        return classC;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Etudiant e = this.first; e != null; e = e.getNext()){
            s.append(e).append("⇄");
        }
        if(!s.isEmpty())
            s.delete(s.length()-1, s.length());
        return s.toString();
    }
}
