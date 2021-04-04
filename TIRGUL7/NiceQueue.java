package com.company;

import lombok.ToString;

import java.util.ArrayList;
@ToString

public class NiceQueue<E> {

    private ArrayList<E> m_queue;

    public void enqueue(E item)
    {
        m_queue.add(0, item);
        if (m_queue.size() > 20){
            System.out.println("queue is full");
        }
    }

    public E dequeue(E item)
    {
        m_queue.remove(item);
        if (m_queue.isEmpty()){
        }
        return null;
    }

    public void clear()
    {
        m_queue.clear();
    }
    public int count()
    {
        return m_queue.size();
    }

    public E next()
    {
        return m_queue.get(0);
    }

}
