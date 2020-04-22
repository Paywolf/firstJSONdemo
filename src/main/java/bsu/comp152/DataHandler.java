package bsu.comp152;

import java.util.ArrayList;

public class DataHandler {

    class responseDataType {
        String title;
        float version;
        String href;
        ArrayList<recipeDataType> results;

    }
    class recipeDataType {
        String title;
        String href;
        String ingredients;
        String thumbnail;
        @Override
        public String toString() {
            return "Recipe Title:" + title ; // only title for display later
        }
    }
}
