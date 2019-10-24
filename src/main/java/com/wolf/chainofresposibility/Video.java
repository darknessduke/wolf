package com.wolf.chainofresposibility;

public class Video {
    private String subtitle;
    private String voice;
    private Boolean isExported;

    public Video(String subtitle, String voice, Boolean isExported) {
        this.subtitle = subtitle;
        this.voice = voice;
        this.isExported = isExported;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public Boolean getExported() {
        return isExported;
    }

    public void setExported(Boolean exported) {
        isExported = exported;
    }
}
