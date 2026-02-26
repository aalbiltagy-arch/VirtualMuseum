package Model;

public class Artifact {
    private String Id;
    private String name;
    private String mediaType; // e.g., "3D" or "Audio"

    public Artifact(String artifactId, String name, String mediaType) {
        this.Id = artifactId;
        this.name = name;
        this.mediaType = mediaType;
    }

    public String getArtifactId() { return Id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getMediaType() { return mediaType; }
}