public class Cars {
    private String Name, Model, Brand, Year, Location, Place;

    public Cars(String name, String model, String brand, String year, String location) {
        super();
        Name = name;
        Model = model;
        Brand = brand;
        Year = year;
        Location = location;
    }

    public Cars(String name, String model, String brand, String year, String location, String place) {
        super();
        Name = name;
        Model = model;
        Brand = brand;
        Year = year;
        Location = location;
        Place = place;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    // Travel -> String Place
    public void setTravel(String place) {
        Place = place;
    }

    public String getTravel() {
        return Place;
    }
}
