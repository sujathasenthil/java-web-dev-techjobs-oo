package org.launchcode.techjobs_oo;

public abstract class JobField {
    protected int id;
    private static int nextId = 1;
    public String value;
    public JobField() {
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

}
