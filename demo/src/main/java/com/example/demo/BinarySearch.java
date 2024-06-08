package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class BinarySearch  {

    @Autowired
    private SortAlgorith sort;

    public BinarySearch(SortAlgorith sortAl) {
        sort=sortAl;
    }

    public int search(int[] numbers, int i) {

        int [] numbershorted= sort.sort(numbers);
        System.out.print(this.sort);


        //ordenamiento

        //busqueda sobre esa busqueda

        return 2;
    }
}
