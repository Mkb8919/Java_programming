package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class image {
    public static void main(String[] args) throws IOException {
        /*
        As you have already learned from the Images lesson, Images are described by a width and a height, measured in pixels, and have a coordinate system that is independent of the drawing surface.

There are a number of common tasks when working with images.

Loading an external GIF, PNG JPEG image format file into the internal image representation used by Java 2D.
Directly creating a Java 2D image and rendering to it.
Drawing the contents of a Java 2D image on to a drawing surface.
Saving the contents of a Java 2D image to an external GIF, PNG, or JPEG image file.
This lesson teaches you the basics of loading, displaying, and saving images.

The are two main classes that you must learn about to work with images:

The java.awt.Image class is the superclass that represents graphical images as rectangular arrays of pixels.
The java.awt.image.BufferedImage class, which extends the Image class to allow the application to operate directly with image data (for example, retrieving or setting up the pixel color). Applications can directly construct instances of this class.
         */

        int width = 640;
        int height = 427;

        BufferedImage image = readfromfile(width, height);
        if (image != null) {
            writetofile(image);
        } else {
            System.out.println("Image could not be loaded.");
        }
    }
    private static BufferedImage readfromfile(int width, int height) {
        BufferedImage image = null;
        try {
            File sampleFile = new File("C:\\Users\\mohit\\OneDrive\\Pictures\\Saved Pictures\\png-transparent-object-oriented-analysis-and-design-randomness-household-goods-miscellaneous-color-dribbble-thumbnail.png");
            if (!sampleFile.exists()) {
                System.out.println("File does not exist at the specified path.");
                return null;
            }

            // Reading the input file
            image = ImageIO.read(sampleFile);
            if (image == null) {
                System.out.println("Image format is not supported.");
            } else {
                System.out.println("Reading complete.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return image;
    }

    private static void writetofile(BufferedImage image) {
        try {
            // Define the output path
            File output = new File("F:\\java-tutorials\\out.png");

            // Check if the directory exists, and create it if not
            File outputDir = output.getParentFile();
            if (!outputDir.exists()) {
                outputDir.mkdirs();  // Creates the directory if it doesn’t exist
            }

            // Write the image
            ImageIO.write(image, "png", output);
            System.out.println("Writing complete.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }


}
}
