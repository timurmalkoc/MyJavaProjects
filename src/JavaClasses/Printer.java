package JavaClasses;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel>=0 && tonerLevel<=100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
        this.duplex = duplex;
        this.pagesPrinted =0;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount<=0 || tonerAmount>100)
            return -1;
        if (tonerAmount+this.tonerLevel >100)
            return -1;
        tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages){
        int pagesToPrint;
        if (this.duplex)
            pagesToPrint = (int) Math.ceil(pages/2.0);
        else
            pagesToPrint = pages;
        this.pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
