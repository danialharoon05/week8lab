package week8;

public class Kindle {
    private int totalPages;
    private int currentPage;

    public Kindle(int numberOfPages){
        totalPages = numberOfPages;
        currentPage = 1;
    }//end of the constructor

    public String toString(){
        return "Page " + currentPage + " of " + totalPages + ".";
    }

    public void turnPages(){
       turnPages(1);
        }

    public void turnPages(int numberOfPages){
        int numPages = numberOfPages + currentPage;
        if(numPages < totalPages){
            currentPage = currentPage + numberOfPages;
        }else {
            System.out.println("You were on: " + toString());
            System.out.println("Turning " + numberOfPages + " pages would take you past the last page.");
            currentPage = totalPages;
            System.out.println("You are now on : " + toString());

        }
    }

}//end of the Kindle class
