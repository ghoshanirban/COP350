package arraysandLLs;

import stacksandqueues.LinkedStack;

import java.util.*;

public class BrowserTab {
    String currentPage = "";
    private final LinkedStack<String> previousPages = new LinkedStack<>(),
                                               nextPages = new LinkedStack<>();
    public static String getTimeStamp(){ return "[" + new Date() + "] "; }

    public BrowserTab() { System.out.println(getTimeStamp() + "New tab opened."); }
    
    public void typeAndGoNewSite(String newPage) {
        if( !currentPage.isEmpty() ) // some page is being viewed currently
            previousPages.push(currentPage); // send the current page to the previousPages DLL

        currentPage = newPage;
        System.out.println(getTimeStamp() + "Currently viewing: " + currentlyViewing());
    }

    public void clickOnGoBackButton() {
        if( previousPages.isEmpty() ) {
            System.out.println(getTimeStamp() + "Back button is greyed out (unavailable).");
            return;
        }
        else {
            System.out.print(getTimeStamp() + "Back button is clicked. ");
            nextPages.push(currentPage);
            currentPage = previousPages.top();
            previousPages.pop();
        }
        System.out.println("Currently viewing: " + currentlyViewing());
    }

    public void clickOnGoForward() {
        if( nextPages.isEmpty() ) {
            System.out.println(getTimeStamp() + "Forward button is greyed out (unavailable).");
            return;
        }
        else {
            previousPages.push(currentPage);
            currentPage = nextPages.pop();
        }
        System.out.println(getTimeStamp() + "Forward button is clicked. Currently viewing: " + currentlyViewing());
    }

    public String currentlyViewing() { return currentPage; }

    public String toString() {
        StringBuilder prettyString = new StringBuilder();

        for (String site : previousPages)
            prettyString.append(site).append(" ");

        prettyString.append(" ***").append(currentPage).append("*** ");

        for (String site : nextPages)
            prettyString.append(site).append(" ");

        return prettyString.toString();
    }
}
