public class Seating extends Furniture{

    private String material;

    private int dimensions;

    private int Load_capacity;

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public int getDimensions() {
        return dimensions;
    }

    @Override
    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public int getLoad_capacity() {
        return Load_capacity;
    }

    public void setLoad_capacity(int load_capacity) {
        Load_capacity = load_capacity;
    }
}
