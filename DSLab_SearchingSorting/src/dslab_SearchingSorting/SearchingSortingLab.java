/**
 * SortingLab.java
 *
 * @author Latulipe/Perez Quinones
 */
package dslab_SearchingSorting;

public class SearchingSortingLab {

    public static void main(String args[]) {
        ConcertManager cm = new ConcertManager();

        // test finding tickets with linear search
        cm.findTicketByPrice_Linear(15);
        cm.findTicketByPrice_Linear(75);
        cm.findTicketByPrice_Linear(102);
        cm.findTicketByPrice_Linear(125);


        // test seeing if tickets exist with linear search
        cm.existsTicketWithPrice_Linear(40);
        cm.existsTicketWithPrice_Linear(13);
         cm.existsTicketWithPrice_Linear(53);
          cm.existsTicketWithPrice_Linear(24);
        
        // Unsorted
        System.out.println("Unsorted: \n" + cm.toString());

        // Sort by price
        // TODO: Implement ConcertManager.sortByPrice
        cm.sortByPrice();
        System.out.println("Sorted by price: \n" + cm.toString());
        
        // Sort by name
        // TODO: Implement ConcertManager.sortByName
       cm.sortByName();
       System.out.println("Sorted by name: \n" + cm.toString());

        
        // Sort by price
        // TODO: Implement ConcertManager.sortByRow
       cm.sortByRow();
        System.out.println("Sorted by row: \n" + cm.toString());
    }
}
