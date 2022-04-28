package com.gypsyhost.socketcraft.custom.util.energy;

import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.energy.IEnergyStorage;

public class CustomEnergyStorage  implements IEnergyStorage, INBTSerializable<CompoundTag> {

    private static final String KEY = "energy";
    protected int energy;
    protected int capacity;
    protected int maxReceive;
    protected int maxExtract;
    protected int maxGenerate;

    public CustomEnergyStorage(int capacity, int maxReceive, int maxExtract, int energy) {
        this.capacity = capacity;
        this.maxReceive = maxReceive;
        this.maxExtract = maxExtract;
        this.energy = Math.max(0 , Math.min(capacity, energy));
    }

    public CustomEnergyStorage(int capacity, int maxReceive, int maxExtract, int maxGenerate, int energy) {
        this.capacity = capacity;
        this.maxReceive = maxReceive;
        this.maxExtract = maxExtract;
        this.maxGenerate = maxGenerate;
        this.energy = Math.max(0 , Math.min(capacity, energy));
    }



    @Override
    public CompoundTag serializeNBT() {
        CompoundTag tag = new CompoundTag();
        tag.putInt(KEY, this.energy);
        return tag;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        this.energy = nbt.getInt(KEY);
    }

    @Override
    public String toString() {
        return "CustomEnergyStorage{" +
                "energy=" + energy +
                ", capacity=" + capacity +
                ", maxReceive=" + maxReceive +
                ", maxExtract=" + maxExtract +
                ", maxGenerate=" + maxGenerate +
                '}';
    }

    @Override
    public int receiveEnergy(int maxReceive, boolean simulate)
    {
        if (!canReceive())
            return 0;

        int energyReceived = Math.min(capacity - energy, Math.min(this.maxReceive, maxReceive));
        if (!simulate)
            energy += energyReceived;
        return energyReceived;
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulate)
    {
        if (!canExtract())
            return 0;

        int energyExtracted = Math.min(energy, maxExtract);
        if (!simulate)
            energy -= energyExtracted;
        return energyExtracted;
    }

    public int generateEnergy(int energy) {
        this.energy += maxGenerate;
        return energy;
    }

    public int consumeEnergy(int energy) {
        this.energy -= maxExtract;
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public int getEnergyStored()
    {
        return energy;
    }

    @Override
    public int getMaxEnergyStored()
    {
        return capacity;
    }

    @Override
    public boolean canExtract()
    {
        return this.maxExtract > 0;
    }

    @Override
    public boolean canReceive()
    {
        return this.maxReceive > 0;
    }


}
