package ControlFlow;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4,2.1,1.5));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){
        if (width>0 && height>0 && areaPerBucket>0 && extraBucket>=0){
            double areaPaint;
            int numberOfBucket = 0;
            areaPaint = width * height;
            if (areaPaint <= extraBucket*areaPerBucket)
                return numberOfBucket;
            else
                return (int) Math.ceil((areaPaint - extraBucket*areaPerBucket)/areaPerBucket);
        }
        return -1;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width>0 && height>0 && areaPerBucket>0){
            double areaPaint;
            areaPaint = width * height;
                return (int) Math.ceil((areaPaint)/areaPerBucket);
        }
        return -1;
    }
    public static int getBucketCount(double areaPaint, double areaPerBucket){
        if (areaPaint>0 && areaPerBucket>0){
            return (int) Math.ceil(areaPaint/areaPerBucket);
        }
        return -1;
    }
}
