package employees;

import storage.StorageUnit;

public abstract class Employee {
    protected final int experience;
    protected final String position;
    protected StorageUnit storageUnit;

    public Employee(int experience, String position, StorageUnit storageUnit) {
        this.experience = experience;
        this.position = position;
        this.storageUnit = storageUnit;
    }
}
