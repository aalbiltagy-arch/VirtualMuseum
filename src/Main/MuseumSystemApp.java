package Main;

import Model.Artifact;
import View.ArtifactView;
import Controller.ArtifactController;

public class MuseumSystemApp {
    public static void main(String[] args) {
        // 1. Create Models (Simulating database records)
        Artifact artifact1 = new Artifact("ART-101", "Ancient Golden Sword", "3D");
        Artifact artifact2 = new Artifact("ART-102", "Pharaoh's Mask", "Audio");

        // 2. Create View (UI Interface)
        ArtifactView artifactView = new ArtifactView();

        // 3. Create Controllers (Linking Model and View)
        ArtifactController controller1 = new ArtifactController(artifact1, artifactView);
        ArtifactController controller2 = new ArtifactController(artifact2, artifactView);

        // 4. Simulate Visitor Scanning QR Codes
        System.out.println("[System Log: Visitor scanned QR Code for Artifact 101]");
        controller1.updateView();
        
        System.out.println("[System Log: Visitor scanned QR Code for Artifact 102]");
        controller2.updateView();
        
        // Simulate Admin Updating Artifact Information
        System.out.println("[Admin Action: Updating Artifact 101 Name]");
        controller1.setArtifactName("Restored Golden Sword");
        controller1.updateView();
    }
}