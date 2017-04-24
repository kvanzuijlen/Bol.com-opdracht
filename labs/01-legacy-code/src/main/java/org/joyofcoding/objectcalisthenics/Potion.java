package org.joyofcoding.objectcalisthenics;

import org.joyofcoding.objectcalisthenics.datatypes.Name;
import org.joyofcoding.objectcalisthenics.datatypes.Quality;
import org.joyofcoding.objectcalisthenics.datatypes.SellIn;

public class Potion implements Item {
    private Name name;
    private SellIn sellIn;
    private Quality quality;

    public Potion(Name name, SellIn sellIn, Quality quality) {
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
        if (quality > 0) {
            quality -= 1;
        }

        sellIn-=1;

        if (sellIn < 0) {
            if (quality > 0) {
                quality -= 1;
            }
        }
    }
}
