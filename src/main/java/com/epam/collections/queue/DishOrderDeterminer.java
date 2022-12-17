package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {

    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new ArrayList<>();
        List<Integer> dishes = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++){
            dishes.add(i);
        }
        int index = 0;
        while (dishes.size() > 1){
            for (int i = 0; i < 1; i++){
                index += (everyDishNumberToEat-1);
                if (index >= dishes.size()){
                    index -= dishes.size();
                }
            }
            result.add(dishes.get(index));
            dishes.remove(index);
        }
        if (dishes.size() > 0) {
            result.add(dishes.get(0));
        }

        return result;
    }
}
