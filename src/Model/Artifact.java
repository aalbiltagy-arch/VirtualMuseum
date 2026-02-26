package Model;

public class Artifact {
    // Information Hiding: Private Attributes
    private String id;
    private String name;
    private String mediaType; // e.g., "3D" or "Audio"

    // Constructor
    public Artifact(String id, String name, String mediaType) {
        this.id = id;
        this.name = name;
        this.mediaType = mediaType;
    }

    // Public Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMediaType() { return mediaType; }
    public void setMediaType(String mediaType) { this.mediaType = mediaType; }
}