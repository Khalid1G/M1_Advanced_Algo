package TP4.ex1;

public class Sac<T>{

    class Noeud{
        T value;
        Noeud next;
    }

    Noeud top;

    public boolean empty()
    {
        return top == null;
    }

    public void push(T val)
    {
        Noeud newNoeud = new Noeud();
        newNoeud.value = val;
        newNoeud.next = top;
        top = newNoeud;
    }

    public T pop() throws Exception {
        if(empty())
        {
            throw new Exception("The stack is empty");
        }
        else
        {
            T val = top.value;
            top = top.next;
            return val;
        }
    }

    public T peek() throws Exception {
        if(empty())
        {
            throw new Exception("The stack is empty");
        }
        else
        {
            return top.value;
        }
    }

    public void clear()
    {
        top = null;
    }

    public int size()
    {
        int size = 0;
        Noeud current = top;
        while(current != null)
        {
            size++;
            current = current.next;
        }
        return size;
    }

}
