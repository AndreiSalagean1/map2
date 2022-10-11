package controller;

import model.Entity;
import repository.Repository;

import java.util.ArrayList;


public class CONTROLLER {

    Repository _repository;

    public CONTROLLER(Repository repository) {
        _repository = repository;
    }

    public ArrayList<Entity> getEntitiesWithMinimumWeight(int weight)  {

        ArrayList<Entity> result = new ArrayList<>();


        for (Entity entity : _repository.getEntities()) {
            if (entity.weight > weight)
                result.add(entity);
        }



        return result;
    }
}