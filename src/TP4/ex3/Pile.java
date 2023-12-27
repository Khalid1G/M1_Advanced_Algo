package TP4.ex3;

public class Pile<T> {

    class Noeud{
        T value;
        Noeud next;

        public Noeud() {}

        public Noeud(T value) {
            this.value = value;
        }

        public Noeud(T value, Noeud next) {
            this.value = value;
            this.next = next;
        }
    }

    Noeud top;

    public int size(){
        int size = 0;
        for (Noeud n = top; n != null; n = n.next)
            size++;
        return size;
    }


    public boolean empty(){
        return top == null;
    }

    public T peak() throws Exception {
        if(empty())
            throw new Exception("Pile is empty");
        return top.value;
    }

    public void push(T val){
        top = new Noeud(val, top);
    }

    public T pop()throws Exception{
        if(empty())
            throw new Exception("Pile is empty");
        else {
            T val = top.value;
            top = top.next;
            return val;
        }
    }

    public void clear(){
        top = null;
    }
}
