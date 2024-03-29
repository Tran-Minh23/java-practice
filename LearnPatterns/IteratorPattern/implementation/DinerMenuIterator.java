package LearnPatterns.IteratorPattern.implementation;

import LearnPatterns.IteratorPattern.interfaces.Iterator;

public class DinerMenuIterator implements java.util.Iterator {
    MenuItem[] items;
    int position = 0;
 
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
 
    public Object next() {
        MenuItem menuItem = this.items[this.position];
        this.position = this.position + 1;

        return menuItem;
    }
 
    public boolean hasNext() {
        if (this.position >= this.items.length || this.items[this.position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        if (this.position <= 0) {
            throw new IllegalStateException("You can’t remove an item until you’ve done at least one next()");
        }
        if (this.items[this.position-1] != null) {
            for (int i = this.position-1; i < (this.items.length-1); i++) {
                this.items[i] = this.items[i+1];
            }

            this.items[this.items.length-1] = null;
        }
    }
 }
