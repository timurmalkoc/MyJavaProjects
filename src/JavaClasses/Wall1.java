package JavaClasses;

public class Wall1 {
    private double width;
    private double height;

    public Wall1(double width, double height){
        if (width<0)
            this.width = 0;
        else
            this.width = width;
        if (height<0)
            this.height = 0;
        else
            this.height = height;
    }
    public Wall1(){

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<0)
            this.width = 0;
        else
            this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height<0)
            this.height = 0;
        else
            this.height = height;
    }

    public double getArea(){
        return this.height * this.width;
    }
}
