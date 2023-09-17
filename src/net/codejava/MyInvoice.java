package net.codejava;

public class MyInvoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String SoldTo="C026-01-0937/2022";
		String date="28/04/2020";
		String address="Mutheu Urbanus Kioko";
		String contactNumber="0100100100";
		int quantity,itemDescription,UnitPrice,Amount,SubTotal;
System.out.println("*************************Adamson Computers LTD***************************");
System.out.println("#99 ACS Building Gilmore Ave. Newline Mla.. Quezon city * Tel No:123-4567");
System.out.println("\t\tVAT REG .TIN 098-765-4321-0000");
System.out.println("\t\t\tSALES INVOICE");
System.out.println("");
System.out.println("");
System.out.print("Sold to:"+SoldTo);
System.out.println("\t\t\tDate:"+date);
System.out.print("Address:"+address);
System.out.print("\t\t\tContact Number:"+contactNumber);
System.out.println("");
System.out.println("");
System.out.println("....................................................................................");
System.out.println("....................................................................................");

System.out.println("Qty\t|\tItem Description\t|\t Unit Price\t|\tAmount");
System.out.println("....................................................................................");
System.out.println("....................................................................................");


System.out.println("4\t|\tPencil\t\t\t|\t\t20\t|\t80.00");
System.out.println("....................................................................................");
System.out.println("10\t|\tDuster\t\t\t|\t\t50\t|\t500.00");
System.out.println("....................................................................................");
System.out.println("9\t|\tPens\t\t\t|\t\t30\t|\t270.00");
System.out.println("....................................................................................");
System.out.println("10\t|\tCrayon\t\t\t|\t\t  80\t|\t800.00");
System.out.println("....................................................................................");
System.out.println("....................................................................................");
System.out.println("\t\t\t\t\t\t\t|Sub Total\t|1650.00");
System.out.println("\t\t\t\t\t\t\t............................");
System.out.println("\t\t\t\t\t\t\t............................");


System.out.println("\t\t\t\t\t\t\t|VAT(16%)\t|264.00");
System.out.println("\t\t\t\t\t\t\t............................");
System.out.println("\t\t\t\t\t\t\t............................");

System.out.println("\t\t\t\t\t\t\t|Total Amount\t|1914.00");
System.out.println("\t\t\t\t\t\t\t............................");
System.out.println("\t\t\t\t\t\t\t............................");


}
}
