package org.example.studymaterial;

public abstract class Reference {
    private String title;
    private String description;
    private String link;
    private String accessRights;
    private String license;
    private boolean isDownloadable;
    private int rating;
    private String language;
    private int viewCount;
    private int downloadCount;
    private int shareCount;

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        if (description == null) {
            throw new IllegalArgumentException("Description cannot be null.");
        }
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public void setLink(String link) {
        if (link == null || link.isEmpty()) {
            throw new IllegalArgumentException("Link cannot be null or empty.");
        }
        this.link = link;
    }
    public String getLink() {
        return link;
    }

    public String getAccessRights() {
        return accessRights;
    }

    public void setAccessRights(String accessRights) {
        if (accessRights == null) {
            throw new IllegalArgumentException("Access rights cannot be null.");
        }
        this.accessRights = accessRights;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        if (license == null) {
            throw new IllegalArgumentException("License cannot be null.");
        }
        this.license = license;
    }

    public boolean getIsDownloadable() {
        return isDownloadable;
    }

    public void setDownloadable(boolean downloadable) {
        isDownloadable = downloadable;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        if (language == null || language.isEmpty()) {
            throw new IllegalArgumentException("Language cannot be null or empty.");
        }
        this.language = language;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        if (viewCount < 0) {
            throw new IllegalArgumentException("View count cannot be negative.");
        }
        this.viewCount = viewCount;
    }
    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        if (downloadCount < 0) {
            throw new IllegalArgumentException("Download count cannot be negative.");
        }
        this.downloadCount = downloadCount;
    }

    public int getShareCount() {
        return shareCount;
    }
    public void setShareCount(int shareCount) {
        if (shareCount < 0) {
            throw new IllegalArgumentException("Share count cannot be negative.");
        }
        this.shareCount = shareCount;
    }

    public int calculatePopularity() {
        return viewCount + downloadCount + shareCount;
    }

    public boolean isAccessible() {
        return !accessRights.equals("Restricted");
    }

    public String formatForDisplay() {
        return "Title: " + title + "\n" +
                "Description: " + description + "\n" +
                "Link: " + link;
    }
    public void incrementViewCount() {
        viewCount++;
    }

    public void incrementDownloadCount() {
        downloadCount++;
    }

    public void incrementShareCount() {
        shareCount++;
    }


}
