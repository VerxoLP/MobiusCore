package mcp.mobius.mobiuscore.profiler_v2;

import net.minecraft.world.World;

public class DummyProfiler implements IProfilerBase{

	@Override
	public void start() {}

	@Override
	public void stop() {}

	@Override
	public void start(Object key) {}

	@Override
	public void stop(Object key) {}

	@Override
	public void start(Object key1, Object key2) {}

	@Override
	public void stop(Object key1, Object key2) {}
}