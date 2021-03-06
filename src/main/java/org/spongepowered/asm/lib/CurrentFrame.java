package org.spongepowered.asm.lib;

final class CurrentFrame extends Frame
{
    CurrentFrame() {
        super();
    }
    
    final void execute(final int n, final int n2, final ClassWriter classWriter, final Item item) {
        super.execute(n, n2, classWriter, item);
        final Frame frame = new Frame();
        this.merge(classWriter, frame, 0);
        this.set(frame);
        this.owner.inputStackTop = 0;
    }
}
