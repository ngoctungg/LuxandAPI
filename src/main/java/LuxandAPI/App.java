package LuxandAPI;

import java.io.File;

import connection.API;
import connection.LuxandAPI;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        API api = new LuxandAPI();
        System.out.println("Get UID and Cookei from Luxand");
        api.initiateConnection();
        File file1 = new File("./image/3qfom6zr.bmp");
        System.out.println("Update image of partner 1");
        api.uploadImage(file1, 1);
        File file2 = new File("./image/jpfa2uo8.bmp");
        System.out.println("Update image of partner 1");
        api.uploadImage(file2, 2);
        //TODO use asynchronous technique to update 2 file
        /*
            gender : 1 boy
                    0 girl
                    -1 either
        */
        System.out.println("make baby: ");
        String imageName = api.makeBaby(-1,-1);
        System.out.println("url baby: "+imageName);
        String fileOuputPath = "./image"+imageName;
        System.out.println("save image "+imageName+" to "+fileOuputPath);
        api.saveImage(imageName, fileOuputPath);
    }
}
