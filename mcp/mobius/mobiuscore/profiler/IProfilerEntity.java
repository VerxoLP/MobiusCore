package mcp.mobius.mobiuscore.profiler;

import net.minecraft.entity.Entity;

public interface IProfilerEntity {
	public void FullEntityStart();
	public void FullEntityStop();	
	
	public void Start(Entity ent);
	public void Stop (Entity ent);
}