package Controller;

import Model.Artifact;
import View.ArtifactView;

public class ArtifactController {
    private Artifact model;
    private ArtifactView view;

    // Constructor
    public ArtifactController(Artifact model, ArtifactView view) {
        this.model = model;
        this.view = view;
    }

    // Update Model Data
    public void setArtifactName(String name){
        model.setName(name);
    }

    // Trigger View to display data
    public void updateView() {
        view.displayArtifact(model.getName(), model.getMediaType());
    }
}