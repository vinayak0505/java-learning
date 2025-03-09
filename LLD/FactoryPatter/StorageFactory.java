package LLD.FactoryPatter;

import LLD.FactoryPatter.Impl.LargeStorage;
import LLD.FactoryPatter.Impl.MediumStorage;
import LLD.FactoryPatter.Impl.SmallStorage;
import LLD.FactoryPatter.Interface.Storage;

public class StorageFactory {
    public static Storage getStorage(int size, double speed) {
        if(size <= 128 && speed <= 1000) {
            return new SmallStorage();
        }else if(size <= 1024 && speed <= 2000) {
            return new MediumStorage();
        }
        return new LargeStorage();
    }
}
