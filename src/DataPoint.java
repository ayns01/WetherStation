public class DataPoint {
    private DataCategory dataCategory;
    private int newValue;

    public DataPoint(DataCategory dataCategory, int newValue) {
        this.dataCategory = dataCategory;
        this.newValue = newValue;
    }

    public DataCategory getDataCategory() {
        return dataCategory;
    }

    public int getNewValue() {
        return newValue;
    }
}
