package View;

public class ArtifactView {
    public void displayArtifact(String name, String type) {
        System.out.println("=================================");
        System.out.println("--- Displaying Artifact Data ---");
        System.out.println("Artifact Name: " + name);
        System.out.println("Media Type Linked: " + type);
        
        // Simulating the rendering process
        if (type.equals("3D")) {
            System.out.println("Action: Rendering interactive 3D Model in browser...");
        } else if (type.equals("Audio")) {
            System.out.println("Action: Playing Multilingual Audio Guide...");
        } else {
             System.out.println("Action: Displaying Text Summary...");
        }
        System.out.println("=================================\n");
    }
}