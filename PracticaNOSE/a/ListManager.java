package com.example.junit;

import java.util.ArrayList;
import java.util.List;

public class ListManager {
    private List<String> items = new ArrayList<>();

    public void addElement(String item) {
        if (item != null) {
            items.add(item);
        }
    }

    public void removeByValue(String item) {
        items.remove(item);
    }

    public void removeByIndex(int index) {
        if (index < 0 || index >= items.size()) {
            throw new IndexOutOfBoundsException("El índice no existe");
        }
        items.remove(index);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }
}
