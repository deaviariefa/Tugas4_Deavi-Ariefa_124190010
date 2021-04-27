package id.ac.upnyk.movie;

import java.util.ArrayList;

public class CinemaData {
    private static String[] cinemaNames = {
            "INDO XXI",
            "SOLO SQUARE XXI",
            "TRANSMART SOLO CGV",
            "SOLO GRAND MALL XXI",
            "SOLO PARAGON XXI",
            "HARTONO MALL CINEPLEX",
            "THE PARK MALL XXI"

    };

    private static String[] cinemaAddress = {
            "Alamat: Solo",
            "Alamat: Solo",
            "Alamat: Solo",
            "Alamat: Solo",
            "Alamat: Solo",
            "Alamat: Solo Baru",
            "Alamat: Solo Baru"


    };
    private static int[] cinemaImages = {
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,

    };
    public static ArrayList<Cinema>getListData(){
        ArrayList<Cinema> list = new ArrayList<>();
        for(int position = 0;position <cinemaImages.length;position++){
            Cinema cinema = new Cinema();
                cinema.setName(cinemaNames[position]);
                cinema.setAddress(cinemaAddress[position]);
                cinema.setPhoto(cinemaImages[position]);
                list.add(cinema);
            }
            return list;
        }
    }

