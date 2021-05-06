package countries;
// Author: 			Frank Vadnjal
// Student ID: 		P401765
// Date: 			18 February 2021
// Program Name:    Countries
// Description:     Class countries containing a nested class Cities

public class Country
{
    private String countryName;
    private CityName cn;

    public void setCountryName(String countryName, String cityName)
    {
        this.countryName = countryName;
        cn = new CityName(cityName);
    }

    @Override
    public String toString()
    {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", City name=" + cn.cityNumberOne +
                '}';
    }
    public String getCountryName()
    {
        return countryName;
    }
    public String getCityName()
    {
        return cn.cityNumberOne;
    }

    private class CityName
    {
        private String cityNumberOne;

        public CityName(String cityNumberOne)
        {
            this.cityNumberOne = cityNumberOne;

        }

    }
}
