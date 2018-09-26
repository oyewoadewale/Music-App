package com.example.hp.lmamapp;

public class Album {

        /**
         * {@link Album} represents the description of the song.
         * It contains the Album name and a Artist name for that song.
         */


        /** This is the  Album name */
        private String mAlbumname;

        /** This is the  Artist name */
        private String mArtistname;




        /**
         * Use constructor to create a new Album object.
         *
         * @param albumnamme is the name of the album that we get the song from while,
         * @param artistname is the name of the artist that sang the song
         *
         */

        public Album(String albumnamme, String artistname) {
            mAlbumname = artistname;
            mArtistname = albumnamme;

        }

        /**
         * This is the Method Get Album name, it returns the title of each song album.
         */
        public String getAlbumname() {
            return mAlbumname;
        }

    /**
     * This is the Method Get Artist name, it returns the name of the artist that sang the song.
     */
        public String getArtistname() {
            return mArtistname;
        }


}
