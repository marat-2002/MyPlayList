package com.geektech.myplaylist;

public class Music {
    private String singer;
    private String music;
    private String time;

    public Music(String singer, String music, String time) {
        this.singer = singer;
        this.music = music;
        this.time = time;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
