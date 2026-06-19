package Collection.HashSet_And_HashMap.HashMap;

import java.util.Objects;

public class UserInfo {
    protected String name;
    protected String lastname;
    protected int age;

    public UserInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }


}
