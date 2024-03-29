package LearnPatterns.IteratorPattern.compositePattern.implementation;

import java.util.Iterator;
import java.util.Stack;

import LearnPatterns.IteratorPattern.compositePattern.interfaces.MenuComponent;

public class CompositeIterator implements Iterator {
    Stack stack = new Stack();
   
    public CompositeIterator(Iterator iterator) {
        this.stack.push(iterator);
    }
   
    public Object next() {
        if (this.hasNext()) {
            Iterator iterator = (Iterator) this.stack.peek();
            
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                this.stack.push(component.createIterator());
            } 
            
            return component;
        } else {
            return null;
        }
    }
  
    public boolean hasNext() {
        if (this.stack.empty()) {
            return false;
        } else {
            Iterator iterator = (Iterator) this.stack.peek();
            
            if (!iterator.hasNext()) {
                this.stack.pop();
                return this.hasNext();
            } else {
                return true;
            }
        }
    }
   
    public void remove() {
        throw new UnsupportedOperationException();
    }
 }
