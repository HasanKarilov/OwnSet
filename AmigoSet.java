package com.javarush.task.task37.task3707;

import java.io.Serializable;
import java.util.*;

/**
 * Created by hanaria on 4/6/17.
 */

public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {

    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public AmigoSet()
    {
        map = new HashMap<>();
    }
    public AmigoSet(Collection<? extends E> collection)
    {
        int capacity = Math.max(16, (int)(collection.size()/0.75f +1));
        map = new HashMap<>(capacity);
        for (E elem : collection)
        {
            map.put(elem, PRESENT);
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }


    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(E e)
    {
        return map.put(e, PRESENT) == null;
    }
}