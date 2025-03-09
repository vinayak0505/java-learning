package LLD.FactoryPatter.Impl;

import LLD.FactoryPatter.Interface.Storage;

public class SmallStorage implements Storage {

    @Override
    public int getSize() {
        return 128;
    }

    @Override
    public long getCost() {
        return 1000;
    }

    @Override
    public double getSpeed() {
        return 1000.4;
    }

}
