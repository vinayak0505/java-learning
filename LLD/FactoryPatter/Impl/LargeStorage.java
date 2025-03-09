package LLD.FactoryPatter.Impl;

import LLD.FactoryPatter.Interface.Storage;

public class LargeStorage implements Storage{

    @Override
    public int getSize() {
        return 10240;
    }

    @Override
    public long getCost() {
        return 10000;
    }

    @Override
    public double getSpeed() {
        return 3000.4;
    }
    
}
