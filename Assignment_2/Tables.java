public class Tables extends Furniture{

  private String shape;

  private String material;

  private  int dimensions;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

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
}
