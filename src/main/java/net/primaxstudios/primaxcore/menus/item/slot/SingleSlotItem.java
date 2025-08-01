package net.primaxstudios.primaxcore.menus.item.slot;

import dev.dejvokep.boostedyaml.block.implementation.Section;
import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

@Getter @Setter
public abstract class SingleSlotItem extends SlotBoundItem {

    private int slot;

    @Override
    public void reload(Section section) {
        super.reload(section);
        slot = section.getInt("slot");
    }

    @Override
    public List<Integer> getBoundSlots() {
        return Collections.singletonList(slot);
    }
}
