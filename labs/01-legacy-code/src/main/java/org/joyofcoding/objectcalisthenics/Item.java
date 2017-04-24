package org.joyofcoding.objectcalisthenics;

import org.joyofcoding.objectcalisthenics.datatypes.Name;
import org.joyofcoding.objectcalisthenics.datatypes.Quality;
import org.joyofcoding.objectcalisthenics.datatypes.SellIn;

import java.util.ArrayList;

public interface Item {
    Name getName();

    Quality getQuality();

    SellIn getSellIn();

    void updateItemQuality();
}
