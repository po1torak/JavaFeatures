package patterns.prototype;

import lombok.ToString;

@ToString
public class ObjectToClone implements Cloneable {

    private String fieldA;
    private String fieldB;
    private String fieldC;

    public ObjectToClone(String fieldA, String fieldB, String fieldC) {
        this.fieldA = fieldA;
        this.fieldB = fieldB;
        this.fieldC = fieldC;
    }

    @Override
    protected ObjectToClone clone() throws CloneNotSupportedException {
        return (ObjectToClone) super.clone();
    }
}
