package cn.Hanabi.events;

import com.darkmagician6.eventapi.events.*;

public final class EventRender2D implements Event
{
    public float partialTicks;
    
    public EventRender2D(final float partialTicks) {
        super();
        this.partialTicks = partialTicks;
    }
}
