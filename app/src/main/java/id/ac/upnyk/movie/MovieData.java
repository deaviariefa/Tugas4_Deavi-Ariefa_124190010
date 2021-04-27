package id.ac.upnyk.movie;

import java.util.ArrayList;

public class MovieData {
    public static String[][] data = new String[][]{
            {
                    "Ad Astra",
                    "The near future, a time when",
                    "2019",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xJUILftRf6TJxloOgrilOTJfeOn.jpg"

            },

            {
                    "Frozen II",
                    "Elsa, Anna, Kristoff and Olaf head far into the forest to learn the truth about an ancient mystery of their kingdom.",
                    "2019",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/mINJaa34MtknCYl5AjtNJzWj8cD.jpg"

            },

            {
                    "Bloodhsot",
                    "Ray Garrison/Bloodshot adalah seorang prajurit yang dihidupkan kembali oleh sebuah nanoteknologi. Karena teknologi ini ia memiliki kemampuan baru yang luar biasa. Namun masa lalu Ray tiba-tiba muncul dan membuatnya penasaran dengan jati dirinya. Dengan kemampuan barunya itu, ia berjuang mendapatkan kebenaran tentang kehidupannya.",
                    "2020",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/8WUVHemHFH2ZIP6NWkwlHWsyrEL.jpg"

            },

            {
                    "Extraction",

                    "Extraction menceritakan Tyler Rake, seorang tentara bayaran yang menyerahkan segalanya ketika diminta menyelamatkan Ovi, anak dari pengedar narkoba terbesar. Hal itu bermula ketika terjadi persaingan bisnis antara pengedar narkoba terbesar di India dan Bangladesh.",
                    "2020",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wlfDxbGEsW58vGhFljKkcR5IxDj.jpg"

            },
            {
                    "Sonic the Hedgehog",

                    "Mengisahkan petualangan Sonic saat ia belajar tentang kompleksitas kehidupan di bumi bersama manusia sahabat barunya, Tom Wachowski. Sonic dan Tom bersatu untuk menghentikan si jahat Dr. Robotnik yang ingin menangkap Sonic dan menggunakan kekuatan istimewanya untuk menguasai dunia.",
                    "2020",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/aQvJ5WPzZgYVDrxLX4R6cLJCEaQ.jpg"

            },
            {
                    "The Call of The Wild",

                    "Buck is a big-hearted dog whose blissful domestic life is turned upside down when he is suddenly uprooted from his California home and transplanted to the exotic wilds of the Yukon during the Gold Rush of the 1890s. As the newest rookie on a mail delivery dog sled team—and later its leader—Buck experiences the adventure of a lifetime, ultimately finding his true place in the world and becoming his own master.",
                    "2020",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/33VdppGbeNxICrFUtW2WpGHvfYc.jpg"

            }
    };

    public static ArrayList<Movie> getListData() {
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] aData : data) {
            Movie movie = new Movie();
            movie.setTitle(aData[0]);
            movie.setDeskripsi(aData[1]);
            movie.setTahun(aData[2]);
            movie.setPhoto(aData[3]);
            list.add(movie);

        }
        return list;
    }
}










