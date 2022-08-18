package harshit;

public class Printer {
    private int toner;
    private int NoPage;
    private boolean duplex;

    public Printer(int toner, boolean duplex) {
        if (this.toner > -1 && toner <= 100) {
            this.toner = toner;
        } else {
            this.toner = -1;
        }
        this.duplex = duplex;
        this.NoPage = 0;
    }

    public int fillUp(int tonerAmount) {
        if (toner > 0&&tonerAmount<=100) {
            if (this.toner+tonerAmount>100){
                return -1;
            }
            this.toner+=tonerAmount;
        }
        else {
            return -1;
        }

        return this.toner;
    }


    public int printPage(int page){
        int pageCount=page;
        if (this.duplex){
            System.out.println("Printing in Duplex Mode ......................");
            pageCount=(page/2)+page%2;
        }
        this.NoPage+=pageCount;
        return pageCount;
    }


    public int getNoPage() {
        return NoPage;
    }
}
