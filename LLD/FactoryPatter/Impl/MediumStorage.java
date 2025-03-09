package LLD.FactoryPatter.Impl;

import LLD.FactoryPatter.Interface.Storage;

public class MediumStorage implements Storage{

    @Override
    public int getSize() {
        return 1024;
    }

    @Override
    public long getCost() {
        return 5000;
    }

    @Override
    public double getSpeed() {
        return 2000.4;
    }
    
}
