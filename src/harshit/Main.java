package harshit;

public class Main {
    public static void main(String[] args){
      

        Printer printer=new Printer(50,true);
        System.out.println("Initial pages :"+printer.getNoPage());
        int pagesToprint=printer.printPage(23);
        System.out.println("Pages printed was :"+pagesToprint+" new Total pages printed :"+printer.getNoPage());
        pagesToprint=printer.printPage(20);
        System.out.println("Pages printed was :"+pagesToprint+" new Total pages printed :"+printer.getNoPage());

    }
}
