package model;

import ru.store.ClassOfflineStore;

public class StoreInfo extends ClassOfflineStore {
    private String name;
   private   int workHouse;

    public StoreInfo(String name, int workHouse) {
        this.name = name;
        this.workHouse = workHouse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkHouse() {
        return workHouse;
    }

    public void setWorkHouse(int workHouse) {
        this.workHouse = workHouse;
    }

    @Override
    public String toString() {
        return "StoreInfo{" +
                "name='" + name + '\'' +
                ", workHouse=" + workHouse +
                '}';
    }
}
