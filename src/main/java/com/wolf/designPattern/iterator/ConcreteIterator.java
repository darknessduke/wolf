package com.wolf.designPattern.iterator;

public class ConcreteIterator extends Iterator {
	  private ConcreteAggregate agg;
	  private int index = 0;
	  private int size = 0;
	  public ConcreteIterator(ConcreteAggregate agg) {
	    this.agg = agg;
	    this.size = agg.size();
	    index = 0;
	  }
	  @Override
	  public void first() {
	    index = 0;
	  }
	  @Override
	  public void next() {
	    if (index < size) {
	      index++;
	    }
	  }
	  @Override
	  public boolean isDone() {
	    return (index >= size);
	  }
	  @Override
	  public Object currentItem() {
	    return agg.getElement(index);
	  }
	}
