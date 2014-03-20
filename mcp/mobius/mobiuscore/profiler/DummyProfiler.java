package mcp.mobius.mobiuscore.profiler;

import java.util.EnumSet;

import cpw.mods.fml.common.IScheduledTickHandler;
import cpw.mods.fml.common.TickType;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;

public class DummyProfiler implements IProfilerTileEntity, IProfilerEntity, IProfilerHandler, IProfilerTick, IProfilerSubtick {
	@Override
	public void FullTileEntityStart() {}

	@Override
	public void FullTileEntityStop() {}

	@Override
	public void Start(TileEntity te) {
		//System.out.printf("%s [%s %s %s]\n", te.getClass().getName(), te.xCoord, te.yCoord, te.zCoord);
	}

	@Override
	public void Stop(TileEntity te) {}

	@Override
	public void FullEntityStart() {}

	@Override
	public void FullEntityStop() {}

	@Override
	public void Start(Entity ent) {}

	@Override
	public void Stop(Entity ent) {}

	@Override
	public void StartTickStart(IScheduledTickHandler ticker, EnumSet<TickType> ticksToRun) {}

	@Override
	public void StopTickStart(IScheduledTickHandler ticker, EnumSet<TickType> ticksToRun) {}

	@Override
	public void StartTickEnd(IScheduledTickHandler ticker, EnumSet<TickType> ticksToRun) {}

	@Override
	public void StopTickEnd(IScheduledTickHandler ticker, EnumSet<TickType> ticksToRun) {}

	@Override
	public void TickStart() {}

	@Override
	public void TickEnd() {}

	@Override
	public void SubTickStart() {}

	@Override
	public void SubTickEnd() {}

}
