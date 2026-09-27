package me.arthed.walljump.api.events;

import me.arthed.walljump.player.WPlayer;
import org.bukkit.event.Cancellable;
import org.jetbrains.annotations.NotNull;

public class WallJumpStartEvent extends WallJumpEvent implements Cancellable {

    private boolean approved = false;

    public WallJumpStartEvent(@NotNull WPlayer who) {
        super(who);
    }

    public boolean isApproved() {
        return this.approved;
    }

    public void approve() {
        this.approved = true;
    }
}
