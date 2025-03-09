package LLD.FactoryPatter;

import LLD.FactoryPatter.Interface.Storage;

public class Main {
    public static void main(String[] args) {
        int size = 300; 
        double speed = 500.0;

        Storage storage = StorageFactory.getStorage(size, speed);
        System.out.println(storage.getCost());
        System.out.println(storage.getSize());
        System.out.println(storage.getSpeed());
    }
}
