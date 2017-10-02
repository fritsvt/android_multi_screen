package tech.frits.tourguide;

public class Place {

    private String name;
    private String description;
    private int ImageResourceId;

    public Place(String cname, String cdescription, int cImageResourceId) {
        name = cname;
        description = cdescription;
        ImageResourceId = cImageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }

}
