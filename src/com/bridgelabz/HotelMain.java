package com.bridgelabz;

public class HotelMain {
    public static void main(String[] args) {
        System.out.println("Hotel Reservation System\n\n");
        HotelReservation hotelReservation = new HotelReservation ();

        hotelReservation.addHotel(new Hotel("Lakewood",110));
        hotelReservation.addHotel(new Hotel("Bridgewood",160));
        hotelReservation.addHotel(new Hotel("Ridgewood",220));

    }
}
