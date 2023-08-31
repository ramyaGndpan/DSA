package javatraining.assessments.day4;

public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;


	/**
	 * Printer
	 * INITIALIZE THE TONER LEVEL AND DUPLEX
	 * @param tonerLevel
	 * @param duplex
	 */
	public Printer(int tonerLevel, boolean duplex) {
		super();
		this.duplex = duplex;
		this.pagesPrinted = 0;
		if(tonerLevel>-1 && tonerLevel<=100) {
			this.tonerLevel = tonerLevel;
		} else this.tonerLevel = -1;
	}


	/**
	 * @return the pagesPrinted
	 */
	public int getPagesPrinted() {
		return pagesPrinted;
	}

	
	/**
	 * addToner
	 * add the toner level
	 * @param tonerAmount
	 * @return
	 */
	public int addToner(int tonerAmount) {
		if(tonerAmount>0 && tonerAmount<=100) {
			if((tonerAmount+tonerLevel)>100) {
				return -1;
			} else {
				tonerLevel += tonerAmount;
				return tonerLevel;
			}
		}else
			return -1;
	}

	/**
	 * printPages
	 * return the number of pages to print
	 * @param pages
	 * @return
	 */
	public int printPages(int pages) {
		int pagesToPrint = pages;
		if(duplex) {
			System.out.println("printing in duplex mode::pages:::"+pages);
			pagesToPrint = (pagesToPrint/2)+(pagesToPrint % 2);
		}
		pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}
	
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer objPrinter = new Printer(50, true);
		System.out.println("addToner::tonerLevel::"+objPrinter.addToner(50));
		System.out.println("initial page count = " +objPrinter.getPagesPrinted());
		int pagesPrinted = objPrinter.printPages(4);
		System.out.println("Pages printed:::" + pagesPrinted +" new total print count:::" +objPrinter.getPagesPrinted());
		pagesPrinted = objPrinter.printPages(2);
		System.out.println("Pages printed:::" + pagesPrinted +" new total print count:::" +objPrinter.getPagesPrinted());
	}
	
	/**
output:
WHEN TONER LEVEL SET TO 50  DUPLEX MODE TRUE
addToner::tonerLevel::100
initial page count = 0
printing in duplex mode::pages:::4
Pages printed:::2 new total print count:::2
printing in duplex mode::pages:::2
Pages printed:::1 new total print count:::3

WHEN TONER LEVEL SET TO 150  DUPLEX MODE FALSE
addToner::tonerLevel::-1
initial page count = 0
Pages printed:::4 new total print count:::4
Pages printed:::2 new total print count:::6

WHEN TONER LEVEL SET TO 150  DUPLEX MODE TRUE
addToner::tonerLevel::-1
initial page count = 0
printing in duplex mode::pages:::4
Pages printed:::2 new total print count:::2
printing in duplex mode::pages:::2
Pages printed:::1 new total print count:::3
	 */

}
