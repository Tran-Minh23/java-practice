package LearnPatterns.IteratorPattern.implementation;

import java.util.List;

import LearnPatterns.IteratorPattern.interfaces.Iterator;

public class PancakeHouseIterator implements Iterator {
    List<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> menuItems) {
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (this.position >= this.items.size()) {
            return false;
        }
        else return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = this.items.get(this.position);
        this.position++;

        return menuItem;
    }
    
}
