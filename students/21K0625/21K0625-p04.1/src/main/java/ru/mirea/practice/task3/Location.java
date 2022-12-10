package ru.mirea.practice.task3;


public class Location {
    private double latitude;
    private double longitude;
    public static final double EARTH_RADIUS = 6.371e6;

    public Location() {
        this(49.9935, 36.2304);
    }

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public static double getDistance(Location currentLocation, Location destinationLocation) {
        double lat1 = Math.toRadians(currentLocation.getLatitude());
        double lon1 = Math.toRadians(currentLocation.getLongitude());
        double lat2 = Math.toRadians(destinationLocation.getLatitude());
        double lon2 = Math.toRadians(destinationLocation.getLongitude());
        return EARTH_RADIUS * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon2 - lon1));
    }
}
