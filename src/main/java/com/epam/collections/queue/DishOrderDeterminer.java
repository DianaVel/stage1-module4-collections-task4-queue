package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List <Integer> res = new ArrayList<>();
        List <Integer> dishes = new ArrayList<>();

        for (int i=1; i<=numberOfDishes; i++){
            dishes.add(i);
        }

        int i=everyDishNumberToEat-1;
        while (dishes.size()>0){
            if(i>=dishes.size()) i=i%dishes.size();
            res.add(dishes.get(i));
            dishes.remove(i);
            i--;
            i+=everyDishNumberToEat;
        }
        return res;
    }
}
