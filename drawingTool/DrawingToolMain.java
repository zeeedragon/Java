package misc.drawingTool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawingToolMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String figure = bfr.readLine();
        CorDraw fig = null;
        switch (figure) {
            case "Square":
                int size = Integer.parseInt(bfr.readLine());
                fig = new Square(size);
                break;
            case "Rectangle":
                int width = Integer.parseInt(bfr.readLine());
                int height = Integer.parseInt(bfr.readLine());
                fig = new Rectangle(width, height);
                break;
        }
        fig.draw();
    }
}
