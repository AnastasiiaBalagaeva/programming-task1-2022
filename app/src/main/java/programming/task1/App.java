/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package programming.task1;


import java.util.Objects;

class App {

    private String nameProduct;
    private double priceProduct;
    private final int countProduct;

    public App(String nameProduct, double priceProduct, int countProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.countProduct = countProduct;
    }

    public double getPriceProduct(){
        return priceProduct;
    }

    public String getName(){
        return nameProduct;
    }

    public void setPriceProduct(double priceProduct){
        this.priceProduct = priceProduct;
    }

    public void setNameProduct(String nameProduct){
        this.nameProduct = nameProduct;
    }

    @Override
    public boolean equals(Object object){
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        App thisObject = (App) object;
        return Objects.equals(thisObject.nameProduct, nameProduct) && thisObject.priceProduct == priceProduct && thisObject.countProduct == countProduct;
    }

}





