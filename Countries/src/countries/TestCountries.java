package countries;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCountries
{
    public static void main(String[] args)
    {
        DoublyLinkedList<Country> country =new DoublyLinkedList<Country>();

        Country newCountry = new Country();
        newCountry.setCountryName("Australia" , "Perth");
        country.addLast(newCountry);

        newCountry = new Country();
        newCountry.setCountryName("England" , "London");
        country.addLast(newCountry);

        newCountry = new Country();
        newCountry.setCountryName("Germany" , "Berlin");
        country.addLast(newCountry);

        newCountry = new Country();
        newCountry.setCountryName("Japan" , "Tokyo");
        country.addLast(newCountry);

        country.iterateForward();

    }
    @Test
    public void Test() throws Exception
    {
        Country newCountry = new Country();
        newCountry.setCountryName("Australia" , "Perth");
        assertEquals(newCountry.getCountryName(), "Australia");
        assertEquals(newCountry.getCityName(), "Perth");

    }
}
