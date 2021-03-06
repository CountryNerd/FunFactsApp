package yocow.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by yocow on 3/7/2015.
 */
public class ColorWheel {
    // Member  variables (properties about the object)
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    // Method (abilities: things about the object)
    public int getColor(){

        String color = "";

        Random randomGen = new Random();
        int randNumber = randomGen.nextInt(mColors.length);

        color = mColors[randNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}