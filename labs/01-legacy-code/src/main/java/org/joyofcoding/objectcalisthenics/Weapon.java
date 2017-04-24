package org.joyofcoding.objectcalisthenics;

import org.joyofcoding.objectcalisthenics.datatypes.Name;
import org.joyofcoding.objectcalisthenics.datatypes.Quality;
import org.joyofcoding.objectcalisthenics.datatypes.SellIn;

public class Weapon implements Item {
    private Name name;
    private SellIn sellIn;
    private Quality quality;

    public Weapon(Name name, SellIn sellIn, Quality quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    @Override
    public Name getName() {
        return name;
    }

    @Override
    public Quality getQuality() {
        return quality;
    }

    @Override
    public SellIn getSellIn() {
        return sellIn;
    }

    @Override
    public void updateItemQuality() {

    }
}
