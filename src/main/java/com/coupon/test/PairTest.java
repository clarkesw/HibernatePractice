package com.coupon.test;


public class PairTest {
    public static void main(String[] args) {
        
    }
}

class Pair<K,V>{
    
    final K key;
    final V value;
    
    public Pair(final K key, final V value){ 
        this.key = key;
        this.value = value;   
    }
    
    public K getKey(){
        return this.key;
    }
    
}