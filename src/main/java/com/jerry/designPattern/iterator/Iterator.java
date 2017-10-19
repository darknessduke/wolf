package com.jerry.designPattern.iterator;

public abstract class Iterator {
	  public abstract void first();
	  public abstract void next();
	  public abstract boolean isDone();
	  public abstract Object currentItem();
	}