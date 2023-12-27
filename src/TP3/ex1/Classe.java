package TP3.ex1;

public class Classe {
    Etudiant first;
    int size;

    public Classe() {
        this.first = null;
        this.size = 0;
    }

    public Etudiant add(Etudiant e) {
        if (this.first == null) {
            this.first = e;
        } else {
            e.setNext(this.first);
            this.first = e;
        }
        this.size++;
        return this.first;
    }

    public Etudiant getFirst() {
        return first;
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

    //write remove function
     
    

}
