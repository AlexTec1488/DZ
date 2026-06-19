package Collection.Generic;

public class Memory<Tim> implements Savable<Tim>  {
    protected Tim value;

    public void save(Tim value) {
        this.value = value;
    }

    public Tim getLast() {
        return value;

    }
}
