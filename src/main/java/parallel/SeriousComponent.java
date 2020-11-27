package parallel;

public class SeriousComponent {

    /**
     * This function tests the seriousness of a String.
     * Returns false if the string contains the word
     * "FUNNY", returns truje otherwise.
     */
    public static boolean testSeriousness( String text ) {
        try {
            Thread.sleep( 5000 );
        } catch (InterruptedException e) {
        }
        return !text.toUpperCase().contains( "FUNNY" );
    }
}
