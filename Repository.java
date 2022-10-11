package repository;



import model.Entity;

import java.util.ArrayList;

public class Repository {

    ArrayList<Entity> _entities;

    public Repository() {
        _entities = new ArrayList<>();
    }

    public void add(Entity entity) {
        _entities.add(entity);
    }

    public ArrayList<Entity> getEntities() {
        return _entities;
    }
}